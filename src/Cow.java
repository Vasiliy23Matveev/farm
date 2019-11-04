public class Cow extends Pet{


    public Cow(String type, String name) {
        super(type, name);
    }


    @Override
    public void rest(Pet pet) {
        if (pet.getHp() == 5) {
            System.out.println("У питомца максимум здоровья.");
            return;
        }
        super.rest(pet);

    }

}
