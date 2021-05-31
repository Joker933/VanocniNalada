package cz.educanet;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;

@ApplicationScoped
public class Manager {
    static ArrayList<Zvirata> animals = new ArrayList<>();

    public ArrayList<Zvirata> getAnimal(){
        return animals;
    }
}
