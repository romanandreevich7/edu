import java.util.HashMap;
import java.util.Map;


public class Collections {
	
	
	public static Map createMap1() {
		Map<String, String> data = new HashMap <String, String> ();
		data.put("Moscow25", "778");
		String value = data.get(Grade.gradeling.Moscow.toString());
		FileCreator.x = value;
		return data;		
	}
	
	public static void createMap2() {
		Map<String, String> data1 = new HashMap <String, String> ();
	}
}
