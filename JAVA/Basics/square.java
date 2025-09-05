import java.util.Scanner;

public class square {
    private int side;

    public square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the side: ");
        int side = sc.nextInt();
        
        square sq = new square(side);
        System.out.println("The area of the square is " + sq.getArea());
        System.out.println("The perimeter of the square is " + sq.getPerimeter());
        
        sc.close();
    }
}