class alternateChars
{
  public static void main(String[] args)
  {
    String s = "independence";
    StringBuilder sb = new StringBuilder();

    for (int index = 0; index < s.length(); index += 2) {

      sb.append(s.charAt(index));
    }
    System.out.println(sb);
  }

}
