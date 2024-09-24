// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Loser extends World
{

    /**
     * Constructor for objects of class Loser.
     */
    public Loser()
    {
        super(600, 400, 1);
        showTextWithBigBlackFont();
        Greenfoot.playSound("lose.wav");
    }

    /**
     * 
     */
    public void showTextWithBigBlackFont()
    {
        GreenfootImage bg = getBackground();
        Font font =  new  Font(50);
        bg.setFont(font);
        bg.setColor(Color.BLACK);
        bg.drawString("You Lose", 200, 180);
    }
}
