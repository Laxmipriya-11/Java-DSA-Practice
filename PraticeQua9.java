//find the largest subarray sum which is equal to k (positive)
//Brute Force Approach

//import java.util.HashMap;

public class PraticeQua9 {
    public static void main(String[] args) {
        
        int[] arr = {1, 2 , 1 , 1 , 1 , 3 , 2};
        int k = 3 ;
       /*  int maxlen =0;
        
        for (int i = 0 ; i < arr.length ;i++ ){

         int sum = 0;
        
         for (int j = i; j < arr.length ; j++){
            sum = sum + arr[j];
             if (sum == k){
                int len = j - i + 1;
                maxlen = Math.max(maxlen ,len);
             }
           }
        }
          System.out.println(maxlen);

    }

 }*/
 //TC-0(n2),SC-0(1)
            //Better force Approach
/*  HashMap<Integer ,Integer> map = new HashMap<>();
 int sum = 0;
 int maxlen = 0;

 for (int i = 0 ; i < arr.length ; i ++ ){
     sum += arr[i];
      
     if (sum == k ){
      maxlen = i + 1;
     }
     int rem = sum - k;
     if (map.containsKey(rem)){
         int len = i -map.get(rem);
         maxlen = Math.max(maxlen , len);
     }
     if (!map.containsKey(sum)){
         map.put(sum,i);  
     } 
   } 
   System.out.println(maxlen);
 }
}*/
//TM- 0(n),SC-0(n)
         //optimal force approach
 int left = 0;
 int sum = 0;
 int maxlen = 0;
 for (int right = 0 ;right < arr.length; right ++){

     sum = sum + arr[right];

     while (sum > k){
        sum = sum - arr[left];
        left++;
     }
     if (sum == k){
      int len = right - left + 1;
      maxlen = Math.max(maxlen,len);
     }
    }
    System.out.println(maxlen);
}
}
// TC - 0(n),SC - 0(1)

