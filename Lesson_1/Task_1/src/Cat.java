public class Cat {
    private String name;
    private int age;
    public Cat(){
        this.name = "null";
        this.age = 0;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void greetings() {
        if (this.age == 0) {
            System.out.println("Нету никакого котика!:( нНадо завести хоть одного!");
        } else {
            System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет).\n", name, age);
        }
    }
}
