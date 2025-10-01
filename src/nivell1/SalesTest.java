
class SalesTest{

    void main() {

        Sale sale1 = new Sale();

        try{
            sale1.getTotalCost(sale1.getProducts());
        } catch (EmptySaleException e) {
           IO.println(e);
        }

        Product productA = new Product("Fanta naranja", 2.10);
        Product productB = new Product("Bocadillo de fuet", 3.55);

        sale1.addProduct(productA);
        sale1.addProduct(productB);

        try{
            IO.println(sale1.getTotalCost(sale1.getProducts()));
        } catch (EmptySaleException e) {
            IO.println(e);
        }

        try{
            sale1.getOutOfBoundsTotalCost(sale1.getProducts());
        } catch (RuntimeException e) {
            IO.println(e);
        }

    }

}

