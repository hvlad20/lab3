package ase.ro;

import java.util.List;

public class AgentieTurism {
    private String locatie;
    private int nrAngajati;
    private String denumire;
    private List<Serviciu> servicii;
    private List<Client> clienti;
    private static AgentieTurism instance = null;

    public static synchronized AgentieTurism getInstance(String locatie, int nrAngajati,
                                            String denumire, List<Serviciu> servicii, List<Client> clienti) {
        if(instance == null) {
            instance = new AgentieTurism(locatie, nrAngajati, denumire, servicii, clienti);
        }
        return instance;
    }

    public AgentieTurism(String locatie, int nrAngajati, String denumire, List<Serviciu> servicii, List<Client> clienti) {
        if(locatie.length()>0)
            this.locatie = locatie;
        if(nrAngajati>0)
            this.nrAngajati = nrAngajati;
        if(denumire.length()>5)
            this.denumire = denumire;
        this.servicii = servicii;
    }

    public String getLocatie() {
        return locatie;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public String getDenumire() {
        return denumire;
    }

    public List<Serviciu> getServicii() {
        return servicii;
    }

    public List<Client> getClienti() {
        return clienti;
    }

    public static AgentieTurism getInstance() {
        return instance;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setServicii(List<Serviciu> servicii) {
        this.servicii = servicii;
    }

    public void setClienti(List<Client> clienti) {
        this.clienti = clienti;
    }

    public static void setInstance(AgentieTurism instance) {
        AgentieTurism.instance = instance;
    }
}
