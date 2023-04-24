public class Main {
    public static void main(String[] args) {
        Cat[] arrCats = new Cat[5];
        arrCats[0] = new Cat("Барсик", 15);
        arrCats[1] = new Cat("Мурзик", 20);
        arrCats[2] = new Cat("Васька", 25);
        arrCats[3] = new Cat("Бонни", 20);
        arrCats[4] = new Cat("Тефтелька", 30);

        Plate p = new Plate(100);

        for (Cat cat : arrCats) {
            cat.eat(p);
            p.info();
            cat.info();
        }
    }
}