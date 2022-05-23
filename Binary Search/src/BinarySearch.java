import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class BinarySearch
	{
		static int [] nums =  {1,34,23,45,63,45,234,5,2123,5321,5,3,212,678,4578,643,678,432,67754,56,75,89,9,10,12,23,54,45};
		
		public static void main(String[] args)
			{
				
				Arrays.sort(nums);
				int num = greatPlayer();
				if(binarySearch(nums, num) >= 0)
					{
						System.out.println("The idex is " + binarySearch(nums,num));
					}
				else
					{
						System.out.println("This array does not have that number!!!");
					}
			}
		
		public static int greatPlayer()
		{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Hello what is you name?");
			String name = userInput.nextLine();
			System.out.println(name + " what is the number you want me to find?");
			int targetNum = userInput.nextInt();
			
			return targetNum;
		}
		
		public static int binarySearch(int[ ] elements, int target)
		{     
			int left = 0;
			int right = elements.length - 1;
			while (left <= right) 
			{
				int mid = (left + right) / 2;
			  if (target == elements[mid]) 
			  {
			  	return mid;
			  }
			  else if (target < elements[mid]) 
			  {
			  	right = mid - 1;
			  } 
			  else 
			  {
			  	left = mid + 1;
			  }
			}
				return -1;
		}	


	}
