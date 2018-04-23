package zad1;

public class Wykladowca extends Osoba 
{
    int numerpracownika;
    String stanowisko;
    int pensja;
    
    public Wykladowca(String imie, String nazwisko, String dataurodzenia, String plec, int id, int pensja, String stanowisko) 
    {
        super(imie, nazwisko, dataurodzenia, plec);
        this.numerpracownika = id;
        this.pensja = pensja;
        this.stanowisko = stanowisko;
    }

    public int getNumerpracownika()
    {
        return numerpracownika;
    }

    public String getStanowisko() 
    {
        return stanowisko;
    }

    public int getPensja() 
    {
        return pensja;
    }

    public void setNumerpracownika(int numerpracownika) 
    {
        this.numerpracownika = numerpracownika;
    }

    public void setStanowisko(String stanowisko) 
    {
        this.stanowisko = stanowisko;
    }

    public void setPensja(int pensja)
    {
        this.pensja = pensja;
    }
    
    public void daneWykladowcy()
    {
        System.out.println(this.imie);
        System.out.println(this.nazwisko);
        System.out.println(this.dataurodzenia);
        System.out.println(this.plec);
        System.out.println(this.numerpracownika);
        System.out.println(this.stanowisko);
        System.out.println(this.pensja);       
    }
    
}
