class Fact
{
    void fact(){
  int i;
  int fact = 1;
  int num = 5;
  for (i = 1; i <= num; i++)
    
      fact = fact * i;
      System.out.println ("The factorial of a given number " + num + " is" +
			  fact);
    }
}
class Factorial
{
  public static void main (String args[])
  {
    Fact f = new Fact ();
      f.fact ();
  }
}