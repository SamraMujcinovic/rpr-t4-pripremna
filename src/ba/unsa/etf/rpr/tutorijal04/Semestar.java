package ba.unsa.etf.rpr.tutorijal04;

public class Semestar {
    private int brojSemestra;
    private int ukupnoPredmeta=0;
    private Predmet predmeti[];
    public Semestar(int brojSemestra){
        this.brojSemestra=brojSemestra;
        predmeti = new Predmet [10];
    }

    public String ispisiPredmete(){
        String pom=new String();
        for(int i=0;i<ukupnoPredmeta-1;i++){
            pom+=predmeti[i]+"  ";
        }
        pom+=predmeti[ukupnoPredmeta-1];
        return pom;
    }

    public void dodajPredmet(Predmet p){
        if(dajBrojPredmea()>0){
            int suma=0;
            for(int i=0;i<dajBrojPredmea();i++)
                suma+=predmeti[i].getBroj_ECTS();
            if(suma+p.getBroj_ECTS()>30) return;
            predmeti[dajBrojPredmea()]=p;
            ukupnoPredmeta++;
        }
    }

    public int dajBrojPredmea(){
        return ukupnoPredmeta;
    }
    public int dajBrojSemesra(){
        return brojSemestra;
    }

}
