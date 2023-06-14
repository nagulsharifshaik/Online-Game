import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends alien
{
    public int hitcount=0;
   public Bullet(int speed)
   {
       super(speed);
       GreenfootImage EnemyImage=getImage();
       int newWidth=EnemyImage.getWidth()/6;
       int newHeight= EnemyImage.getHeight()/6;
       EnemyImage.scale(newWidth,newHeight);
       
   }
    public void act()
    {
        setLocation(getX(),getY()-10);
        disapper();
    }
    public void disapper()
    { 
        if(hitcount==1||isAtEdge())
        {
            World world=getWorld();
            world.removeObject(this);
        }
    }
}
