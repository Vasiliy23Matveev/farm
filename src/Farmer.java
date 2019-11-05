public class Farmer  {
    private String name = "Олег";
    public int power = 1;
    private int resf = 5;


    public void feed(Pet pet){   // Метод кормежки, обращается к классу Pet
        System.out.println("Фермер покормил " + pet.getName() + " " + pet.getType());
        resf -= 1;
        pet.rest(pet);              // Восстанавливает здоровье метод класса Pet
        }

        public void collect(Pet pet){
        if (pet.getType().equals("Котя")) return;
        if (pet.getRes() == 0) {
            this.resf = this.resf + pet.getHp();
            System.out.println(pet.getName() + " Пошел на шашлык!!!");
            this.resf += pet.getHp();
            return;
        }
        this.resf += 1;
        pet.give(pet);
        }

    @Override
    public String toString() {
        return "Farmer{" +
                "Имя: " + name  +
                ", Ресурсы: " + resf +
                '}';
    }

    void defence(WildAnimal wildAnimal) {
        wildAnimal.setHp(wildAnimal.getHp() - this.power);
        System.out.println("Фермер прогнал " + wildAnimal.getType() + ", здоровье: " + wildAnimal.getHp());
    }

    public int getResf() {
        return resf;
    }

}

