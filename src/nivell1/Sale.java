import java.util.ArrayList;

class Sale {
    private static final String CUSTOMMESSAGE = "To proceed with a sale first you need to include products.";
    private ArrayList<Product> products;
    private double totalCost;

    Sale(){

        products = new ArrayList<Product>();

    }

    protected void addProduct(Product product){

        products.add(product);

    }

    protected String getTotalCost(ArrayList<Product> products) throws EmptySaleException{

        if(products.isEmpty()) throw new EmptySaleException(CUSTOMMESSAGE);

        for (int i=0; i < products.size(); i++) {

            totalCost += products.get(i).getPrice();

        }

        return "Total amount to be paid: " + totalCost;
    }

    protected ArrayList<Product> getProducts(){
        return products;
    }


    protected double getOutOfBoundsTotalCost(ArrayList<Product> products){

        for(int i=0 ; i <= products.size(); i++){

            totalCost += products.get(i).getPrice();

        }

        return totalCost;
    }


    {
        totalCost = 0;
    }

}
