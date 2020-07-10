
public class Chemin {	//Peut etre piste (Noir ou vert ou...) , OU remontee mecanics
	String nom;

	private int tempSkieurDeb;
	private int tempSkieurPro;
	
	private int typeDePiste;
	
	Chemin(int Deb, String nom, int type){
		this.nom = nom;
		setTempSkieurDeb(Deb);
		setTempSkieurPro(calculTempPro(Deb, type));
	}
	
	
	public int calculTempPro(int tempDebu, int typeDePiste)
	{
		if(typeDePiste == 4)
			return tempDebu;
		return (typeDePiste+1)*tempDebu;
	}
	
	
	public String getNom() {
		return nom;
	}
	

	public int getTempSkieurDeb() {
		return tempSkieurDeb;
	}
	public  void setTempSkieurDeb(int tempSkieurDeb) {
		this.tempSkieurDeb = tempSkieurDeb;
	}
	public  int getTempSkieurPro() {
		return tempSkieurPro;
	}
	public void setTempSkieurPro(int tempSkieurPro) {
		this.tempSkieurPro = tempSkieurPro;
	}
	
	public int getTypeDePiste() {
		return typeDePiste;
	}

	public void setTypeDePiste(int typeDePiste) {
		this.typeDePiste = typeDePiste;
	}


/*	
	private Sommet getSrc() {
		return src;
	}
	private void setSrc(Sommet src) {
		this.src = src;
	}
	private Sommet getDst() {
		return dst;
	}
	private void setDst(Sommet dst) {
		this.dst = dst;
	}
*/	
	
}
