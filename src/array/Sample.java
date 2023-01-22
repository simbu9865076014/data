package array;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sample   {
	public static void main(String[] args) {
		Map<String,String>m=new HashMap<>();
		m.put("name", "simbu");
		m.put("email", "simbu@gmail.com");
		m.put("native", "tiruppur");
		m.put("city", "chennai");
		Set<java.util.Map.Entry<String,String>> entrySet = m.entrySet();
		for (java.util.Map.Entry<String, String> entry : entrySet) {
			System.out.println(entry);
			String key = entry.getKey();
			System.out.println(key);
			String value = entry.getValue();
			System.out.println(value);
		}
	}

	}
