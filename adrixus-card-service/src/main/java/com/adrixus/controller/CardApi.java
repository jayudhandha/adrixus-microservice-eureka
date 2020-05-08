package com.adrixus.controller;

import com.adrixus.models.Card;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

public interface CardApi {
    ResponseEntity<Void> createCard(@RequestBody Card cardModel);
}
