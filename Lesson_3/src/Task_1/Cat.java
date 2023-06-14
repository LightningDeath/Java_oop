package Task_1;

public class Cat extends Animals implements i_cat {
    String catIndex;

    public Cat(int a, String n, String i) {
        age = a;
        petName = n;
        this.catIndex = i;
    }


    public String getCurrentPetType() {
        return getPetType() + this.catIndex;
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
