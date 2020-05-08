package com.adrixus.controllers;

import com.adrixus.models.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface AccountApi {
    ResponseEntity<Void> createAccount(@RequestBody Account accountModel);

    ResponseEntity<Account> getAccount(@PathVariable String accountId);
}
