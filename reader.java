import java.util.*;
import java.io.*;

public class reader {

  public static void main(String[] args) throws Exception
    {
       File f = new File("/Users/lewislebentz/Desktop/readme.txt"); //1
       Reader rdr = new FileReader(f);

       int in = rdr.read(); //2
       while(in != -1)
       {
          System.out.print((char) in);
          in = rdr.read();
       }

       rdr.close();
    }
}
