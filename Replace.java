import java.util.*; 
class Replace
{
  public static void main (String args[])

{
  Scanner scan = new Scanner(System.in);
  String s = scan.next();
  String s1 = "Hello <<username>>, How are you??";

   if(s.length() >= 3)
{
 String s2 = s1.replace("<<username>>",s);

 System.out.println(s2);
}
else
{
 System.out.println("Minimun 3 characters are required");
}
}

}
