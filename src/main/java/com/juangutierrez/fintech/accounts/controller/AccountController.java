package com.juangutierrez.fintech.accounts.controller;

import com.juangutierrez.fintech.accounts.entity.Account;
import com.juangutierrez.fintech.accounts.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public Account create(@RequestBody Account account) {
        return service.create(account);
    }

    @GetMapping
    public List<Account> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Account findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PutMapping("/{id}/deposit")
    public Account deposit(
            @PathVariable Long id,
            @RequestParam BigDecimal amount) {

        return service.deposit(id, amount);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}