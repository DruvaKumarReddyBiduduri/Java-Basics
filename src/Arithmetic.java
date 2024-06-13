public class Arithmetic {
    public static void operations(){
        int a=10;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }

    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void prime(int num){
        for (int i=2;i<=num;i++){
            boolean b=isPrime(i);
            if(b){
                System.out.println(i+" is prime");
            }else {
                System.out.println(i+" is not prime");
            }

        }
    }
}
