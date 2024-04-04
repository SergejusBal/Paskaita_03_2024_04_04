import java.util.Date;

public class Darbuotojas {
    String vardas;
    String pavarde;
    String pareigos;
    long asmensKodas;
    boolean arVairuoja;

    String vardasPavarde;
    int simboliuSkaicius;
    String iskirptasTekstas;
    String lytis;
    Date gimimoMetai;


    Darbuotojas(String vardas, String pavarde, String pareigos,long asmensKodas, boolean arVairuoja, String lytis, Date gimimoMetai){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pareigos = pareigos;
        this.asmensKodas = asmensKodas;
        this.arVairuoja = arVairuoja;
        this.lytis = lytis;
        this.gimimoMetai = gimimoMetai;

        this.vardasPavarde = vardasPavarde();
        this.simboliuSkaicius = simboliuSkaicius();
        this.iskirptasTekstas = iskirptasTekstas();
    }
    public String vardasPavarde(){
        return vardas+pavarde;
    }
    public int simboliuSkaicius(){
        return (vardas+pavarde).length();
    }
    public String iskirptasTekstas(){
        return (vardas+pavarde).substring(3,9);
    }
    public String lytiesNustatymas(){
        Long asK = asmensKodas;
        int sk = Integer.valueOf(asK.toString().substring(0,1));
        switch(sk){
            case 3,5: return "vyras";
            case 4,6: return "moteris";
        }
        return null;
    }

    public Date gimimoMetai(){
        Long asK = asmensKodas;

        int sk = Integer.valueOf(asK.toString().substring(0,1));
        int metai;
        int menuo;
        int diena;
        switch(sk){
            case 3,5:
                 metai= Integer.valueOf(19+asK.toString().substring(1,3));
                 menuo= Integer.valueOf(asK.toString().substring(3,5));
                 diena= Integer.valueOf(asK.toString().substring(5,7));;
                 return new Date(metai,menuo,diena);
            case 4,6:
                metai= Integer.valueOf(20+asK.toString().substring(1,3));
                menuo= Integer.valueOf(asK.toString().substring(3,5));
                diena= Integer.valueOf(asK.toString().substring(5,7));;
                return new Date(metai,menuo,diena);
        }
        return null;
    }




}
