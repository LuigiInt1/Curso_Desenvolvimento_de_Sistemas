import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        User luigi = new User("Luigi","Santos","luigisantostk@gmail.com","1234");

        ParkAddress rua4 = new ParkAddress("Cachoeirinha", "RS", "Brasil", "Imbui", 123135.1234f, 123.432f);

        CombatTeam timeAzul = new CombatTeam(3, rua4, luigi);

        Leader tulho = new Leader("Luigi", "Santos", "Luigisantostk@gmai.com", "arereOgremiovaiJogarASerieB", false, "balaNacara", timeAzul);

        Image paraiso = new Image("Ceu", LocalDate.now(), "Cruz");

        Sensor rd40 = new Sensor(123.123f, 321.321f, SensorStatus.OPERATIONAL, "Rd40");

        SensorRead deuRuim = new SensorRead(123.123f, LocalDate.now(), rd40
        );

        FireSpot emTudo = new FireSpot(LocalDate.now(), LocalDate.now(), "CurtoCircuito", Status.ACTIVE, Identefication.SENSOR, Intensity.HIGH, rua4, luigi, paraiso, rd40 );

        System.out.println(luigi.toString());
        System.out.println(rua4.toString());
        System.out.println(timeAzul.toString());
        System.out.println(tulho.toString());
        System.out.println(paraiso.toString());
        System.out.println(rd40.toString());
        System.out.println(deuRuim.toString());
        System.out.println(emTudo.toString());




    }
}
