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
    private Integer SurfaceTerrain;
    private Integer SurfaceTerrasse;
    private Integer nbPieces;

    private String etage;

    private Integer nbSalleDeBain;

    private String garage;




    public String getEtage() {
        return etage;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getSurfaceTerrasse() {
        return SurfaceTerrasse;
    }

    public void setSurfaceTerrasse(Integer surfaceTerrasse) {
        SurfaceTerrasse = surfaceTerrasse;
    }

    public Integer getSurfaceTerrain() {
        return SurfaceTerrain;
    }

    public void setSurfaceTerrain(Integer surfaceTerrain) {
        SurfaceTerrain = surfaceTerrain;
    }

    public Integer getIdDevis() {
        return idDevis;
    }

    public void setIdDevis(Integer idDevis) {
        this.idDevis = idDevis;
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

    public Integer getNbPieces() {
        return nbPieces;
    }

    public void setNbPieces(Integer nbPieces) {
        this.nbPieces = nbPieces;
    }

    public void setSurface(Integer surface) {
        Surface = surface;
    }

    public void setNomDevis(String nomDevis) {
        this.nomDevis = nomDevis;
    }

    public void setTypeHabitation(String typeHabitation) {
        this.typeHabitation = typeHabitation;
    }



    public Integer getSurface() {
        return Surface;
    }

    public String getNomDevis() {
        return nomDevis;
    }

    public String getTypeHabitation() {
        return typeHabitation;
    }



}
