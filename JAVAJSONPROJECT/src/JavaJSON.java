
import java.io.FileNotFoundException; 
import java.io.PrintWriter; 
import java.util.LinkedHashMap; 
import java.util.Map; 
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 

  
public class JavaJSON {
	public static void main(String[] args) throws FileNotFoundException  
    {
		JSONObject jo = new JSONObject(); 
		JSONArray ja = new JSONArray(); 
		Map m1 = new LinkedHashMap(2); 
		Map m2 = new LinkedHashMap(1); 
		Map m3 = new LinkedHashMap(1); 
		Map m4 = new LinkedHashMap(1); 
		Map m5 = new LinkedHashMap(1); 
		Map m6 = new LinkedHashMap(1); 
		Map m7 = new LinkedHashMap(1); 
		
		
		m1.put("option1", "True");
		m1.put("option2", "False");
		m2.put("options", m1);
		m3.put("correctoption", "option1");

		m5.put("question",  "1. Python is a high-level, interpreted, interactive and object-oriented scripting language.");
		ja.add(m3);
		ja.add(m2);
		ja.add(m5);
		m4.put("questions", ja);
		m6.put("quiz1",m4);
		
		jo.put("quiz", m6);
		
		PrintWriter pw = new PrintWriter("JSONExample.json"); 
		pw.write(jo.toJSONString()); 
        
        pw.flush(); 
        pw.close(); 
		
		
    }
    

}
