import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Zenoti {

    /*Zenoti dotnet software engineer*/

    /*Online test : Status pass*/

        public static void main1(String args[] ) throws Exception {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            while(n > 0){
                String str=sc.next();
                Map<Character,Integer> fhMap=new LinkedHashMap<>();

                for(char ch : str.toCharArray()){
                    fhMap.put(ch, fhMap.getOrDefault(ch,0)+1);
                }

                StringBuilder sb=new StringBuilder();
                for(char ch : fhMap.keySet()){
                    sb.append(ch);
                    sb.append(fhMap.get(ch));
                }
                System.out.println(sb);
                n--;
            }

        }


    public static void main2(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String S = br.readLine();

        String[] out_ = tokenize_string(S);
        for (int i_out_ = 0; i_out_ < out_.length; i_out_++)
        {
            System.out.println(out_[i_out_]);
        }

        wr.close();
        br.close();
    }
    static String[] tokenize_string(String S){
        char[] chr= S.toCharArray();
        int f=-1;
        List<String> str=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chr.length;i++){

            if(chr[i]==' ' && f==-1) {
                str.add(sb.toString());
                sb=new StringBuilder();
            }

            if(f!=-1 && chr[i]=='"'){
                sb.append(chr[i]);
                str.add(sb.toString());
                sb=new StringBuilder();
                f=-1;
                continue;
            }

            if(chr[i]=='"'){
                f=i;
            }
            sb.append(chr[i]);
        }

        String[] ans=new String[str.size()];
        for(int i=0;i<str.size();i++){
            ans[i]=str.get(i).trim();
        }


        return ans;
    }

    public static void main3(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            String str=sc.next();
            StringBuilder sb=new StringBuilder();

            for(char ch : str.toCharArray()){
                if(ch >=65 && ch <=90){
                    if(sb.length()!=0) sb.append('_');
                    sb.append((char) (ch+32));
                }else{
                    sb.append(ch);
                }
            }

            System.out.println(sb.toString());
            n--;
        }
    }


    /*[19/04/2024] Interview questions on hacker earth : status pass*/

    /**
     *       1
     *     1 2 1
     *   1 2 3 2 1
     * 1 2 3 4 2 3 1
     */

    /*Time : O(N^2) Space :O(1)*/
    public  static  void printPattern(int n) {
        for(int i=0;i<=n;i++) {
            int k=n-i;
            while(k-->0) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j +" ");
            for (int j = i-1; j >0; j--) System.out.print(j +" ");
            System.out.println();
        }
    }



    /*Time :O(2^n) Space :O(1) + (call stack space)*/
    public int fib(int n ){
        if(n<2) return  1;
        return fib(n-1)+fib(n-2);
    }

    /*Time :O(n) Space :O(1) + (call stack space)*/
    public int fibMemo(int n,     Map<Integer,Integer> memo){
        if(n<2) return  1;
        if(memo.containsKey(n)) return memo.get(n);
        memo.put(n, fib(n-1)+fib(n-2));
        return memo.get(n);
    }

    /*Time : O(n) Space :O(n)*/
    public int fibTab(int n){
        if(n<2) return 1;
        int[] dp =new int[n+1];
        for(int i=2;i<n;i++)  dp[i]=dp[i-1]+dp[i-2];
        return dp[n];
    }

    /*
    * given three tables, we need to query certain data on the tables;
    *
    * Select students.name from students_table  where id in (
    * select students_id in attendance_table left join
    * lecture_table on attendance_table.lecture_id =lecture_table
    * )
    * order by students.name
    * */


    /* [22/04/2024] :Interview on hacker earth*/
    public static void sortWords(String paragraph){
        String[] words=paragraph.split(" ");
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }

    /*[24/04/2024] : Interview on hacker earth*/
    public void findFirstTwoMax(int[] arr){

        /*constraints:  without sorting  array, without using extra loops */
        int fMax=Integer.MIN_VALUE, sMax=Integer.MIN_VALUE;

        for(int i: arr){
            if(i>fMax){
                sMax=fMax;
                fMax=i;
            }else sMax=Math.max(sMax,i);
        }
        System.out.println(fMax +" , "+sMax);
    }
    public boolean isAnagram(String s, String t){
        int[] asciiArr=new int[256];

        /*constraints: without using extra loops & extra hashmaps*/
        if(s.length()!=t.length()) return false;

        for(int i=0; i<s.length(); i++) {
            asciiArr[s.charAt(i)]++;
            asciiArr[t.charAt(i)]--;
        }

        for(int i:asciiArr)
             if(i>0) return false;

        return true;
    }

    /*sql*/
}
