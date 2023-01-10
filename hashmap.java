package com.java;
import java.util.HashMap;
import java.util.Map;
import javax.swing.text.Keymap;

public class hashmap {
public static void main(String[] args) {
	Map <Integer,Object> m = new HashMap<>();
	m.put(1, "hello");
	m.put(2, "hi");
	m.put(3, "java");
	m.put(3, null);
	
	System.out.println(m);
	
	Map <String,Integer>m1 = new HashMap<>();
	m1.put("core", 1);
	m1.put(null, null);
	m1.put("rushi", 28);
	System.out.println(m1);
}
}
