package fr;

import org.springframework.stereotype.Service;

/**
 * Created by termiton on 07/04/16.
 */
@Service
public class WizardToQuotation {

    public QuotationHome saveStep(ModelWizardHabitation modelWizardHabitation, Integer step){
        private int quotHid = modelWizardHabitation.getIdDevis();
        private String quotHName = modelWizardHabitation.getNomDevis();
        private Double homeSurface = modelWizardHabitation.getSurface();
        private Integer homeNbRoom = modelWizardHabitation.getNbPieces();
        private Integer quotStep = step;
        private Integer homeFloor = modelWizardHabitation.getEtage();
        private Integer homeNbBathroom = modelWizardHabitation.getNbSalleDeBain();
        private Byte homeGarage;
        if (modelWizardHabitation.getGarage() == "oui")
        {
            homeGarage = 1;
        }else{
            homeGarage = 0;
        }
        private Double homeGardenSurface = (double) modelWizardHabitation.getSurfaceTerrain();
        private Double homeTerraceSurface = (double) modelWizardHabitation.getSurfaceTerasse();
        private Double priceAssHome = modelWizardHabitation.getTarif();
        private String userLogin = modelWizardHabitation.getUser();
        private String homeHeater;
        private String homeNote;
        private HomeContractType homeContract;
    }

}
