import java.util.LinkedList;

public class LinkedList_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Linked L�st S�n�f� metorlar�:
		
		/* add
		 * addFirst-en ba�a ekler
		 * addLast-en sona ekler
		 * clear
		 * contains
		 * get
		 * getFirst
		 * getLast
		 * indexOf
		 * lastIndexOf
		 * iterator
		 * listIterator
		 * 
		 */
		
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("Mercedes");
		
		linkedList.add("audi");
		linkedList.addFirst("porsche");
		linkedList.add("bmw");
		
		linkedList.addLast("opel");
		
		
		for (String string : linkedList) {
				System.out.println(string);
				
			}
		
		System.out.println("birinci eleman:"+linkedList.getFirst());
		System.out.println("son eleman:"+linkedList.getLast());
		
		//ilk eleman� silme
		linkedList.removeFirst();
		System.out.println("birinci eleman:"+linkedList.getFirst());
		
		linkedList.removeLast();
		System.out.println("son eleman:"+linkedList.getLast());
		
		
		
	
		
		
	}

}
