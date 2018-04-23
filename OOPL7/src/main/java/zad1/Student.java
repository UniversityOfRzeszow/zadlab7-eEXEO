package zad1;

public class Student extends Osoba
{

    int nrindeksu;
    String typstudiow;
    String kierunek;
    int rokstudiow;

    public Student(int nrindeksu, String typstudiow, String kierunek, int rokstudiow, String imie, String nazwisko, String dataurodzenia, String plec) 
    {
        super(imie, nazwisko, dataurodzenia, plec);
        this.nrindeksu = nrindeksu;
        this.typstudiow = typstudiow;
        this.kierunek = kierunek;
        this.rokstudiow = rokstudiow;
    }
    
    

    public int getNrindeksu() 
    {
        return nrindeksu;
    }

    public void setNrindeksu(int nrindeksu) 
    {
        this.nrindeksu = nrindeksu;
    }

    public String getTypstudiow() 
    {
        return typstudiow;
    }

    public void setTypstudiow(String typstudiow) 
    {
        this.typstudiow = typstudiow;
    }

    public String getKierunek() 
    {
        return kierunek;
    }

    public void setKierunek(String kierunek) 
    {
        this.kierunek = kierunek;
    }

    public int getRokstudiow()
    {
        return rokstudiow;
    }

    public void setRokstudiow(int rokstudiow)
    {
        this.rokstudiow = rokstudiow;
    }
    
    public void daneStudenta()
    {
        System.out.println(this.imie);
        System.out.println(this.nazwisko);
        System.out.println(this.dataurodzenia);
        System.out.println(this.plec);
        System.out.println(this.nrindeksu);
        System.out.println(this.typstudiow);
        System.out.println(this.kierunek);
        System.out.println(this.rokstudiow);
        
    }

}
