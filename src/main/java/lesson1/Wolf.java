package lesson1;

public class Wolf extends AnimalLesson implements CanSwim{ // выдаёт ошибку выбираем на красной лампочке mpliment metods
    public Wolf(String name, String color, int age) { // alt + insert создали конструктор
        super(name, color, age);
    }

    @Override
    public void voice() { // появляется метод voice пише что делает волк
        System.out.println("Волк воет");
    }

    public double swim(Pool pool){
        System.out.println("Я волк и я плыву");
        return  pool.getLength() / getSwimmingSpead();
    }
}
