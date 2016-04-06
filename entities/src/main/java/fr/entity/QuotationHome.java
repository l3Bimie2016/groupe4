package fr.entity;

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
    private int homeContractId;
    private String userLogin;
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
    @Column(name = "homeContractID", nullable = false)
    public int getHomeContractId() {
        return homeContractId;
    }

    public void setHomeContractId(int homeContractId) {
        this.homeContractId = homeContractId;
    }

    @Basic
    @Column(name = "userLogin", nullable = false, length = 50)
    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuotationHome that = (QuotationHome) o;

        if (quotHid != that.quotHid) return false;
        if (homeContractId != that.homeContractId) return false;
        if (quotHName != null ? !quotHName.equals(that.quotHName) : that.quotHName != null) return false;
        if (homeSurface != null ? !homeSurface.equals(that.homeSurface) : that.homeSurface != null) return false;
        if (homeNbRoom != null ? !homeNbRoom.equals(that.homeNbRoom) : that.homeNbRoom != null) return false;
        if (quotStep != null ? !quotStep.equals(that.quotStep) : that.quotStep != null) return false;
        if (homeFloor != null ? !homeFloor.equals(that.homeFloor) : that.homeFloor != null) return false;
        if (homeNbBathroom != null ? !homeNbBathroom.equals(that.homeNbBathroom) : that.homeNbBathroom != null)
            return false;
        if (homeGarage != null ? !homeGarage.equals(that.homeGarage) : that.homeGarage != null) return false;
        if (homeGardenSurface != null ? !homeGardenSurface.equals(that.homeGardenSurface) : that.homeGardenSurface != null)
            return false;
        if (homeTerraceSurface != null ? !homeTerraceSurface.equals(that.homeTerraceSurface) : that.homeTerraceSurface != null)
            return false;
        if (priceAssHome != null ? !priceAssHome.equals(that.priceAssHome) : that.priceAssHome != null) return false;
        if (userLogin != null ? !userLogin.equals(that.userLogin) : that.userLogin != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quotHid;
        result = 31 * result + (quotHName != null ? quotHName.hashCode() : 0);
        result = 31 * result + (homeSurface != null ? homeSurface.hashCode() : 0);
        result = 31 * result + (homeNbRoom != null ? homeNbRoom.hashCode() : 0);
        result = 31 * result + (quotStep != null ? quotStep.hashCode() : 0);
        result = 31 * result + (homeFloor != null ? homeFloor.hashCode() : 0);
        result = 31 * result + (homeNbBathroom != null ? homeNbBathroom.hashCode() : 0);
        result = 31 * result + (homeGarage != null ? homeGarage.hashCode() : 0);
        result = 31 * result + (homeGardenSurface != null ? homeGardenSurface.hashCode() : 0);
        result = 31 * result + (homeTerraceSurface != null ? homeTerraceSurface.hashCode() : 0);
        result = 31 * result + (priceAssHome != null ? priceAssHome.hashCode() : 0);
        result = 31 * result + homeContractId;
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "homeContractID", referencedColumnName = "homeContractID", nullable = false)
    public HomeContractType getHomeContract() {
        return homeContract;
    }

    public void setHomeContract(HomeContractType homeContract) {
        this.homeContract = homeContract;
    }
}
