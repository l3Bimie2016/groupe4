package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Termiton on 10/05/2016.
 */
@Service
public class DevisVehiculeService {
    @Autowired
    private SessionData sessionData;
    @Autowired
    private DevisVehiculeRepository devisVehiculeRepository;
    public Integer convertAndSaveByStep(ModelWizardVehicule model){
        UserVertx uv = sessionData.getUser();
        String user = uv.getUserLogin();
        QuotationVehicle quotationVehicle = new QuotationVehicle();
        Integer step = model.getStep();
        switch (step){
            case 1:
                quotationVehicle.setQuotVName(model.getNomDevis());
                quotationVehicle.setVehicleBrand(model.getMarque());
                quotationVehicle.setVehicleModel(model.getModele());
                quotationVehicle.setVehicleFuel(model.getCarburant());
                quotationVehicle.setVehicleHp(model.getChvxfiscaux());
                break;
            case 2:
                quotationVehicle.setQuotVName(model.getNomDevis());
                quotationVehicle.setVehicleBrand(model.getMarque());
                quotationVehicle.setVehicleModel(model.getModele());
                quotationVehicle.setVehicleFuel(model.getCarburant());
                quotationVehicle.setVehicleHp(model.getChvxfiscaux());
                quotationVehicle.setQuotVid(model.getIdDevis());
                quotationVehicle.setDatePermis(model.getDatePermis());
                quotationVehicle.setUserNbAccident(model.getNbAccident());
                quotationVehicle.setUserBonus(model.getBonusMalus());
                break;
            case 3:
                quotationVehicle.setQuotVName(model.getNomDevis());
                quotationVehicle.setVehicleBrand(model.getMarque());
                quotationVehicle.setVehicleModel(model.getModele());
                quotationVehicle.setVehicleFuel(model.getCarburant());
                quotationVehicle.setVehicleHp(model.getChvxfiscaux());
                quotationVehicle.setQuotVid(model.getIdDevis());
                quotationVehicle.setDatePermis(model.getDatePermis());
                quotationVehicle.setUserNbAccident(model.getNbAccident());
                quotationVehicle.setUserBonus(model.getBonusMalus());
                quotationVehicle.setVehicleFirstDriver(model.getConducteurPrincipal());
                quotationVehicle.setVehicleSecondDriver(model.getConducteurSecondaire());
                if("oui".equals(model.getDortDansGarage())) {
                    quotationVehicle.setVehicleShed(1);
                }else{
                    quotationVehicle.setVehicleShed(0);
                }
                quotationVehicle.setUserAddress(model.getAdresse());
                break;
            case 4:
                quotationVehicle.setQuotVName(model.getNomDevis());
                quotationVehicle.setVehicleBrand(model.getMarque());
                quotationVehicle.setVehicleModel(model.getModele());
                quotationVehicle.setVehicleFuel(model.getCarburant());
                quotationVehicle.setVehicleHp(model.getChvxfiscaux());
                quotationVehicle.setQuotVid(model.getIdDevis());
                quotationVehicle.setDatePermis(model.getDatePermis());
                quotationVehicle.setUserNbAccident(model.getNbAccident());
                quotationVehicle.setUserBonus(model.getBonusMalus());
                quotationVehicle.setVehicleFirstDriver(model.getConducteurPrincipal());
                quotationVehicle.setVehicleSecondDriver(model.getConducteurSecondaire());
                if("oui".equals(model.getDortDansGarage())) {
                    quotationVehicle.setVehicleShed(1);
                }else{
                    quotationVehicle.setVehicleShed(0);
                }
                quotationVehicle.setUserAddress(model.getAdresse());
                VehiculeContractType vehiculeContractType = new VehiculeContractType();
                vehiculeContractType.setVehicleContractId(model.getType());
                quotationVehicle.setVehicleContractType(vehiculeContractType);
                break;
        }
        quotationVehicle.setUserLogin(user);
        quotationVehicle.setQuotStep(step);
        devisVehiculeRepository.save(quotationVehicle);
        return quotationVehicle.getQuotVid();
    }
}
