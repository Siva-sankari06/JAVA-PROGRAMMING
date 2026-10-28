import java.util.*;
public class Anagrams_1{
public static void main(String[]args){
String s="listen";
String t="silent";
char c[]=s.toCharArray();
char d[]=t.toCharArray();
Arrays.sort(c);
Arrays.sort(d);
String s1=new String(c);
String s2=new String(d);
System.out.println(s1.equals(s2));
}
}