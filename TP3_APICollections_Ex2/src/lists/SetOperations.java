package lists;

import java.util.ArrayList;

public class SetOperations {

	public static ArrayList<Integer> Create(int element){
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(element);
		return set;

	}
	
	public void addElement(ArrayList<Integer> set, int element){
		set.add(element);
	}
	
	public void showAllElements(ArrayList<Integer> set){
		System.out.println(set);
	}
	
	public void setUnion(ArrayList<Integer> set1, ArrayList<Integer> set2){
		ArrayList<Integer> setUnion = new ArrayList<Integer>();
		
		for(int i = 0; i<set1.size(); i++){
			setUnion.add(set1.get(i));
		}
		
		for(int i = 0; i<set2.size(); i++){
			if(!setUnion.contains(set2.get(i))){
				setUnion.add(set2.get(i));
			}
		}
		
		System.out.println("setUnion:"+setUnion);
		
	}
	
	
	public void setIntersection(ArrayList<Integer> set1, ArrayList<Integer> set2){
		ArrayList<Integer> setIntersection = new ArrayList<Integer>();
		
		for(int j = 0; j<set2.size(); j++){
			if(set1.contains(set2.get(j))){
				setIntersection.add(set2.get(j));
			}
		}
		System.out.println("setIntersection:"+setIntersection);
	}
	
	
	//Q2
	public boolean appartenance(ArrayList<Integer> set, int element){
		if(set.contains(element)){
			System.out.println("Yes, "+element+"\t  belongs to the set.");
			return true;
		}
		return false;
		
	}
	
	
	public int nbElements(ArrayList<Integer> set){
		
		System.out.println("There are   " + set.size()+"   elements in the set.");
		return set.size();
		
	}
}
