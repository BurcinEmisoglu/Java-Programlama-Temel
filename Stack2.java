import java.util.Stack;

public class Stack_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*push:listeye eleman ekleme i�lemi yapar
		 * 
		 * pop:listenin e�ste bulunan eleman� siler.E�er liste bo� ise
		 * EmptyStacKException hatas� verir
		 * 
		 * 
		 * peek:listenin en �st�ndeki eleman� d�md�rmek i�in.Bu eleman� silmez,sadece g�sterir
		 * 
		 * empty:listenin bo� olup olmama durumunu kontrol eder
		 * 
		 * search:listede eleman arama i�lemi yapmam�z i�in kullan�l�r.Eleman listede varsa indisini d�ner
		 * listede yoksa - d�ner
		 * 
		 * ilk eklenen en son s�raya,en son eklenen ilk s�rayaeklenir.
		 * 
	
		 * 
		 */
		
		
		
		/*Stack stack=new Stack();
		 stack.push("Burom");
		 stack.push("K�b");
		 stack.push("Fatmik");
		 System.out.println(stack);
		  System.out.println(stack.search("K�b"));
		 System.out.println(stack.peek());
		 System.out.println(stack.pop());*/
		
		
		Stack <String> stack =new Stack();
		stack.push("MECL�S�");
		stack.push("M�LLET");
		stack.push("B�Y�K");
		stack.push("T�RK�YE");
		
		
		for (int i = 0; i <4 ; i++) {
			
			System.out.println(stack.pop());
			
		}
	
		
		
	}

}
