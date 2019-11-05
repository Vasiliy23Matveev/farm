public class Main {
    public static void main(String[] args) {

        Farmer oleg = new Farmer();
        Forest forest = new Forest();

        Farm farm = new Farm(oleg);

        Cow pet1 = new Cow("Корова", "Алла");
        farm.addPets(pet1);
        pet1.setRes(5);
        pet1.setMs(1);
        pet1.setHp(1);

        Kitty pet2 = new Kitty ("Котя", "Тамара");
        farm.addPets(pet2);
        pet2.setHp(1);
        pet2.setMs(3);
        pet2.setRes(0);

        Cow pet3 = new Cow ("Корова", "Алена");
        farm.addPets(pet3);
        pet3.setHp(1);
        pet3.setMs(1);
        pet3.setRes(5);

        Rabbit pet4 = new Rabbit ("Кролик", "Петр");
        farm.addPets(pet4);
        pet4.setHp(1);
        pet4.setMs(3);
        pet4.setRes(0);

        Rabbit pet5 = new Rabbit ("Кролик", "Иван");
        farm.addPets(pet5);
        pet5.setHp(1);
        pet5.setMs(3);
        pet5.setRes(0);

        Rabbit pet6 = new Rabbit ("Кролик", "Валентин");
        farm.addPets(pet6);
        pet6.setHp(1);
        pet6.setMs(3);
        pet6.setRes(0);

        Chicken pet7 = new Chicken ("Кура", "Артем");
        farm.addPets(pet7);
        pet7.setHp(1);
        pet7.setMs(2);
        pet7.setRes(3);

        Chicken pet8 = new Chicken ("Кура", "Снежана");
        farm.addPets(pet8);
        pet8.setHp(1);
        pet8.setMs(1);
        pet8.setRes(3);

        Chicken pet9 = new Chicken ("Кура", "Галина");
        farm.addPets(pet9);
        pet9.setHp(1);
        pet9.setMs(1);
        pet9.setRes(3);

        Chicken pet10 = new Chicken ("Кура", "Матрона");
        farm.addPets(pet10);
        pet10.setHp(1);
        pet10.setMs(2);
        pet10.setRes(3);

        Wolf predator1 = new Wolf("Волк", "Серый");
        farm.addWildAnimals(predator1);
        predator1.setMs(2);
        predator1.setPower(2);

        Fox predator2 = new Fox("Лиса", "Фокси");
        farm.addWildAnimals(predator2);
        predator2.setMs(3);
        predator2.setPower(1);

        Bear predator3 = new Bear("Медведь", "Михаил");
        farm.addWildAnimals(predator3);
        predator3.setMs(2);
        predator3.setPower(3);



        System.out.println(farm);
        farm.defence();
        System.out.println(farm);















    }
}
