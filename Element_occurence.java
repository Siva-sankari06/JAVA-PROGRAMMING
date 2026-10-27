import java.util.*;
public class Element_occurence{
public static void main(String[]args){
int arr[]={10,20,30,40,20};
int check=20;
for(int i=0;i<arr.length;i++){
if(arr[i]==check){
System.out.println("first occur:"+i);
break;
}
}
for(int j=arr.length-1;j>0;j++){
if(arr[j]==check){
System.out.println("last occur:"+j);
break;
}
}
}}
