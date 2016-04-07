package validator;

import fr.ModelWizardVehicule;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by nicol on 06/04/2016.
 */
@Component
public class VehiculeValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass == ModelWizardVehicule.class;
    }

    @Override
    public void validate(Object o, Errors errors) {
        ModelWizardVehicule model = (ModelWizardVehicule)o;


    }
}
