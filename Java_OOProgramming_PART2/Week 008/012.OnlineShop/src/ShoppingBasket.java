import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> purchases;

    public ShoppingBasket(){
        this.purchases = new HashMap<>();
    }

    public void add(String product, int price){

        if (purchases.containsKey(product)){
            purchases.get(product).increaseAmount();
        } else {
            Purchase item = new Purchase(product, 1, price);
            purchases.put(product, item);
        }
    }

    public int price(){

        int price = 0;

        for (Purchase item : purchases.values()){
            price += item.price();
        }

        return price;
    }

    public void print(){

        for (Purchase item : purchases.values()){
            System.out.println(item);
        }
    }

}
