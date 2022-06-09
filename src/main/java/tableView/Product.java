package tableView;

public class Product {


    protected int id;
    protected String name;
    protected double price;
    protected int qntd;

    //---------------------------------------------

    public Product(){
        this.name = "";
        this.price = 0;
        this.qntd = 0;
    }
    public Product(String name, double price, int qntd){
        this.name = name;
        this.price = price;
        this.qntd = qntd;
    }
    //------------------------------------------------------


    //------------------------------------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }

    //-----------------------------------
}
