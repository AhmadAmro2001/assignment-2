public class Main {
    public static void main(String[] args) {
        GroceryList List1 = new GroceryList();
        GroeceryItemOrder item1 = new GroeceryItemOrder("pepsi",6);
        GroeceryItemOrder item2 = new GroeceryItemOrder("cola",7);

        System.out.println(item1.getcost());
        System.out.println(item2.getcost());
        List1.add(item1);
        List1.add(item2);

        System.out.println(List1.gettotalcost());
    }
}