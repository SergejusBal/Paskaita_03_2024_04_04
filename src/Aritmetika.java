public class Aritmetika {

    public static double sudek(double sk1, double sk2){
        return sk1+sk2;
    }
    public static double atimk(double sk1, double sk2){
        return sk1-sk2;
    }
    public static double sudaugink(double sk1, double sk2){
        return sk1*sk2;
    }
    public static double padalink(double sk1, double sk2){
        return sk1/sk2;
    }
    public static double pakelkLaipsniu(double sk1, int sk2){
        double sk3=1;
        for(int i = 0; i<sk2;i++){
            sk3 *=sk1;
        }
        return sk3;
    }
    public String sujung (String s1, String s2){
        return s1+s2;
    }


}
