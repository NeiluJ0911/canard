package canard.application;

import canard.model.Canard;
import canard.model.Colvert;
import canard.model.PropulsionAReaction;
import canard.model.PrototypeCanard;

public class Client {
    public static void main(String[] args) {
        Canard colvert = new Colvert("Calvaire");
        System.out.println(colvert.afficher());
        System.out.println(colvert.nager());
        System.out.println(colvert.effectuerCancan());

        Canard prototype = new PrototypeCanard("Duckminator");
        System.out.println(prototype.afficher());
        System.out.println(prototype.effectuerVol());

        prototype.changerComportementVol(new PropulsionAReaction());
        System.out.println(prototype.effectuerVol());
    }
}