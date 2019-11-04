import java.util.Arrays;

public class Farm {
    public Pet[] pets = new Pet[10];  // Создали массив животных на ферме
    public WildAnimal[] wildAnimals = new WildAnimal[3];

    public void addPets(Pet pet) {            // Наполнение животными фермы
        for (int i = 0; i < this.pets.length; i++) {
            if (pets[i] == null) {
                this.pets[i] = pet;
                return;
            }
        }
    }

    public void addWildAnimals(WildAnimal wildAnimal) {            // Наполнение животными фермы
        for (int i = 0; i < this.wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                this.wildAnimals[i] = wildAnimal;
                return;
            }
        }
    }

    Farmer farmer;


    public Farm(Farmer farmer) {
        this.farmer = farmer;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "wildAnimals=" + Arrays.toString(wildAnimals) +
                '}';
    }

    public void feed() {
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] == null) return;
            farmer.feed(this.pets[i]);
        }
    }

    public void collect() {
        for (int i = 0; i < this.pets.length; i++) {
            if (this.pets[i] == null) return;
            farmer.collect(this.pets[i]);
        }
    }

    /* public void dead() {
         for (int i = 0; i < this.pets.length; i++) {
             if (this.pets[i].getHp() == 0 || this.pets[i].getRes() == 0) {
                 this.pets[i] = null;
                 for (int j = i; j < this.pets.length; j++) {
                     Pet[] pets1 = new Pet[this.pets.length - 1];
                     if (pets1[j] == null && pets[i] != null) pets1[j] = this.pets[i];
                     this.pets = pets1;
                 }
             }
         }
     } */
    public void defence() {
        int choise = 1 + (int) (Math.random() * 1);
        System.out.println(choise);
        int rndWild = (int) (Math.random() * wildAnimals.length);
        System.out.println(rndWild);
        System.out.println(wildAnimals[rndWild]);
        int rnd = (int) (Math.random() * pets.length);
        System.out.println(pets[rnd]);
        if (choise == 1) {
            System.out.println(wildAnimals[rndWild].getType() + " Пробрался на ферму!");
            wildAnimals[rndWild].attack(pets[rnd]);
        }
        else farmer.defence(wildAnimals[rndWild]);
    }
}


