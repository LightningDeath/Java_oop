public class Owner extends Cat {
    String name;

    public Owner(String name) {
        this.name = name;
    }

    /**
     * Constructor
     * @param name - имя владельца
     * @param catName - имя животного
     * @param age - возраст животного
     */
    public Owner(String name, String catName, int age) {
        super(catName, age);
        this.name = name;
    }

    @Override
    public void greetings() {
        if (super.getAge() == 0) {
            System.out.printf("Меня зовут %s и у меня нет котика :(\n", name);
        } else {
            System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n", super.getName(), super.getAge(), this.name);
        }
    }
}
