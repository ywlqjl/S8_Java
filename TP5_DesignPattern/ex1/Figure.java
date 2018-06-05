package ex1;

import java.util.ArrayList;

public class Figure extends Objet implements Component {

	private ArrayList<Objet> objetList;
	
	public ArrayList<Objet> getObjetList() {
		return objetList;
	}

	public void setObjetList(ArrayList<Objet> objetList) {
		this.objetList = objetList;
	}



	public Figure() {
		objetList = new ArrayList<Objet>();
	}
	
	
	
	//Ce sont des methodes de la figure (composite)
	public void ajouter(Objet o) {
		objetList.add(o);
	}
	public void retirer(Objet o) {
		objetList.remove(o);
	}
	public void getEnfant() {
		for(int i = 0; i<objetList.size();i++){
			System.out.println(i);
			objetList.get(i).dessiner();
		}
	}

	@Override
	public void tranlater() {
		getEnfant();
	}

	@Override
	public void dessiner() {
		System.out.println("Dessiner une figure");
	}


}
