import java.util.LinkedList;
import java.util.Queue;
import java.util.LinkedList;
public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Bu s�n�f stack s�n�f�ndan farkl� olarak �zel durumlar d���nda ilk giren ilk ��kar mant��� ile
		�al��maktad�r.
		FIFO (first in first out)
		Bu s�n�fa ait metotlar;
		add(eleman): Parametrede verilen eleman� kuyru�a ekler. ��lemin ba�ar�s�z olmas�
		durumunda hata f�rlat�r.
		offer(eleman): Parametrede verilen eleman� kuyru�a ekler. ��lemin ba�ar�s�z olmas�
		durumunda null d�ner.
		poll(): Kuyru�un ba��ndaki eleman� kuyruktan ��kart�r.
		peek(): Kuyrukta s�radaki elemana ula�mak i�in kullan�l�r.
		clear() Kuyru�u temizlemek i�in 
		
		element: peek ile benzer  */
		  Queue<Integer> q = new LinkedList<>(); 
		  
		for (int i = 1; i <= 5; i++) {
			
			q.add(i);
			
		}
		System.out.println(q);
		q.offer(6);
		System.out.println(q);
		q.poll();
		System.out.println(q);
	
		System.out.println(q.peek());
		
	
		
		q.remove(3);
		System.out.println(q);
		

		System.out.println(q.element());
		
		
	}

}
