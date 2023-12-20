package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Hổ said: Meo meo";
    }

    @Override
    public String howToEat() {
        return "Nấu cao chứ làm gì nữa";
    }
}
