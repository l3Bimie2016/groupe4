package fr;

import javax.persistence.*;

/**
 * Created by termiton on 06/04/16.
 */
@Entity(name = "QuotationHome")
public class DevisHabitation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer quotHID;
    private String quotHName;
    private double homeSurface;
    private double homeTerraceSurface;
    private double homeGardenSurface;
    private int homeNbRoom;
    private int homeNbBathroom;
    private int homeFloor;
    private boolean homeGarage;
    private double priceAssHome;


    @ManyToOne
    @JoinColumn(name="homeContractID", nullable=false)
    private HomeContractType homeContract;
    private String userLogin;
    private int quotStep;

    public DevisHabitation() {
    }

    public String getQuotHName() {
        return quotHName;
    }

    public void setQuotHName(String quotHName) {
        this.quotHName = quotHName;
    }

    public double getHomeSurface() {
        return homeSurface;
    }

    public void setHomeSurface(double homeSurface) {
        this.homeSurface = homeSurface;
    }

    public double getHomeTerraceSurface() {
        return homeTerraceSurface;
    }

    public void setHomeTerraceSurface(double homeTerraceSurface) {
        this.homeTerraceSurface = homeTerraceSurface;
    }

    public double getHomeGardenSurface() {
        return homeGardenSurface;
    }

    public void setHomeGardenSurface(double homeGardenSurface) {
        this.homeGardenSurface = homeGardenSurface;
    }

    public int getHomeNbRoom() {
        return homeNbRoom;
    }

    public void setHomeNbRoom(int homeNbRoom) {
        this.homeNbRoom = homeNbRoom;
    }

    public int getHomeNbBathroom() {
        return homeNbBathroom;
    }

    public void setHomeNbBathroom(int homeNbBathroom) {
        this.homeNbBathroom = homeNbBathroom;
    }

    public int getHomeFloor() {
        return homeFloor;
    }

    public void setHomeFloor(int homeFloor) {
        this.homeFloor = homeFloor;
    }

    public boolean isHomeGarage() {
        return homeGarage;
    }

    public void setHomeGarage(boolean homeGarage) {
        this.homeGarage = homeGarage;
    }

    public double getPriceAssHome() { return priceAssHome; }

    public void setPriceAssHome(double priceAssHome) { this.priceAssHome = priceAssHome; }



    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public int getQuotStep() {
        return quotStep;
    }

    public void setQuotStep(int quotStep) {
        this.quotStep = quotStep;
    }

    public Integer getQuotHID() {
        return quotHID;
    }

    public void setQuotHID(Integer quotHID) {
        this.quotHID = quotHID;
    }



    public HomeContractType getHomeContract() {
        return homeContract;
    }

    public void setHomeContract(HomeContractType homeContract) {
        this.homeContract = homeContract;
    }

    // Calcul du tarif de l'assurance
    public double calculTarif() {
        double result = 0;
        double maj = 0;
        double hms = this.homeSurface;
        double hts = this.homeTerraceSurface;
        double hgs = this.homeGardenSurface;
        double nbr = (double) this.homeNbRoom;
        double nbb = (double) this.homeNbBathroom;
        double flo = (double) this.homeFloor;
        //double ctr = (double) this.homeContractID;

        // Si l'utilisateur possède un garage
        if (this.homeGarage){
            maj = 50;
        }
        // Calcul à la con
        //result = maj + (hms + hts + hgs) / (nbr + nbb + flo) * ctr;

        return result;
    }
}
