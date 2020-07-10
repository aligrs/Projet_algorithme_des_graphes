
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class Sommet {
	
	private String nom;
	//private boolean marque =false;
	private HashMap <Chemin, Sommet> voisins;
	
	private LinkedList<Sommet> PlusCourtChemin = new LinkedList<>();

	private Integer distanceParSource = Integer.MAX_VALUE;


	//Constructor
	
	Sommet(String nom, Sommet voisin, Chemin cheminVoisin)
	{
		this.nom= nom;
		//voisins.put(cheminVoisin, voisin);
		
		
		HashMap<Chemin, Sommet> v = new HashMap<Chemin, Sommet>();
		this.voisins= v;
		voisins.put(cheminVoisin, voisin);
		
	}
	
	Sommet(String nom)
	{
		this.nom = nom;
		HashMap<Chemin, Sommet> v = new HashMap<Chemin, Sommet>();
		this.voisins= v;
		//voisins=new HashMap<Chemin, Sommet>();
	}
	/*
	Sommet()
	{
		Map<Chemin, Sommet> voisins=new HashMap<Chemin, Sommet>();
		
	}
	*/
	//METHODES
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}

	
	public void ajoutVoisin(Chemin c, Sommet SommetVoisin)
	{
		voisins.put(c, SommetVoisin);
	}

	
	public void afficherSommetsVoisins() 
	{
		System.out.print("ces sommets sont voisins de Sommet "+getNom()+ ":");
		for(Sommet s:voisins.values())
			System.out.print(s.getNom()+"\t");
		System.out.println();
	}
	
	public void afficherCheminsSortants() 
	{
		System.out.print("ces pistes sortenet de Sommet "+getNom() +":");
		for(Chemin c:voisins.keySet())
			System.out.print(c.getNom()+"\t");
		System.out.println();
	}
	
	public int getTempDeb(Sommet y)
	{
		for (Chemin c : voisins.keySet())
			if (getVoisins().get(c) == y)
				return c.getTempSkieurDeb();
		return -1;
	}
	
	public int getTempPro(Sommet y)
	{
		for (Chemin c : voisins.keySet())
			if (getVoisins().get(c) == y)
				return c.getTempSkieurPro();
		return -1;
	}
	
	
	
	//getter voisins
	public HashMap<Chemin, Sommet> getVoisins() {
		return voisins;
	}
	//setter voisins
	public void setVoisins(HashMap<Chemin, Sommet> voisins) {
		this.voisins = voisins;
	}
/*
	public void marquer()
	{
		marque=true;
	}
*/
	public Integer getDistanceParSource() {
		return distanceParSource;
	}

	public void setDistanceParSource(Integer distanceParSource) {
		this.distanceParSource = distanceParSource;
	}
	
	
	public LinkedList<Sommet> getPlusCourtChemin() {
		return PlusCourtChemin;
	}

	public void setPlusCourtChemin(LinkedList<Sommet> plusCourtChemin) {
		PlusCourtChemin = plusCourtChemin;
	}
	
	
}