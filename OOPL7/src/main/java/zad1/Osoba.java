package zad1;

public class Osoba 
{
    String imie;
    String nazwisko;
    String plec;
    String dataurodzenia;

    public Osoba(String imie, String nazwisko, String dataurodzenia, String plec) 
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dataurodzenia = dataurodzenia;
        this.plec = plec;
    }    
    
    public void setImie(String imie) 
    {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) 
    {
        this.nazwisko = nazwisko;
    }

    public void setDataurodzenia(String dataurodzenia) 
    {
        this.dataurodzenia = dataurodzenia;
    }

    public void setPlec(String plec) 
    {
        this.plec = plec;
    }

    public String getImie() 
    {
        return imie;
    }

    public String getNazwisko() 
    {
        return nazwisko;
    }

    public String getDataurodzenia() 
    {
        return dataurodzenia;
    }

    public String getPlec() 
    {
        return plec;
    }
    
    public void DaneOsoby()
    {
        System.out.println(this.imie);
        System.out.println(this.nazwisko);
        System.out.println(this.dataurodzenia);
        System.out.println(this.plec);
    }
}
