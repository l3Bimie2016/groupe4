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
        if(quotationVehicle.getVehicleShed() != null && quotationVehicle.getVehicleShed().intValue() == 1) {
            model.setDortDasnsGarage("oui");
        }else{
            model.setDortDasnsGarage("non");
        }
        model.setAdresse(quotationVehicle.getUserAddress());
        model.setStep(quotationVehicle.getQuotStep());
        VehiculeContractType vehiculeContractType = quotationVehicle.getVehicleContractType();
        if(vehiculeContractType != null) {
            model.setType(vehiculeContractType.getVehicleContractId());
        }

        return model;
    }

    public QuotationHome getHome(Integer id){
        QuotationHome quotationHome;
        quotationHome = devisHabitationRepository.findOne(id);
        return quotationHome;
    }


}
