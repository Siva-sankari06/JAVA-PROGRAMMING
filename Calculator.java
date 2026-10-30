public class Calculator{
int Addition(int a,int b){
return a+b;
}
int subtraction(int a,int b){
return a-b;
}
int multliplication(int a,int b){
return a*b;
}
double division(int a,int b){
return a/b;
}
public static void main(String[]args){
Calculator s1=new Calculator();
int Add=s1.Addition(5,5);
int sub=s1.subtraction(5,5);
int mul=s1.multliplication(5,5);
double div=s1.division(5,5);
System.out.println(Add);
System.out.println(sub);
System.out.println(mul);
System.out.println(div);
}
}