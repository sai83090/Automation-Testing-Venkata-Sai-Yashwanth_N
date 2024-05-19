package Assignment;
class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class cat extends Animal {
    void Sound() {
        System.out.println("sleep");
    }
}

public class Assignment_90 {
    public static void main(String[] args) {
        Animal animal = new cat();
        animal.makeSound();
        cat dog = (cat) animal; 
        dog.Sound(); 
    }
}
