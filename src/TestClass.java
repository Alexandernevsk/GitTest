import java.util.ArrayList;

public class TestClass {
    enum Gem { Sapphire, Ruby, Emerald, Diamond, Opal, Amethyst
    }

    enum Food {Frikandel, Kroket, Bitterbal, Mexicano}
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(Food.Frikandel);
        foods.add(Food.Bitterbal);
        foods.add(Food.Mexicano);
        for(Food food : foods){
            System.out.println(food);
        }
    }
}
