package fr;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by termiton on 06/04/16.
 */
public interface DevisHabitationRepository extends CrudRepository<QuotationHome,Integer> {

    QuotationHome findByUserLogin(String userLogin);

}
