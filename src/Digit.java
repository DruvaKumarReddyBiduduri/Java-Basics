public class Digit {

    public static int[] digitize(int n) {
        int c = count(n);
        System.out.println(c);
        int[] arr = new int[c];
        int temp = n;

        int index = c - 1;
        while (temp != 0) {
            int rem = temp % 10;
            arr[index--] = rem;
            temp = temp / 10;
        }
        return arr;
    }

    public static void palindrome(int num) {
        int rev = 0;
        int temp = num;

        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (rev == num) {
            System.out.println(num + " is palindrome");
        } else {
            System.out.println(num + " is not palindrome");
        }
    }

    public static void sumDigit(int num) {
        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        System.out.println(sum);
    }

    public static void armstrongNumber(int num) {
        int numOfDigits = count(num);
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numOfDigits);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is armstrong number");
        } else {
            System.out.println(num + " is not armstrong number");
        }
    }

    public static int count(int num) {
        if(num==0){
            return  1;
        }
        int count = 0;

        int temp = num;

        while (temp != 0) {
            int rem = temp % 10;
            count++;
            temp = temp / 10;
        }

        return count;
    }
}
