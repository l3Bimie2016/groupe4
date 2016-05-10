package fr;

import javax.persistence.*;

/**
 * Created by termiton on 06/04/16.
 */
@Entity
public class QuotationVehicle {
    private Integer quotVid;
    private String quotVName;
    private Double priceAssVehicle;
    private Integer quotStep;
    private String userDriverLicense;
    private Integer userNbAccident;
    private Double userBonus;
    private Integer vehicleShed;
    private String vehicleFirstDriver;
    private String vehicleSecondDriver;

    private String userLogin;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleFuel;
    private Integer vehicleHp;
    private VehiculeContractType vehicleContractType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quotVID", nullable = false)
    public Integer getQuotVid() {
        return quotVid;
    }

    public void setQuotVid(Integer quotVid) {
        this.quotVid = quotVid;
    }

    @Basic
    @Column(name = "quotVName", nullable = true, length = 50)
    public String getQuotVName() {
        return quotVName;
    }

    public void setQuotVName(String quotVName) {
        this.quotVName = quotVName;
    }

    @Basic
    @Column(name = "priceAssVehicle", nullable = true, precision = 0)
    public Double getPriceAssVehicle() {
        return priceAssVehicle;
    }

    public void setPriceAssVehicle(Double priceAssVehicle) {
        this.priceAssVehicle = priceAssVehicle;
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
    @Column(name = "userDriverLicense", nullable = true, length = 10)
    public String getUserDriverLicense() {
        return userDriverLicense;
    }

    public void setUserDriverLicense(String userDriverLicense) {
        this.userDriverLicense = userDriverLicense;
    }

    @Basic
    @Column(name = "userNbAccident", nullable = true)
    public Integer getUserNbAccident() {
        return userNbAccident;
    }

    public void setUserNbAccident(Integer userNbAccident) {
        this.userNbAccident = userNbAccident;
    }

    @Basic
    @Column(name = "userBonus", nullable = true, precision = 0)
    public Double getUserBonus() {
        return userBonus;
    }

    public void setUserBonus(Double userBonus) {
        this.userBonus = userBonus;
    }

    @Basic
    @Column(name = "vehicleShed", nullable = true)
    public Integer getVehicleShed() {
        return vehicleShed;
    }

    public void setVehicleShed(Integer vehicleShed) {
        this.vehicleShed = vehicleShed;
    }

    @Basic
    @Column(name = "vehicleFirstDriver", nullable = true, length = 50)
    public String getVehicleFirstDriver() {
        return vehicleFirstDriver;
    }

    public void setVehicleFirstDriver(String vehicleFirstDriver) {
        this.vehicleFirstDriver = vehicleFirstDriver;
    }

    @Basic
    @Column(name = "vehicleSecondDriver", nullable = true, length = 50)
    public String getVehicleSecondDriver() {
        return vehicleSecondDriver;
    }

    public void setVehicleSecondDriver(String vehicleSecondDriver) {
        this.vehicleSecondDriver = vehicleSecondDriver;
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
    @Column(name = "vehicleBrand", nullable = true, length = 50)
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    @Basic
    @Column(name = "vehicleModel", nullable = true, length = 50)
    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    @Basic
    @Column(name = "vehicleFuel", nullable = true, length = 50)
    public String getVehicleFuel() {
        return vehicleFuel;
    }

    public void setVehicleFuel(String vehicleFuel) {
        this.vehicleFuel = vehicleFuel;
    }

    @Basic
    @Column(name = "vehicleHP", nullable = true)
    public Integer getVehicleHp() {
        return vehicleHp;
    }

    public void setVehicleHp(Integer vehicleHp) {
        this.vehicleHp = vehicleHp;
    }


    @ManyToOne
    @JoinColumn(name = "vehicleContractID", referencedColumnName = "vehicleContractID", nullable = false)
    public VehiculeContractType getVehicleContractType() {
        return vehicleContractType;
    }

    public void setVehicleContractType(VehiculeContractType vehicleContractType) {
        this.vehicleContractType = vehicleContractType;
    }
}
