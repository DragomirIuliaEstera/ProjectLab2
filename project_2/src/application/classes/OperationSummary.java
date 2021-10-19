package application.classes;

public class OperationSummary {
    private String _productName;
    private float _quantity;
    private float _price;
    public static String _productNameE= "nume produs";
    public float _quantityE= 50;
    public float _priceE= 250;

    public OperationSummary(String productName, float quantity, float price) {
        _productName = productName;
        _quantity = quantity;
        _price = price;
    }

    public OperationSummary() {
        _productName = _productNameE;
        _quantity = _quantityE;
        _price = _priceE;
    }

    public String printOperationSummary() {
        String opSum = "\n"+"Sumar operatiune:"
                + "\nProdus: " +_productName
                +"\nCantitate( L): "+_quantity
                +"\nPret( lei): "+_price+"\n";
        return opSum;
    }

    @Override
    public String toString() {
        return "Sumar operatiune( exemplu): " +
                "produs: '" + _productName + '\'' +
                ", cantitate: " + _quantity +
                ", pret: " + _price;
    }
}