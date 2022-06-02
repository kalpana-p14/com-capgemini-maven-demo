package com.capgemini.demo1.co1;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
// list marks = new ArrayList();
		List<Integer> marks = new ArrayList();
		marks.add(98);
		marks.add(95);
		//marks.add(99.99);
		//marks.add("kalpa");
		//marks.add(false);
		System.out.println(marks);
	}

}
