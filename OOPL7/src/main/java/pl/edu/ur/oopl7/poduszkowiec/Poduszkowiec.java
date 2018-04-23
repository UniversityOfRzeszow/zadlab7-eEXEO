package pl.edu.ur.oopl7.poduszkowiec;

public class Poduszkowiec implements Naziemne, Wodne
{

    @Override
    public void jedzie() 
    {
        System.out.println("Jedzie, chyba");
    }

    @Override
    public void plynie() 
    {
        System.out.println("Płynie, chyba");
    }
    
}
