package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class AdharTester {

	public static void main(String[] args) {

		Map<Long, Long> adharNoAndMobNo = new HashMap<Long, Long>();
		adharNoAndMobNo.put(256314256987L, 9632145859L);
		adharNoAndMobNo.put(556314256983L, 9621507776L);
		adharNoAndMobNo.put(126314256989L, 89166414749L);
		adharNoAndMobNo.put(326314256452L, 74214149270L);
		adharNoAndMobNo.put(456314256965L, 9846773858L);

		System.out.println("Size of AdharCard " + adharNoAndMobNo.size());

		System.out.println("MobNo of Person " + adharNoAndMobNo.values());

		Set<Long> keySet = adharNoAndMobNo.keySet();
		Iterator<Long> itr = keySet.iterator();
		while (itr.hasNext()) {
			Long string = itr.next();
			Long value = adharNoAndMobNo.get(string);

			System.out.println(string + " " + value);
		}

		Collection<Long> strings = adharNoAndMobNo.keySet();
		Iterator<Long> itr1 = keySet.iterator();
		while (itr1.hasNext()) {
			Long string = itr1.next();
			Long value = adharNoAndMobNo.get(string);

			System.out.println("Country Name =" + string);
		}
		Collection<Long> values = adharNoAndMobNo.values();
		Iterator<Long> itr2 = values.iterator();
		while (itr2.hasNext()) {
			Long integer = itr2.next();

			System.out.println("Country Population =" + integer);
		}

		adharNoAndMobNo.remove("456314256965L");
		System.out.println("Size of AdharCard After removing Adhar no :456314256965L =" + adharNoAndMobNo.size());

		adharNoAndMobNo.clear();
		System.out.println("Size of Country " + adharNoAndMobNo.size());
	}

}
