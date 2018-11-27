package 建造者模式;
import java.util.*;
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float sum = 0.0f;
        for (Item item:items) {
            sum+=item.price();
        }
        return sum;
    }

    public void showItems(){
        for (Item item:items) {
            System.out.print("Item : "+item.name());
            System.out.print(",Packing : "+item.packing());
            System.out.println(",Price : "+item.price());
        }
    }
}
