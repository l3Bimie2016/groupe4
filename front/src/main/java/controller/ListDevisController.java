package controller;

import fr.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
//import fr.SessionData;
import java.util.List;
import java.util.Map;

/**
 * Created by termiton on 09/05/16.
 */
@Controller
public class ListDevisController {

    @Autowired
    private ListingService listingService;

    @Autowired
    private SessionData sessionData;

    @RequestMapping("/devis/listing")
    public String listing(Map<String, Object> model) {
        UserVertx uv = sessionData.getUser();
        String user = uv.getUserLogin();
        List<QuotationHome> devisHome = listingService.listDevisHome(user);
        List<QuotationVehicle> devisVehicle = listingService.listDevisVehicle(user);
        model.put("devisHome", devisHome);
        model.put("devisVehicle", devisVehicle);
        return "liste-devis";
    }
}
