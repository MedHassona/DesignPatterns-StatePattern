package sdn.hassona.issues;

import java.util.HashMap;
import java.util.Map;


public class SuperMarche {
	
	private Map<String, Issue> issuesSecours;
	
	private int nombreDeRayon;
	
	/**
     * @param nombreDeRayon: the number of the shelves in the supermarket
     * @param issues: an array of descriptions of the shelves of the supermarket. 
     *                   the format of a description "[shelf_id]:[correspond_exit_of_shelf]".
     */
	public SuperMarche(int nombreDeRayon, String... issues) {
		this.nombreDeRayon = nombreDeRayon;
		this.issuesSecours = new HashMap<>();
		
		for(String issue : issues) {
			String id = issue.split(":")[0];
			int rayon = Integer.valueOf(issue.split(":")[1]);
			Issue iSSue = new Issue(id, rayon);
			/**
			 * A shelf is created as open by default.  
			 */
			this.issuesSecours.put(id, iSSue);
		}
		
	}
	
	
	public String selectIssueFrom(int nbIssue) {
		Map<String, Issue> issuesOuverts = new HashMap<>();
		int dist = nombreDeRayon;
		String idProche = null;
		for(String id : issuesSecours.keySet()) {
			if(issuesSecours.get(id).getIssueStat().distanceDeRayon(nbIssue) <= nombreDeRayon)
				issuesOuverts.put(id, issuesSecours.get(id));
		}
		
		for(String id : issuesOuverts.keySet()) {
			if(issuesOuverts.get(id).getIssueStat().distanceDeRayon(nbIssue) < dist) {
				dist = issuesOuverts.get(id).getIssueStat().distanceDeRayon(nbIssue);
				idProche = id;
			}
			if(issuesOuverts.get(id).getIssueStat().distanceDeRayon(nbIssue) == dist) {
				if(issuesOuverts.get(id).getNomberDePersonne() < issuesOuverts.get(idProche).getNomberDePersonne()){
					dist = issuesOuverts.get(id).getIssueStat().distanceDeRayon(nbIssue);
					idProche = id;
				}
			}
		}
		
		return idProche;
	}
	
	public void fermer(String idIssu) {
		Issue issu = issuesSecours.get(idIssu);
		issu.getIssueStat().femer();
	}


	public Map<String, Issue> getIssuesSecours() {
		return issuesSecours;
	}


	public void setIssuesSecours(Map<String, Issue> issuesSecours) {
		this.issuesSecours = issuesSecours;
	}

	

}
