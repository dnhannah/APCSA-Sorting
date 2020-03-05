public class Sort implements SortInterface
{

/**
      Sorts an array, using bubble sort.
      @param array the array to sort
      @param lowindex is where you want to start sorting
      @param highindex is where you want to stop sorting
      @param reversed tells to sort from least to greatest or greatest to least
*/
public void bubbleSort(int[] array, int lowindex, int highindex, boolean reversed)
{  
	if(reversed == false)
	{
	    int min = array[lowindex];
		for(int i = 0; i <= highindex - lowindex; i++)
	  {
		  for(int n = lowindex; n <= highindex - 1 - i; n++)
		  {
	 		    min = array[n];
	  	  	if(array[n] > array[n + 1]){
		      	ArrayUtil.swap(array, n, n+1);}
			
	  	}
		}
	}
	if(reversed == true)
	{
	  int max = array[lowindex];
		for(int i = 0; i <= highindex - lowindex; i++)
		{
	  	for(int n = lowindex; n <= highindex - 1 - i; n++)
	  	{
	 	  	max = array[n];
	  		if(array[n] < array[n + 1]){
		    	ArrayUtil.swap(array, n, n+1);}
	  	}
		}
	}

	//for(int i = 0; i < array.length; i++)
	//{
	//	System.out.print(array[i] + ", ");
	//}
}


/**
      Sorts an array, using selection sort.
      @param array the array to sort
      @param lowindex is where you want to start sorting
      @param highindex is where you want to stop sorting
      @param reversed tells to sort from least to greatest or greatest to least
*/
public void selectionSort(int[] array, int lowindex, int highindex, boolean reversed)
{  
   for (int i = lowindex; i <= highindex - 1; i++)
   {  
	     if(reversed == false){
         int minPos = minimumPosition(array, i);
         ArrayUtil.swap(array, minPos, i);}
	     else{
         int maxPos = maximumPosition(array, i);
         ArrayUtil.swap(array, maxPos, i);}
   }


  //for(int i = 0; i < array.length; i++)
	//{
	//	System.out.print(array[i] + ", ");
	//}
}

   /**
      Finds the smallest element in a tail range of the array.
      @param a the array to sort
      @param from the first position in a to compare
      @return the position of the smallest element in the
      range a[from] . . . a[a.length - 1]
   */
private static int minimumPosition(int[] a, int from)
{  
      int minPos = from;
      for (int i = from + 1; i < a.length; i++)
      {
         if (a[i] < a[minPos]) { minPos = i; }
      }
      return minPos;
}

 /**
      Finds the largest element in a tail range of the array.
      @param a the array to sort
      @param from the first position in a to compare
      @return the position of the largest element in the
      range a[from] . . . a[a.length - 1]
   */
private static int maximumPosition(int[] a, int from)
{  
      int maxPos = from;
      for (int i = from + 1; i < a.length; i++)
      {
         if (a[i] > a[maxPos]) { maxPos = i; }
      }
      return maxPos;
}

/**
      Sorts array using merge sort
      @param arrray is the array that needs to be sorted
      @param lowindex is where you want to start sorting
      @param highindex is where you want to stop sorting
      @param reversed tells to sort from least to greatest or greatest to least
*/
public void mergeSort(int[] array, int lowindex, int highindex, boolean reversed)
{
      if (array.length > 1) {
      int[] first = new int[(highindex - lowindex + 1) / 2];
      int[] second = new int[(highindex - lowindex + 1) - first.length];
      // Copy the first half of array into first, the second half into second
      for (int i = 0; i < first.length; i++) 
      { 
         first[i] = array[i]; 
      }
      for (int i = 0; i < second.length; i++) 
      { 
         second[i] = array[((highindex - lowindex + 1) / 2) - 1 + i]; 
      }
      mergeSort(first, 0, first.length - 1, reversed);
      mergeSort(second, 0, second.length - 1, reversed);
      merge(first, second, array, reversed);
	
	//for(int i = 0; i < array.length; i++)
	//{
	//	System.out.print(array[i] + ", ");
	//}

	}
}

/**
      Helper method for mergeSort - Merges two sorted arrays into an array
      @param first the first sorted array
      @param second the second sorted array
      @param a the array into which to merge first and second
      @param reversed tells to sort from least to greatest or greatest to least
*/
public static void merge(int[] first, int[] second, int[] a, boolean reversed)
{  
      int iFirst = 0; // Next element to consider in the first array
      int iSecond = 0; // Next element to consider in the second array
      int j = 0; // Next open position in a

      // As long as neither iFirst nor iSecond is past the end, move
      // the smaller element into a
      while (iFirst < first.length && iSecond < second.length)
      {  
	if(reversed == false){
        	 if (first[iFirst] < second[iSecond])
        	 {  
          	  a[j] = first[iFirst];
           	 iFirst++;
      	  	 }
        	 else
        	 {  
          	  a[j] = second[iSecond];
          	  iSecond++;
       		 }
		j++;
	}
	else{
		if (first[iFirst] > second[iSecond])
        	 {  
          	  a[j] = first[iFirst];
           	 iFirst++;
      	  	 }
        	 else
        	 {  
          	  a[j] = second[iSecond];
          	  iSecond++;
       		 }
		j++;
	}
      }

      // Note that only one of the two loops below copies entries
      // Copy any remaining entries of the first array
      while (iFirst < first.length) 
      { 
         a[j] = first[iFirst]; 
         iFirst++; j++;
      }
      // Copy any remaining entries of the second half
      while (iSecond < second.length) 
      { 
         a[j] = second[iSecond]; 
         iSecond++; j++;
      }
}

}
