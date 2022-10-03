/*
package lesson1;

import DZ1.Competitor;

import java.util.Objects;

public  class Cat1 extends AnimalLesson implements CanSwim, Competitor { // класс тоже сделался абстрактным и реализовывает методы CanSwim


    public Cat1(String name){ //конструктор где указываем что прописывается котику
    super(name,color,age);
    }

    //Нажимаем alt + insert нажимаем to string и меняем тело
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", age=" + getAge() +
                '}';
    }



    // alt + inser выбираем equalse пишем что хотим сравнивать котиков по имени цвету и возрасту
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //если разные классы то не будет равно
        Cat1 cat = (Cat1) o;
        return getAge() == cat.getAge() && Objects.equals(getName(), cat.getName()) && Objects.equals(getColor(), cat.getColor());
    }

    //
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getColor(), getAge());
    }

    public double swim(Pool pool){
        System.out.println("Я кот и я плыву");
        return  pool.getLength() / getSwimmingSpead();
    }

    @Override
    public void voice() {

    }


    @Override
    public void run(int dist) {

    }

    @Override
    public void swim(int dist) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void info() {

    }
}
*/
