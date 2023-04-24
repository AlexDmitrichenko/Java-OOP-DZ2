public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    void info() {
        System.out.println(name + " хочет поесть.");
        String isHungry = !satiety ? " сыт!" : " остается голодным, потому что в тарелке мало еды.";
        System.out.println(name + isHungry);
    }

    public void eat(Plate p) {
        if (satiety == true && p.decreaseFood(appetite) == true) {
            satiety = false;
        }
    }
}
