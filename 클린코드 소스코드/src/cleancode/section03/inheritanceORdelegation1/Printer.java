package cleancode.section03.inheritanceORdelegation1;
 
public abstract class Printer {
    private String id;

    public Printer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    abstract void print(Object msg);
}