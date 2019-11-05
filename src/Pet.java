public class Pet extends Animal {
    private int res;

    public Pet(String type, String name) {   // Конструктор, в котором задаются параметры класса по всякому
        super(type, name); // Эти ребята назначаются через методы setName и setType (они в родительском классе)
        setRes(res);    // ресурсы назначаются через МЕТОД КОТОРЫЙ ВНИЗУ СЕТТЕР
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    @Override
    public String toString() {
        return "[" +
                "Вид: " + getType() +
                ", Имя: " + getName() +
                ", Здоровье: " + getHp() +
                ", Скорость: " + getMs() +
                ", Ресурсы: " + res +


                ']';
    }
    public void rest(Pet pet){
        setHp(getHp() + 1);
        System.out.println("Питомец восстановил 1 здоровье.");
    }

    public void give(Pet pet) {
        System.out.println("Фермер собрал реурсы с " + getName());
        pet.setRes(getRes()-1);
    }






}




