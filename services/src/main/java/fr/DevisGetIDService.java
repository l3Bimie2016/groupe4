package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Termiton on 11/05/2016.
 */

@Service
public class DevisGetIDService {
    @Autowired
    private DevisVehiculeRepository devisVehiculeRepository;
    @Autowired
    private DevisHabitationRepository devisHabitationRepository;

    public ModelWizardVehicule getVehicule(Integer id){
        ModelWizardVehicule model = new ModelWizardVehicule();
        QuotationVehicle quotationVehicle;
        quotationVehicle = devisVehiculeRepository.findOne(id);
        model.setIdDevis(quotationVehicle.getQuotVid());
        model.setNomDevis(quotationVehicle.getQuotVName());
        model.setMarque(quotationVehicle.getVehicleBrand());
        model.setModele(quotationVehicle.getVehicleModel());
        model.setCarburant(quotationVehicle.getVehicleFuel());
        model.setChvxfiscaux(quotationVehicle.getVehicleHp());
        model.setDatePermis(quotationVehicle.getDatePermis());
        model.setNbAccident(quotationVehicle.getUserNbAccident());
        model.setBonusMalus(quotationVehicle.getUserBonus());
        model.setConducteurPrincipal(quotationVehicle.getVehicleFirstDriver());
        model.setConducteurSecondaire(quotationVehicle.getVehicleSecondDriver());
        if(1 == quotationVehicle.getVehicleShed()) {
            model.setDortDasnsGarage("oui");
        }else{
            model.setDortDasnsGarage("non");
        }
        model.setAdresse(quotationVehicle.getUserAddress());
        model.setStep(quotationVehicle.getQuotStep());
        VehiculeContractType vehiculeContractType = quotationVehicle.getVehicleContractType();
        model.setType(vehiculeContractType.getVehicleContractId());
        return model;
    }

    public ModelWizardHabitation getHome(Integer id){
        ModelWizardHabitation model = new ModelWizardHabitation();
        QuotationHome quotationHome;
        quotationHome = devisHabitationRepository.findOne(id);
        model.setIdDevis(quotationHome.getQuotHid());
        model.setNomDevis(quotationHome.getQuotHName());
        model.setTypeHabitation(quotationHome.getHomeNote());
        model.setSurface(quotationHome.getHomeSurface());
        model.setNbPieces(quotationHome.getHomeNbRoom());
        model.setEtage(quotationHome.getHomeFloor().toString());
        model.setNbSalleDeBain(quotationHome.getHomeNbBathroom());
        if(1 == quotationHome.getHomeGarage()){
            model.setGarage("oui");
        }else{
            model.setGarage("non");
        }
        model.setStep(quotationHome.getQuotStep());
        model.setSurfaceTerrain(quotationHome.getHomeGardenSurface());
        model.setSurfaceTerasse(quotationHome.getHomeTerraceSurface());
        model.setTypeChauffage(quotationHome.getHomeHeater());
        HomeContractType homeContractType = quotationHome.getHomeContract();
        model.setTypeForlmule(homeContractType.getHomeContractId());
        return model;
    }


}
