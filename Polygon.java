public class Polygon {
    public static void main(String[] args) throws Exception {
        RegularPolygon poly1 = new RegularPolygon();
        RegularPolygon poly2 = new RegularPolygon(6,4);
        RegularPolygon poly3 = new RegularPolygon(10,4,5.6,7.8);

        System.out.println("The peremiter of polygon 1 is: " + poly1.getPerimeter());
        System.out.println("The peremiter of polygon 2 is: " + poly2.getPerimeter());
        System.out.println("The peremiter of polygon 3 is: " + poly3.getPerimeter());
        System.out.println("The area of polygon 1 is: " + poly1.getArea());
        System.out.println("The area of polygon 2 is: " + poly2.getArea());
        System.out.println("The area of polygon 3 is: " + poly3.getArea());




    }
}
