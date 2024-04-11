package canard.model;

public class PrototypeCanard extends Canard {

    public PrototypeCanard(String nom) {
        super(nom);
        this.vol = new NePasVoler();
        this.cancan = new CanardMuet();
    }

    @Override
    public String afficher() {
        return this.nom + " : Je suis un prototype de canard";
    }
}