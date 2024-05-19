package Assignment;

interface Pet {
    void play();
}
interface Barkable extends Pet {
    void bark();
}
class Dog implements Barkable {
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking");
    }
}
public class Assignment_52 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.play();
        myDog.bark();
    }
}
