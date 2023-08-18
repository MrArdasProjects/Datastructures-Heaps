
package main;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Heap heap1=new Heap();
		// ...
		heap1.insert(52);
                heap1.insert(25);
                heap1.insert(40);
                heap1.insert(2);
                heap1.insert(10);
                heap1.insert(49);

		
		// Print the heap that you have created
                heap1.printHeap();
		// ...
		
		// Get min value of the heap that you have created
                System.out.println("minimum value is: "+ heap1.getMinValue());
		// ...
		
		// Get height of the heap that you have created
                System.out.println("Height of heap is: "+ heap1.getHeight());
		// ...
		
		int[] arrayC = {15, 170, 5, 28, 92, 84, 38, 203, 37, 70, 40};
                Heap h2= new Heap();
                
		// Use arrayC[] for building the heap again with buildHeap() method this time and print it
               
                h2.buildHeap(arrayC);
                System.out.println("After building =>  ");
                h2.printHeap();
                h2.deleteMin();
		System.out.println("After deleting =>  ");
                h2.printHeap();
		
		// Use deleteMin() method to delete root of the heap and print the new heap
		// ...
		
	}


    }
    

