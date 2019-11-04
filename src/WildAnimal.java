public class WildAnimal extends Animal {

    private int power;

    public WildAnimal(String type, String name) {
        super(type, name);
        setHp(3);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "WildAnimal{" +
                "Вид: " + getType() +
                ", Имя: " + getName() +
                ", Здоровье: " + getHp() +
                ", Скорость: " + getMs() +
                ", Сила: " + power +
                '}';
    }

    public void attack(Pet pet) {       // Метод атаки
        if (pet.getMs() > this.getMs()) {
            System.out.println("Питомец убежал от зверя!");
            return;
        }
        else {
            pet.setHp(pet.getHp() - this.power);
        System.out.println(this.getName() + " сделал кусь " + pet.getName() + ", Здоровье " + pet.getName() + " стало " + pet.getHp());
        }
    }


}
