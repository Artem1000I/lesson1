package DZ1;

//blablabla
//import java.util.Random;

public class Team {

    String nameTeam ;
    //Random random = new Random();

    Competitor[] partner = new Competitor[3];
    Animal[] zoo = {new Cat("Murzik"), new Dog("Izzy")};
    // Формируем команду
    public Team(String nameTeam, Competitor team1, Competitor team2, Competitor team3 ) {
        this.nameTeam  = nameTeam;

        partner[0] = team1;
        partner[1] = team2;
        partner[2] = team3;
//

    }
    // Вывод информации кто прошел дистанцию
    public void passedTheDistance() {
        for (Competitor com : partner) {
            // Если участник onDistance == true, выводим его
            if (com.isOnDistance()) {
                com.info();
            }
        }
    }

    // Вывод информации о членах команды
    public void showResults() {
        for (Competitor com : partner) {
            com.info();
        }
    }

    // геттер участников команды
    public Competitor[] getTeammates() {
        return partner;
    }
}
