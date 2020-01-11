package farm;

abstract public class Animal {
    public Animal() {
    }
    String name;

    public Animal(String name) {
        this.name = "Bezimienny";
    }

    String showName() {
        return " zwierzę" + name;
    }

    String makeSound() {
        return "???";
    }

    void introduce() {
        System.out.println("Jestem " + showName() + ": " + makeSound());
    }
}
