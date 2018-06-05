package tp4_APICollections_Suite;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author yanwenli
 *
 */

public class ListOperation {

	/**
	 * Create une nouvelle liste chaine
	 * @return
	 */
	public LinkedList<String> CreateList(){
		LinkedList<String> list = new LinkedList<String>();
		return list;
		
	}
	
	/**
	 * Ajouter un element dans la liste chaine
	 * @param list
	 * @param element
	 * @return
	 */
	public LinkedList<String> ajouterElement(LinkedList<String> list, String element){
		list.add(element);
		return list;
	}
	public LinkedList<String> ajouterElement2(LinkedList<String> list, List<String> elements){
		list.addAll(elements);
		return list;
	}	
	
	/**
	 * Afficher tous les elements dans la liste chaine.
	 * @param list
	 */
	public void afficherAll(LinkedList<String> list){
	    System.out.println("LinkedList:" + list);	
	}
	
	
	//methode 1
	/**
	 * Afficher les elements dans la liste a partir d'un position.
	 * @param list
	 * @param pos
	 */
	public void afficherSublistAvecPos(LinkedList<String> list, int pos){
		System.out.println(list.subList(pos, list.size()));
	}
	
	
	/**
	 * Afficher les éléments de la liste dans le sens inverse
	 * @param list
	 */
	public void afficherInverse(LinkedList<String> list){
		Collections.reverse(list);
		System.out.println(list);
	}
	
	/**
	 * Rajouter un élément donné à une position spécifique de la liste
	 * @param list
	 * @param element
	 * @param pos
	 * @return
	 */
	public LinkedList<String> ajouterElementParPosition(LinkedList<String> list, String element, int pos){
		list.add(pos, element);
		return list;
	}
	
	/**
	 * Insérer deux éléments en tête et en queue de liste
	 * @param list
	 * @param ele1
	 * @param ele2
	 * @return
	 */
	public LinkedList<String> ajouterElementEnTete(LinkedList<String> list, String ele1, String ele2){
		list.add(0, ele1);
		list.add(0, ele2);
		
		return list;
	}
	
	/**
	 * Ajouter des éléments données à des emplacements spécifiques
	 * @param list
	 * @param ele1
	 * @param ele2
	 * @return
	 */
	public LinkedList<String> ajouterElementEnQueue(LinkedList<String> list, String ele1, String ele2){
		list.add(list.size(), ele1);
		list.add(list.size(), ele2);
		
		return list;
	}
	
	
	/**
	 * Emplacement à la postision Specifique - facon1
	 * @param list
	 * @param ele
	 * @param pos
	 * @return
	 */
	public LinkedList<String> EmplacementSpecifique(LinkedList<String> list, String ele, int pos){
		list.add(pos, ele);
		return list;
	}

	
	/**
	 * Emplacement à la postision Specifique - facon2
	 * @param list
	 * @param a
	 * @param index
	 * @return
	 */
	public LinkedList<String> EmplacementSpecifique2(LinkedList<String> list, String[] a, int[] index){
		for(int i = 0; i< a.length; i++){
			list.add(index[i],a[i]);
		}
		return list;
	}
	
	/**
	 * Afficher tous les éléments avec leurs indices dans la liste
	 * @param list
	 */
	public void afficherAvecIndex(LinkedList<String> list){

		for(int i = 0; i < list.size(); i++){
			System.out.println(i+":"+list.get(i));
		}
		
	}
	
	/**
	 * Vérifier si un élément appartient à la liste
	 * @param list
	 * @param ele
	 * @return
	 */
	public boolean appartenance(LinkedList<String> list, String ele){
		if(list.contains(ele)){
			System.out.println("yes,"+ele+"\tbelongs to it.");
			return true;
		}
		else
			return false;
	}
	
	
	/**
	 * Supprimer un Element
	 * @param list
	 * @param ele
	 */
	public void supprimerElement(LinkedList<String> list, String ele){
		list.remove(ele);
	}
	
	/**
	 * Supprimer dernier Element
	 * @param list
	 */
	public void supprimerDernier(LinkedList<String> list){
		list.removeLast();
	}
	

	/**
	 * Supprimer premier Element
	 * @param list
	 */
	public void supprimerPremier(LinkedList<String> list){
		list.removeFirst();
	}
	
	/**
	 * Permuter les éléments de la liste
	 * @param list
	 * @param ele1
	 * @param ele2
	 */
	public void permuter(LinkedList<String> list, String ele1, String ele2){
		int index1 = list.indexOf(ele1);
		int index2 = list.indexOf(ele2);
		Collections.swap(list, index1, index2);
	}
	
	/**
	 * Mélanger les éléments de la liste
	 * @param list
	 */
	public void melanger(LinkedList<String> list){
		Collections.shuffle(list);
	}
	
	/**
	 * Dupliquer la liste dans une nouvelle liste
	 * @param src
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public LinkedList<String> duplicate(LinkedList<String> src){
		return (LinkedList<String>) src.clone();
//		Collections.copy(dest, src);
	}
 
	/**
	 * Récupérer (sans supprimer) le premier élément
	 * @param list
	 * @return
	 */
	public String recupererFirstElement(LinkedList<String> list){
		return list.getFirst();	
	}
	
	/**
	 * Récupérer (sans supprimer) le dernier élément
	 * @param list
	 * @return
	 */
	public String recupererLastElement(LinkedList<String> list){
		return list.getLast();	
	}
	

	/**
	 * Remplacer un élément d’indice i.
	 * @param list
	 * @param ele
	 * @param pos
	 */
	public void remplacerElement(LinkedList<String> list, String ele, int pos){
		list.set(pos, ele);
	}
	
	/**
	 * Convertir la liste en ArrayList
	 * @param list
	 * @return
	 */
	public ArrayList<String> LinkToArray(LinkedList<String> list){
		ArrayList<String> arrayList = new ArrayList<String>(list);  
		return arrayList;  
	}
	
	/**
	 * Vérifier si une liste est vide
	 * @param list
	 * @return
	 */
	public boolean listVide(LinkedList<String> list){
		if(list.isEmpty()){
			return true;
		}
		else
			return false;
	}
	
	/**
	 * Comparer la liste avec une liste donnée
	 * @param list1
	 * @param list2
	 * @return
	 */
	public boolean comparerLists(LinkedList<String> list1, LinkedList<String> list2){
		if((list1.containsAll(list2)) && (list2.containsAll(list1))){
			System.out.println("Yes, list1 = list2");
			return true;
		}
		else
			System.out.println("No, list1 != list2");
			return false;
	}
	
	
	
}
