public class Student{
String name;
String department;
int age;
void display(){
System.out.println("name:"+name);
System.out.println("department:"+department);
System.out.println("age:"+age);
}
public static void main(String[]args){
Student s1=new Student();
s1.name="siva";
s1.department="cse";
s1.age=20;
s1.display();
}
}

