package ba.unsa.etf.rpr.tutorijal04;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndexa;
    private int brojbodECTS=0 ;

    public Student(String ime, String prezime,int i) {
        this.setIme(ime);
        this.setPrezime(prezime);
        this.setBrojIndexa(i);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndexa() {
        return brojIndexa;
    }

    public void setBrojIndexa(int brojIndexa) {
        this.brojIndexa = brojIndexa;
    }

    public String ispisi(){
        String s=new String();
        int i=1;
        s+= "i. "+getIme() + " "+ getPrezime() + " " + "("+getBrojIndexa() + ")";
        i++;
        return s;
    }

    public int getBrojbodECTS() {
        return brojbodECTS;
    }

    public void setBrojbodECTS(int brojbodECTS) {
        this.brojbodECTS = brojbodECTS;
    }
}
