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
    double sum = 0;
    int count = 0;
    int maxcount = 0;
    int mode = arr.get(0);

    for (Integer num : arr)
    {
      sum += num;
      count = 0;

      for (Integer temp : arr)
      {
        if (temp.equals(num))
        {
          count++
        }
      }

      if (count > maxcount)
      {
        mode = num;
        maxcount = count;
      }

    }

    if (there is only one mode)
    {
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + sum/arr.size());
      System.out.println("Mode: " + mode);
    }
    else
    {
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + sum/arr.size());
      System.out.println("Mode: no single mode");
    }
  }
}
