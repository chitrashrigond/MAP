package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GovtTester {

	public static void main(String[] args) {

		Map<String, Integer> officialAndSallaryMap = new HashMap<String, Integer>();
		officialAndSallaryMap.put("DC", 100000);
		officialAndSallaryMap.put("Tashildar", 65000);
		officialAndSallaryMap.put("BO", 70000);
		officialAndSallaryMap.put("PDO", 45000);
		officialAndSallaryMap.put("CM", 60000);

		System.out.println("Size of Official " + officialAndSallaryMap.size());

		System.out.println("Sallary of Official " + officialAndSallaryMap.values());

		Set<String> keySet = officialAndSallaryMap.keySet();
		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			Integer value = officialAndSallaryMap.get(string);

			System.out.println(string + " " + value);
		}

		Collection<String> strings = officialAndSallaryMap.keySet();
		Iterator<String> itr1 = keySet.iterator();
		while (itr1.hasNext()) {
			String string = itr1.next();
			Integer value = officialAndSallaryMap.get(string);

			System.out.println("Official  =" + string);
		}
		Collection<Integer> values = officialAndSallaryMap.values();
		Iterator<Integer> itr2 = values.iterator();
		while (itr2.hasNext()) {
			Integer integer = itr2.next();

			System.out.println("Sallary =" + integer);
		}

		officialAndSallaryMap.remove("CM");
		System.out.println("Size of Official After removing CM " + officialAndSallaryMap.size());

		officialAndSallaryMap.clear();
		System.out.println("Size of Country " + officialAndSallaryMap.size());
	}

}
