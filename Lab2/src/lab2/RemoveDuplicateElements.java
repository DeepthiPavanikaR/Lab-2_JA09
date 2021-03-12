package lab2;

import java.util.Arrays;

public class RemoveDuplicateElements {
	
	static int removeDuplicates(int arr[]) 
    { 
        int n = arr.length;
        if (n==0 || n==1) 
            return n; 
       
        int[] temp = new int[n]; 
          
       
        int j = 0; 
        for (int i=0; i<n-1; i++) 
           
            if (arr[i] != arr[i+1]) 
                temp[j++] = arr[i]; 
          
        
        temp[j++] = arr[n-1];    
          
        
        for (int i=0; i<j; i++) 
            arr[i] = temp[i]; 
       
        return j; 
    } 
      
    public static void main (String[] args)  
    { 
        int arr[] = {1, 2, 6,6, 4, 4, 5, 5}; 
        Arrays.sort(arr);
        int n = arr.length; 
          
        n = removeDuplicates(arr); 
        int temp;
        
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }  
        
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" ");
    } 
} 

	

