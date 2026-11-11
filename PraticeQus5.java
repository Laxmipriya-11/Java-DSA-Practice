import java.util.*;

public class PraticeQus5 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 6, 7};

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
    /* 
    //union of two arrays
            if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size()-1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            }

            else if (a[i] > b[j]) {
                if (ans.isEmpty() || ans.get(ans.size()-1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }

            else {
                if (ans.isEmpty() ||ans.get(ans.size()-1) != a[i]) {
                 ans.add(a[i]);
                }
                i++;
                j++;
            }
        }
            while (i < a.length){
                if ( ans.isEmpty()||ans.get(ans.size()-1) !=a[i]){
                    ans.add(a[i]);
                }
                i++;
            }
            while(j < b.length){
                if(ans.isEmpty()||ans.get(ans.size()-1) !=b[j]){
                    ans.add(b[j]);
                }
                j++;
            }
            System.out.println("union of two arrays : " + ans);

            }
        } */
       //intersection of two arrays
       if (a[i] == b[j]){
           if (ans.isEmpty()|| ans.get(ans.size()-1)!=a[i]){
              ans.add(a[i]);
           }
           i++;
           j++;
        }
       else if (a[i] < b[j]){
        i++;
       }
      else {
        j++;
      }
    }
    System.out.println(ans);
}
}