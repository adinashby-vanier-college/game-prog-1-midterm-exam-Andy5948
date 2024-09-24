// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class PigWorld extends World
{

    /**
     * Constructor for objects of class PigWorld.
     */
    public PigWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burger burger =  new  Burger();
        addObject(burger, 120, 53);
        Burger burger2 =  new  Burger();
        addObject(burger2, 252, 43);
        Burger burger3 =  new  Burger();
        addObject(burger3, 458, 55);
        Burger burger4 =  new  Burger();
        addObject(burger4, 443, 170);
        Snake snake =  new  Snake();
        addObject(snake, 525, 348);
        Pig pig =  new  Pig();
        addObject(pig, 67, 188);
        Burger burger5 =  new  Burger();
        addObject(burger5, 57, 371);
        Burger burger6 =  new  Burger();
        addObject(burger6, 198, 339);
        Burger burger7 =  new  Burger();
        addObject(burger7, 263, 209);
        Burger burger8 =  new  Burger();
        addObject(burger8, 355, 320);
        burger3.setLocation(492, 39);
        burger4.setLocation(453, 96);
        burger8.setLocation(507, 253);
        burger7.setLocation(389, 312);
        burger5.setLocation(52, 272);
        pig.setLocation(163, 191);
        burger.setLocation(104, 57);
        burger2.setLocation(172, 63);
        Burger burger9 =  new  Burger();
        addObject(burger9, 119, 122);
    }
}
