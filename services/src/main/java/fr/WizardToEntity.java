package fr;


/**
 * Created by termiton on 09/05/16.
 */
public class WizardToEntity {

    private ModelWizardVehicule modelWizardVehicule;

    public QuotationVehicle toEntity(){
        QuotationVehicle quotationVehicle = new QuotationVehicle();
       // VehiculeContractType vehiculeContractType = new VehiculeContractType();
        //vehiculeContractType.setVehicleContractId(modelWizardVehicule.getType());
        //quotationVehicle.setVehicleContractType(modelWizardVehicule.getType());
        quotationVehicle.setQuotVid(modelWizardVehicule.getIdDevis());
        quotationVehicle.setVehicleFirstDriver(modelWizardVehicule.getConducteurPrincipal());
        quotationVehicle.setVehicleSecondDriver(modelWizardVehicule.getConducteurSecondaire());
        if("oui".equals(modelWizardVehicule.getDortDansGarage())) {
            quotationVehicle.setVehicleShed(1);
        }else{
            quotationVehicle.setVehicleShed(0);
        }
        //quotationVehicle.set(modelWizardVehicule.getAdresse());
        quotationVehicle.setVehicleHp(modelWizardVehicule.getChvxfiscaux());
        //quotationVehicle.set(modelWizardVehicule.getDatePermis());
        quotationVehicle.setUserNbAccident(modelWizardVehicule.getNbAccident());
        quotationVehicle.setUserBonus(modelWizardVehicule.getBonusMalus());
        quotationVehicle.setVehicleBrand(modelWizardVehicule.getMarque());
        quotationVehicle.setVehicleModel(modelWizardVehicule.getModele());
        quotationVehicle.setVehicleFuel(modelWizardVehicule.getCarburant());
        quotationVehicle.setQuotStep(modelWizardVehicule.getStep());
        quotationVehicle.setQuotVName(modelWizardVehicule.getNomDevis());
        return quotationVehicle;
    }


    public WizardToEntity(ModelWizardVehicule modelWizardVehicule) {
        this.modelWizardVehicule = modelWizardVehicule;
    }
    public ModelWizardVehicule getModelWizardVehicule() {
        return modelWizardVehicule;
    }
    public void setModelWizardVehicule(ModelWizardVehicule modelWizardVehicule) {
        this.modelWizardVehicule = modelWizardVehicule;
    }
}
