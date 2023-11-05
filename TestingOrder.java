public class TestingOrder {
    public static void main(String[] args) {
        
        Order order1 = new Order() ;
        Order order2 = new Order() ;

        Order order3 = new Order("Jame");
        Order order4 = new Order("Alix");
        Order order5 = new Order("Alexandra");

        Item item1 = new Item("Cappucino",2.0) ;
        Item item2 = new Item("Nescafe",3.0) ; 
        Item item3 = new Item("Milk",4.0) ;
        Item item4 = new Item("Frapuccino",5.0) ; 
        Item item5 = new Item("Express",6.0) ;
        Item item6 = new Item("The",7.0) ; 
        Item item7 = new Item("Juice",8.0) ;
        Item item8 = new Item("Water",3.0) ; 

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item5);
        order3.addItem(item6);

        order4.addItem(item7);
        order4.addItem(item8);

        order5.addItem(item1);
        order5.addItem(item6);

        order1.display() ;
        order2.display() ;
        order3.display() ;
        order4.display() ;
        order5.display() ;

        order1.setReady(true);
        order2.setReady(false);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());

        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
     


    }
}