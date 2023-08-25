import Animals.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animals[] msv = {
                new Cat("Кузя"), new Cat("Котя"),
                new Dog("Джек"), new Dog("Палкан"),
                new Tiger("Тигр"), new Tiger("Тигруля"),
                new Fish("Рыбонька"), new Fish("Рыбка"),
                new Cat("Кошка")
        };
        Arrays.sort(msv);

        for (Animals o:msv) {
            o.run(50);
            o.swim(5);
            System.out.println();
        }
        Animals.getInfo();

    }
}