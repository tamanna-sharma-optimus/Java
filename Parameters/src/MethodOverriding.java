class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat Meows");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal animal = new Animal(); 
        animal.makeSound();
        
        Animal cat = new Cat();
        cat.makeSound();
    }
}