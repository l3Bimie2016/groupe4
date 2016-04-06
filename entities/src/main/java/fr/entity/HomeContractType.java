package fr.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by termiton on 06/04/16.
 */
@Entity
public class HomeContractType {
    private int homeContractId;
    private String homeContractName;


    @Id
    @Column(name = "homeContractID", nullable = false)
    public int getHomeContractId() {
        return homeContractId;
    }

    public void setHomeContractId(int homeContractId) {
        this.homeContractId = homeContractId;
    }

    @Basic
    @Column(name = "homeContractName", nullable = true, length = 20)
    public String getHomeContractName() {
        return homeContractName;
    }

    public void setHomeContractName(String homeContractName) {
        this.homeContractName = homeContractName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HomeContractType that = (HomeContractType) o;

        if (homeContractId != that.homeContractId) return false;
        if (homeContractName != null ? !homeContractName.equals(that.homeContractName) : that.homeContractName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = homeContractId;
        result = 31 * result + (homeContractName != null ? homeContractName.hashCode() : 0);
        return result;
    }


}
