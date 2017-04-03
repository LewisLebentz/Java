import java.util.*;
import java.lang.*;
import java.io.*;

class arrays
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] Array = new int[10];

		for (int i = 0; i < 10; i++) {

			Array[i] = i + 1;
		}

		for (int i = 0; i < Array.length; i++) {

			System.out.print(Array[i]);
		}

		int[] arrayicma = {1, 2, 3, 4};

		System.out.println();

		for (int i = 0; i < arrayicma.length; i++) {

			System.out.print(arrayicma[i] + ", ");
		}
	}
}
