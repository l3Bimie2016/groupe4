package fr;

/**
 * Created by termiton on 06/04/16.
 */
public class DevisVehicule {
    private String quotVName;
    private double priceAssVehicle;
    private int quotStep;
    private String userDriverLicense;
    private int userNbAccident;
    private double userBonus;
    private boolean vehicleShed;
    private String vehicleFirstDriver;
    private String vehiculeSecondDriver;
    private int vehicleContractID;
    private String userLogin;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleFuel;
    private String vehicleHP;

    public DevisVehicule() {
    }


    public String getQuotVName() {
        return quotVName;
    }

    public void setQuotVName(String quotVName) {
        this.quotVName = quotVName;
    }

    public double getPriceAssVehicle() {
        return priceAssVehicle;
    }

    public void setPriceAssVehicle(double priceAssVehicle) {
        this.priceAssVehicle = priceAssVehicle;
    }

    public int getQuotStep() {
        return quotStep;
    }

    public void setQuotStep(int quotStep) {
        this.quotStep = quotStep;
    }

    public String getUserDriverLicense() {
        return userDriverLicense;
    }

    public void setUserDriverLicense(String userDriverLicense) {
        this.userDriverLicense = userDriverLicense;
    }

    public int getUserNbAccident() {
        return userNbAccident;
    }

    public void setUserNbAccident(int userNbAccident) {
        this.userNbAccident = userNbAccident;
    }

    public double getUserBonus() {
        return userBonus;
    }

    public void setUserBonus(double userBonus) {
        this.userBonus = userBonus;
    }

    public boolean isVehicleShed() {
        return vehicleShed;
    }

    public void setVehicleShed(boolean vehicleShed) {
        this.vehicleShed = vehicleShed;
    }

    public String getVehicleFirstDriver() {
        return vehicleFirstDriver;
    }

    public void setVehicleFirstDriver(String vehicleFirstDriver) {
        this.vehicleFirstDriver = vehicleFirstDriver;
    }

    public String getVehiculeSecondDriver() {
        return vehiculeSecondDriver;
    }

    public void setVehiculeSecondDriver(String vehiculeSecondDriver) {
        this.vehiculeSecondDriver = vehiculeSecondDriver;
    }

    public int getVehicleContractID() {
        return vehicleContractID;
    }

    public void setVehicleContractID(int vehicleContractID) {
        this.vehicleContractID = vehicleContractID;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleFuel() {
        return vehicleFuel;
    }

    public void setVehicleFuel(String vehicleFuel) {
        this.vehicleFuel = vehicleFuel;
    }

    public String getVehicleHP() {
        return vehicleHP;
    }

    public void setVehicleHP(String vehicleHP) {
        this.vehicleHP = vehicleHP;
    }

    public double calculTarif(){
        double result;
        double nba = (double) this.userNbAccident;
        double bon = this.userBonus;
        double ctr = (double) this.vehicleContractID;
        double maj = 100;

        if (vehicleShed){
            maj = 50;
        }

        result = (nba + maj + ctr) * bon;

        return result;
    }


}
