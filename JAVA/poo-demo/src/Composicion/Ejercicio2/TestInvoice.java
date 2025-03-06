package Composicion.Ejercicio2;

public class TestInvoice {
    public static void main(String[] args) {
        Customer customer= new Customer(1,10,"Manolo");
        Invoice invoice= new Invoice(12, customer,150);
        System.out.println(invoice);
        System.out.println("Amount after Discount: "+invoice.getAmountAfterDiscount());

    }
}
