import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class KidsCalculator {
    Scanner scanner = new Scanner(System.in);
    String scVerte;

    public int sudeti(int sk1, int sk2){
        System.out.println("Atsakymas: " + (sk1 + sk2));
        return sk1 + sk2;
    }
    public int atimti(int sk1, int sk2){
        System.out.println("Atsakymas: " + (sk1 - sk2));
        return sk1 - sk2;
    }
    public int dauginti(int sk1, int sk2){
        System.out.println("Atsakymas: " + (sk1 * sk2));
        return sk1 * sk2;
    }
    public int dalinti(int sk1, int sk2){
        System.out.println("Atsakymas: " + (sk1 / sk2));
        return sk1 / sk2;
    }

    public int Skaicius() {
        int sk = 0;
        boolean tikrinti =true;
        while(tikrinti) {
            System.out.println("Iveskite sveika skaiciu:");
            scVerte = scanner.nextLine();
            for(int i = 0; i < scVerte.length(); i++){
                if(!Character.isDigit(scVerte.charAt(i))) {
                    break;
                }
                else if (i==scVerte.length()-1){
                    tikrinti = false;
                    sk = Integer.valueOf(scVerte);
                }
            }
        }
        return sk;
    }

    public String Zenklas(){
        String zk;
        boolean tikrinti =true;
        while(tikrinti) {
            System.out.println("Pasirinkite operacija:");
            scVerte = scanner.nextLine();
            switch(scVerte){
                case "-": return "-";
                case "+": return "+";
                case "*": return "-";
                case "/": return "/";
            }
        }
    return null;
    }

    public boolean Atsakymas() {
        while(true) {
            System.out.println("Iveskite (T/N)?");
            scVerte = scanner.nextLine();
            if(scVerte.toUpperCase().equals("T")) return true;
            else if (scVerte.toUpperCase().equals("N")) return false;
        }
    }


}
