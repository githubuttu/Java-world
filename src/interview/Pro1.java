package interview;

import java.util.HashMap;
import java.util.Map;

public class Pro1 {

	public static void main(String[] args) {
		String str = "001110100000111111100011";
		char[] s = str.toCharArray();
		int c = s[0];
		int index = 0;
		int count = 1;
		Map<String,Integer> hash = new HashMap<String, Integer>();
		hash.put("ZeroCount", 0);
		hash.put("OneCount",0);
		hash.put("ZeroIndex", 0);
		hash.put("OneIndex",0);
		// We can also use getOrDefault() method of hashmap 
		for(int i=0; i<s.length; i++) {
			if(s[i]==c) {
				count++;
				if(c=='0' && hash.get("ZeroCount")<count) {
					hash.put("ZeroCount", count);
					hash.put("ZeroIndex", index);
				} else if(c=='1' && hash.get("OneCount")<count) {
					hash.put("OneCount", count);
					hash.put("OneIndex", index);
				}
			} else {
				c = s[i];
				index = i;
				count =1;
			}
		}
		if(hash.get("ZeroCount")==hash.get("OneCount")){
			System.out.println("Equal -> " + hash.get("ZeroCount") + " times at index -> " + hash.get("ZeroIndex"));
		}else if(hash.get("ZeroCount")>hash.get("OneCount")) {
			System.out.println("0 -> " + hash.get("ZeroCount") + " times at index -> " + hash.get("ZeroIndex"));
		} else {
			System.out.println("1 -> " + hash.get("OneCount") + " times at index -> " + hash.get("OneIndex"));
		}
	}
}