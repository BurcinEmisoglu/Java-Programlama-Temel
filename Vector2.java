import java.util.Enumeration;
import java.util.Vector;
public class Vector_Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector<String> ulkeler=new Vector<>();
		ulkeler.addElement("T�RK�YE CUMHUR�YET�");
		ulkeler.addElement("SUR�YE");
		ulkeler.addElement("K.K.T.C");
		ulkeler.addElement("RUSYA");
		ulkeler.addElement("YUNAN�STAN");
		ulkeler.addElement("BULGAR�STAN");
		ulkeler.addElement("IRAK");
		ulkeler.addElement("�RAN");
		
		
		//�TERASYON �RNEG�
		Enumeration vectorEnum=ulkeler.elements();
		
		
		while(vectorEnum.hasMoreElements()) {
			
			System.out.println(vectorEnum.nextElement());
		}

		
		for (String ulkeAdi : ulkeler) {
			System.out.println(ulkeAdi);
		}
		
		for(int i=0;i< ulkeler.size();i++)
		{
			
			System.out.println(ulkeler.get(i));
		}
		
	}

}
