import java.util.*;
public class Order1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int odd=0;
int even=0;
for(int i=0;i<=n;i++)
{
if(i%2==0){
even=even+i;
}
else{
odd=odd+i;
}
}
System.out.println("sum of odd numbers:"+odd);
System.out.println("sum of even numbers:"+even);
}
}
