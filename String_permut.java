public class String_permut
{
  int count=0;
  static String str = "Prateek";
  static int n = str.length();
  public static void main(String[] args)
  {
        String_permut permutation = new String_permut();
        permutation.permute(str, 0, n-1);
        System.out.println((2*n));
  }

  private void permute(String str, int lower_limit, int position)
  {
     if(lower_limit == position)
          System.out.println(str);
     else
     {
          for(int i = 1; i <=position; i++)
          {
              str=swap(str,lower_limit,i);
              permute(str, lower_limit+1, position);
              str = swap(str,lower_limit,position);

          }

     }

  }

  public String swap(String a, int i, int j)
  {

    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;

    return String.valueOf(charArray);

  }

  }
