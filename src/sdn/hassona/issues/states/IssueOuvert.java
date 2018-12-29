package sdn.hassona.issues.states;

import sdn.hassona.issues.Issue;

public class IssueOuvert extends IssueStat {

	public IssueOuvert(Issue issue) {
		super(issue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void femer() {
		issue.setIssueStat(new IssueFerme(issue));
		
	}

	@Override
	public void ouvrir() {
		throw new IllegalStateException("issue déjà ouvert... ");
		
	}

	@Override
	public int distanceDeRayon(int Rayon) {
		// TODO Auto-generated method stub
		return Math.abs(issue.getNbRayon() - Rayon);
	}
	
	public String toString() {
		return "Ouvert";
	}

}
