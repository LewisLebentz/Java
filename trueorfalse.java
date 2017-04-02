class trueorfalse {
  public static void main(String[] args) {


    int[] a = {1, 2, 3, 4, 5};
    int[] b = new int[6];

    for (int i = 0; i < a.length; i ++) {

      b[i] = a[i];

    }
    System.out.println(a.length <= b.length);
    System.out.println(b[5] > b[4]);
    System.out.println();
    System.out.println(a.length < b.length);
    System.out.println(a[1] == 2);
    System.out.println();
    System.out.println(a.length <= b.length);
    System.out.println(b[5] == 0);
    System.out.println();
    System.out.println(a.length == b.length);
    System.out.println(a[4] == 5);
    System.out.println();
    System.out.println(a.length > b.length);
    System.out.println(a[1] == b[1]);
  }

}
