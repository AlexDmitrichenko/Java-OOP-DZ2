public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        int difference = food - n;
        if (difference < 0)
            return false;
        food -= n;
        return true;
    }

    public void info() {
        System.out.println();
        System.out.println("В тарелке " + food + " кусков еды.");
    }
}

