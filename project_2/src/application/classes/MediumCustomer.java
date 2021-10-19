package application.classes;

public class MediumCustomer extends Customer{
    public MediumCustomer(String name, int id){
        super(name, id);
    }

    public String get_name() {
        return super._name;
    }

    public int get_id() {
        return super._id;
    }
}