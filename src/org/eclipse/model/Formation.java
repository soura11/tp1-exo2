package org.eclipse.model;

import java.util.Arrays;

public class Formation {
	private String intitulé;
	private int nbrJours;
	private Stagiaire[] stagiaires;

	public Formation() {

	}

	public Formation(String intitulé, int nbrJours, Stagiaire... stagiaires) {
		super();
		this.intitulé = intitulé;
		this.nbrJours = nbrJours;
		this.stagiaires = stagiaires;
	}

	public String getIntitulé() {
		return intitulé;
	}

	public void setIntitulé(String intitulé) {
		this.intitulé = intitulé;
	}

	public int getNbrJours() {
		return nbrJours;
	}

	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
	}

	public Stagiaire[] getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(Stagiaire[] stagiaires) {
		this.stagiaires = stagiaires;
	}

	public float calculerMoyenneFormation() {
		var somme = 0;
		for (var elt : stagiaires) {
			somme += elt.calculerMoyenne();
		}
		return somme / stagiaires.length;
	}

	public int trouverIndiceMax() {
		var indiceMax = 0;
		var max = stagiaires[0].calculerMoyenne();
		for (var i = 1; i < stagiaires.length; i++) {
			if (max < stagiaires[i].calculerMoyenne()) {
				max = stagiaires[i].calculerMoyenne();
				indiceMax = i;
			}
		}
		return indiceMax;
	}
	// reponse 9
	public String trouverNomMax() {
		String nomMax = stagiaires[0].getNom();
		var max = stagiaires[0].calculerMoyenne();
		for (var i = 1; i < stagiaires.length; i++) {
			if (max < stagiaires[i].calculerMoyenne()) {
				max = stagiaires[i].calculerMoyenne();
				nomMax = stagiaires[i].getNom();
			}
		}
		return nomMax;

	}
	// reponse 10
	public float trouverMinMax() {
		float minMax = 0;
		var max = stagiaires[0].calculerMoyenne();
		for (var i = 1; i < stagiaires.length; i++) {
			if (max < stagiaires[i].calculerMoyenne()) {
				max = stagiaires[i].calculerMoyenne();
				minMax = stagiaires[i].trouverMin();
			}
		}
		return minMax;
	}
	// reponse 11
	public float trouverMoyenneParNom(String nom) {
		String nomStagiaire = stagiaires[0].getNom();
		float[] moyenneParNom = stagiaires[0].getNotes(); 
		int i = 0;
		return stagiaires[i].calculerMoyenne();
	}

	@Override
	public String toString() {
		return "Formation [intitulé=" + intitulé + ", nbrJours=" + nbrJours + ", stagiaires="
				+ Arrays.toString(stagiaires) + "]";
	}

}
