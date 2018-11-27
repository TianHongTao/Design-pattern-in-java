package 建造者模式;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    public String name(){
        return "ChikenBurger";
    }
}
