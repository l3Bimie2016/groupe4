package controller;

import fr.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/devis/listing")
    public String listing(Map<String, Object> model) {
        String user = "user";
        List<QuotationHome> devisHome = listingService.listDevis(user);
        model.put("listingDevis", devisHome);
        return "liste-devis";
    }
}
