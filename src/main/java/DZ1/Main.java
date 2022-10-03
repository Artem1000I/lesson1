package DZ1;



public class Main {
    /*public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик","Белый",1);//Создаём новый обьект и вызываем конструктор Cat он с параметрами и записываем туда параметры имя цвет возраст
        System.out.println(cat1);

        Cat cat2 = new Cat("Морис","black",1);

        Cat cat3 = new Cat("Морис","black",1);

        System.out.println(cat2.equals(cat3)); //проверяем одинаковы обьекты или нет
        System.out.println(cat2 == cat3);      // не правильно так сравнивать строки проверяем одинаковы обьекты или нет


        Wolf wolf = new Wolf("Тревор","Серый",6); //созданный обьект волк
        Animal cat4 = new Cat("Морис","red",10);


        if(cat4 instanceof Wolf){ // проверка на принодлежность к тому или иному типу
            //Привести к типу волк кота
            Wolf cat5 = (Wolf) cat4;
            System.out.println(cat5);
        }
        else {System.out.println("Это не волк!");
        }

        cat1.voice();
        wolf.voice();

        cat1.setAge(-10);
        System.out.println(cat1);

        cat2.setSwimmingSpead(2.0); //2 киломатра скорость
        Pool pool = new Pool( 200); // длина бассейна

        double timeToOvercomeCat2 = cat2.swim(pool);
        System.out.println(timeToOvercomeCat2);

        Pool[] pools ={new Pool(15),new Pool(20),new Pool(35)}; // препятствия три должны преодолеть и покахать результат

        //попросить одного из котиков пройти все препятствия при помощи цикла

        wolf.setSwimmingSpead(5);// зададим скорость волку

        for (Pool poolI : pools){
            System.out.println( "Проплыл за время"+ wolf.swim(poolI)); //проплыл по очереди по всем препятствиям
        }*/

        public static void main(String[] args){
            Course c = new Course(new Cross(80), new Water(3), new Wall(5)); // Создаем полосу препятствий
            Team team = new Team("Heroes", (Competitor) new Human("Johny"), new Cat("Murzik"), new Dog("Izzy")); // Создаем команду
            c.doIt(team); // Просим команду пройти полосу

            System.out.println("\nWinners:");
            team.passedTheDistance();

            System.out.println("\nResult:");// Показываем результаты
            team.showResults();

    }
    }




/*}*/
