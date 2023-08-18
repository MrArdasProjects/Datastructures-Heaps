


package main;


public class Heap {
    
	private int currentSize;
	private int[] heapArray;
	
	// Constructors
	public Heap()
	{
		setCurrentSize(0);
		heapArray = new int[1];
	}
	
	public Heap(int capacity)
	{
		setCurrentSize(0);
		heapArray = new int[capacity + 1];
	}
	
	// Heap Operations
	public int[] buildHeap(int[] array)
	{
		// Builds the heap from an array that you have provided
		
		 setCurrentSize(array.length);
        setHeapArray(new int[getCurrentSize() + 1]);

        for (int i = 0; i < array.length; i++) {
            getHeapArray()[i + 1] = array[i];
        }

        for (int i = getCurrentSize() / 2; i > 0; i--) {
            percolateDown(i);
        }

        return getHeapArray();
    }

	
	
	public int deleteMin()
	{
		// Deletes the min element of binary min heap
		
		 if (isEmpty()) {
            System.out.println("Heap is empty");
        }

        int minItem = getMinValue();
       this.heapArray[1] = this.heapArray[currentSize--];
        percolateDown(1);
        return minItem;
	}
	
	private void percolateDown(int hole) 
	{
		// Organizes the elements of the heap and percolate down the elements for not violating heap properties
		
		 int child;
        int tmp = heapArray[hole];

        for (; hole * 2 <= currentSize; hole = child) {
            child = hole * 2;

            if (child != currentSize && Integer.compare(heapArray[child + 1], heapArray[child]) < 0) {
                child++;
            }

            if (Integer.compare(heapArray[child], tmp) < 0) {
                heapArray[hole] = heapArray[child];
            } else {
                break;
            }
        }

        heapArray[hole] = tmp;
    

	}
	
	public int getMinValue()
	{
		  if (isEmpty()) {
            System.out.println("heap is empty!");
        }
        return heapArray[1]; //first index is the root.
    
	}
	
	public int getHeight()
	{
		 return (int) Math.ceil(Math.log(currentSize + 1) / Math.log(2)) - 1;
	}
	
	public void insert(int value)
	{
		// Inserts an integer element to the binary min heap
		if(currentSize == heapArray.length - 1)
			enlargeArray(heapArray.length + 1);
		
		int hole = ++currentSize;
		
		percolateUp(value, hole);
	}
	
	private void percolateUp(int value, int hole) 
	{
		// Organizes the elements of the heap and percolate up the elements for not violating heap properties
		for(heapArray[0] = value; Integer.compare(value, heapArray[hole / 2]) < 0 ; hole = hole / 2)
		{
			heapArray[hole] = heapArray [hole / 2];
		}
		
		heapArray[hole] = value;
	}
	
	// Helper Methods
	public boolean isEmpty() 
	{
		return currentSize == 0;
	}
	
	public void makeEmpty() 
	{
		currentSize = 0;
	}
	
	private void enlargeArray(int newSize)
	{
		// Enlarges array to the new size
		int[] old = heapArray;
		heapArray = new int[newSize];
	
		for( int i = 1; i < old.length; i++)
			heapArray[i] = old[i];
	}
		
	public void printHeap()
	{
		int level = 1;
		// Prints the heap elements one by one
		for (int i = 1; i < heapArray.length; i++) 
		{
			System.out.print(heapArray[i] + " ");
			
			if((i + 1) % Math.pow(2, level) == 0)
			{
				System.out.println();
				level++;
			}
		}
		
		System.out.println("\n---------------------------");
	}
	
	// Getters and Setters
	public int getCurrentSize() {
		return currentSize;
	}

	public void setCurrentSize(int currentSize) {
		this.currentSize = currentSize;
	}

	public int[] getHeapArray() {
		return heapArray;
	}

	public void setHeapArray(int[] heapArray) {
		this.heapArray = heapArray;
	}
	
}
    

