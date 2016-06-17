package mastermind.traitement.enums;

public enum CouleurEnum {
    ROUGE("1"),
    JAUNE("2"),
    VERT("3"),
    BLEU("4"),
    ORANGE("5"),
    BLANC("6"),
    VIOLET("7"),
    FUSHIA("8");

    private String label;

    /**
     * Constructeur de l'enumeration des couleurs du MasterMind
     * 
     * @param label
     */
    private CouleurEnum(String label) {
        this.label = label;
    }

    /**
     * Retourne un string de la couleur
     * 
     * @return String
     */
    public String label() {
        return this.label;
    }
}
