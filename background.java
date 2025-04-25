import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class background extends World
{
    public background()
    {    
        
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject(hero, 100, 200);
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);
    }
}
