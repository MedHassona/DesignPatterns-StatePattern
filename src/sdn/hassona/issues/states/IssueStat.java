package sdn.hassona.issues.states;

import sdn.hassona.issues.Issue;

public abstract class IssueStat {
	
	protected Issue issue;
	
	public IssueStat(Issue issue) {
		super();
		this.issue = issue;
	}
	
	
	public abstract void femer();
	public abstract void ouvrir();
	
	public abstract int distanceDeRayon(int Rayon);

}
