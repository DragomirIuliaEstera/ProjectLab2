package application.classes;

import application.interfaces.ICustomer;

public class Customer implements ICustomer {
    protected String _name;
    protected int _id;
    private int _numberOfProducts;
    private int _contor = 0;
    private Product[] _purchasedList;

    public Customer(String name, int id){
        _name = name;
        _id = id;
    }
    public Customer(String name, int id, int numberOfProducts){
        _name = name;
        _id = id;
        _numberOfProducts = numberOfProducts;
    }
    public String getName(){
        return _name;
    };
    public int getId(){
        return _id;
    };

    public void makeList(int numberOfProducts){
        _numberOfProducts = numberOfProducts;
        _purchasedList = new Product[_numberOfProducts];
    }
    public int makePurchase(Product prod){
        if(_contor<0)
            return -1;
        if(_contor<_numberOfProducts) {
            _purchasedList[_contor] = prod;
            _contor++;
            return 1;
        }
        return 0;
    }
    public StringBuffer getList(){
        StringBuffer s = null;
        for(int i=0; i<_contor;++i){
            s.append(_purchasedList[i].get_name()+"\n");
        }
        return s;
    }
}