package main;

public class item {
    String _name;
    double _quantity;
    double _price;

    public void debug () {
        System.out.println(_name);
        System.out.println(_quantity);
        System.out.println(_price);
    }

    public item (String d) { //Jol Ley purchased #3 of the @washers at the price $0.25
        String name = d.substring(d.indexOf("@") );
        _name = name.substring(1, name.indexOf(" ") + 1);
        String quantity = d.substring(d.indexOf("#") );
        String quantityConvert = quantity.substring(1, quantity.indexOf(" ") + 1);
        _quantity = Double.parseDouble(quantityConvert);
        String price = d.substring(d.indexOf("$") );
        String priceConvert;
        if (price.indexOf(" ") != 0 && price.indexOf(" ") > 0) {
            priceConvert = price.substring(1, price.indexOf(" ") + 1);
        } else {
            priceConvert = price.substring(1);
        }
        _price = Double.parseDouble(priceConvert);
    }

    public String toString () {
        String output = "Name: " + _name
                + "\nQuantity: " + _quantity
                + "\nPrice per item: " + _price;
        return output;
    }

    public double getTotal () {
        return _price * _quantity;
    }
}
