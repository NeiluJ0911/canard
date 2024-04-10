package canard.model;

public class Colvert extends Canard {
    public Colvert(String nom) {
        super(nom);
        this.vol = new VolerAvecDesAiles();
    }

    @Override
    public String afficher() {
        return this.nom + " : Je suis un vrai colvert!";
    }
}
