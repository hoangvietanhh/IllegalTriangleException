import java.util.Scanner;
public class IllegalTriangleException extends Exception {
    int a;
    int b;
    int c;
    public IllegalTriangleException(){
        
    }
    public IllegalTriangleException(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public boolean isTriangle(){
        return a + b > c && a + c > b && c + b > a && a > 0 && b > 0 && c > 0;
    }
    public void IllegalTriangleException(){
        try{
            if(isTriangle()){
                System.out.println("this is triangle");
            } else {
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println("this is not triangle");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.println("input b: ");
        int b = Integer.parseInt(input.nextLine());
        System.out.println("input c: ");
        int c = Integer.parseInt(input.nextLine());
        IllegalTriangleException triangle = new IllegalTriangleException(a,b,c);
        triangle.IllegalTriangleException();
    }
}
