package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Gà said: Ò ó o";
    }

    @Override
    public String howToEat() {
        return "Gà ủ muối";
    }
}
