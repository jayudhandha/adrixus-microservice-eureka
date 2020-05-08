package com.adrixus.repositories;

import com.adrixus.models.Card;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CardRepositoryTest {

    private static final int ACCOUNT = 123456789;
    private static final int CVV = 135;
    private static final String PASSWORD = "test";

    @Autowired
    private CardRepository cardRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        Card card = new Card();

        card.setId(1);
        card.setAccountId(123456789);
        card.setCvv(135);
        card.setPassword("test");

        //when
        cardRepository.save(card);

        //then
        Assert.assertNotNull(card.getId());
        Card newCard = cardRepository.findById(Long.valueOf(card.getId())).orElse(null);
        Assert.assertEquals(ACCOUNT, newCard.getAccountId());
        Assert.assertEquals(CVV, newCard.getCvv());
        Assert.assertEquals(PASSWORD, newCard.getPassword());
    }
}
