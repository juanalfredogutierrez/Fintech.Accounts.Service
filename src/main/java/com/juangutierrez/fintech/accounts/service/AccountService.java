package com.juangutierrez.fintech.accounts.service;

import com.juangutierrez.fintech.accounts.entity.Account;
import com.juangutierrez.fintech.accounts.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account create(Account account) {
        return repository.save(account);
    }

    public List<Account> findAll() {
        return repository.findAll();
    }

    public Account findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cuenta no encontrada"));
    }

    public Account deposit(Long id, BigDecimal amount) {

        Account account = findById(id);

        account.setBalance(account.getBalance().add(amount));

        return repository.save(account);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}