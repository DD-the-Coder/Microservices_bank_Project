package com.ddbank.accounts.repository;

import com.ddbank.accounts.entities.AccountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends JpaRepository<AccountsEntity,Long> {
}
