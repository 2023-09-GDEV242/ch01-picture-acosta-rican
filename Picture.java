/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Franco Acosta
 * @version 2023.10.09
 */
public class Picture
{
    private Square foreground;
    private Square ground;
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;
    private Person me;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        me = new Person();
        ground = new Square();
        foreground = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            foreground.moveHorizontal(-350);
            foreground.moveVertical(-350);
            foreground.changeSize(600);
            foreground.makeVisible();
            
            ground.moveHorizontal(-350);
            ground.moveVertical(100);
            ground.changeSize(800);
            ground.makeVisible();
            
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            me.moveHorizontal(0);
            me.moveVertical(20);
            me.changeSize(60,60);
            me.makeVisible();
            
            drawn = true;
            
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        foreground.changeColor("white");
        ground.changeColor("black");
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        me.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        foreground.changeColor("orange");
        ground.changeColor("green");
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
        me.changeColor("blue");
    }
}
