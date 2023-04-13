package Task3;

class Chicken extends Animal implements Edible {
    @Override
    public String sound() {
        return "bawk bak,bak,bak, baaak bak";
    }

    @Override
    public String howToEat() {
        return "Love the Chinese Orange chicken orange juice sauce";
    }
}
