package nivell1;

import java.util.ArrayList;

class Sale {

    private ArrayList<Product> sale;
    private double totalCost;

    Sale(){

        sale = new ArrayList<Product>();

    }

    protected void addProduct(Product product){

        sale.add(product);

    }

    protected double getTotalCost(ArrayList<Product> products){

        for (Product product : products) {

            totalCost += product.getPrice();

        }

        return totalCost;
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
