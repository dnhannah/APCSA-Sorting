import java.util.Random;
/**
This class tests the Sort class
*/

public class SortTest
{
	public static void main(String[] args)
	{	
	int[] a = ArrayUtil.randomIntArray(100, 100);
	//int[] b = ArrayUtil.randomIntArray(1000, 1000);
	//int[] c = ArrayUtil.randomIntArray(5000, 5000);
	//int[] d = ArrayUtil.randomIntArray(10000, 10000);
	int[] e = ArrayUtil.randomIntArray(50000, 50000);
	//int[] f = ArrayUtil.randomIntArray(75000, 75000);
	int[] g = ArrayUtil.randomIntArray(100000, 100000);
	int[] h = ArrayUtil.randomIntArray(500000, 500000);

	SortInterface demo = new Sort();
	long time1 = System.currentTimeMillis();
	//demo.bubbleSort(a, 3, 9, false);
	demo.selectionSort(g, 3, 9, false);
	//demo.mergeSort(h, 0, 499, false);
	System.out.println("        ------        ");
	long time2 = System.currentTimeMillis();
	long time3 = System.currentTimeMillis();
	//demo.bubbleSort(a, 4, 20, true);
	demo.selectionSort(g, 0, 200, true);
	//demo.mergeSort(h, 0, 499999, true);
	long time4 = System.currentTimeMillis();
	System.out.println("        ------        ");
	System.out.print(time2- time1);
	System.out.println("        ------        ");
	System.out.print(time4- time3);	
	}
}
