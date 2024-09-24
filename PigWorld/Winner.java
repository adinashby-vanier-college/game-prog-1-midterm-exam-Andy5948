// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Winner extends World
{

    /**
     * Constructor for objects of class Winner.
     */
    public Winner()
    {
        super(600, 400, 1);
        showTextWithBigBlackFont();
        Greenfoot.playSound("win.wav");
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
        bg.drawString("You Win!!!", 200, 180);
    }
}
