public class Exercise18 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.makeSound();
        d.makeSound();
    }
}
class Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Bark");
    }
}
