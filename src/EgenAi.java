import java.util.*;

public class EgenAi { static class Account {
    private String timestamp;
    private String accountId;
    private Long balance;
    private Long totalTransactions;

    Account(String timestamp, String accountId, Long balance, Long totalTransactions) {
        this.timestamp = timestamp;
        this.accountId = accountId;
        this.balance = balance;
        this.totalTransactions = totalTransactions;
    }

    public void setBalance(Long amount) {
        this.balance = amount;
    }

    public void setTotalTransactions(Long amount) {
        this.totalTransactions = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public Long getTotalTransactions() {
        return totalTransactions;
    }
}

    static boolean createAccount(String timestamp, String accountId, HashMap<String, Account> db) {
        if (db.containsKey(accountId)) return false;
        db.put(accountId, new Account(timestamp, accountId, 0L, 0L));
        return true;
    }

    static String pay(String timestamp, String accountId, String amount, HashMap<String, Account> db) {
        if (!db.containsKey(accountId) || db.get(accountId).balance < Long.valueOf(amount)) return "";
        Account acc = db.get(accountId);
        acc.setBalance(acc.balance - Long.valueOf(amount));
        acc.setTotalTransactions(acc.getTotalTransactions() + Long.valueOf(amount));
        db.put(accountId, acc);
        return String.valueOf(acc.balance);
    }

    static String deposit(String timestamp, String accountId, String amount, HashMap<String, Account> db) {
        if (!db.containsKey(accountId)) return "";
        Account acc = db.get(accountId);
        acc.setBalance(acc.balance + Long.valueOf(amount));
        acc.setTotalTransactions(acc.getTotalTransactions() + Long.valueOf(amount));
        db.put(accountId, acc);
        return String.valueOf(acc.balance);
    }

    static String topActivity(String timeStamp, String n, HashMap<String, Account> db) {
        StringBuilder sb = new StringBuilder();
        List<Account> valuesList = new ArrayList<>(db.values());

        Collections.sort(valuesList, new Comparator<Account>() {
            @Override
            public int compare(Account a1, Account a2) {
                int compareByTransactions = a2.getTotalTransactions().compareTo(a1.getTotalTransactions());
                if (compareByTransactions == 0) {
                    return a1.getAccountId().compareTo(a2.getAccountId());
                } else {
                    return compareByTransactions;
                }
            }
        });

        int count = 0;
        for (Account account : valuesList) {
            sb.append(account.getAccountId()).append("(").append(account.getTotalTransactions()).append("), ");
            count++;
            if (count >= Integer.valueOf(n)) {
                break;
            }
        }

        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        return sb.toString();
    }

    static String[] solution(String[][] queries) {
        HashMap<String, Account> db = new HashMap<>();
        String[] ans = new String[queries.length];
        int q = 0;

        for (String[] query : queries) {
            if ("CREATE_ACCOUNT".equals(query[0])) {
                ans[q++] = String.valueOf(createAccount(query[1], query[2], db));
            } else if ("DEPOSIT".equals(query[0])) {
                ans[q++] = deposit(query[1], query[2], query[3], db);
            } else if ("PAY".equals(query[0])) {
                ans[q++] = pay(query[1], query[2], query[3], db);
            } else if ("TOP_ACTIVITY".equals(query[0])) {
                ans[q++] = topActivity(query[1], query[2], db);
            }
        }
        return ans;
    }


    /*
    *
    * {{"CREATE_ACCOUNT","1","account1"},
{"CREATE_ACCOUNT","2","account2"},
{"DEPOSIT","3","account1","2000"},
{"DEPOSIT","4","account2","1000"},
{"PAY","5","account1","500"},
{"PAY","6","account1","1000"},
{"PAY","7","account2","1000"}}


{{"CREATE_ACCOUNT","1","account1"},
{"CREATE_ACCOUNT","2","account2"},
{"CREATE_ACCOUNT","3","account3"},
{"DEPOSIT","4","account1","1000"},
{"DEPOSIT","5","account2","1000"},
{"DEPOSIT","6","account3","1000"},
{"PAY","7","account2","100"},
{"PAY","8","account2","500"},
{"PAY","9","account2","2000"},
{"PAY","10","account2","500"},
{"PAY","11","account3","700"},
{"PAY","12","account1","800"},
{"TOP_ACTIVITY","13","2"},
{"TOP_ACTIVITY","14","3"},
{"TOP_ACTIVITY","15","4"}}


{{"CREATE_ACCOUNT","1","account1"},
{"CREATE_ACCOUNT","2","account2"},
{"CREATE_ACCOUNT","3","account3"},
{"DEPOSIT","4","account1","1000"},
{"DEPOSIT","5","account2","1000"},
{"DEPOSIT","6","account3","1000"},
{"PAY","7","account2","100"},
{"PAY","8","account2","100"},
{"PAY","9","account3","100"},
{"TOP_ACTIVITY","10","3"}}
    * */
}
