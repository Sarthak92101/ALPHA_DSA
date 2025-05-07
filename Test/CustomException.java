package Test;

class SarthakException extends Exception {
  public SarthakException(String string) {
    super(string);
  }
}

public class CustomException {
  int i = 20;
  int j=0;

  try
  {
    j = 18 / i;
    if (j == 0)
      throw new SarthakException("I dont want to print");
  }catch(
  SarthakException e)
  {
    j = 18 / 1;
    System.out.println("Default answer");
  }catch(
  Exception e)
  {
    System.out.println("Something went wrong " + e);
  }system.out.println(j);
}
