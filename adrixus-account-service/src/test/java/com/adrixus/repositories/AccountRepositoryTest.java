package com.adrixus.repositories;

import com.adrixus.models.Account;
import org.bouncycastle.util.Longs;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountRepositoryTest {
    private static final int COUNTRY_CODE = 91;


    @Autowired
    private AccountRepository accountRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        Account account = new Account();

        account.setId(Longs.valueOf(1));
        account.setCountryCode(91);

        //when
        accountRepository.save(account);

        //then
        Assert.assertNotNull(Longs.valueOf(account.getId()));
        Account newAccount = accountRepository.findById(Long.valueOf(account.getId())).orElse(null);
        Assert.assertEquals(COUNTRY_CODE, newAccount.getCountryCode());

    }
}
