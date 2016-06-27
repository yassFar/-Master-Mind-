package mastermind.traitement.impl;

import java.util.ArrayList;
import java.util.List;

import mastermind.traitement.enums.CouleurEnum;
import mastermind.traitement.enums.ResultatEnum;

public class Traitement {
    // public List<ResultatEnum> traitement(List<CouleurEnum> couleursBase,
    // List<CouleurEnum> couleursProposees) {
    // couleursBase.add(CouleurEnum.BLEU);
    // couleursBase.add(CouleurEnum.FUSHIA);
    // couleursBase.add(CouleurEnum.JAUNE);
    // couleursBase.add(CouleurEnum.ORANGE);
    //
    // couleursProposees.add(CouleurEnum.ORANGE);
    // couleursProposees.add(CouleurEnum.JAUNE);
    // couleursProposees.add(CouleurEnum.VERT);
    // couleursProposees.add(CouleurEnum.ORANGE);
    //
    // return resultats;
    // }

    // TODO : MAIN � changer en m�thode
    // M�thode traite le choix de l'utilisateur
    // Param�tre 1 : une liste de 4 couleurs choisit par l'ordi ou le joueur d�s
    // le d�part de la partie
    // Param�tre 2: une liste de 4 couleurs propos�es par le joueur � chaque
    // coup
    // return: liste avec 3 �tat possible:
    // MAUVAIS
    // MAL_PLACE_COULEUR_OK
    // BON
    public static void main(String[] args) {
        List<CouleurEnum> couleursBase = new ArrayList<>();
        List<CouleurEnum> couleursProposees = new ArrayList<>();
        couleursBase.add(CouleurEnum.BLEU);
        couleursBase.add(CouleurEnum.FUSHIA);
        couleursBase.add(CouleurEnum.JAUNE);
        couleursBase.add(CouleurEnum.ORANGE);

        couleursProposees.add(CouleurEnum.BLEU);
        couleursProposees.add(CouleurEnum.JAUNE);
        couleursProposees.add(CouleurEnum.ORANGE);
        couleursProposees.add(CouleurEnum.ORANGE);

        List<ResultatEnum> resultats = new ArrayList<ResultatEnum>();
        for (int i = 0; i < 4; i++) {
            if (couleursProposees.get(i) == couleursBase.get(i)) {
                resultats.add(i, ResultatEnum.BON);
            } else if (couleursBase.contains(couleursProposees.get(i))) {
                resultats.add(i, ResultatEnum.MAL_PLACE_COULEUR_OK);
            } else {
                resultats.add(i, ResultatEnum.MAUVAIS);
            }
        }
        for (ResultatEnum res : resultats) {
            System.out.println(res.name());
        }

    }
}
