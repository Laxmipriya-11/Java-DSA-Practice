//2 sum problem
   //Brute force approach

//import java.util.HashMap;

public class PracticeQus10 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11 ,15};
        int target = 9 ;

       /*  for ( int i = 0 ; i < arr.length ; i ++){

         for ( int j = i ; j < arr.length; j ++){
           
            if (arr[i] + arr [j] == target){
           
               System.out.println(i + " " + j);
            }
        }
      }
    }
    }*/
//TC - 0(n2),SC-0(1)

    // Better force approach
/*HashMap<Integer , Integer> map  =  new HashMap<>();
for (int i = 0 ; i < arr.length; i++){
     int needed = target - arr[i];

     if (map.containsKey(needed)){
     System.out.println(map.get(needed) +" "+ i);
        break;
     }
     map.put(arr[i],i);
    }
  }
}*///TC - 0(n),SC-0(n)

//optimal force approach
int left = 0 ; 
int right = arr.length - 1;

while (left < right){
    int sum = arr[left] + arr[right];
    if (sum == target){
        System.out.println(left +" "+ right);
        break ;
    }
    else if ( sum < target){
        left ++;
    }
    else{
       right--;
    }
   }
  }
}//TC-0(n),SC-0(1)