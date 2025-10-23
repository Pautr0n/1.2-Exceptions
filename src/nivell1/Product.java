class Product {

    private final String name;
    private double price;

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
        System.out.println("New product " + this.name + " created, price: " + this.price);

    }

    protected double getPrice() {
        return price;
    }

    protected String getName() {
        return name;
    }

}
