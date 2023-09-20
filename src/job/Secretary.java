package job;

public class Secretary extends MBDSStaff{
    public Secretary(String nom) {
        super(nom);
    }
    public void work() {
        System.out.println("I do handle the registrations and all the paperwork");
    }
}
