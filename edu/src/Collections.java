import java.util.HashMap;
import java.util.Map;


public class Collections {
	
	public static String createMap() {
		Map<String, String> data = new HashMap <String, String> ();
		data.put("Moscow", "777");
		String value = data.get(Grade.gradeling.Moscow.toString());
		return value;
	}

}
