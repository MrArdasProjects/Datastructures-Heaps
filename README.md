# Datastructures-Heaps
This project pertains to the implementation of important methods related to Heaps in the context of the Data Structures and Advanced Algorithms course within the Computer Engineering department. 

The following instructions have been implemented in the project.

1. Instantiate a new Heap object in the main function.

2. Heap class has an insert(int value) method which inserts the given value 
to the heap. Use that method to build your heap with random numbers. You can 
use any value to test whether the method works properly or not. 

3. Print the elements that you have inserted using the method printHeap().

4. Implement getMinValue() method which returns the minimum element of the 
heap. Use it and print the minimum value. 

5. Implement getHeight() method which returns the height of the heap. Use it 
and print the height of the heap.

6. Implement the buildHeap(int value) method this time which builds a 
binary min heap from the given array arrayC[]. 
6.1. You will need to implement percolateDown(int hole)helper method 
for buildHeap method to work. It moves down the hole to the correct 
position without violating the heap order property. 

7. Print the heap elements using printHeap() again.

8. Implement a deleteMin()method which deletes the root of the heap and
organizes the heap accordingly. Print this new heap after this operation. This
method should also use percolateDown(int hole) method to work. 
