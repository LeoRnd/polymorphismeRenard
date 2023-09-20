package job;

public class MBDSStaff {
    private String nom;

    public MBDSStaff(String nom) {
        this.nom = nom;
    }

    public void work() {
        // The work method is defined in the base class
        System.out.println("I do some work.");
    }

    public String getName() {
        return nom;
    }
}
