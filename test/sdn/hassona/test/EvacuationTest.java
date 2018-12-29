package sdn.hassona.test;


import static org.junit.Assert.*;

import org.junit.Test;

import sdn.hassona.issues.SuperMarche;

public class EvacuationTest {
	
	
	@Test
	public void issuePlusProche1() {
		int nombreDeRayon = 10;
		SuperMarche superMarche = new SuperMarche(nombreDeRayon, "issu1:3","issu2:9");
		/*  les deux issues sont toutes les deux ouverts
		 * 
		   *                    issu1                         issu2
		   *                     ||                            ||
		   *           
		   *           ||   ||   ||   ||   ||   ||   ||   ||   ||   ||  
		   *           r1   r2   r3   r4   r5   r6   r7   r8   r9   r10
		   *  Si l'évacuation est faite du rayon 5 l'issue la plus proche est issu1
		   * */
		   String issueId = superMarche.selectIssueFrom(5);
		   assertEquals("issu1", issueId);
	}
	
	@Test
	public void issuePlusProche2() {
		int nombreDeRayon = 10;
		SuperMarche superMarche = new SuperMarche(nombreDeRayon, "issu1:3","issu2:10");
		/*  fermer l'issue 1
		 * 
		   *				   issu1
		   *                    ____                              issu2
		   *                     ||                                 ||
		   *           
		   *           ||   ||   ||   ||   ||   ||   ||   ||   ||   ||  
		   *           r1   r2   r3   r4   r5   r6   r7   r8   r9   r10
		   * */
		superMarche.fermer("issu1");
		String issueId = superMarche.selectIssueFrom(4);
		assertEquals("issu2", issueId);
	}
	
	@Test
	public void issuePlusProche3() {
		int nombreDeRayon = 10;
		SuperMarche superMarche = new SuperMarche(nombreDeRayon, "issu1:3","issu2:9");
		// la distance vers l'issue 1 et 2 est la même, mais le nombre de pesonnes 
		// à évacuer par l'issue 1 est plus élevé. L'évacuation choisit l'issue 2
		superMarche.getIssuesSecours().get("issu1").setNomberDePersonne(10);
		superMarche.getIssuesSecours().get("issu2").setNomberDePersonne(4);
		String issueId = superMarche.selectIssueFrom(6);
		assertEquals("issu2", issueId);
	}
	

}
