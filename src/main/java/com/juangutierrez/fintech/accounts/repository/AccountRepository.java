package com.juangutierrez.fintech.accounts.repository;

import com.juangutierrez.fintech.accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}