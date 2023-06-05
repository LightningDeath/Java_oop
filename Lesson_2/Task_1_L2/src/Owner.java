
public class Owner extends Human implements i_owner, i_greetings {
    String petType;

    public Owner(String n, int g, String petType) {
        this.petType = petType;
        name = n;
        age = g;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     * Получение текущего типа животного,
     * с помощью которого возможно определить владельцем какого животного
     * является хозяин
     */
    @Override
    public String currentPetType() {
        return this.petType;
    }

    /**
     * Получение типа животного из текущего типа
     */
    public String getPetType() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            result.append(this.petType.charAt(i));
        }
        return result.toString();
    }

    /**
     * Метод вывода приветствия в зависимости от типа животного
     */
    @Override
    public void greetings(String namePet, int agePet, String petType) {
        if (petType.equalsIgnoreCase("cat")){
            System.out.printf("Мяу! Меня завут %s, мне %d года(лет) и я %s. Мой хозяин - %s, возраст: %d.\n", namePet, agePet, getPetType(), name, age);
        } else if (petType.equalsIgnoreCase("dog")){
            System.out.printf("Гав! Меня завут %s, мне %d года(лет) и я %s. Мой хозяин - %s, возраст: %d.\n", namePet, agePet, getPetType(), name, age);
        }
    }
}
