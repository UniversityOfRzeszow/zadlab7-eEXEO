package zad2;

import java.util.Random;

public class Punkt2D 
{

    protected int x;
    protected int y;

    public Punkt2D() 
    {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }


    public void generuj() 
    {
        Random r = new Random();
        this.x = r.nextInt(20) - 10;
        this.y = r.nextInt(20) - 10;
    }

    @Override
    public String toString() 
    {
        return ("x=" + this.x + " y=" + this.y);
    }
}