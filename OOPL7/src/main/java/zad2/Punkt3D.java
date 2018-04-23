package zad2;

import java.util.Random;

public class Punkt3D extends Punkt2D 
{

    protected int z;

    public Punkt3D() 
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Punkt3D(int x, int y, int z) 
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    @Override
    public void generuj() {
        Random r = new Random();
        this.x = r.nextInt(20) - 10;
        this.y = r.nextInt(20) - 10;
        this.z = r.nextInt(20) - 10;
    }

    @Override
    public String toString() 
    {
        return ("x=" + this.x + " y=" + this.y + " z=" + this.z);
    }
}