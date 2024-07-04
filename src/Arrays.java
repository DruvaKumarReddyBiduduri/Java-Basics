public class Arrays {
    public static int sum(int[] arr){
        int sum=arr[0];
        for (int i=1;i< arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void average(int[] arr){
        int s=sum(arr);
        System.out.println(s/arr.length);
    }

    public static void reverse(int[] arr){
        int left=0,right=arr.length-1;
        while (left<right){
            int temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
    }

    public static int min(int[] arr, int start) {
        int minNum = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[minNum] > arr[i]) {
                minNum = i;
            }
        }
        return minNum;
    }

    public static void compare(int[] a,int[] b){
        int equal=java.util.Arrays.compare(a,b);
        if(equal==0){
            System.out.println("Both arrays are equal");
        }
        if(equal>1){
            System.out.println(a +"is greater");
        }else{
            System.out.println(b +"is greater");
        }
    }

    public static boolean search(int[] arr, int target) {
        for (int j : arr) {
            if (j == target) {
                return true;
            }
        }
        return false;
    }

    public static int[] copy(int[] a){
        // use util.Arrays.copyOf()

        int[] arr=new int[a.length];
        int k=0,i=0;

        while(i<a.length){
            arr[k++]=a[i++];
        }

        return arr;
    }

    public static int[] merge(int[] a,int[] b){
        int[] arr=new int[a.length+b.length];

        int k=0,i=0,j=0;

        while(i<a.length){
            arr[k++]=a[i++];
        }

        while (j<b.length){
            arr[k++]=b[j++];
        }

        return arr;
    }

    public static int[] common(int[] a,int[] b){
        int[] arr=new int[a.length];
        int k=0;

        for (int ele : a) {
            for (int value : b) {
                if (value == ele) {
                    arr[k++] = value;
                }
            }
        }

        return arr;
    }

    public static int[] removeDuplicates(int[] arr){
        int[] newArray=new int[arr.length];

        int k=0;
        for (int ele : arr) {
            boolean eleFound = false;
            for (int e : newArray) {
                if (e == ele) {
                    eleFound = true;
                    break;
                }
            }
            if (!eleFound) {
                newArray[k++] = ele;
            }
        }
        return newArray;

    }

    public static void sort(int[] arr){
        java.util.Arrays.sort(arr);
    }

}
