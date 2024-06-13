
public class Patterns {

    public static void numbersPyramid(int n){
        int count=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void alphabet2(int n){
        char c='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(c+"\t");
            }
            c++;
            System.out.println();
        }
    }

    public static void alphabet(int n){
        char ch='A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }



    public static void alphabet1(int n){
        for (int i = 0; i < n; i++) {
            char ch='A';
            for (int j = 0; j < i; j++) {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }

    public static void rightHalfPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("#\t");
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n){
        int bit=1;
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print(bit);
                bit=bit==1?0:1;
            }
            System.out.println();
        }
    }

    public static void kPattern(int n){
        for (int i=n;i>=2;i--){
            for (int j = i; j >=1 ; j--) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        System.out.println("*");
        for (int i = 2; i <=n ; i++) {
            for(int j=1;j<=i;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }

    public static void numberTriangular(int n){
        for (int i=1;i<=n;i++){
            for (int j = 0; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void box(int n){
        for (int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for (int j = 0; j <n; j++) {
                    System.out.print("#\t");
                }
            }else{
                for (int j=0;j<n;j++){
                    if(j==0 || j==n-1){
                        System.out.print("#\t");
                    }else{
                        System.out.print(" \t");
                    }
                }
            }
            System.out.println();
        }
    }
}
