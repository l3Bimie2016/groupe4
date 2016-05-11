package fr;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by termiton on 06/04/16.
 */
public interface DevisHabitationRepository extends CrudRepository<QuotationHome,Integer> {

    List<QuotationHome> findByUserLogin(String userLogin);

}
