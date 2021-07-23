package com.xworkz.dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PersonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> nameAndFavFoodMap = new HashMap<String, String>();
		nameAndFavFoodMap.put("Chitra", "CrabFry");
		nameAndFavFoodMap.put("Shahsikumar", "ChickenBiryani");
		nameAndFavFoodMap.put("Ravikumar", "ChikenKabab");
		nameAndFavFoodMap.put("Nagaraj", "MasalDose");
		nameAndFavFoodMap.put("Jaideep", "FishFry");

		System.out.println("Size of Persons " + nameAndFavFoodMap.size());
		System.out.println("Size of Persons " + nameAndFavFoodMap);
		System.out.println("Persons Name " + nameAndFavFoodMap.values());

		Set<String> keySet = nameAndFavFoodMap.keySet();
		Iterator<String> itr = keySet.iterator();
		while (itr.hasNext()) {
			String string = itr.next();
			String string1 = nameAndFavFoodMap.get(string);

			System.out.println("Name and FavFood : " + string + " " + string1);
		}

		Collection<String> strings = nameAndFavFoodMap.keySet();
		Iterator<String> itr1 = keySet.iterator();
		while (itr1.hasNext()) {
			String string = itr1.next();
			String value = nameAndFavFoodMap.get(string);

			System.out.println("Person Name =" + string);
		}
		Collection<String> values = nameAndFavFoodMap.values();
		Iterator<String> itr2 = values.iterator();
		while (itr2.hasNext()) {
			String string = itr2.next();

			System.out.println(" FavFood :" + string);
		}

		nameAndFavFoodMap.remove("Chitra");
		System.out.println("Size of Country After removing Chitra " + nameAndFavFoodMap.size());

		nameAndFavFoodMap.clear();
		System.out.println("Size of Persons " + nameAndFavFoodMap.size());
	}

}
