package geeks;
import java.util.Scanner;
public  class sum{
    public static void main(String [] args) {
        Scanner out = new Scanner(System.in);
        int a = out.nextInt();
       int[] arr=new int[a];
        int s= out.nextInt();
        for (int i = 0; i < a; i++) {
                arr[i] = out.nextInt();
            }
        for (int i = 0; i<a; i++) {
            int sum=arr[i];
            int j =i+1;
            while(j<a){
                sum=sum+arr[j];
                if (sum == s) {
                    System.out.println(i+""+j);
                }
                j++;
            }
        }
    }}
