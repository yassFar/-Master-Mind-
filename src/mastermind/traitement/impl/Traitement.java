package mastermind.traitement.impl;

import java.util.ArrayList;
import java.util.List;

import mastermind.traitement.enums.CouleurEnum;
import mastermind.traitement.enums.ResultatEnum;

public class Traitement {
    // MAUVAIS
    // MAL_PLACE_COULEUR_OK
    // BON
    public List<ResultatEnum> traitement (List<CouleurEnum> couleursBase, List<CouleurEnum> couleursProposees) {
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
        
        return resultats;
    }
}
