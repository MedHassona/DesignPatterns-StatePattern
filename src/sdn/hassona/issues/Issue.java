package sdn.hassona.issues;

import sdn.hassona.issues.states.IssueOuvert;
import sdn.hassona.issues.states.IssueStat;

public class Issue {
	
	private IssueStat issueStat;
	private int NomberDePersonne = 0;
	private int NbRayon;
	private String id;
	
	public Issue(String idIssue, int nbRayon) {
		this.id = idIssue;
		this.NbRayon = nbRayon;
		this.issueStat = new IssueOuvert(this);
	}

	public IssueStat getIssueStat() {
		return issueStat;
	}

	public void setIssueStat(IssueStat issueStat) {
		this.issueStat = issueStat;
	}

	public int getNomberDePersonne() {
		return NomberDePersonne;
	}

	public void setNomberDePersonne(int nomberDePersonne) {
		NomberDePersonne = nomberDePersonne;
	}

	public int getNbRayon() {
		return NbRayon;
	}

	public void setNbRayon(int nbRayon) {
		NbRayon = nbRayon;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

}
