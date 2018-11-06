package ba.unsa.etf.rpr.tutorijal04;

public class Predmet {
    private  String naziv;
    private int broj_ECTS;
    private int kapacitet;
    private int br=0;
    private Student studenti[];

    public Predmet(String naziv, int ects,int kapacitet){
        this.naziv=naziv;
        this.broj_ECTS=ects;
        this.kapacitet=kapacitet;
        studenti= new Student[kapacitet];
    }

    public String toString(){
        return this.naziv;
    }

    public  int getBroj_ECTS(){
        return this.broj_ECTS;
    }

    public void dodajStudenta(Student s){
        if(br>kapacitet) throw new IllegalArgumentException("Popunjen broj studenata na ovom predmetu");
        studenti[br]= s;
        br++;
    }

    public void obrisiStudenta(int n){
        if(n<br){
            for(int i=n;i<br-1;i++){
                studenti[i]=studenti[i+1];
            }
            br--;
        }
    }

    public String ispisiStudente(){
        String s=new String();
        for(int i=0;i<br;i++){
           s+= i+ ". " + studenti[i].getIme() + " " + studenti[i].getPrezime() + " " + studenti[i].getBrojIndexa()+ "\n";
        }
        return s;
    }
}
