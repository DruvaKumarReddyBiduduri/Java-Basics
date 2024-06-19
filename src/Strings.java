import java.util.Arrays;
import java.util.Scanner;

public class Strings {

    public static void evenLength(String sentence){
        String[] words=sentence.split(" ");
        for (String word: words) {
            if(word.length()%2==0){
                System.out.println(word);
            }
        }
    }

    public static String reverse(String str){
        char[] ar=str.toCharArray();
        int left=0,right=str.length()-1;
        while(left<right){
            char temp=ar[left];
            ar[left++]=ar[right];
            ar[right--]=temp;
        }
        return new String(ar);
    }

    public static void vowelOrConsonant() {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is an vowel");
        } else {
            System.out.println(ch + " is consonant");
        }
    }

    public static void count(String str){
        int wordCount=1,charCount=0,spaceCount=0;
        boolean endOfWord=false;
        for (char ch:str.toCharArray()) {
            if(ch==' '){
                spaceCount++;
                endOfWord=true;
            }else {
                if(endOfWord){
                    wordCount++;
                    endOfWord=false;
                }
                charCount++;
            }
        }
        System.out.println("Words : " +wordCount);
        System.out.println("Chars : "+charCount);
        System.out.println("Spaces : "+spaceCount);
    }

    public static boolean anagram(String a,String b){

        if(a.length()!=b.length()){
            return false;
        }

        char[] ch1=a.toLowerCase().toCharArray();
        char[] ch2=b.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(ch1);


        return Arrays.equals(ch1,ch2);
    }

    public static boolean pangram(String str){
        str=str.toLowerCase();
        for (char ch = 'a'; ch <='z' ; ch++) {
            if(!str.contains(ch+"")){
                return false;
            }
        }
        return true;
    }


    public static String longest(String[] arr){
        int longest=arr[0].length();
        String longestString=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i].length()>=longest){
                longest=arr[i].length();
                longestString=arr[i];
            }
        }
        return longestString;
    }

    public static void deleteWord(String str,String target){
        str=str.replace(target,"");
        System.out.println(str);
    }

    public static String toggleCase(String str){
        char[] arr=str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=97){
                arr[i]= (char) (arr[i]-32);
            }else {
                arr[i]= (char) (arr[i]+32);
            }
        }
        return new String(arr);
    }

    public static void wordFrequencies(String sentence){
        String[] words=sentence.split(" ");

        int[] frequencies=new int[words.length];
        String[] uniqueWords=new String[words.length];

        System.out.println(Arrays.toString(words));

        for (int i=0;i<words.length;i++) {

            boolean wordFound=false;
            String word=words[i];

            for (int j = 0; j < uniqueWords.length; j++) {
                if(uniqueWords[j]!=null && uniqueWords[j].equals(word)){
                    wordFound=true;
                    frequencies[j]++;
                }
            }
            if(!wordFound){
                uniqueWords[i]=word;
                frequencies[i]++;
            }

        }

        System.out.println(Arrays.toString(uniqueWords));
        System.out.println(Arrays.toString(frequencies));
    }

    public static void palindrome(String str){
        String rev=reverse(str);

        if(str.equals(rev)){
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }
    }

    public static String replaceVowels(String str){
        return str.replaceAll("[AEIOUaeiou]","*");
    }
}
