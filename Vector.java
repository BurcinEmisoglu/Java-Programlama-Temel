import java.util.Vector;

public class Vector_Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vector=new Vector<>(1);//parantez i�ine 3 yazmazsam 10 tane �retiyor.RAM de 3 elemanl� alan a��lm�� oluyo(kapasite)
		vector.setSize(2);
		vector.add("burom");
		vector.add("fatmik");
		vector.add("k�b");
		
		
		for (String string : vector) {
			System.out.println(string);
			
		}
		
		System.out.println("capacity:"+vector.capacity());
		System.out.println("Size:"+vector.size());
		
		
		/*addElement-verieklemek i�in
		 * capacity
		 * clear-degerleri temizler
		 * contains-listede deger aramak i�in
		 * get-indisini bildi�imi< degeri �a��rmak
		 * indexOf
		 * lastIndexOf
		 * removeAllElements-t�m elemanlar� silmek i�in
		 * set-var olan degeri degistirmek i�in
		 * remove-belirtilen indisteki/isimdeki eleman� silmek i�in
		 * size-vector un eleman say�s�n� d�ner
		 */
		
	}

}
