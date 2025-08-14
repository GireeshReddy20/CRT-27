import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
      int c=9;
      int b=c*c;
      System.out.print(b);
      int sum=0;
      while(b>0){
          sum+=b%10;
          b/=10;
      }
      if(c==sum)
      {
          System.out.println("it is a neon number");
      }
      else{
          System.out.println("it is not a neon number");
      }
      sc.close();
    }
}
