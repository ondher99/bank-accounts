package hu.nye.progkor.bankaccounts.data.repository.impl;

import hu.nye.progkor.bankaccounts.data.model.Account;
import hu.nye.progkor.bankaccounts.data.repository.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Repository
public class InMemoryAccountRepository implements Repository<Account, Long> {

    private static final Map<Long, Account> MANAGEMENT = new HashMap<>();

    @Override
    public Account save(Account account) {
        Long id = MANAGEMENT.size() + 1L;
        account.setId(id);
        MANAGEMENT.put(id, account);
        return MANAGEMENT.get(id);
    }

    @Override
    public Account getById(Long id) {
        return MANAGEMENT.get(id);
    }

    @Override
    public List<Account> getAll() {
        return MANAGEMENT.values().stream().toList();
    }

    @Override
    public Account update(Account account) {

        Long id = account.getId();
        MANAGEMENT.put(id, account);
        return MANAGEMENT.get(id);
    }

    @Override
    public void deleteById(Long id) {
        MANAGEMENT.remove(id);
    }
}
