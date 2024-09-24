// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pig extends Actor
{

    /**
     * Act - do whatever the Pig wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAndTurn();
        eat();
        if (isGameWon()) {
            transitionToWinner();
        }
        if (isGameLost()) {
            transitionToLoser();
        }
    }

    /**
     * 
     */
    public void moveAndTurn()
    {
        if (Greenfoot.isKeyDown("a")) {
            move(4);
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(4);
            turn(3);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(4);
            turn(-3);
        }
        if (Greenfoot.isKeyDown("w")) {
            move(4);
            turn(3);
        }
    }

    /**
     * eats the burger
     */
    public void eat()
    {
        Actor burger = getOneIntersectingObject(Burger.class);
        if (burger != null) {
            World world = getWorld();
            world.removeObject(burger);
            Greenfoot.playSound("eating.wav");
        }
    }

    /**
     * 
     */
    public boolean isGameWon()
    {
        World world = getWorld();
        if (world.getObjects(Burger.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToWinner()
    {
        World winner =  new  Winner();
        Greenfoot.setWorld(winner);
    }

    /**
     * 
     */
    public boolean isGameLost()
    {
        World world = getWorld();
        if (world.getObjects(Pig.class).isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * 
     */
    public void transitionToLoser()
    {
        World loser =  new  Loser();
        Greenfoot.setWorld(loser);
    }
}
