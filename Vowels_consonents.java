import java.util.*;
public class Vowels_consonents{
public static void main(String[]args){
String s="Hello World";
int vowels=0;
int consonents=0;
char arr[]=s.toCharArray();
for(int i=0;i<arr.length;i++){
if(arr[i]=='a' ||arr[i]=='e' ||arr[i]=='i' ||arr[i]=='o' ||arr[i]=='u'){
vowels++;
}
else if(Character.isAlphabetic(arr[i])){
consonents++;
}
}
System.out.println("vowels count:"+vowels);
System.out.println("consonents count:"+consonents);
}
}