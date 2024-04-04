import java.sql.SQLOutput;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /////////////////////////////////////////////
        // Užduotis 6/1

        System.out.println();
        System.out.println("Užduotis 6");
        System.out.println();

        Mokinys jonas = new Mokinys("Jonas","Betra",new int[]{7,3,8});
        Mokinys rasa = new Mokinys("Rasa","Jurkute",new int[]{4,10,8});
        Mokinys mantas = new Mokinys("Mantas","Jonkus",new int[]{8,5,1});
        Mokinys inga = new Mokinys("Inga","Berzine",new int[]{8,1,8});

        List<Mokinys> mokyniai = new ArrayList<Mokinys>();
        mokyniai.add(jonas);
        mokyniai.add(rasa);
        mokyniai.add(mantas);
        mokyniai.add(inga);


        Map<String, Float> zurnalas = new HashMap<String, Float>();
        for(Mokinys m : mokyniai){
            zurnalas.put(m.vardas+" "+m.pavarde,m.vidurkis);
        }
        System.out.println();
        System.out.println(zurnalas);



        TreeSet<Float> vidurkiai = new TreeSet<Float>();
        for(Mokinys m : mokyniai){
            vidurkiai.add(m.vidurkis);

        }
        System.out.println();
        System.out.println(vidurkiai);


        System.out.println();
        System.out.println(vidurkiai.last()-vidurkiai.first());


        /////////////////////////////////////////////
        // Užduotis method 3? skaiciai

        ArrayList<Double> skaiciai = new ArrayList<Double>();
        ArrayList<Double> skaiciai2 = new ArrayList<Double>();
        Random random = new Random();

        for(int i = 0; i < 2; i++){
            skaiciai.add(random.nextDouble(-100,100));
        }
        for(int i = 0; i < 2; i++){
            skaiciai2.add(random.nextDouble(-99.99,99.99));
        }

        SkaiciuOperacijos skaiciuOperacijos = new SkaiciuOperacijos();

        System.out.println("Sudetis:");
        System.out.println("Pirmas listas: " + skaiciuOperacijos.sudekSkaicius(skaiciai));
        System.out.println("Antras listas: " + skaiciuOperacijos.sudekSkaicius(skaiciai2));
        System.out.println();

        System.out.println("Atimtis:");
        System.out.println("Pirmas listas: " + skaiciuOperacijos.atimkSkaicius(skaiciai));
        System.out.println("Antras listas: " + skaiciuOperacijos.atimkSkaicius(skaiciai2));
        System.out.println();

        System.out.println("Daugyba:");
        System.out.println("Pirmas listas: " + skaiciuOperacijos.sudauginkSkaicius(skaiciai));
        System.out.println("Antras listas: " + skaiciuOperacijos.sudauginkSkaicius(skaiciai2));
        System.out.println();

        System.out.println("Dalyba:");
        System.out.println("Pirmas listas: " + skaiciuOperacijos.padalinkSkaicius(skaiciai));
        System.out.println("Antras listas: " + skaiciuOperacijos.padalinkSkaicius(skaiciai2));
        System.out.println();

        System.out.println("Pakelti antru laipsnis:");
        System.out.println("Pirmas listas: " + skaiciuOperacijos.pakelkSkaiciusLaipsnyje(skaiciai,2));
        System.out.println("Antras listas: " + skaiciuOperacijos.pakelkSkaiciusLaipsnyje(skaiciai2,2));
        System.out.println();


        /////////////////////////////////////////////
        // Užduotis methods nr1

        System.out.println();
        System.out.println("Užduotis methods nr1");
        System.out.println();

        Darbuotojas darb01 = new Darbuotojas("Jonas", "Berzas","Vairuotojas" , 39002225781L, true,"Vyras", new Date(1990,02,22));
        Darbuotojas darb02 = new Darbuotojas("Inga", "Liepa","Vairuotojas" , 48804125784L, true,"Moteris", new Date(1988,04,12));
        Darbuotojas darb03 = new Darbuotojas("Mantas", "Jonkus","Mokytojas" , 38010024125L, false,"Vyras", new Date(1980,10,02));
        Darbuotojas darb04 = new Darbuotojas("Aiste", "Turtyte","Pardaveja" , 49902075213L, false,"Moteris", new Date(1999,02,07));

        ArrayList<Darbuotojas> darbuotojai = new ArrayList<Darbuotojas>();
        darbuotojai.add(darb01);
        darbuotojai.add(darb02);
        darbuotojai.add(darb03);
        darbuotojai.add(darb04);

        ArrayList<Boolean> sarasas = new ArrayList<Boolean>();
        for (int i = 0; i < darbuotojai.size();i+=2){
            if (darbuotojai.size() % 2 != 0 && i+1 == darbuotojai.size()) break;
            if (lyginti(darbuotojai.get(i),darbuotojai.get(i+1))){
                sarasas.add(true);
                System.out.println(darbuotojai.get(i).vardas + " ir " + darbuotojai.get(i+1).vardas + " pareidos yra "+ true);
            }
            else{
                sarasas.add(false);
                System.out.println(darbuotojai.get(i).vardas + " ir " + darbuotojai.get(i+1).vardas + " pareidos yra "+ false);
            }


        }

        /////////////////////////////////////////////
        // Užduotis methods nr2

        System.out.println();
        System.out.println("Užduotis methods nr2");
        System.out.println();

        System.out.println();
        System.out.println("Užduotis methods nr2");
        System.out.println();

        System.out.println("Lytis pagal Asmens koda");
        for(Darbuotojas d : darbuotojai) System.out.println(d.lytiesNustatymas());
        System.out.println();

        System.out.println("Data pagal Asmens koda");
        for(Darbuotojas d : darbuotojai) System.out.println(""+d.gimimoMetai().getYear() + " " + d.gimimoMetai().getMonth() + " " + d.gimimoMetai().getDay());


        /////////////////////////////////////////////
        // Užduotis methods nr4

        System.out.println();
        System.out.println("Užduotis methods nr4");
        System.out.println();

        Joje joje = new Joje();

        joje.metuSkaiciai(15);
        System.out.println();

        joje.valandosPoVidurnakcio();
        System.out.println();


        double vidknygos=  joje.vidKnygusk(random.nextInt(10,100), random.nextInt(100,1000));
        System.out.println("Vidutiniskai per metus lankytojas perskaito knygu: "+ vidknygos);
        System.out.println();

        double vidIVilniu=  joje.iVilniu(random.nextInt(100,1000), random.nextInt(0,100),random.nextInt(10,20));
        System.out.println("Vidutiniskai i Vilniu viename vagone vazioja: "+ vidIVilniu);
        System.out.println();

        /////////////////////////////////////////////
        // Užduotis KidCalculator

        System.out.println();
        System.out.println("Užduotis KidCalculator");
        System.out.println();

        int verte1 = KidsCalculator.sudeti(random.nextInt(1,9),random.nextInt(1,9));
        int verte2 = KidsCalculator.atimti(random.nextInt(1,9),random.nextInt(1,9));




    }

    public static boolean lyginti(Darbuotojas dr1,Darbuotojas dr2){
        return dr1.pareigos.compareTo(dr2.pareigos)==0;
    }


}