package com.everis.day7.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("abc");
		list.add("def");
		list.add("yz");

		list.forEach(e -> System.out.println(e + " | "+ e.hashCode()));

		System.out.println(list);

		Set<Integer> set = new HashSet<Integer>();

		set.add(2);
		set.add(4);
		set.add(3);
		set.add(8);
		set.add(13);
		set.add(5);

		set.forEach(e -> System.out.println(e + " | "+ e.hashCode()));

		System.out.println(set);

		Map<String, String> map = new HashMap<String, String>();

		map.put("clé", "valeur");
		map.put("key", "value");
		map.put("sarout", "9ima");

		map.forEach((k, v) -> System.out.println(v.hashCode()));

		System.out.println(map);
	}
}
