import java.time.LocalDateTime;

public class Joje {


    public void metuSkaiciai(int metai){
        System.out.println(metai + " metu" + " yra " + metai*12 + " menesiu arba " + metai*365 + " dienu arba " + metai*365*24 + " valandu");
    }

    public void valandosPoVidurnakcio(){
        int hours = LocalDateTime.now().getHour();
        int minutes = hours*60 + LocalDateTime.now().getMinute();
        int second = minutes*60 + LocalDateTime.now().getSecond();

        System.out.println("Po vidurakcio praejo: " + hours + " valandu arba " + minutes + " minuciu arba " + second + " sekundziu");
    }

    public double vidKnygusk(int knygosPerMen, int ZmonesPerMetus){
        return (double)knygosPerMen*12/ZmonesPerMetus;
    }

    public double iVilniu(int keleiviuSk, int keleiviuskneIV, int vagonu ){
        return (double)(keleiviuSk - keleiviuskneIV)/vagonu;
    }

}
