package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Termiton on 10/05/2016.
 */
@Service
public class DevisHabitationService {
    @Autowired
    private SessionData sessionData;
    @Autowired
    private DevisHabitationRepository devisHabitationRepository;
    public Integer convertAndSaveByStep(ModelWizardHabitation model){
        UserVertx uv = sessionData.getUser();
        String user = uv.getUserLogin();
        QuotationHome quotationHome = new QuotationHome();
        Integer step = model.getStep();
        switch (step){
            case 1:
                quotationHome.setQuotHName(model.getNomDevis());
                quotationHome.setHomeNote(model.getTypeHabitation());
                quotationHome.setHomeSurface(model.getSurface());
                break;
            case 2:
                quotationHome.setQuotHName(model.getNomDevis());
                quotationHome.setHomeNote(model.getTypeHabitation());
                quotationHome.setHomeSurface(model.getSurface());
                quotationHome.setHomeNbRoom(model.getNbPieces());
                quotationHome.setHomeNbBathroom(model.getNbSalleDeBain());
                if( "oui".equals(model.getGarage()) )
                {
                    quotationHome.setHomeGarage(1);
                }else{
                    quotationHome.setHomeGarage(0);
                }
                break;
            case 3:
                quotationHome.setQuotHName(model.getNomDevis());
                quotationHome.setHomeNote(model.getTypeHabitation());
                quotationHome.setHomeSurface(model.getSurface());
                quotationHome.setHomeNbRoom(model.getNbPieces());
                quotationHome.setHomeNbBathroom(model.getNbSalleDeBain());
                if( "oui".equals(model.getGarage()) )
                {
                    quotationHome.setHomeGarage(1);
                }else{
                    quotationHome.setHomeGarage(0);
                }
                quotationHome.setHomeGardenSurface(model.getSurfaceTerrain());
                quotationHome.setHomeTerraceSurface(model.getSurfaceTerasse());
                quotationHome.setHomeHeater(model.getTypeChauffage());
                break;
            case 4:
                quotationHome.setQuotHName(model.getNomDevis());
                quotationHome.setHomeNote(model.getTypeHabitation());
                quotationHome.setHomeSurface(model.getSurface());
                quotationHome.setHomeNbRoom(model.getNbPieces());
                quotationHome.setHomeNbBathroom(model.getNbSalleDeBain());
                if( "oui".equals(model.getGarage()) )
                {
                    quotationHome.setHomeGarage(1);
                }else{
                    quotationHome.setHomeGarage(0);
                }
                quotationHome.setHomeGardenSurface(model.getSurfaceTerrain());
                quotationHome.setHomeTerraceSurface(model.getSurfaceTerasse());
                quotationHome.setHomeHeater(model.getTypeChauffage());
                break;
        }
        // @TODO: Blaise : changer user avec security
        quotationHome.setUserLogin(user);
        quotationHome.setQuotStep(step);
        devisHabitationRepository.save(quotationHome);
        return quotationHome.getQuotHid();
    }
}
