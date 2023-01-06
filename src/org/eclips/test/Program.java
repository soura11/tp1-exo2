package org.eclips.test;

import org.eclipse.model.Formation;
import org.eclipse.model.Stagiaire;

public class Program {

	public static void main(String[] args) {
		Stagiaire stag1 = new Stagiaire("Sou", 10, 12, 14);
		System.out.println(stag1);
		System.out.println(stag1.calculerMoyenne());
		System.out.println(stag1.trouverMax());
		System.out.println(stag1.trouverMin());
		
		Formation stag2 = new Formation("POEC", 57, new Stagiaire("Sou", 15, 12, 14), new Stagiaire("Ra", 14, 13, 12), new Stagiaire("Ya", 16, 17, 18));
		System.out.println(stag2);
		System.out.println(stag2.calculerMoyenneFormation());
		System.out.println(stag2.trouverIndiceMax());
		System.out.println(stag2.trouverNomMax());
		System.out.println(stag2.trouverMinMax());
		System.out.println(stag2.trouverMoyenneParNom("Sou"));
		System.out.println(stag2.trouverMoyenneParNom("Ra"));
	}
	
	}
	



	

