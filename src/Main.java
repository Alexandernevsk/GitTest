import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("test branch v2.0");

        ArrayList<TestClass.Food> foods = new ArrayList<>();
        ArrayList<TestClass.Gem> gems = new ArrayList<>();

        gems.add(TestClass.Gem.Sapphire);
        gems.add(TestClass.Gem.Emerald);
        gems.add(TestClass.Gem.Diamond);

        gems.forEach(c -> System.out.println(c));

        foods.add(TestClass.Food.Frikandel);
        foods.add(TestClass.Food.Bitterbal);
        foods.add(TestClass.Food.Mexicano);

        for(TestClass.Food food : foods){
            System.out.println(food);
        }

        Shop item = new Shop(2.0, "Banaan", "Lekker rijk aan magnesium");
        System.out.println(item.getName());
    }
}