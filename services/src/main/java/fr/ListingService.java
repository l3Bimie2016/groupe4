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

    private QuotationVehicle devisVehicule = new QuotationVehicle();
    private QuotationHome devisHome = new QuotationHome();
    private String user;
    @Autowired
    private DevisHabitationRepository devisHabitationRepository;


    public List<String> listDevis(String user) {
        List<String> devis = new ArrayList();
        this.devisHome = devisHabitationRepository.findByUserLogin(user);
        res.add("Clio");
        return devis;
    }


    public ListingService() {
    }
}
