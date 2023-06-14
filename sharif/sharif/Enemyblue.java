import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemyblue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemyblue extends alien
{
    public Enemyblue( int speed)
   {
       super(speed);
       GreenfootImage EnemyImage=getImage();
       int newWidth=EnemyImage.getWidth()/4;
       int newHeight= EnemyImage.getHeight()/4;
       EnemyImage.scale(newWidth,newHeight);
       
   }
    public void act()
    {
        move(speed);
        bounce();
    }
    public void bounce()
    {
        if(getX()==999)
        {
            speed=-speed;
        }
        if(getX()==0)
        {
            speed=-speed;
        }
    }
}
