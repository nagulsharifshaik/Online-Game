import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends alien
{
   
   public Enemy( int speed)
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
        goAround();
        disapper();
   }
   public void goAround()
        {
           if(getX()==999) 
           {
               setLocation(0,getY());
           }
        }
        public void disapper()
        {
            Bullet bullet =(Bullet)getOneIntersectingObject(Bullet.class);
            if(bullet!=null)
            {
                World world =getWorld();
                world.removeObject(this);
                bullet.hitcount++;
                jetspace. score++;
            }
        }
}
