
class SalesTest {

    public static void main(String[] args) {

        Sale sale1 = new Sale();

        try {
            sale1.getTotalCost(sale1.getProducts());
        } catch (EmptySaleException e) {
            System.out.println(e);
        }

        Product productA = new Product("Fanta naranja", 2.10);
        Product productB = new Product("Bocadillo de fuet", 3.55);

        sale1.addProduct(productA);
        sale1.addProduct(productB);

        try {
            System.out.println(sale1.getTotalCost(sale1.getProducts()));
        } catch (EmptySaleException e) {
            System.out.println(e);
        }

        try {
            sale1.getOutOfBoundsTotalCost(sale1.getProducts());
        } catch (RuntimeException e) {
            System.out.println(e);
        }

    }

}

