public class File
{
public static void main(String[] args)
{
int a=4567;
int sum=a%10;
int b=a/10;
int add=sum+(b%10);
int c=b/10;
int d=c%10;
int e=add+d;
int s=e+(c/10);
System.out.println(s);
}
}
