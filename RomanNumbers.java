import java.util.Scanner;
public class RomanNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Roman number: ");
        String roman = sc.nextLine().toUpperCase();
        int c= romanToInt(roman);
        System.out.println("The integer value is: "+c);
        sc.close();
    }
    public static int romanToInt(String s) {
        int c= 0;
        int b = 0;
        for (int i = s.length()-1; i>=0;i--) {
            int a = romanCharToInt(s.charAt(i));
            if (a<b) {
                c-=a;
            } else {
                c+=a;
            }
            b=a;
        }
        return c;
    }
    public static int romanCharToInt(char ch) {
        int a= 0;
        switch(ch) {
            case 'I':
                a=1;
                break;
            case 'V':
                a=5;
                break;
            case 'X':
                a=10;
                break;
            case 'L':
                a=50;
                break;
            case 'C':
                a=100;
                break;
            case 'D':
                a=500;
                break;
            case 'M':
                a=1000;
                break;
            default:System.out.println("invalid Roman Number");
        }
        return a;
    }
}

