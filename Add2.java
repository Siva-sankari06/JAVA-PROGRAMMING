import java.util.*;
public class Add2{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array:");
int n=sc.nextInt();
int arr[]=new int[n];
int sum=0;
for(int i=0;i<arr.length;i++){
arr[i]=sc.nextInt();
sum=sum+arr[i];
}
System.out.println(sum);
}
}
