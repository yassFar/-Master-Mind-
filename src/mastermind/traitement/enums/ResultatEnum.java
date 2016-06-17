package mastermind.traitement.enums;

/**
 * Enumeration des etats d'un resultat
 * 
 * @author kbasse
 *
 */
public enum ResultatEnum {

    MAUVAIS("0"), //ne rien faire

    BON("1"), // Mettre un pion rouge 

    MAL_PLACE_COULEUR_OK("2"); // Mettre un pion blanc

    private String label;

    /**
     * Constructeur de l'enumeration des etats d'un resultat
     * 
     * @param label
     */
    private ResultatEnum(String label) {
        this.label = label;
    }

    /**
     * Retourne un string de l'etat du resultat
     * 
     * @return String
     */
    public String label() {
        return this.label;
    }

}
