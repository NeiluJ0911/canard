package canard.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CanardTest {
    private static final String VOLER = "Je vole !";
    private static final String NE_PAS_VOLER = "Je ne sais pas voler !";
    private static final String CANCAN = "Can-can";
    private static final String COINCOIN = "Coin-coin";
    private static final String SILENCE = "...Silence...";
    private static final String VOL_PROPULSION = "Je vole avec propulsion à réaction !";

    Canard colvert;
    Canard leurre;
    Canard mandarin;
    Canard canardPlastique;
    Canard prototype;

    @BeforeEach
    private void extracted() {
        colvert = new Colvert("Piero");
        leurre = new Leurre("Danny");
        mandarin = new Mandarin("Oshidori");
        canardPlastique = new CanardEnPlastique("Rubber");
        prototype = new PrototypeCanard("Proto");
    }

    @Test
    public void test_effectuerVol() {
        assertEquals(VOLER, colvert.effectuerVol());
        assertEquals(VOLER, mandarin.effectuerVol());
        assertEquals(NE_PAS_VOLER, leurre.effectuerVol());
        assertEquals(NE_PAS_VOLER, canardPlastique.effectuerVol());
        assertEquals(NE_PAS_VOLER, prototype.effectuerVol()); // Le prototype ne peut pas voler
    }

    @Test
    public void test_effectuerCancan() {
        assertEquals(CANCAN, colvert.effectuerCancan());
        assertEquals(CANCAN, mandarin.effectuerCancan());
        assertEquals(SILENCE, leurre.effectuerCancan());
        assertEquals(COINCOIN, canardPlastique.effectuerCancan());
        assertEquals(SILENCE, prototype.effectuerCancan()); // Le prototype est muet
    }

    @Test
    public void test_presentation_nom_et_afficher() {
        assertEquals("Piero", colvert.getNom());
        assertEquals("Je suis un vrai colvert", colvert.afficher());

        assertEquals("Oshidori", mandarin.getNom());
        assertEquals("Je suis un vrai mandarin", mandarin.afficher());

        assertEquals("Danny", leurre.getNom());
        assertEquals("Je suis un leurre", leurre.afficher());

        assertEquals("Rubber", canardPlastique.getNom());
        assertEquals("Je suis un canard en plastique", canardPlastique.afficher());

        assertEquals("Proto", prototype.getNom());
        assertEquals("Je suis un prototype de canard", prototype.afficher());
    }

    @Test
    public void test_changerComportementVol() {
        // Créer un nouveau comportement de vol
        ComportementVol nouveauComportementVol = new PropulsionAReaction();

        // Changer le comportement de vol du colvert
        colvert.changerComportementVol(nouveauComportementVol);

        // Vérifier que le comportement de vol du colvert a été correctement changé
        assertEquals(nouveauComportementVol, colvert.getVol());

        // Vérifier que le colvert vole avec propulsion à réaction
        assertEquals(VOL_PROPULSION, colvert.effectuerVol());
    }
}
