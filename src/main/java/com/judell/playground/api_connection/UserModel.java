package com.judell.playground.api_connection;

import java.time.Instant;

public class UserModel {

    private Long userId;
    private String firstName;
    private String lastName;
    private String currency;
    private String stripeAcctId;
    private String email;
    private String accountType;
    private String password;
    private Instant acctCreatedAt;
    private String country;
    private boolean isActive;
    private boolean isVerified;
    private boolean isClosed;
    private String acctCloseReason;
    private String initials;
    private Instant closedAt;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getStripeAcctId() {
        return stripeAcctId;
    }

    public void setStripeAcctId(String stripeAcctId) {
        this.stripeAcctId = stripeAcctId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Instant getAcctCreatedAt() {
        return acctCreatedAt;
    }

    public void setAcctCreatedAt(Instant acctCreatedAt) {
        this.acctCreatedAt = acctCreatedAt;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getAcctCloseReason() {
        return acctCloseReason;
    }

    public void setAcctCloseReason(String acctCloseReason) {
        this.acctCloseReason = acctCloseReason;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public Instant getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Instant closedAt) {
        this.closedAt = closedAt;
    }
}
