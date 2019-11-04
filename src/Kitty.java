public class Kitty extends Pet {


    public Kitty(String type, String name) {
        super(type, name);
    }


    @Override
    public void rest(Pet pet) {
        if (pet.getHp() == 2) {
            System.out.println("У питомца максимум здоровья.");
            return;
        }
        setHp(getHp() + 1);
        System.out.println("Питомец восстановил 1 здоровье.");

    }

    @Override
    public void give(Pet pet) {
        System.out.println("Китя не дает ресуров.");
    }
}
