package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CountryTester {

	public static void main(String[] args) {
		Map<String, Integer> nameAndPopulationMap = new HashMap<String, Integer>();
		nameAndPopulationMap.put("India", 1380004385);
		nameAndPopulationMap.put("Shrilanka", 21507776);
		nameAndPopulationMap.put("Bangladesh", 166414749);
		nameAndPopulationMap.put("Brazil", 214149270);
		nameAndPopulationMap.put("Spain", 46773858);

		System.out.println("Size of Country " + nameAndPopulationMap.size());
		System.out.println("Size of Country " + nameAndPopulationMap);
		System.out.println("Population of Country " + nameAndPopulationMap.values());

		Set<String> keySet = nameAndPopulationMap.keySet();
		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			Integer value = nameAndPopulationMap.get(string);

			System.out.println(string + " " + value);
		}

		Collection<String> strings = nameAndPopulationMap.keySet();
		Iterator<String> itr1 = keySet.iterator();
		while (itr1.hasNext()) {
			String string = itr1.next();
			Integer value = nameAndPopulationMap.get(string);

			System.out.println("Country Name =" + string);
		}
		Collection<Integer> values = nameAndPopulationMap.values();
		Iterator<Integer> itr2 = values.iterator();
		while (itr2.hasNext()) {
			Integer integer = itr2.next();

			System.out.println("Country Population =" + integer);
		}

		nameAndPopulationMap.remove("Bangladesh");
		System.out.println("Size of Country After removing Bangladesh " + nameAndPopulationMap.size());

		nameAndPopulationMap.clear();
		System.out.println("Size of Country " + nameAndPopulationMap.size());
	}

}
