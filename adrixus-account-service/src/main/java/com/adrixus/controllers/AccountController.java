package com.adrixus.controllers;

import com.adrixus.models.Account;
import com.adrixus.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController implements AccountApi {

    private AccountService accountService;

    @Autowired
    public void setAccountService(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/createAccount")
    public ResponseEntity<Void> createAccount(@RequestBody Account accountModel) {
        accountService.createAccount(accountModel);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getAccount/{accountId}")
    public ResponseEntity<Account> getAccount(@PathVariable String accountId) {
        return new ResponseEntity<>(accountService.getAccount(Long.valueOf(accountId)), HttpStatus.OK);
    }
}
