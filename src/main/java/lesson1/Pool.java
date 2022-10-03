package lesson1;

public class Pool { //бассейн
    private double length; //длина

    public  Pool(double length){
        this.length = length;
    }
    public double getLength(){
        return  length;
    }

    public void setLength(double length){
        this.length = length;
    }

    //Метод который вернёт кто и за сколько проплывает
        public double getTimeToOvercome(CanSwim cat){ //метод только для котов
            return cat.swim(this);
        }

    @Override
    public String toString() {
        return "Pool{" +
                "length=" + length +
                '}';
    }
}
