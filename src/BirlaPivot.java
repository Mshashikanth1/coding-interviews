import java.util.ArrayList;
import java.util.List;

public class BirlaPivot {

    /* software engineer 1 role: Interview 1 : interviewer : yash mittal Yash Mittal <yash.mittal@adityabirla.com>

     Namrata Singh <namrata.singh-v@adityabirla.com>
     cc:	Anubhuti Kala <anubhuti.kala@adityabirla.com>,
        Gaurav Sharma <sharma.gaurav@adityabirla.com>

*/
    /*given a array=[3,4,9,7,8,9,13,5] and sum=12 , i need  to find the all the sub arrays which array elements should be splitted in array*/

    /* Time : O(n* max(arr)%sum)  , space : O(n* max(arr)%sum)*/
    public List<List<Integer>> findSubArraysSplittingInputArrayEqualToSum(int[] arr, int sum){
        List<List<Integer>> ans=new ArrayList<>();
        int i=0;
        while(i<arr.length){
                int num=arr[i], s=sum;
                for(int j=0;i<num/sum;i++){
                    List<Integer> subArr=new ArrayList<>();
                    subArr.add(sum);
                    ans.add(subArr);
                }
                int rem=num%sum;
                if(s==sum){
                    List<Integer> subArr=new ArrayList<>();
                    subArr.add(sum);
                    ans.add(subArr);
                }
                i++;
        }
        return ans;
    }


    /*given an array find the max of two numbers difference provided the left --> right, right should be maximum  */
    /*Time :O(n^2) space :O(1)*/
    public int findMaxDiffLeftToRight(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    max=Math.max(arr[i]-arr[j],max);
                }
            }
        }
        return max;
    }


    /*follow-up : can we decrease the time complexity : solution : yes, we can construct post-max array for every element */
    /*Time : O(n) space :O(n)*/
    public int findMaxDiffLeftToRightPostMaxArray(int [] arr){
        int max=0;
        int[] postMaxArr=new int[arr.length];
        postMaxArr[arr.length-1]=0;

        for(int i=arr.length-2; i>=0; i--){
            postMaxArr[i]=Math.max(postMaxArr[i+1], arr[i]);
        }

        for(int i=0; i<arr.length; i++) {
            max = Math.max(postMaxArr[i] - arr[i], max);
        }
        return max;
    }


    /*follow-up : can we decrease space complexity y : solution yes, since we are using only one element at  a time we can use a single variable instead of array*/
   /*Time :O(n) space :O(1)*/
    public int findMaxDiffLeftToRightSpaceOptimized(int[] arr){
        int max=0 ,postMaxEle=0;
        for(int i=arr.length-2; i>=0; i--){
            postMaxEle=Math.max(postMaxEle, arr[i]);
            max = Math.max(postMaxEle- arr[i], max);
        }
        return max;
    }
}
