import java.util.HashMap;
import java.util.Map;


public class Collections {
	
	
	public static String createMap() {
		Map<String, String> data = new HashMap <String, String> ();
		data.put("Moscow", "778");
		String value = data.get(Grade.gradeling.Moscow.toString());
		FileCreator.x = value;
		return value;		
	}
}
