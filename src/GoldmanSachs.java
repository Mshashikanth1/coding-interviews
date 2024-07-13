import java.util.HashMap;
import java.util.Map;

public class GoldmanSachs {



    /******************************************************************************

     Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums
     with a sum of at least k.

     Input : [2,7,3,-8,4,10], target = 12
     Output : 2

     *******************************************************************************/


        static int pathSum=Integer.MAX_VALUE;
        public static void main(String[] args) {
            int nums[] = {2,7,3,-8,4,10};

// 		System.out.println(shortest(nums, 12));

            pathSum=dfs(new int[][]   {{ 1, 3 ,1},
                            {1, 5, 1},
                            {4, 2, 1}},
                    0,
                    0,
                    3,
                    3,
                    1,
                    Integer.MAX_VALUE,
                    new HashMap<>()
            );

            System.out.println(pathSum);
            /*. 2, 9, 12, 4, 8, 18*/
        }
        public static int shortest(int nums[], int target){

            int shortestSubArrLen=Integer.MAX_VALUE, n= nums.length ;

            for( int i=0;i<n; i++){
                int currSum=0;

                for( int j=i; j<n; j++){

                    currSum+=nums[j];

                    if( currSum >= target) {
                        shortestSubArrLen=Math.min(shortestSubArrLen, j-i+1);
                        break;
                    }

                }
            }

            return shortestSubArrLen;

        }
	/*
	     [ 1, 3 ,1]
	     [1, 5, 1]
	    [4, 2, 1]

	    1 , 1, ,4, 2, ,1. --> 1
	            5,  1, 1
	            5, 2, , 1




	*/


        public static int dfs( int[][] grid, int i, int j, int r, int c,int currSum, int pathSum, Map<String,Integer> cache ){


            String key="";
            if( cache.containsKey(key) ) return cache.get(key);


            if( i>=r || j >=c  || i<0 || j<0) return 0;

            if( i == r-1 && j==c-1) {
                pathSum= Math.min(pathSum , currSum);
                return pathSum ;
            }

            currSum+=grid[i][j];

            //left
            int left= dfs(grid,i, j+1, r, c, currSum,pathSum,cache);

            //bottom
            int right= dfs(grid, i+1,j, r, c, currSum,pathSum,cache);

            return Math.min(left, right);

        }
    }

