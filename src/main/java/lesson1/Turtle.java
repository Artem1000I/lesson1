package lesson1;

public class Turtle extends AnimalLesson {
    public Turtle(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Черепаха фыркает");
    }
    public double swim(Pool pool){
        System.out.println("Я черепаха я не плыву");
        return  pool.getLength() / getSwimmingSpead();
    }
}
