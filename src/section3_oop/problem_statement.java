package section3_oop;

public class problem_statement {
    public static void main(String[] args) {
        ShoppingCart sc1 = new ShoppingCart();
        sc1.addToCart(new CartItem(61, 1));
        sc1.addToCart(new CartItem(62, 2));
        sc1.addToCart(new CartItem(63, 3));
        sc1.addToCart(new CartItem(64, 4));
        sc1.addToCart(new CartItem(65, 5));
        sc1.addToCart(new CartItem(66, 6));
        sc1.addToCart(new CartItem(67, 7));
        sc1.addToCart(new CartItem(68, 8));
        sc1.addToCart(new CartItem(69, 9));
        sc1.addToCart(new CartItem(70, 10));
        sc1.addToCart(new CartItem(71, 11));

        sc1.order();

    }
}

class CartItem {
    private int itemCode, quantity;

    public CartItem(int itemCode, int quantity){
        this.itemCode = itemCode;
        this.quantity = quantity;
    }

    public int getItemCode() {
        return itemCode;
    }

    public int getQuantity() {
        return quantity;
    }

}

class ShoppingCart {
    private CartItem items[];
    private int size, itemCount = 0;
    private static final int DEFAULT_SIZE = 10;

    public ShoppingCart(){
        items = new CartItem[DEFAULT_SIZE];
        this.size = DEFAULT_SIZE;
    }

    public ShoppingCart(int size){
        items = new CartItem[size];
        this.size = size;
    }

    public void addToCart(CartItem item){
        if(itemCount < size){
            this.items[itemCount++] = item;
            System.out.println("Added Item!");
        }
        else {
            System.out.println("Shopping Cart is Full");
        }
    }

    public void order(){
        for (int i = 0; i < itemCount; i++){
            System.out.println("Item " + (i + 1));
            System.out.println("Item Code: " + items[i].getItemCode());
            System.out.println("Item Quantity: " + items[i].getQuantity());
            System.out.println();
        }
    }
}
