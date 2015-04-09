package iutvalence.sylmard.binome6.memory;

/* TODO JAVADOC. */
public class Grille {
    /* TODO JAVADOC. */
    public static final int    TAILLE_COTE_NIV1 = 4;
    /* TODO JAVADOC. */
    public static final int    TAILLE_COTE_NIV2 = 6;
    /* TODO JAVADOC. */
    public static final int    TAILLE_COTE_NIV3 = 8;
    /* TODO JAVADOC. */
    public static final int    TAILLE_COTE_NIV4 = 10;
    /* TODO JAVADOC. */
    public static final String VALEUR_FAUSSE    = "Ecrivez 1, 2, 3 ou 4 en fonction de votre niveau";
    /* TODO JAVADOC. */
    private final int     TailleCote;
    /* TODO JAVADOC. */
    private       int[][] Tableau;


    public Grille(int n) {

    }

    public String testNiveau() {

        if (n < 1 || n > 4) { return VALEUR_FAUSSE; }
    }
}
