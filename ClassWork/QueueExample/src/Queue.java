
public class Queue {
	      // Create a Queue as a Integer Array called A with length 100.
		   public int [] A = new int [100];
           // Create a front field (head) that starts at index 0
		   public int front = 0;
		    // Create a back field (tail) that starts at index -1;
		   public int back  = -1;
		   // Create a count field = 0; We use as counter to find how many elements are in the Queue. 
		   public int count = 0;
           //Adds an element to the Queue.
		   public void enqueue (int x)
		   {   
			   // Condition to test if Array is full.
		      if (count == A.length) resize();
              // Assigns value of to tail  +1
		      back = (back + 1) % A.length;
              // STORES THE VALUE PASSED IN AT NEW INDEX
		      A[back] = x;
              // INCREMENT COUNT BY 1 
		      count++;
		   }
           // REMOVES AN ELEMENT OUTSIDE ARRAY.
		   public int dequeue ()
		   {
			   //TEST IF ARRAY IS NOT EMPTY.
		      if (!isEmpty())
		      {  
		    	  // STORE THE ELEMENT AT INDEX 0 IN TEMP.
		         int temp = A[front];
                 // ADDS 1 TO PREVIOUS FRONT INDEX.
		         front = (front + 1) % A.length;
                 // REMOVES ELEMENT 
		         count--;
		         // RETURNS ELEMNT THAT WAS REMOVED
		         return temp;
		      }
              // RETURNS EMPTY;
		      return A[-1]; 
		   }

           // TRUE IF EMPTY 
		   public boolean isEmpty ()
		   {
			  // IF COUNT =0 IT IS EMPTY
		      return count == 0;
		   }
            // RETURNS ELEMENT AT FRONT
		   public int front ()
		   {
		      return A[front];
		   }
           // RETURNS ELEMENT AT BACK TAIL
		   public int back ()
		   {
		      return A[back];
		   }
           // DOUBLES CURRENT ARRAY LENGTH.
		   private void resize ()
		   {  // DECLARE ARRAY B WHOSE LENGTH IS DOUBLE ARRAY A;
		      int [] B = new int [2*A.length];
              // LOO[S THROUGH ARRAY A INDEX
		      for (int i = 0; i < A.length; i++)
		         B[i] = A[(front + i) % A.length];

		      front = 0;
		      back = A.length -1;
              // SET NEW VALUE OF ARRAY TO A Equal to B.
		      A = B;
		   }
		


}
