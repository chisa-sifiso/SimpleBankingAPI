package tut.SimpleBanking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tut.SimpleBanking.model.Account;
import tut.SimpleBanking.repository.AccountRepository;

import java.util.Optional;
@Service
public class BankingService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(String name) {
        Account account = new Account(name);
        return accountRepository.save(account);
    }

    public Optional<Account> getAccount(Long accountNumber) {
        return accountRepository.findById(accountNumber);
    }

    public Account deposit(Long accountNumber, double amount) {
        Account account = accountRepository.findById(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));
        account.setBalance(account.getBalance() + amount);
        return accountRepository.save(account);
    }

    public Account withdraw(Long accountNumber, double amount) {
        Account account = accountRepository.findById(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        account.setBalance(account.getBalance() - amount);
        return accountRepository.save(account);
    }
}
