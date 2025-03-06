package Composicion.Ejercicio2;

public class Customer {

    int id;
    String name;
    int discount;


    public Customer(int id, int discount, String name) {
        this.id = id;
        this.discount = discount;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name+ "("+id+") "+discount+"%";
    }
}
