package stacks;

public class StackUsingArray {
/*Points to remember:
 * 1. As using array and Arrays have fixed size to need something to store max size and
 * throw error when that size is reached
 * 2. For push increase index by 1 and insert element.
 * 3. For pop just read the element and decrease index by 1. No need to delete element
 * as that location will be overwritten in next push
 * 4. index variable that points head of stack and array that stores the elements
 * should be private so nobody outside class can have its direct access and mess with head index.
 * 5. Start top/head index= -1 so when you push first element goes to 0th index.
 * and when you want to check isEmpty u can check head index==-1.
 * 6. Peek() just gets you the value of top element , it does not delete/decrease pointer
 * like pop()
 * 
 * 
 */
	private int maxSize;
	   private long[] stackArray;
	   private int top;
	   public StackUsingArray(int s) {
	      maxSize = s;
	      stackArray = new long[maxSize];
	      top = -1;
	   }
	   public void push(long j) {
	      stackArray[++top] = j;
	   }
	   public long pop() {
	      return stackArray[top--];
	   }
	   public long peek() {
	      return stackArray[top];
	   }
	   public boolean isEmpty() {
	      return (top == -1);
	   }
	   public boolean isFull() {
	      return (top == maxSize - 1);
	   }
	   public static void main(String[] args) {
		   StackUsingArray theStack = new StackUsingArray(10); 
	      theStack.push(10);
	      theStack.push(20);
	      theStack.push(30);
	      theStack.push(40);
	      theStack.push(50);
	      while (!theStack.isEmpty()) {
	         long value = theStack.pop();
	         System.out.print(value);
	         System.out.print(" ");
	      }
	      System.out.println("");
	   }
}
