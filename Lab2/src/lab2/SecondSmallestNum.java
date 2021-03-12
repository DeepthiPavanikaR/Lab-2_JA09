package lab2;

public class SecondSmallestNum {
	public static int getSecondSmallest(int[] arr){  
		int temp;  
		for (int i = 0; i < arr.length; i++)   
		        {  
		            for (int j = i + 1; j < arr.length; j++)   
		            {  
		                if (arr[i] > arr[j])   
		                {  
		                    temp = arr[i];  
		                    arr[i] = arr[j];  
		                    arr[j] = temp;  
		                }  
		            }  
		        }  
		       return arr[1];
		}  

	public static void main(String[] args) {
		
		int arr[]= {4,7,5,2,8};
		System.out.println("Second smallest number is : "+getSecondSmallest(arr));
		
	}

}


