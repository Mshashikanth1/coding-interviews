import java.util.*;

public class winsen {



    /* T : n^2 S: O(1)    2, 3, 5, 7, */
    public static int  countPrime(int n){
        int count=0;

        for ( int i=2; i<=n; i++){
            if( isPrime(i)) count++;
        }

        return count;

    }

    public static boolean isPrime(int n){
        if( n<2) return  true;

        for( int i=2; i<n ; i++){
            if( n%i==0) return false;
        }
        return  true;
    }




    /*
    *  2, 4, 6, 8
    *  3, 6, 9,
    *  4, 8,
    *  5, 10
    *
    * */
    public static int  countPrimeSteveOfEreross(int n){
         int[] arr = new int[n+1];

        Arrays.fill(arr, 1);

        arr[0]=0;
        arr[1]=0;

        for( int i=2; i<=n; i++){  // O(n)
            int   j=2;
            while ( i*j <= n){  // O(n) ...  O(n^2)
                arr[i*j]=0;
                j++;
            }
        }

        int primeCount=0;
        for(int i: arr) primeCount+=i;
        return  primeCount;
    }


    /*
    *
    * Input: s = "abpcplea",
    * dictionary = ["ale","apple","monkey","plea"]   --> []
      Output: "apple"

       Input: s = "abpcplea", dictionary = ["a","b","c"]
       Output: "a"
    *
    *
    *     T : O (n log(N) ). +   M*N*K
    *
    *
    *
    * */

    public static String lexSmallStringByRemovingSomeCharsFromString( String str, String[] dict){

        List<String>  possibleStrings= new ArrayList<>();
        for( String s : dict){            // T : O(len(dict))
            if( isPossible( str, s)) possibleStrings.add(s);
        }

        if (possibleStrings.isEmpty()) return  "";

        Collections.sort(possibleStrings , (a,b) ->  ( b.length()-a.length())  );  // T : O(nlog(n))

       System.out.println(possibleStrings);

        return  possibleStrings.stream()
                .filter(  strr -> strr.length()==possibleStrings.get(0).length())
                .sorted().findFirst().orElse("");  // T : O(nlog(n))
    }

    public  static  boolean isPossible( String str, String s){
        int m = str.length(), n= s.length(), i=0, j=0;

        while (i<m && j<n){
            if( str.charAt(i) == s.charAt(j)){    // T : O(max(m,n))
              i++;
              j++;
            }else  i++;
        }

      return j == n;

    }
    }
