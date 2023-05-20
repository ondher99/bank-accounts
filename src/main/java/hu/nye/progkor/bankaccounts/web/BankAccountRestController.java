package hu.nye.progkor.bankaccounts.web;

import hu.nye.progkor.bankaccounts.data.model.Account;
import hu.nye.progkor.bankaccounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/botp/accounts")
public class BankAccountRestController {

    private final AccountService accountService;

    @Autowired
    public BankAccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        return accountService.retrieveAccountById(id);
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.retrieveAllAccount();
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @PutMapping
    public Account updateAccount(@RequestBody Account account) {
        return accountService.updateAccount(account);
    }

    @DeleteMapping("/{id")
    public void deleteAccountById(@PathVariable Long id) {
        accountService.deleteAccountById(id);
    }
}
