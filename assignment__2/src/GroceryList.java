public class GroceryList {
    GroeceryItemOrder[] groceries;
    int count;

    public GroceryList() {
        groceries = new GroeceryItemOrder[10];
        count = 0;
    }
    public void add(GroeceryItemOrder item){
        if (count<9){
            this.groceries[count]=item;
            count++;
        }
    }

    public double gettotalcost(){
        double totalCost = 0;
        for (int i =0;i<this.count;i++){
            totalCost = totalCost +this.groceries[i].getcost();
        }

        return totalCost;
    }

}
