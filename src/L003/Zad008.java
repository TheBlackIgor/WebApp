package L003;

import java.util.ArrayList;

public class Zad008 {
    public static void main(String[] args) {
        Invoice i1 = new Invoice("A001", "faktura 001", 1, 1.50);
        Invoice i2 = new Invoice("A002", "faktura 002", 2, 2.50);
        Invoice i3 = new Invoice("A003", "faktura 003", 3, 3.50);
        Invoice i4 = new Invoice("A004", "faktura 004", 4, 4.50);
        Invoice i5 = new Invoice("A005", "faktura 005", 5, 5.50);
        Invoices invoices = new Invoices();
        invoices.addInvoice(i1);
        invoices.addInvoice(i2);
        invoices.addInvoice(i3);
        invoices.addInvoice(i4);
        invoices.addInvoice(i5);
        System.out.println(invoices.toString());
    }
}
class Invoice{
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;
    public Invoice(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}

class Invoices{
    private ArrayList<Invoice> invokes = new ArrayList<>();

    public void addInvoice(Invoice i){
        invokes.add(i);
    }

    @Override
    public String toString() {
        int quantity=0;
        double sumPrice = 0;
        double avgPrice = 0;

        for(int i = 0; i < invokes.size(); i++){
            quantity += invokes.get(i).getQuantity();
            sumPrice += invokes.get(i).getUnitPrice();
        }
        avgPrice = sumPrice / quantity;

        return sumPrice +"\n"+"Invoices{allQuantities="+quantity+", getAverageUnitPrice="+avgPrice+"}";
    }
}