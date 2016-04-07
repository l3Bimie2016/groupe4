package fr;

import javax.persistence.*;

/**
 * Created by termiton on 06/04/16.
 */
@Entity
public class QuotationVehicle {
    private int quotVid;
    private String quotVName;
    private Double priceAssVehicle;
    private Integer quotStep;
    private String userDriverLicense;
    private Integer userNbAccident;
    private Double userBonus;
    private Byte vehicleShed;
    private String vehicleFirstDriver;
    private String vehicleSecondDriver;
    private int vehicleContractId;
    private String userLogin;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleFuel;
    private Integer vehicleHp;
    private VehiculeContractType vehicleContractType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quotVID", nullable = false)
    public int getQuotVid() {
        return quotVid;
    }

    public void setQuotVid(int quotVid) {
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
    public Byte getVehicleShed() {
        return vehicleShed;
    }

    public void setVehicleShed(Byte vehicleShed) {
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
    @Column(name = "vehicleContractID", nullable = false)
    public int getVehicleContractId() {
        return vehicleContractId;
    }

    public void setVehicleContractId(int vehicleContractId) {
        this.vehicleContractId = vehicleContractId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuotationVehicle that = (QuotationVehicle) o;

        if (quotVid != that.quotVid) return false;
        if (vehicleContractId != that.vehicleContractId) return false;
        if (quotVName != null ? !quotVName.equals(that.quotVName) : that.quotVName != null) return false;
        if (priceAssVehicle != null ? !priceAssVehicle.equals(that.priceAssVehicle) : that.priceAssVehicle != null)
            return false;
        if (quotStep != null ? !quotStep.equals(that.quotStep) : that.quotStep != null) return false;
        if (userDriverLicense != null ? !userDriverLicense.equals(that.userDriverLicense) : that.userDriverLicense != null)
            return false;
        if (userNbAccident != null ? !userNbAccident.equals(that.userNbAccident) : that.userNbAccident != null)
            return false;
        if (userBonus != null ? !userBonus.equals(that.userBonus) : that.userBonus != null) return false;
        if (vehicleShed != null ? !vehicleShed.equals(that.vehicleShed) : that.vehicleShed != null) return false;
        if (vehicleFirstDriver != null ? !vehicleFirstDriver.equals(that.vehicleFirstDriver) : that.vehicleFirstDriver != null)
            return false;
        if (vehicleSecondDriver != null ? !vehicleSecondDriver.equals(that.vehicleSecondDriver) : that.vehicleSecondDriver != null)
            return false;
        if (userLogin != null ? !userLogin.equals(that.userLogin) : that.userLogin != null) return false;
        if (vehicleBrand != null ? !vehicleBrand.equals(that.vehicleBrand) : that.vehicleBrand != null) return false;
        if (vehicleModel != null ? !vehicleModel.equals(that.vehicleModel) : that.vehicleModel != null) return false;
        if (vehicleFuel != null ? !vehicleFuel.equals(that.vehicleFuel) : that.vehicleFuel != null) return false;
        if (vehicleHp != null ? !vehicleHp.equals(that.vehicleHp) : that.vehicleHp != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = quotVid;
        result = 31 * result + (quotVName != null ? quotVName.hashCode() : 0);
        result = 31 * result + (priceAssVehicle != null ? priceAssVehicle.hashCode() : 0);
        result = 31 * result + (quotStep != null ? quotStep.hashCode() : 0);
        result = 31 * result + (userDriverLicense != null ? userDriverLicense.hashCode() : 0);
        result = 31 * result + (userNbAccident != null ? userNbAccident.hashCode() : 0);
        result = 31 * result + (userBonus != null ? userBonus.hashCode() : 0);
        result = 31 * result + (vehicleShed != null ? vehicleShed.hashCode() : 0);
        result = 31 * result + (vehicleFirstDriver != null ? vehicleFirstDriver.hashCode() : 0);
        result = 31 * result + (vehicleSecondDriver != null ? vehicleSecondDriver.hashCode() : 0);
        result = 31 * result + vehicleContractId;
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (vehicleBrand != null ? vehicleBrand.hashCode() : 0);
        result = 31 * result + (vehicleModel != null ? vehicleModel.hashCode() : 0);
        result = 31 * result + (vehicleFuel != null ? vehicleFuel.hashCode() : 0);
        result = 31 * result + (vehicleHp != null ? vehicleHp.hashCode() : 0);
        return result;
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
