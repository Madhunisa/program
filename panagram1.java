# program
import java.io.*;
import java.util.*;
public class panagram1
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String ss=s.nextLine();
        String s1=ss.toLowerCase();
        ArrayList<String> a=new ArrayList<String>();
        ArrayList<String> b=new ArrayList<String>();
        for(char i='a';i<='z';i++)
        {
           a.add(Character.toString(i)); 
        }
        for(int j=0;j<s1.length();j++)
      {
          char  k=s1.charAt(j);
          b.add(Character.toString(k));
      }
        
    if(b.containsAll(a))
        System.out.print("is an panagram");
    else
        System.out.print("not an panagram");
    }
}
