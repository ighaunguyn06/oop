public class TextRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1.2f,3.4f);
        System.out.println(r1);
        Rectangle r2 = new Rectangle();
        System.out.println(r2);

        r1.setLenght(5.6f);
        r1.setWidth(7.8f);
        System.out.println(r1);
        System.out.println("lenght is:"+ r1.getLenght());
        System.out.println("width is:"+ r1.getWidth());
        System.out.printf("area is : %.2f%n", r1.getArea());
        System.out.printf("Circumference is : %.2f%n", r1.getPerimeter());
    }
}
