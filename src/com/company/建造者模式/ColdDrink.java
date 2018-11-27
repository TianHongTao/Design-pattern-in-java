package 建造者模式;

public abstract class ColdDrink implements Item {
    @Override
    public String name() {
        return "ColdDrink";
    }

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
