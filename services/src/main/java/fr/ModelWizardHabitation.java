package fr;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by nicol on 07/04/2016.
 */
public class ModelWizardHabitation {


    @NotEmpty
    @NotNull
    private Integer idDevis;
    private String nomDevis;
    private String user;
    private String typeHabitation;
    private Integer Surface;
    private Integer nbPieces;
    private String etage;
    private Integer nbSalleDeBain;
    private String garage;
    private Integer surfaceTerrain;
    private Integer surfaceTerasse;
    private String typeChauffage;

    public Integer getIdDevis() {
        return idDevis;
    }

    public void setIdDevis(Integer idDevis) {
        this.idDevis = idDevis;
    }

    public String getNomDevis() {
        return nomDevis;
    }

    public void setNomDevis(String nomDevis) {
        this.nomDevis = nomDevis;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTypeHabitation() {
        return typeHabitation;
    }

    public void setTypeHabitation(String typeHabitation) {
        this.typeHabitation = typeHabitation;
    }

    public Integer getSurface() {
        return Surface;
    }

    public void setSurface(Integer surface) {
        Surface = surface;
    }

    public Integer getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(Integer nbPieces) {
        this.nbPieces = nbPieces;
    }

    public String getEtage() {
        return etage;
    }

    public void setEtage(String etage) {
        this.etage = etage;
    }

    public Integer getNbSalleDeBain() {
        return nbSalleDeBain;
    }

    public void setNbSalleDeBain(Integer nbSalleDeBain) {
        this.nbSalleDeBain = nbSalleDeBain;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public Integer getSurfaceTerrain() {
        return surfaceTerrain;
    }

    public void setSurfaceTerrain(Integer surfaceTerrain) {
        this.surfaceTerrain = surfaceTerrain;
    }

    public Integer getSurfaceTerasse() {
        return surfaceTerasse;
    }

    public void setSurfaceTerasse(Integer surfaceTerasse) {
        this.surfaceTerasse = surfaceTerasse;
    }

    public String getTypeChauffage() {
        return typeChauffage;
    }

    public void setTypeChauffage(String typeChauffage) {
        this.typeChauffage = typeChauffage;
    }
}
