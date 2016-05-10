package fr;

import javax.persistence.*;

/**
 * Created by termiton on 06/04/16.
 */
@Entity
public class QuotationHome {
    private int quotHid;
    private String quotHName;
    private Double homeSurface;
    private Integer homeNbRoom;
    private Integer quotStep;
    private Integer homeFloor;
    private Integer homeNbBathroom;
    private Byte homeGarage;
    private Double homeGardenSurface;
    private Double homeTerraceSurface;
    private Double priceAssHome;
    private String userLogin;

    private String homeHeater;
    private String homeNote;

    private HomeContractType homeContract;

    @Id
    @Column(name = "quotHID", nullable = false)
    public int getQuotHid() {
        return quotHid;
    }

    public void setQuotHid(int quotHid) {
        this.quotHid = quotHid;
    }

    @Basic
    @Column(name = "quotHName", nullable = true, length = 20)
    public String getQuotHName() {
        return quotHName;
    }

    public void setQuotHName(String quotHName) {
        this.quotHName = quotHName;
    }

    @Basic
    @Column(name = "homeSurface", nullable = true, precision = 0)
    public Double getHomeSurface() {
        return homeSurface;
    }

    public void setHomeSurface(Double homeSurface) {
        this.homeSurface = homeSurface;
    }

    @Basic
    @Column(name = "homeNbRoom", nullable = true)
    public Integer getHomeNbRoom() {
        return homeNbRoom;
    }

    public void setHomeNbRoom(Integer homeNbRoom) {
        this.homeNbRoom = homeNbRoom;
    }

    @Basic
    @Column(name = "quotStep", nullable = true)
    public Integer getQuotStep() {
        return quotStep;
    }

    public void setQuotStep(Integer quotStep) {
        this.quotStep = quotStep;
    }

    @Basic
    @Column(name = "homeFloor", nullable = true)
    public Integer getHomeFloor() {
        return homeFloor;
    }

    public void setHomeFloor(Integer homeFloor) {
        this.homeFloor = homeFloor;
    }

    @Basic
    @Column(name = "homeNbBathroom", nullable = true)
    public Integer getHomeNbBathroom() {
        return homeNbBathroom;
    }

    public void setHomeNbBathroom(Integer homeNbBathroom) {
        this.homeNbBathroom = homeNbBathroom;
    }

    @Basic
    @Column(name = "homeGarage", nullable = true)
    public Byte getHomeGarage() {
        return homeGarage;
    }

    public void setHomeGarage(Byte homeGarage) {
        this.homeGarage = homeGarage;
    }

    @Basic
    @Column(name = "homeGardenSurface", nullable = true, precision = 0)
    public Double getHomeGardenSurface() {
        return homeGardenSurface;
    }

    public void setHomeGardenSurface(Double homeGardenSurface) {
        this.homeGardenSurface = homeGardenSurface;
    }

    @Basic
    @Column(name = "homeTerraceSurface", nullable = true, precision = 0)
    public Double getHomeTerraceSurface() {
        return homeTerraceSurface;
    }

    public void setHomeTerraceSurface(Double homeTerraceSurface) {
        this.homeTerraceSurface = homeTerraceSurface;
    }

    @Basic
    @Column(name = "priceAssHome", nullable = true, precision = 0)
    public Double getPriceAssHome() {
        return priceAssHome;
    }

    public void setPriceAssHome(Double priceAssHome) {
        this.priceAssHome = priceAssHome;
    }

    @Basic
    @Column(name = "userLogin", nullable = false, length = 50)
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    @Basic
    @Column(name = "homeHeater", nullable = true, length = 50)
    public String getHomeHeater() {
        return homeHeater;
    }

    public void setHomeHeater(String homeHeater) {
        this.homeHeater = homeHeater;
    }

    @Basic
    @Column(name = "homeNote", nullable = true, length = 250)
    public String getHomeNote() {
        return homeNote;
    }

    public void setHomeNote(String homeNote) {this.homeNote = homeNote;}


    @ManyToOne
    @JoinColumn(name = "homeContractID", referencedColumnName = "homeContractID", nullable = false)
    public HomeContractType getHomeContract() {
        return homeContract;
    }

    public void setHomeContract(HomeContractType homeContract) {
        this.homeContract = homeContract;
    }
}
