import java.util.HashMap;
import java.util.Map;

public class Nielson {
    /* ROLE : Software Engineer_Nielson


     * Given an array of integers of size N, the task is to find the first non-repeating element in this array.
    * arr=[1 ,2, 1, 3, 4]
    *
    *      0 1 2 3 4   --> 1 --> 0,1  , 2 -->1  , 3 ---> 3, ,4---> 4
    *
    * approach 1 :
    *   1. iterate over the array  :  ---> calcualte the frequecy map --> should maintain the order
    *   2. iterata over the created map  --> if( count> 1)   , smiply return that elemtn
    *
    * Time  : O(n) + O(n) + O(log(n)  ==> O(n)
    * Space :  O(n)
    *
    *   Map<Integer,Integer> frqhMap=new HashMap<>();

     * */
    class person {
        String name;
        Integer age;
    }

    public  static  int firstNonRepeating(int[] arr){
        /* it maintains the order*/
           Map<Integer,Integer> frqhMap=new HashMap<>(); /* cpu intenst */

        person[] pAtt= new person[10];


            int n=arr.length;
           /*iterating over the array and hashify the arra with freq O(log(0)*/
            for(int i : arr){
                frqhMap.put(i, (frqhMap.containsKey(i) ? frqhMap.get(i) : 0) +1 );
            }

 //            System.out.println(frqhMap);
             for(int i : arr){
                if(frqhMap.get(i)==1) return  i;
            }
            return -1;
    }
}
