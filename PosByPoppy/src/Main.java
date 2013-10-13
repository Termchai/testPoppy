
public class Main {
    public static void main(String[]agrs)
    {
    	Inventory invent = Inventory.getInstance();
    	invent.print();
    	
    	invent.addNewItem("1234","ETerm",1);
    	invent.addNewItem("12","EBabe", 2);
    	invent.addNewItem("12345","Term", 15);
    	
    	invent.addItemQuantity("12345",15);
    	
    	invent.print();
    	
    }
}
