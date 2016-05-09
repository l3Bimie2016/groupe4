package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by termiton on 09/05/16.
 */
@Service
public class ListingService {
    @Autowired
    private DevisHabitationRepository devisHabitationRepository;


    public List<QuotationHome> listDevis(String user) {
        List<QuotationHome> devis = devisHabitationRepository.findByUserLogin(user);
        return devis;
    }


    public ListingService() {
    }
}
