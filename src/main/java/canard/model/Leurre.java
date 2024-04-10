package canard.model;

public class Leurre extends Canard{

	public Leurre(String nom) {
		super(nom);
		this.vol = new NePasVoler();
	}

	@Override
	public String afficher() {
		return this.nom+" : Je suis un leurre";
	}
	
}
