import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String ... args) {
        List<Dog> dogs = new ArrayList<>();

        Dog dog;
        dog = new Wolf();
        dog.setBarkBehaviour(new LoudBark());
        dog.setInstinctBehaviour(new Hunt());

        dogs.add(dog);

        Dog smallDog = new Corgi();
        smallDog.setInstinctBehaviour(new Wag());
        smallDog.setBarkBehaviour(new Bork());

        dogs.add(smallDog);

        for(Dog d :dogs){
            System.out.println(d.display()+". "+d.bark()+" "+d.instinct());
        }

    }
}
