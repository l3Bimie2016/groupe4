package fr.convert;

import fr.ModelWizardVehicule;
import fr.QuotationVehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Termiton on 10/05/2016.
 */
@Service
public class ConvertEntityService {


    public QuotationVehicle convert(ModelWizardVehicule model){
        QuotationVehicle quotationVehicle = new QuotationVehicle();
        Integer step = model.getStep();
        switch (step){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

        return null;
    }
}
