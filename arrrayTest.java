import java.util.*;

class arrayTest {

  public static void main(String[] args) {

    ArrayList<String> test = new ArrayList<String>();

    test.add("Something");
    System.out.println(test.size());
    test.add("AnotherWord");
    System.out.println(test.size());
    test.add("ThirdWord");
    System.out.println(test.size());
    test.remove("Something");
    System.out.println(test.size());

    System.out.println(Arrays.toString(test.toArray()));

  }

}
