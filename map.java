import java.util.*;

class map {
  public static void main(String[] args) {

    Map<String, Integer> ageMap = new HashMap<String, Integer>();
      ageMap.put("Anna", 3);
      ageMap.put("Ben", 5);
      ageMap.put("Ben", 2);
      ageMap.put("Chas", 2);
      ageMap.keySet().remove("Anna");
      ageMap.remove("Ben");

    System.out.println("ageMap.get(\"Chas\") = " + ageMap.get("Chas"));

    System.out.println("ageMap.values().size() = " + ageMap.values().size());

    System.out.println("ageMap.get(2) = " + ageMap.get(2));

    System.out.println("ageMap.keySet().size() = " + ageMap.keySet().size());

    System.out.println("ageMap.containsKey(\"Ben\") = " + ageMap.containsKey("Ben"));

  }
}
