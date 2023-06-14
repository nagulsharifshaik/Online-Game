 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class space here.
 * 
 * @author (siva) 
 * @version (v.0.1)
 */
public class space extends World
{

    /**
     * Constructor for objects of class space.
     * 
     */
    private static final int nextLeaveDelay=0;
    private int delayCount=0;
    public space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        addjetspace();
        addEnemy();
        addEnemyblue();
    }
    public void addjetspace()
    {
        int x = Greenfoot.getRandomNumber(999);
        while(true)
        {
            int y = Greenfoot.getRandomNumber(500);
            if(y>=250)
            {
                addObject(new jetspace(3),x,y);
                break;
            }
        }
    }
    public void addEnemy()
    {
        for(int i=0;i<=7;i++)
        {
            int x=275+(67*i);
             int y=101;
        addObject(new Enemy(3),x,y);
        }
    }
    public void addEnemyblue()
    {
        for(int i=0;i<=5;i++)
        {
            int x=Greenfoot.getRandomNumber(999);
            int y=Greenfoot.getRandomNumber(249);
            addObject(new Enemyblue(4),x,y);
        }
    }
    public void displaycore()
        {
            showText("score:"+jetspace.score,84,55);
        }
    public void act()
    {
        displaycore();
        nextLevel();
        if(jetspace.score==8)
        {
            delayCount++;
        }
    }
    public void nextLevel()
    {
    if(jetspace.score==8)
        {
            setBackground("nextlevel.jpg");
            if(delayCount>=nextLeaveDelay)
            {
                Greenfoot.setWorld(new Water());
                
            }
        }
    }
}
