package application.classes;

public class SmallCustomer extends Customer{
    public SmallCustomer(String name, int id){
        super(name, id);
    }

    public String get_name() {
        return super._name;
    }

    public int get_id() {
        return super._id;
    }
}