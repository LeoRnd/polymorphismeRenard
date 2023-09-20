package job;

public class Teacher extends MBDSStaff{

    public Teacher(String nom)
    {
        super(nom);
    }
    public void work() {
        System.out.println("I do handle the teaching part !");
    }
}
