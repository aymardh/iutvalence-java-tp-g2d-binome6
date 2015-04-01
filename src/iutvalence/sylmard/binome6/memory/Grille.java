package iutvalence.sylmard.binome6.memory;

public class Grille {
	
	private final int TailleCote;
	private int[][] Tableau;
	
	public final static int TAILLE_COTE_NIV1 = 4;
	public final static int TAILLE_COTE_NIV2 = 6;
	public final static int TAILLE_COTE_NIV3 = 8;
	public final static int TAILLE_COTE_NIV4 = 10;
	public final static String VALEUR_FAUSSE = "Ecrivez 1, 2, 3 ou 4 en fonction de votre niveau";
	
	
	public Grille(int n)
	{
		
	}
	
	public String testNiveau() {
		
		if (n < 1 || n > 4) return VALEUR_FAUSSE;
	}
}
