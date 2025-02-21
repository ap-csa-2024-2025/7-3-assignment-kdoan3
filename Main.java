import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

  public static void main(String[] args)
  {
    ArrayList<String> name = new ArrayList<String>();
  name.add("a");
  name.add("b");
  name.add("c");
  name.add("d");
  name.add("e");
  name.add("f");
  }

  public static void shiftLeft(ArrayList<String> arr)
  {
    String front = arr.remove(0);
    arr.add(front);
  }

  public static void printStatistics(final ArrayList<Integer> arr)
  {
    
  }
}
