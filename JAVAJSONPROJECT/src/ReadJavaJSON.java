import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

public class ReadJavaJSON {
	public static void main(String[] args) throws Exception  
    {
		Object obj = new JSONParser().parse(new FileReader("JSONExample.json")); 
		JSONObject jo = (JSONObject) obj; 
		Map quiz= ((Map)jo.get("quiz")); 
        
        
        Iterator<Map.Entry> itr1 = quiz.entrySet().iterator(); 
        while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
    
    }
    

}
