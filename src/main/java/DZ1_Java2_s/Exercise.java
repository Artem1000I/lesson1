package DZ1_Java2_s;

public abstract class Exercise {

    abstract void sinkTheShip(int distance); //затопить корабль

    abstract void shootDown_a_Plane(int distance); // Сбить самолёт

    abstract void stealThePrincess(int distance); //Украсть принцессу

    abstract boolean onDistance(); // Если участник onDistance == true, выводим его

    public void information() {
    }
}
