package fr;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by termiton on 06/04/16.
 */
@Entity
public class VehiculeContractType {
    private int vehicleContractId;
    private String vehicleContract;

    @Id
    @Column(name = "vehicleContractID", nullable = false)
    public int getVehicleContractId() {
        return vehicleContractId;
    }

    public void setVehicleContractId(int vehicleContractId) {
        this.vehicleContractId = vehicleContractId;
    }

    @Basic
    @Column(name = "vehicleContract", nullable = true, length = 20)
    public String getVehicleContract() {
        return vehicleContract;
    }

    public void setVehicleContract(String vehicleContract) {
        this.vehicleContract = vehicleContract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehiculeContractType that = (VehiculeContractType) o;

        if (vehicleContractId != that.vehicleContractId) return false;
        if (vehicleContract != null ? !vehicleContract.equals(that.vehicleContract) : that.vehicleContract != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = vehicleContractId;
        result = 31 * result + (vehicleContract != null ? vehicleContract.hashCode() : 0);
        return result;
    }
}
