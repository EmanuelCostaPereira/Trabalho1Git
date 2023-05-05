import java.util.Scanner;

    public class Hohoho{
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int n = sc.nextInt();

            for(int i= 0 ; i < n; i++){
                if( i==n-1){
                    System.out.println("Ho!");
                   
                }else{
                    System.out.println("Ho");
                }
            }
            System.out.println();
        }
    }