public class GroeceryItemOrder {
    String name;
    int quantity;
    double priceperunit;

    public GroeceryItemOrder(String name,double priceperunit) {
        this.name=name;

        this.priceperunit=priceperunit;
    }
    public double getcost(){
        return (this.quantity*this.priceperunit);
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
}
