public interface i_dog {
    default String getPetType(){return "dog";}
    String getPetName();

    int getPetAge();

}
