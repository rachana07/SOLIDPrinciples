public class OpenClosedPrinciple {
}

//Open for extension and closed for Modification
//create interface and implement other classes

//I want to save the file in DB and file, extend classes by implementing interface
//class InvoiceDAO{
//    private Invoice invoice;
//
//    public InvoiceDAO(Invoice invoice) {
//        this.invoice = invoice;
//    }
//    public void saveToDB(){}
////    public void saveToFile(){}
//}

interface InvoiceDAO{
    public void save(Invoice invoice);
}

class DatabaseInvoiceDAO implements InvoiceDAO{

    @Override
    public void save(Invoice invoice) {
        //save to DB
    }
}

class FileInvoiceDAO implements InvoiceDAO{

    @Override
    public void save(Invoice invoice) {

    }
}

