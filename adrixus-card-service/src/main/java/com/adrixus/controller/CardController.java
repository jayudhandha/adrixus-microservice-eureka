package com.adrixus.controller;

import com.adrixus.models.Card;
import com.adrixus.services.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController implements CardApi{
    private CardService cardService;

    @Autowired
    public void setCardService(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping("/createCard")
    public ResponseEntity<Void> createCard(@RequestBody Card cardModel) {
        cardService.createCard(cardModel);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping("/getDummyCard")
    public Card createCard() {
        Card card = new Card();
        card.setId(1);
        card.setCvv(135);
        card.setPassword("Test");
        card.setCardType(Card.Type.VISA);
        return card;
    }
}
