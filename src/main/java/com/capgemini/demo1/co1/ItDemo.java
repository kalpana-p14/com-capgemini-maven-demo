package com.capgemini.demo1.co1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItDemo {

	public static void main(String[] args) {
List<String>list = new ArrayList<>();
list.add("sonu");
list.add("monu");
list.add("tonu");
list.add("konu");

System.out.println(list);
System.out.println("iterate using for loop");
for(int i = 0; i < list.size(); i++) {
	System.out.println(list.get(i));
}
System.out.println("iterate using for each loop");
	for(String elem:list) {
		System.out.println(elem);
	}
	System.out.println("iterate using iterator:");
	Iterator<String> it = list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
	}


