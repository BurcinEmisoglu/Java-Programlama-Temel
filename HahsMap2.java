import java.util.HashMap;
import java.util.Scanner;

public class HahsMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//d��ar�dan n adet deger giriniz.
		HashMap<String, String> hash = new HashMap<String, String>(); 
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Ka� tane veri girisi");
			int n=sc.nextInt();
			
			
			for (int i = 0; i < n; i++) {
				
				System.out.println((i+1)+"key");
				String key=sc.next();
				System.out.println((i+1)+"value");
				String value=sc.next();
				
				
			hash.put(key, value);
		
				
				
			}
			
			System.out.println("key");
			String don=sc.next();
			
		
			
			hash.getOrDefault(don, "girdiginiz kelime yok");
			
		if(hash.containsKey(don)) {
				
			System.out.println(hash.get(don));	
		

		}
			else {
				System.out.println("b�yle bir deger yok");
				
		
	}
	}
}
