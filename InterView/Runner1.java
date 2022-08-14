package InterView;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Runner1 {
    // =====================
    public static boolean isUnique1(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        int len_arr = arr.length;
        for(int i = 0 ; i < len_arr ; ++i){
            if(set.contains(arr[i])){
                return false;
            }else{
                set.add(arr[i]);
            }
        }
        return true;
    }
    public static boolean isUnique2(int[] arr){
        int len_arr = arr.length;
        for(int i =0 ;i < len_arr - 1 ; ++i){
            for(int j = i+1; j < len_arr ; ++j){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
    // =====================
    public static int[] returnDuplicates(int[]arr){
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> res_set = new HashSet<Integer>();
        int len_arr = arr.length;
        for(int i = 0 ; i < len_arr ; ++i){
            if(set.contains(arr[i])){
                res_set.add(arr[i]);

            }else{
                set.add(arr[i]);
            }
        }
        if(res_set.size() == 0){
            return null;
        }
        int[] res = new int[res_set.size()];

        int i =0;
        for(Integer e: res_set){
            res[i++] = e;
        }

        return res;

    }
    // =====================
    public  static void printArray(int[]arr){
        if(arr == null )
            return ;
        int i=0;
        System.out.print("[");
        for( ; i < arr.length - 1;++i){
        System.out.print(arr[i]+", ");
        }
        System.out.println(arr[i]+"]");
    }
    // =====================
    public static int getMaxElement(int[] arr){

        int max= arr[0];

       for(int i =1 ;i < arr.length ; ++i){
           if(max < arr[i])
               max = arr[i];
       }

        return max;
    }
    public static int getSecMaxElement(int[] arr){

        if(arr.length == 1)
            return arr[0];
        int fMax = getMaxElement(arr);
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; ++i){
            if(fMax!=arr[i] && max< arr[i] ){
                max = arr[i];
            }
        }
        return max;
    }
// =====================
    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int [] arr,int i, int j){
        if(i == j)
            return ;
        int t = 0;
        int mid = i+(j -i)/2 + 1;
        for(int k =i ;k <mid; ++k){
            swap(arr,k, j - t);
            t++;
        }
    }
    public static void  rotateArray(int[] arr, int k){
        if(k>=arr.length)
            k%=arr.length;
        if(k == 0)
            return ;

       reverse(arr,arr.length - k,arr.length -1);
       reverse(arr,0,arr.length - k-1 );
       reverse(arr,0,arr.length -1);

    }
    public static boolean isAnagram(String str1, String str2){

        Map<Character,Integer> map = new HashMap<>();
        if(str1.length() != str2.length())
            return false;

        for(int i =0 ;i < str1.length() ; ++i){
            if(map.containsKey(str1.charAt(i))){
                map.put(str1.charAt(i),map.get(str1.charAt(i))+1);
            }else{
                map.put(str1.charAt(i),0);
            }
        }

        for(int i =0 ;i < str2.length() ; ++i){
            if(map.containsKey(str2.charAt(i))){
                if(map.get(str2.charAt(i)) < 0)
                    return false;
                map.put(str2.charAt(i),map.get(str2.charAt(i))-1);
            }else{
                return false;
            }
        }

        return true;
    }
// =====================
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5,3};
        System.out.println("======== print the root arrays ========");
        printArray(arr);
        printArray(arr2);
        System.out.println("check if all elements in array is unique");
        System.out.println(isUnique1(arr));//time: O(n) space: O(n)
        //        System.out.println(isUnique2(arr));//time: O(nLog(n)) using sort array (heap Sort)
        System.out.println(isUnique2(arr2));//time: O(n^2)
        System.out.println("======== return the duplicate elements ========");
        printArray(arr2);
        int [] res = returnDuplicates(arr2);
        printArray(res);
        System.out.println("======== get second max element in array ========");
        printArray(arr);
        System.out.println(getSecMaxElement(arr));
        System.out.println("======== rotate array using k is given ========");
        int k = 7;
        System.out.println("K = "+k);
        printArray(arr);
        rotateArray(arr,k);
        printArray(arr);
        System.out.println("======== check if the str1 and str2 are anagrams========");
        String str1 = "Ahmad";
        String str2 = "hmad";
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
        System.out.println(isAnagram(str1,str2));
        str1 = "Ahmad";
        str2 = "hmadA";
        System.out.println("str1 = "+str1);
        System.out.println("str2 = "+str2);
        System.out.println(isAnagram(str1,str2));

    }
}
