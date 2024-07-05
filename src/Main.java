import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//      Zenoti.sortWords("contributed to netsuite development and curated enough");
        EgenAi g=new EgenAi();
        System.out.println(Arrays.toString(g.solution(new String[][]{{"CREATE_ACCOUNT","1","account1"},
                {"CREATE_ACCOUNT","2","account2"},
                {"CREATE_ACCOUNT","3","account3"},
                {"DEPOSIT","4","account1","1000"},
                {"DEPOSIT","5","account2","1000"},
                {"DEPOSIT","6","account3","1000"},
                {"PAY","7","account2","100"},
                {"PAY","8","account2","100"},
                {"PAY","9","account3","100"},
                {"TOP_ACTIVITY","10","3"}})));
    }
}