import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse(){
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product){
        if (prices.containsKey(product)){
            return prices.get(product);
        }

        return -99;
    }

    public int stock(String product){
        if (stocks.containsKey(product)){
            return stocks.get(product);
        }

        return 0;
    }

    public boolean take(String product){
        int stock = 0;
        if (stocks.containsKey(product)){
            stock = stocks.get(product);

            if (stock > 0){
                stock -= 1;
                stocks.put(product, stock);

                return true;
            }
        }

        return false;
    }

    public Set<String> products(){
        Set<String> productList = new HashSet<>();

        for (String product : stocks.keySet()){
            productList.add(product);
        }

        return productList;
    }
}
