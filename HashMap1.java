import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * HashMap, Key(anahtar),value ili�kisinde deger saklayabilmemizi sa�layan map s�n�f�r
		 * HashMap belirtilen tipte key ve yine ayr�ca belirtilen tipte value almaktad�r.
		 * 
		 * 
		 * */
		 
		
		//***********ilki anahtar ikinci value deger g�nderir*****
		 HashMap<String, String> kelimeler = new HashMap<String, String>(); 
		 kelimeler.put("elma","apple");
		 kelimeler.put("kalem","pencil");
		 kelimeler.put("araba","car");
		 kelimeler.put("bilgisayar","computer");
		 
		 System.out.println(kelimeler.get("elma"));
		 
		 
		 
		 /*HashMap metodlar�:
		  * out-veri eklemek i�in
		  * get-belirtilen keye sahip eleman�n value �a��rmak i�n
		  * isEmpty-HashMap bo� mu dolu mu kontrol eder
		  * remove-belirtilen isimdeki tan�mlamay� siler
		  * size-hashmap in eleman say�s�n� d�ner
		  * replace-ismi belirtilen ketyin degerini de�i�tirir
		  * containsKey-bir anahtart�n varl���n� sorgulamak i�in
		  * containsValue-bir degerin varl���n� sorgulamak i�in
		  * values-t�m value lar� d�nd�rmek i�in
		  * keySet-t�m key ler� d�nd�rmek i�in
		  * getOrDefault-
		  * 
		  */

	}

}
