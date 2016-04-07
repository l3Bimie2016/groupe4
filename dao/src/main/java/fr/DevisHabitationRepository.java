package fr;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by termiton on 06/04/16.
 */
public interface DevisHabitationRepository extends CrudRepository<QuotationHome,Integer> {

    QuotationHome findByUserlogin(String userLogin);
    QuotationHome findByQuothid(int id);

    @Query(nativeQuery = "INSERT INTO QuotationVehicle (quotVID," +
                "quotVName," +
                "priceAssVehicle," +
                "quotStep," +
                "userDriverLicense," +
                "userNbAccident," +
                "userNbAccident," +
                "userBonus," +
                "vehicleShed," +
                "vehicleFirstDriver," +
                "vehicleSecondDriver," +
                "vehicleContractID," +
                "userLogin," +
                "vehicleBrand," +
                "vehicleModel," +
                "vehicleFuel," +
                "vehicleHP) " +
            "VALUES (:quotVName," +
                ":priceAssVehicle," +
                ":quotStep," +
                ":userDriverLicense," +
                ":userNbAccident," +
                ":userNbAccident," +
                ":userBonus," +
                ":vehicleShed," +
                ":vehicleFirstDriver," +
                ":vehicleSecondDriver," +
                ":vehicleContractID," +
                ":userLogin," +
                ":vehicleBrand," +
                ":vehicleModel," +
                ":vehicleFuel," +
                ":vehicleHP);")
    Boolean insertQuotationHome(QuotationHome quotationHome);





}
