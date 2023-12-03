package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Шарик", "Коричневый"));
        animals.add(new Cat("Мурзик", "Коричневый"));
        animals.add(new Fish("Золотая рыбка", "Коричневый"));
        animals.add(new Pegeon("Голубь обычный", "Коричневый"));
        animals.add(new Pingvin("Пингуин", "Коричневый"));
        animals.add(new Duck("Утка Боб", "Коричневый"));

        for (Animal animal: animals) {
            animal.fly();
            animal.toGo();
            animal.swim();
        }
    }
}
