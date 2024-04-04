import java.util.ArrayList;
public class SkaiciuOperacijos {

    public double sudekSkaicius(ArrayList<Double> skaiciai){

        double rez=skaiciai.get(0);
        for (int i = 1; i <skaiciai.size(); i++){
            rez = Aritmetika.sudek(rez,skaiciai.get(i));
        }
        return rez;
    }
    public double atimkSkaicius(ArrayList<Double> skaiciai){

        double rez=skaiciai.get(0);
        for (int i = 1; i <skaiciai.size(); i++){
            rez = Aritmetika.atimk(rez,skaiciai.get(i));
        }
        return rez;
    }
    public double sudauginkSkaicius(ArrayList<Double> skaiciai){

        double rez=skaiciai.get(0);
        for (int i = 1; i <skaiciai.size(); i++){
            rez = Aritmetika.sudaugink(rez,skaiciai.get(i));
        }
        return rez;
    }
    public double padalinkSkaicius(ArrayList<Double> skaiciai){

        double rez=skaiciai.get(0);
        for (int i = 1; i <skaiciai.size(); i++){
            rez = Aritmetika.padalink(rez,skaiciai.get(i));
        }
        return rez;
    }
    public ArrayList<Double>  pakelkSkaiciusLaipsnyje(ArrayList<Double> skaiciai,int laipsnis){

        ArrayList<Double> atsakymuListas = new ArrayList<Double>();
        for (int i = 0; i <skaiciai.size(); i++){
           Double rez = Aritmetika.pakelkLaipsniu(skaiciai.get(i),laipsnis);
            atsakymuListas.add(rez);
        }
        return atsakymuListas;
    }




}
