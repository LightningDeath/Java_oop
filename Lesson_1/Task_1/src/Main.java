public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik",4);
        Owner owner1 = new Owner("Vasia");
        Owner owner2 = new Owner("Petia", "Katie", 5);
        owner1.greetings();
        cat1.greetings();
        owner2.greetings();
    }
}