

// class should have only 1 reason to change
//each class has single responsibility
public class SingleResponsibilityPrinciple {

}

class Marker{
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price) {
        this.name = name;
        this.color = color;
        this.year = year;
        this.price = price;
    }
}

//generate the invoice
class Invoice{
    private Marker marker;
    private int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public int getQuantity(){
        return ((marker.price) * this.quantity);
    }
//    public void printInvoice(){
//        System.out.println(marker.name + marker.color + marker.price + marker.year);
//    }
//
//    public void saveToDB(){
//        //save to db
//    }
}


//prints the invoice
class InvoicePrinter{
    private Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice(){

    }
}


//save invoice
class InvoiceDB{
    private Invoice invoice;

    public InvoiceDB(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveToDB(){}
}