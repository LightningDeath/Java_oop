package Task_1;

public interface i_cat {
    default String getPetType(){return "cat";}
    String getPetName();

    int getPetAge();

}
