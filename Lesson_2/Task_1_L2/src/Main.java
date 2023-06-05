import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Cat> catList = new HashSet<>();
        HashSet<Dog> dogList = new HashSet<>();
        HashSet<Owner> ownerList = new HashSet<>();
        HashMap<Cat, Owner> cat_list = new HashMap<>();
        HashMap<Dog, Owner> dog_list = new HashMap<>();
        Cat cat1 = new Cat(4, "Barsik", "1");
        Cat cat2 = new Cat(5,"Chak", "2");
        Cat cat3 = new Cat(8, "Garage", "3");
        Dog dog1 = new Dog(5, "Mike", "1");
        Dog dog2 = new Dog(12, "Challanger", "2");
        Dog dog3 = new Dog( 2, "Kas", "3");
        Owner owner1 = new Owner("Vasia", 25, "cat1");
        Owner owner2 = new Owner("Alex", 34, "dog1");
        Owner owner3 = new Owner("Nata", 18, "cat2");
        Owner owner4 = new Owner("Grace", 45, "dog2");
        Owner owner5 = new Owner("Chandler", 50, "cat3");
        Owner owner6 = new Owner("Lucie", 25,"dog3");
        catList.add(cat1);
        catList.add(cat2);
        catList.add(cat3);
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        ownerList.add(owner1);
        ownerList.add(owner2);
        ownerList.add(owner3);
        ownerList.add(owner4);
        ownerList.add(owner5);
        ownerList.add(owner6);
        for (Owner o : ownerList) {// пробегаемся по владельцам
            if (o.getPetType().equalsIgnoreCase("cat")) {
                for (Cat c : catList) {//заполняем HashMap котиками и их владельцами
                    if (o.currentPetType().equalsIgnoreCase(c.getCurrentPetType())) {
                        cat_list.put(c, o);
                    }
                }
            } else if ((o.getPetType().equalsIgnoreCase("dog"))) {
                for (Dog d : dogList) {//заполняем HashMap собачками и их владельцами
                    if (o.currentPetType().equalsIgnoreCase(d.getCurrentPetType())) {
                        dog_list.put(d, o);
                    }
                }
            }
        }
        //далее реализовал использование default метода интерфейса i_greetings
        for (Cat c : cat_list.keySet()) {
            cat_list.get(c).greetings(c.getPetName(), c.getPetAge(), c.getPetType());
        }
        for (Dog d : dog_list.keySet()) {
            dog_list.get(d).greetings(d.getPetName(), d.getPetAge(), d.getPetType());
        }
    }
}