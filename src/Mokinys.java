class Mokinys {
    String vardas;
    String pavarde;
    int[] pazymiai;
    float vidurkis;
    public Mokinys(String vardas, String pavarde, int[] pazymiai){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pazymiai = pazymiai;
        this.vidurkis = skaiciokVidurki();

    }
    public Float skaiciokVidurki(){

        int suma = 0;
        for(Integer i : pazymiai) suma = suma + i;
        vidurkis = suma / (float) pazymiai.length;
        return vidurkis;

    }

}