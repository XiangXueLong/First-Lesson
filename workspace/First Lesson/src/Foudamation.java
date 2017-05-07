import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Foudamation {
	public static void main(String[] args) {
		//print(1, "hello world");
		//operator();
		//controlFlow();
		//doString();
		//doList();
		//doSet();
		//doMap();
		//doException();
		doRandom();
	}
	
	public static void print(int index, Object obj) {
		System.out.println(String.format("{%d},%s", index,  obj.toString()));
	}
	//运算符操作
	public static void operator() {
		print(1, 5 + 2);
		print(2, 5 - 2);
		print(3, 5 * 3);
		print(4, 5 / 4);
		print(5, 5 % 2);
		print(6, 5/2.0);
		print(7, 5 >> 2);
		print(8, 5 << 2);
		print(9, 5 & 2);
		print(10, 5 | 2);
		print(11, 5 ^ 2);
		print(12, 5 == 2);
		print(13, 5 != 2);
		
		int a = 2;
		double b = 3.0;
		a += b;
		print(14, a);
	}
	//控制流操作
	public static void controlFlow() {
		int score = 65;
		if(score > 80 && score <= 100) {
			print(1, "A");
		} else if(score > 60 && score <= 80) {
			print(2, "B");
		} else {
			print(3, "C");
		}
		
		String grade = "B";
		switch(grade) {
		case "A" :
			print(4, "score > 80 && score <= 100");
			break;
		case "B" : 
			print(5, "score > 60 && score <= 80");
			break;
		default :
			print(6, "score >= 0 && score <= 60");
		}
		
		for(int i=0; i<6; i++) {
			if(i == 1) {
				continue;
			}
			if(i == 5) {
				break;
			}
			if(i % 2 == 1) {
				print(7, "i%2=1");
			}
			print(8, i);
		}
		
		String str = "hello world";
		for(char c : str.toCharArray()) {
			print(9, c);
		}
		
		int value = 30;
		int current = 0;
		while(current < value) {
			current += 5;
			print(10, current);
			if(current == 20) {
				break;
			}
		}
	}
	//字符串操作
	public static void doString() {
		String str = "hello world";
		print(1, str.charAt(4));
		print(2, str.codePointAt(3));
		print(3, str.compareTo("hello teacher"));
		print(4, str.compareTo("hello world"));
		print(5, str.compareToIgnoreCase("Hello World"));
		print(6, str.concat(" I am coming"));
		print(7, str.contains("hello"));
		print(8, str.endsWith("world"));
		print(9, str.startsWith("Hi"));
		print(10, str.indexOf('l'));
		print(11, str.lastIndexOf('l'));
		print(12, str.length());
		print(13, str.split(" "));
		print(14, str.toUpperCase());
		print(15, str.replace('o','a'));
		print(16, str.replaceAll("o|l", "a"));
		print(17, str.replaceAll("world", "country"));
		
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(110);
		sb.append(false);
		print(18, sb.toString());
		print(19, sb.capacity());
		print(20, "a" + "b" + String.valueOf('c'));
	}
	//List操作
	public static void doList() {
		List<String> list = new ArrayList<>();
		for(int i=0; i<5; i++) {
			list.add(String.valueOf(i));
		}
		print(1, list);
		List<String> listA = new ArrayList<>();
		for(int i=0; i<4; i++) {
			listA.add(String.valueOf(i*i));
		}
		list.addAll(listA);
		print(2, list);
		list.remove(0);
		print(3, list);
		list.remove(String.valueOf(3));
		print(4, list);
		print(5, list.contains(3));
		print(6, list.get(2));
		print(7, list.isEmpty());
		print(8, list.set(0, "a"));
		print(9, list.size());
		
		Collections.sort(list);
		print(10, list);
		Collections.reverse(list);
		print(11, list);
		
		int[] array = new int[] {1,2,3,4};
		print(12, array[2]);
	}
	//Set操作:不包括重复元素
	public static void doSet() {
		Set<String> set = new HashSet<>();
		for(int i=0; i<5; i++) {
			set.add(String.valueOf(i));
			set.add(String.valueOf(i));
		}
		print(1, set);
		set.remove("1");
		print(2, set);
		print(3, set.contains("3"));
		set.addAll(Arrays.asList(new String[] {"a","b","c"}));
		print(4, set);
		
		for(String str : set) {
			print(5, str);
		}
		
		print(6, set.isEmpty());
		print(7, set.size());
	}
	//Map操作
	public static void doMap() {
		Map<String, String> map = new HashMap<>(); 
		for(int i=0; i<5; i++) {
			map.put(String.valueOf(i), String.valueOf(i*i));
		}
		print(1, map);
		for(Map.Entry<String, String> entry : map.entrySet()) {
			print(2, entry.getKey() + ":" + entry.getValue());
		}
		print(3, map.keySet());
		print(4, map.values());
		print(6, map.get("1"));
		print(7, map.containsKey("4"));
		print(8, map.replace("1", "true"));
		print(9, map);
	}
	//异常处理
	public static void doException() {
		try {
			print(1, "I miss you");
			int a  = 4;
			a = a / 0;
			String b = null;
			b.indexOf('a');
		} catch (NullPointerException e) {
			print(3, "NPE");
		} catch(Exception e) {
			print(4, "Exception");
		} finally {
			print(2, "finally");
		}
	}
	//随机数，时间，Math类等操作
	public static void doRandom() {
		Random r = new Random();
		r.setSeed(1);
		for(int i=0; i<5; i++) {
			print(1, r.nextInt(100));
			print(2, r.nextDouble());
		}
		List<Integer> l = Arrays.asList(new Integer[] {1,2,3,4,5});
		print(3, l);
		Collections.shuffle(l);
		print(4, l);
		
		Date date = new Date();
		print(5, date);
		print(6, date.getTime());
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		print(7, df.format(date));
		
		print(8, UUID.randomUUID());//随机产生32位的UUID
		print(9, Math.abs(-5));
		print(10, Math.max(2, 5));
		print(11, Math.pow(3, 6));
		print(12, Math.round(5.8));
		print(13, Math.ceil(2.3));
		print(14, Math.floor(3.5));
		print(15, Math.rint(5.8));
		print(16, Math.signum(-5));
	}
} 
