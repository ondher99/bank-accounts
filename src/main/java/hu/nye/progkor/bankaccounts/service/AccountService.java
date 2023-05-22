package hu.nye.progkor.bankaccounts.service;

import hu.nye.progkor.bankaccounts.data.model.Account;

import java.util.List;

public interface AccountService {

    Account createAccount(Account account);

    Account retrieveAccountById(Long id);

    List<Account> retrieveAllAccount();

    Account updateAccount(Account account);

    void deleteAccountById(Long id);
}
