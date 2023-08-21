import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Master branch v2.0");
        ArrayList<TestClass.Food> foods = new ArrayList<>();
        foods.add(TestClass.Food.Frikandel);
        foods.add(TestClass.Food.Bitterbal);
        foods.add(TestClass.Food.Mexicano);
        for(TestClass.Food food : foods){
            System.out.println(food);
        }

    }
}