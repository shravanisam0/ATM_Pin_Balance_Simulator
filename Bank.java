import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Manages ATM accounts.
 * Owner: Shravani S. Samarth
 */
public class Bank {
    private final Map<String, Account> accounts;

    public Bank() {
        accounts = new LinkedHashMap<>();
    }

    public void addAccount(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null.");
        }
        accounts.put(account.getAccountNumber(), account);
    }

    public Account findAccount(String accountNumber) {
        if (accountNumber == null) {
            return null;
        }
        return accounts.get(accountNumber.trim());
    }

    public int getAccountCount() {
        return accounts.size();
    }
}
