package sdn.hassona.issues.states;

import sdn.hassona.issues.Issue;

public class IssueFerme extends IssueStat {

	public IssueFerme(Issue issue) {
		super(issue);
	}

	@Override
	public void femer() {
		throw new IllegalStateException("issue déjà fermé... ");
	}

	@Override
	public void ouvrir() {
		issue.setIssueStat(new IssueOuvert(issue));
		
	}

	@Override
	public int distanceDeRayon(int Rayon) {
		// TODO Auto-generated method stub
	    return 10000;
	}
	
	public String toString() {
		return "Fermé";
	}

}
