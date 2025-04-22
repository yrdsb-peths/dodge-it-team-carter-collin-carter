import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(-10);
        
        if(getX() <= 0)
        {
            resetBomb();
        }
        if(isTouching(Hero.class))
        {
            getWorld().removeObject(this);
        }
    }
    
    public void resetBomb()
    {
        int x = Greenfoot.getRandomNumber(2);
        if(x == 0)
        {
            setLocation(600, 100);
        }
        else
        {
        setLocation(600, 300);
        }
    }
}
