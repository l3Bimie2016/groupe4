package fr;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by termiton on 06/04/16.
 */
@Entity
public class HomeContractType {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer homeContractID;

    private String homeContractName;

    public Integer getHomeContractID() {
        return homeContractID;
    }

    public void setHomeContractID(Integer homeContractID) {
        this.homeContractID = homeContractID;
    }

    public String getHomeContractName() {
        return homeContractName;
    }

    public void setHomeContractName(String homeContractName) {
        this.homeContractName = homeContractName;
    }
}
