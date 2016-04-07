package fr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joelle on 05/04/2016.
 */
@Service
public class TypesHabitationsService {

    public List<String> getAllHabitationTypes() {

        //todo get habitationTypesList
        //todo call this in ListController (waiting for Nico's controller)
        List<String> habitationTypesList = new ArrayList<String>();
        habitationTypesList.add("Maison");
        habitationTypesList.add("Château");
        habitationTypesList.add("T1");
        habitationTypesList.add("T2");

        return habitationTypesList;
    }
}
