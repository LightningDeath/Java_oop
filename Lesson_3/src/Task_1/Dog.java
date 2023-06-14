package Task_1;

public class Dog extends Animals implements i_dog{
    String dogIndex;
    public Dog(int a, String n, String i) {
        age = a;
        petName =n;
        this.dogIndex = i;
    }

    /**
     * Создание текущего типа животного
     */
    public String getCurrentPetType() {
        return getPetType() + this.dogIndex;
    }

    @Override
    public String getPetName() {
        return petName;
    }

    @Override
    public int getPetAge() {
        return age;
    }
}
