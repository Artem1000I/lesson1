package lesson1;

public abstract class AnimalLesson {
    private String name; //имя
    private String color; //цвет
    private int age; //возраст

    private  double swimmingSpead; //скорость плавания

    public double getSwimmingSpead() {
        return swimmingSpead;
    }

    public void setSwimmingSpead(double swimmingSpead) {
        this.swimmingSpead = swimmingSpead;
    }

    public AnimalLesson(String name, String color, int age){//конструктор где указываем что прописывается котику
        this.name =name;
        this.color = color;
        if (age >= 0)this.age = age;
    }

    //_____________________________________________________________________________________________________-
    //Создаём геторы сетторы alt + insert выбираем get and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0)this.age = age;
    }

    //метод для плавания
    public double swim(Pool pool){
        return pool.getLength() / swimmingSpead; //длинну бассейна делим на скорость плавания
    }


    //Добавим метод Voice что наши животные умеют издавать звук
    public abstract void voice(); //сделали метод абстрактным



}
