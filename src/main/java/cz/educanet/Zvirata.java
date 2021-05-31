package cz.educanet;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@SessionScoped
public class Zvirata implements Serializable {
    private String id;
    private String jmeno;
    private String druh;
    private String vahaZvire;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getDruh() {
        return druh;
    }
    public void setDruh(String druh) {
        this.druh = druh;
    }

    public String getVahaZvire() {
        return vahaZvire;
    }
    public void setVahaZvire(String vahaZvire) {
        this.vahaZvire = vahaZvire;
    }

}
