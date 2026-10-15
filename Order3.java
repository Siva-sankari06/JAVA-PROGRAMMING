import java.util.*;
public class Order3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int k=sc.nextInt();
int reverse=0;
for(int i=k;i>0;i/=10){
reverse=reverse*10;
reverse+=i%10;
}
boolean check=(reverse==k);
System.out.println(check);
}
}
