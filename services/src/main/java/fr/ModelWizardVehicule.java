package fr;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by nicol on 06/04/2016.
 */
public class ModelWizardVehicule {


    @NotEmpty @NotNull
    private Integer idDevis;

    @NotEmpty @NotNull
    private String nomDevis;

    @NotEmpty @NotNull
    private String marque;

    @NotEmpty @NotNull
    private String modele;

    @NotEmpty @NotNull
    private String carburant;

    private Integer chvxfiscaux;

    @NotEmpty @NotNull
    private String datePermis;

    private Integer nbAccident;

    private Double bonusMalus;

    private String conducteurPrincipal;

    private String conducteurSecondaire;

    private String dortDasnsGarage;

    private String adresse;

    private String type;



    public String getType() {
        return type;
    }

    public Integer getIdDevis() {
        return idDevis;
    }

    public void setIdDevis(Integer idDevis) {
        this.idDevis = idDevis;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getConducteurPrincipal() {
        return conducteurPrincipal;
    }

    public String getConducteurSecondaire() {
        return conducteurSecondaire;
    }

    public String getDortDansGarage() {
        return dortDasnsGarage;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setConducteurPrincipal(String conducteurPrincipal) {
        this.conducteurPrincipal = conducteurPrincipal;
    }

    public void setConducteurSecondaire(String conducteurSecondaire) {
        this.conducteurSecondaire = conducteurSecondaire;
    }

    public void setDortDansGarage(String dortDasnsGarage) {
        this.dortDasnsGarage = dortDasnsGarage;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getChvxfiscaux() {
        return chvxfiscaux;
    }

    public String getDatePermis() {
        return datePermis;
    }

    public Integer getNbAccident() {
        return nbAccident;
    }

    public Double getBonusMalus() {
        return bonusMalus;
    }

    public void setChvxfiscaux(Integer chvxfiscaux) {
        this.chvxfiscaux = chvxfiscaux;
    }

    public void setDatePermis(String datePermis) {
        this.datePermis = datePermis;
    }

    public void setNbAccident(Integer nbAccident) {
        this.nbAccident = nbAccident;
    }

    public void setBonusMalus(Double bonusMalus) {
        this.bonusMalus = bonusMalus;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getCarburant() {
        return carburant;
    }

    private String step1;
    private String step2;
    private String step3;

    public String getStep1() {
        return step1;
    }

    public void setStep1(String step1) {
        this.step1 = step1;
    }

    public String getStep2() {
        return step2;
    }

    public void setStep2(String step2) {
        this.step2 = step2;
    }

    public String getStep3() {
        return step3;
    }

    public void setStep3(String step3) {
        this.step3 = step3;
    }

    public String getNomDevis() {
        return nomDevis;
    }

    public void setNomDevis(String nomDevis) {
        this.nomDevis = nomDevis;
    }
}
