import java.util.Arrays;

public class Forest {
    public WildAnimal[] wildAnimals = new WildAnimal[3];

    public void addWildAnimal(WildAnimal wildAnimal) {
        for (int i = 0; i < this.wildAnimals.length; i++) {
            if (this.wildAnimals[i] == null) {
                this.wildAnimals[i] = wildAnimal;
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Forest{" +
                "wildAnimals=" + Arrays.toString(wildAnimals) +
                '}';
    }

    public void attack(WildAnimal wildAnimal, Pet pet) {
        int choise = 1 + (int) (Math.random() * 2);
        System.out.println(choise);
        if (choise == 1) {
            System.out.println(wildAnimals[0].getType() + "Пробрался на ферму!");
            wildAnimal.attack(pet);

    }
}
}
