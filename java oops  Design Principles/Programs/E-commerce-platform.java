import java.util.*;

class ProductItem {
    private String code; private String name; private double price;
    public ProductItem(String code,String name,double price){ this.code=code; this.name=name; this.price=price; }
    public double getPrice(){ return price; }
    public String getName(){ return name; }
    public String getCode(){ return code; }
}

class EOrder {
    private String id; private List<ProductItem> items = new ArrayList<>();
    public EOrder(String id){ this.id=id; }
    public void add(ProductItem p){ items.add(p); }
    public double total(){ return items.stream().mapToDouble(ProductItem::getPrice).sum(); }
}

class ECustomer {
    private String name; private List<EOrder> orders = new ArrayList<>();
    public ECustomer(String name){ this.name = name; }
    public EOrder createOrder(String id){ EOrder o = new EOrder(id); orders.add(o); return o; }
}

public class ECommerce {
    public static void main(String[] args){
        ECustomer c = new ECustomer("Buyer1");
        EOrder o = c.createOrder("ORD1001");
        o.add(new ProductItem("P01","Phone", 10000));
        o.add(new ProductItem("P02","Charger", 500));
        System.out.println("Order total: " + o.total());
    }
}
