package Домашка.com;



public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle();
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(11, "Green");
        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getArea());
        circle1.setColor("Yellow");
        System.out.println(circle1.toString());
        System.out.println("_______________________");

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(11, 12);
        rectangle.setLength(100);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle.toString());
        System.out.println("_______________________");

        Employee employee = new Employee(1, "Andrey", "Tishenko", 10000);
        System.out.println(employee.getName());
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(12));
        System.out.println(employee.toString());
        System.out.println("_______________________");

        Author[] authors = new Author[3];
        authors[0]=new Author("Tolkin");
        authors[1]=new Author("Tolstoi");
        Book book = new Book("Lord of the Rings",authors,100);
        System.out.println(book.toString());
        System.out.println("_______________________");

        MyPoint point1 = new MyPoint(11,12);
        MyPoint point2 = new MyPoint(3,4);
        System.out.println(point1.toString());
        System.out.println(point1.getXY());
        System.out.println(point1.distance(1,1));
        System.out.println(point1.distanceToAnotherPoint(point2));
        System.out.println(point1.distanceToAnotherPoint(point1));
        System.out.println(point2.distanceToNull());
        System.out.println("_______________________");

        MyTriangle triangle1 = new MyTriangle(0,0,3,0,0,4);
        System.out.println(triangle1.toString());
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());
        MyTriangle triangle2 = new MyTriangle(-2,0,2,0,0,5);
        System.out.println(triangle2.toString());
        System.out.println(triangle2.getPerimeter());
        System.out.println(triangle2.getType());
        System.out.println("_______________________");
    }

}
