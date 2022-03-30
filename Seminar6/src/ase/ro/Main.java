package ase.ro;

public class Main {
    public static void Main(String[] args) {
        //AgentieTurism agentie = AgentieTurism.getInstance("Bucuresti", 3, "Travel now", null, null);
        //System.out.println(agentie.getNrAngajati());
    AgentieTurism agentie = AgentieTurism.getInstance();
    try {
        System.out.println("Agentie 1 : " +agentie.getNrAngajati());
    }
    catch(Exception e) {

    }
    finally {

    }
    }
}
