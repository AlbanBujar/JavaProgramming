package day40_FinalKeyword;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "Red","Large", 7);

        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();
    }
}
