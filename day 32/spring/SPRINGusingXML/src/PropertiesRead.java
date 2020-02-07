import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyStore.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesRead {

	public static void main(String[] args) throws IOException {
		
		Properties props=new Properties();
		FileInputStream fin=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\spring\\SPRINGusingXML\\src\\details.properties");
		props.load(fin);
		//System.out.println("username: "+props.getProperty("username"));
		props.put("email", "hameemsha121@gmail.com");
		
		Properties p=System.getProperties();
		Set set=p.entrySet();
		
//		for(Object entry:set) {
//			System.out.println(entry);
//		}
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}

}
