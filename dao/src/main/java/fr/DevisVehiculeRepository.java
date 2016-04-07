package fr;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by termiton on 06/04/16.
 */
public interface DevisVehiculeRepository extends CrudRepository<QuotationVehicle,Integer> {

    QuotationVehicle findByUserlogin(String userLogin);
    QuotationVehicle findByQuotvid(int id);

}
