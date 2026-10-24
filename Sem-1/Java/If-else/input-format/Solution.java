import java.util.Scanner;
class Solution {
    public static void solve() {
      Scanner sc = new Scanner(System.in);
      int age = sc.nextInt();
      if(age>18){
        System.out.println("Eligible to vote");
      }
      else{
        System.out.println("Not Eligible to vote");
      }
    }
}
