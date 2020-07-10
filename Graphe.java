//package pjts_algo;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.LinkedList;


public class Graphe {
	private HashSet<Sommet> Nodes;
	
	
	
	public Graphe() {
		this.Nodes = new HashSet<Sommet>();
	}
	
	//getter and setter for Nodes
	private void setNodes(HashSet<Sommet> Nodes) {
		this.Nodes = Nodes;
	}
	public HashSet<Sommet> getNodes() {
		return Nodes;
	}
	

	//METHODES

	public void ajout_sommet(Sommet s){
		Nodes.add(s);
	}
	
	
	
	public void deleteSommet(Sommet s)
	{
		Nodes.remove(s);
	}
	

	public void afficheGrapheNodes()
	{
		for(Sommet s:getNodes())
			System.out.println(s.getNom());
	}
	
	public void afficheGraphPistes()
	{
		for (Sommet i : Nodes)
			for(Chemin c : i.getVoisins().keySet())
				System.out.println(c.nom);
	}
	
	public void afficheGraph()
	{
		System.out.println("Cette sommet + Chemin -> Sommet voisin");
		for (Sommet i : Nodes){
			for(Chemin c : i.getVoisins().keySet())
				System.out.println(i.getNom()+" + "+ c.nom +" -> "+ i.getVoisins().get(c).getNom());
		}
	}
	
	public int getSize()
	{
		return Nodes.size();
	}
	
	public Sommet returnSommet(String nom)
	{
		for (Sommet n : Nodes)
			if(n.getNom() == nom)
				return n;
		return null;
	}
	
	
	//Dijkstra :
	public static Graphe Dikjstra(Graphe graphe, Sommet source, int i) { // int i : skieur Deb(1) ou Pro(2)
	    source.setDistanceParSource(0);
	 
	    Set<Sommet> temineNodes = new HashSet<>();
	    Set<Sommet> instableNodes = new HashSet<>();
	    Integer temp=0;
	    
	    instableNodes.add(source);
	 
	    while (instableNodes.size() != 0) {
	        Sommet currentNode = PlusPetiteDistanceParSource(instableNodes);
	        instableNodes.remove(currentNode);
	        for (Entry<Chemin, Sommet> adjacencyPair: currentNode.getVoisins().entrySet()) {
	            Sommet adjacentNode = adjacencyPair.getValue();
	            if (i==1)
	            	temp = adjacencyPair.getKey().getTempSkieurDeb();	///////DEB
	            if(i==2)
	            	temp = adjacencyPair.getKey().getTempSkieurPro();	///////PRO
	            if (!temineNodes.contains(adjacentNode)) {
	                CalculeDistanceMinimum(adjacentNode, temp, currentNode);
	                instableNodes.add(adjacentNode);
	            }
	        }
	        temineNodes.add(currentNode);
	    }
	    return graphe;
	}
	
	private static Sommet PlusPetiteDistanceParSource(Set < Sommet > instableNodes) {
	    Sommet lowestDistanceSommet = null;
	    int lowestDistance = Integer.MAX_VALUE;
	    for (Sommet node: instableNodes) {
	        int nodeDistance = node.getDistanceParSource();
	        if (nodeDistance < lowestDistance) {
	            lowestDistance = nodeDistance;
	            lowestDistanceSommet = node;
	        }
	    }
	    return lowestDistanceSommet;
	}
	
	private static void CalculeDistanceMinimum(Sommet evaluationSommet, Integer edgeWeigh, Sommet sourceSommet) {
			    Integer sourceDistance = sourceSommet.getDistanceParSource();
			    if (sourceDistance + edgeWeigh < evaluationSommet.getDistanceParSource()) {
			        evaluationSommet.setDistanceParSource(sourceDistance + edgeWeigh);
			        LinkedList<Sommet> shortestPath = new LinkedList<>(sourceSommet.getPlusCourtChemin());
			        shortestPath.add(sourceSommet);
			        evaluationSommet.setPlusCourtChemin(shortestPath);
			    }
			}
	
}