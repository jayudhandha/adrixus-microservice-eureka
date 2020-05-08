package com.adrixus.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
    public enum Type {
        VISA, MasterCard
    }

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private int customerId;
    private int accountId;
    private Type cardType;
    private int cvv;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Type getCardType() {
        return cardType;
    }

    public void setCardType(Type cardType) {
        this.cardType = cardType;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
