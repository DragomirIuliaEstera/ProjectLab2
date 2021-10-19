package application.classes;

import application.interfaces.IProduct;

public class Product implements IProduct {
    private String _name;
    private float _price;
    private int _id;
    private float _quantity;

    public Product(String name, float price){
        _name = name;
        _price = price;
    }
    public Product(String name, float price, int id){
        _name = name;
        _price = price;
        _id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public float get_price() {
        return _price;
    }

    public void set_price(float _price) {
        this._price = _price;
    }

    public void setId(int id){
        _id = id;
    }

    public int getId(){
        return _id;
    }

    public boolean availability(){//if the product is available
        if(_quantity>0){
            return true;
        }
        return false;
    }
    public boolean availability(float amount){//if an amount is available
        if(_quantity-amount>0){
            return true;
        }
        return false;
    }
}