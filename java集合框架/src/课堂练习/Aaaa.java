package 课堂练习;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Aaaa {
	public static void main(String[] args) {
		
	
	Map<String, Object> map=new HashMap<>();
	map.put("dog","小狗");
	map.put("cat", "小猫");
	map.put("desk", "桌子");
	System.out.println("dog对应的value值是====》"+map.get("dog"));
	
	Set<Entry<String,Object>>entrySet=map.entrySet(); 
	Iterator<Entry<String,Object>>iterator = entrySet.iterator();
	while (iterator.hasNext()) {
		Entry<String,Object>entry = iterator.next();
		String x = "";
		System.out.println(x);
		
	}
	
	
	}
}
