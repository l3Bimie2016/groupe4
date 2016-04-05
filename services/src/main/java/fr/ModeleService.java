package fr;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicol on 05/04/2016.
 */
@Service
public class ModeleService {

    public List<String> findByMarque(String marque) {
        List<String> res = new ArrayList<String>();
        if(marque.equals("Renault")) {
            res.add("Clio");
            res.add("Megane");
            res.add("Escape");
        }
        if(marque.equals("Peugeot")) {
            res.add("207");
            res.add("3008");
            res.add("206");
        }
        if(marque.equals("Citroën")) {
            res.add("DS3");
            res.add("DS4");
            res.add("C3");
        }
        return res;
    }
}
