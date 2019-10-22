import java.util.Stack;

public class Stack_Ornek1 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack stack=new Stack();
		/*Stack s�n�f� vector s�n�f�ndan t�remi�tir.
		 * bu nedennle Stacj s�n�f� i�erisinde Vector de bulunan isimleri ile
		 * kar��la�abilir.
		 * Fakat,vector da olmay�p stacj de ayr�ca eklenmi� metot isimleri ile kar��lassabilirz
		 * 
		 * 
		 * add
		 * addElement
		 * capacity
		 * elementsAt
		 * empty
		 * firstElement
		 * lastElement
		 * get
		 * isEmpty
		 * lastIndexOf
		 * indexOf
		 * removeAllElement
		 * clear
		 * 
		 * 
		 * peek
		 * pop
		 * push
		 
		 */
		
		/*
		 stack.push("Londra");
		 stack.push("Moskova");
		 stack.push("Ankara");
		 stack.push("Paris");
		 stack.push("Viyana");
		 System.out.println(stack);
		 System.out.println(stack.search("Ankara"));
		 System.out.println(stack.peek());
		 System.out.println(stack.pop());
		 System.out.println(stack); */
		
		
		
		// Pushing element on the top of the stack 
	    static void stack_push(Stack<Integer> stack) 
	    { 
	        for(int i = 0; i < 5; i++) 
	        { 
	            stack.push(i); 
	        } 
	    } 
	      
	    // Popping element from the top of the stack 
	    static void stack_pop(Stack<Integer> stack) 
	    { 
	        System.out.println("Pop :"); 
	  
	        for(int i = 0; i < 5; i++) 
	        { 
	            Integer y = (Integer) stack.pop(); 
	            System.out.println(y); 
	        } 
	    } 
	  
	    // Displaying element on the top of the stack 
	    static void stack_peek(Stack<Integer> stack) 
	    { 
	        Integer element = (Integer) stack.peek(); 
	        System.out.println("Element on stack top : " + element); 
	    } 
	      
	    // Searching element in the stack 
	    static void stack_search(Stack<Integer> stack, int element) 
	    { 
	        Integer pos = (Integer) stack.search(element); 
	  
	        if(pos == -1) 
	            System.out.println("Element not found"); 
	        else
	            System.out.println("Element is found at position " + pos); 
	    } 
	  
	  
	    public static void main (String[] args) 
	    { 
	        Stack<Integer> stack = new Stack<Integer>(); 
	  
	        stack_push(stack); 
	        stack_pop(stack); 
	        stack_push(stack); 
	        stack_peek(stack); 
	        stack_search(stack, 2); 
	        stack_search(stack, 6); 
	 
	}

}
