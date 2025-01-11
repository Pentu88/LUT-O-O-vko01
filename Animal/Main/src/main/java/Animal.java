public class Animal {
    String name;
    String species;
    int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + '\n' + this.species + '\n' + this.age;
    }
}
