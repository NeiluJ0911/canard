package canard.model;

public class CanardEnPlastique extends Canard{

	public CanardEnPlastique(String nom) {
		super(nom);
		this.vol = new NePasVoler();
	}

	@Override
	public String afficher() {
		return this.nom+" : Je suis un leurre";
	}
	
}
