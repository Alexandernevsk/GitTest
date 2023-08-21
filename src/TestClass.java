import java.util.ArrayList;

public class TestClass {
    enum Gem { Sapphire, Ruby, Emerald, Diamond, Opal, Amethyst
    }

    public static void main(String[] args) {
        ArrayList<Gem> gems = new ArrayList<>();
        gems.add(Gem.Sapphire);
        gems.add(Gem.Ruby);
        gems.add(Gem.Emerald);
        for(Gem gem : gems){
            System.out.println(gem);
        }
    }
}
