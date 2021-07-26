package com.xworkz.features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.xworkz.features.DTO.FishDTO;
import com.xworkz.features.DTO.FishType;

public class FishTester {

	public static void main(String[] args){
		
     FishDTO dto1=new FishDTO("Bangde","Silver",FishType.A,1,10,"Male");
     FishDTO dto2=new FishDTO("Kudtli","White",FishType.C,3,5,"Female");
     FishDTO dto3=new FishDTO("Bayge","Silver",FishType.B,2,12,"Male");
    
     List<FishDTO> list=new ArrayList<FishDTO>();
     list.add(dto1);
     list.add(dto2);
     list.add(dto3);
     
     Comparator<FishDTO> fishName=new Comparator<FishDTO>(){

		@Override
		public int compare(FishDTO o1, FishDTO o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
    	 
     
	};
	Collections.sort(list,fishName);
	Iterator<FishDTO> itr=list.iterator(); {
		while(itr.hasNext()){
			FishDTO fish=itr.next();
			System.out.println("Sort by Name+"+fish.getName());
		}
		
	
	}
	
	   Comparator<FishDTO> fishColor=new Comparator<FishDTO>(){

		@Override
		public int compare(FishDTO o1, FishDTO o2) {
			// TODO Auto-generated method stub
			return o1.getColor().compareTo(o2.getColor());
		}

	};
	Collections.sort(list,fishColor);
	Iterator<FishDTO> itr1=list.iterator(); 
		while(itr1.hasNext()){
			FishDTO fish=itr1.next();
			System.out.println("Sort by Color "+fish.getColor());
		}
		
	
		  

				

			
			
			Comparator<FishDTO> fishLifeSpan = new Comparator<FishDTO>() {

				@Override
				public int compare(FishDTO o1, FishDTO o2) {
					if(o1.getLifeSpan() == o2.getLifeSpan())
						return 0;
					else if (o1.getLifeSpan() > o2.getLifeSpan())
						return 1;
					else 
					return -1;
				}

			};
			
			Collections.sort(list,fishLifeSpan);
			
			Iterator<FishDTO> iterate = list.iterator();
			for (Iterator iterator = list.iterator(); 
				iterator.hasNext();) {
				FishDTO fishDTO = (FishDTO) iterator.next();
				System.out.println("LifeSpan Ascending: " + fishDTO.getLifeSpan());
				
			}
			
			Comparator<FishDTO> lifeSpanDesc = new Comparator<FishDTO>() {

				@Override
				public int compare(FishDTO o1, FishDTO o2) {
					if(o2.getLifeSpan() == o1.getLifeSpan())
						return 0;
					else if(o2.getLifeSpan() > o1.getLifeSpan())
						return -1;
					else 
					
					return 1;
				}
				
			};
			
			Collections.sort(list,lifeSpanDesc.reversed());
			
			Iterator itt = list.iterator();
			for (Iterator iterator = list.iterator();
					iterator.hasNext();) {
				FishDTO fishDTO = (FishDTO) iterator.next();
				System.out.println("Life Span Descending : " + fishDTO.getLifeSpan());
				
			}
			
			Comparator<FishDTO> fishnameDesc = new Comparator<FishDTO>() {

				@Override
				public int compare(FishDTO o1, FishDTO o2) {
					
					return o2.getName().compareTo(o1.getName());
				}
				
			};
			
			Collections.sort(list,fishnameDesc);
			
			Iterator namedesc = list.iterator();
			for (Iterator iterator = list.iterator(); 
			    iterator.hasNext();) {
				FishDTO fishDTO = (FishDTO) iterator.next();
				System.out.println("Fish name Descending : " + fishDTO.getName());
				
				
			}
				
			Comparator<FishDTO> fishcostDesc = new Comparator<FishDTO>() {

				@Override
				public int compare(FishDTO o1, FishDTO o2) {
					if(o2.getCost() == o1.getCost())
						return 0;
					else if(o2.getCost() > o1.getCost())
						return -1;
					else 
						return 1;
				}
				
			};
			
		Collections.sort(list,fishcostDesc.reversed());
			
			Iterator fishcost = list.iterator();
			for (Iterator iterator = list.iterator();
				iterator.hasNext();) {
				FishDTO fishDTO = (FishDTO) iterator.next();
				System.out.println("FishCost Descending : " + fishDTO.getCost());
				
			}
}
}
