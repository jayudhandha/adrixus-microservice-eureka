package com.adrixus.services;

import com.adrixus.models.Account;

public interface AccountService {
    void createAccount(Account accountModel);

    Account getAccount(Long id);
}
