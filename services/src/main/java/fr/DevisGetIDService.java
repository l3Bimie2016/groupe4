package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Termiton on 11/05/2016.
 */

@Service
public class DevisGetIDService {
    @Autowired
    private DevisVehiculeRepository devisVehiculeRepository;
    @Autowired
    private DevisHabitationRepository devisHabitationRepository;

    public QuotationVehicle getVehicule(Integer id){
        QuotationVehicle quotationVehicle;
        quotationVehicle = devisVehiculeRepository.findOne(id);
        return quotationVehicle;
    }

    public QuotationHome getHome(Integer id){
        QuotationHome quotationHome;
        quotationHome = devisHabitationRepository.findOne(id);
        return quotationHome;
    }


}
