class Product {

    private String name;
    private double price;

    Product (String name, double price){

        this.name = name;
        this.price = price;
        IO.println("New product " + this.name + " created, price: " + this.price);

    }

    protected double getPrice(){
        return price;
    }

    protected String getName(){
        return name;
    }

}
