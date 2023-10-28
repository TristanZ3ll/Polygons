
/**************************************************************
*                     RegularPolygon                          *
***************************************************************
* -n: int                                                     *
* -side: double                                               *
* -x: double                                                  *
* -y: double                                                  *
* +RegularPolygon()                                           *
* +RegularPolygon(n: int, side: double)                       *
* +RegularPolygon(n: int, side: double, x: double, y: double) *
* +setN(newN: int)                                            *
* +setSide(newSide: double)                                   *
* +setX(newX: double)                                         *              
* +setY(newY: double)                                         * 
* +getN(): int                                                *
* +getSide(): double                                          *
* +getX(): double                                             *              
* +getY(): double                                             * 
* +getPerimeter(): double                                     *
* +getArea(): double                                          *           
**************************************************************/






import java.lang.Math; 
public class RegularPolygon {
    
    private int n;
    private double side;
    private double x;
    private double y;

//Polygon with default values
    RegularPolygon(){
        n = 3;
        side = 1;
        x = y = 0;
        

    }
    //polygon with user setting the side length and number of sides
    RegularPolygon(int newN, double newSide){
        n = newN;
        side = newSide;
        x = y = 0;
    }

    //polygon with user setting the side length number of sides and x and y value
    RegularPolygon(int newN, double newSide, double newX, double newY){
        n = newN;
        side = newSide;
        x = newX;
        y = newY;
    }

    //Mutator methods for all member variables

    public void setN(int newN){
        n = newN;
    }
    
    public void setSide(double newSide){
        side = newSide;
    }

    public void setX(double newX){
        x = newX;
    }

    public void setY(double newY){
        y = newY;
    }

    //Accessor method for all member variables

    public int getN(){
        return n;

    }

    public double getSide(){
        return side;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getPerimeter(){
        return(n * side);
    }

    public double getArea(){
        double numerator =n * Math.pow(side,2);
        double denominator = 4 * Math.tan(Math.PI/4);
        return (numerator / denominator);
    }

}
