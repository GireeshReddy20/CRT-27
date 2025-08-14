public class Demo2 {
public static void main(String[] args){
    int[] haystack={3,5,7,9,11,15,17};
    int needle=3;
        boolean found=false;
        for(int number:haystack) {
            if (number == needle) {
                found = true;
                break;
            }
        }
            if(found)
                System.out.println("it is a haystack number");
            else
                System.out.println("it is not a haystack number");

      }
}
