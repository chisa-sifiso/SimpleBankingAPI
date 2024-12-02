package tut.SimpleBanking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tut.SimpleBanking.model.Account;
import tut.SimpleBanking.service.BankingService;

public class BankingController {

    @Autowired
    private BankingService bankingService;

    // Create Account
    @PostMapping("/create")
    public Account createAccount(@RequestParam String name) {
        return bankingService.createAccount(name);
    }

    // Deposit Money
    @PostMapping("/{accountNumber}/deposit")
    public Account deposit(@PathVariable Long accountNumber, @RequestParam double amount) {
        return bankingService.deposit(accountNumber, amount);
    }

    // Withdraw Money
    @PostMapping("/{accountNumber}/withdraw")
    public Account withdraw(@PathVariable Long accountNumber, @RequestParam double amount) {
        return bankingService.withdraw(accountNumber, amount);
    }

    // Check Balance
    @GetMapping("/{accountNumber}/balance")
    public double checkBalance(@PathVariable Long accountNumber) {
        Account account = bankingService.getAccount(accountNumber)
                .orElseThrow(() -> new RuntimeException("Account not found"));
        return account.getBalance();
    }
}
