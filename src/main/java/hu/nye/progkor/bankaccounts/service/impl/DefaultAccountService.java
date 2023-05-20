package hu.nye.progkor.bankaccounts.service.impl;


import hu.nye.progkor.bankaccounts.data.model.Account;
import hu.nye.progkor.bankaccounts.service.AccountService;
import hu.nye.progkor.bankaccounts.data.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultAccountService implements AccountService {

    private final Repository<Account, Long> accountRepository;

    @Autowired
    public DefaultAccountService(Repository<Account, Long> accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Account retrieveAccountById(Long id) {
        return accountRepository.getById(id);
    }

    @Override
    public List<Account> retrieveAllAccount() {
        return accountRepository.getAll();
    }

    @Override
    public Account updateAccount(Account account) {
        return accountRepository.update(account);
    }

    @Override
    public void deleteAccountById(Long id) {
        accountRepository.deleteById(id);
    }
}
