import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;

/**
 * Write a description of class jetspace here.
 * 
 * @author (siva) 
 * @version (v.0.1)
 */
public class jetspace extends Actor
{
    /**
     * Act - do whatever the jetspace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static int score=0;
    private static final int reloadcount=50;
    private static int count=0;
    private int speed;
    private int rotation;
    public jetspace (int speed)
    {
        this.speed=speed;
    }
    public void act()
    {
        count++;
       move(speed); 
       rotation();
       fire();
    }
    public void move(int distance)
    {
        sideways(distance);
        upanddown(distance);
    }
    public void sideways(int distance)
    {
        if(Greenfoot.isKeyDown("right"))
        {
            super.move(distance);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            super.move(-distance);
        }
    }
         public void upanddown(int distance)
        {
            if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-distance);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX() ,getY()+distance);
        }
        
    }
    public void rotation()
    {
        if(Greenfoot.isKeyDown("r"))
        {
            turn(3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            turn(-3);
        }
    }
    public void fire()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            lanuch();
        }
        
    }
    public void lanuch()
        {
            if(count>=reloadcount)
            {
                World world=getWorld();
                Bullet bullet=new Bullet(3);
                world.addObject(bullet,getX(),getY());
                count=0;
                
            }
        }
        
}
