import java.util.Scanner;

public class ControlFlow {

    public static void run(){

        Scanner scanner=new Scanner(System.in);

        System.out.println("Java Calculator");

        while (true){
            System.out.println("1 for Addition (+)");
            System.out.println("2 for Subtraction (-)");
            System.out.println("3 for Multiply (*)");
            System.out.println("4 for Division (/)");
            System.out.println("5 for Modulo (%)");
            System.out.println("6 for quit");
            System.out.println("Enter a number from above list");

            int input=scanner.nextInt();

            if (input==6){
                break;
            }

            System.out.print("Enter First number : ");
            int a=scanner.nextInt();
            System.out.print("Enter Second number : ");
            int b=scanner.nextInt();

            switch (input){
                case 1:{
                    System.out.printf("%d + %d = %d\n",a,b,a+b);
                    break;
                }
                case 2:{
                    System.out.printf("%d -%d = %d\n",a,b,a-b);
                    break;
                }
                case 3:{
                    System.out.printf("%d * %d = %d\n",a,b,a*b);
                    break;
                }
                case 4:{
                    System.out.printf("%d / %d = %d\n",a,b,a/b);
                    break;
                }
                case 5:{
                    System.out.printf("%d '%' %d = %d\n",a,b,a%b);
                    break;
                }
                default:{
                    System.out.println("Invalid input, Please select a number from the list");
                }
            }

        }
    }
}
