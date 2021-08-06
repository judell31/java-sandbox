package com.judell.playground.country_and_currency;

import java.util.Currency;
import java.util.Locale;

public class CountryLocationAndCurrency {

    public static void main(String[] args) {
        String[] countries = Locale.getISOCountries();

//        Locale locale = new Locale("en", "US");
//
//        Currency currency = Currency.getInstance(locale);
//        System.out.println("$" + currency.getCurrencyCode().toLowerCase());
        System.out.println();

        for (String country : countries) {
            Locale locale = new Locale("en", country);
            Currency currency = Currency.getInstance(locale);

            if (currency != null) {
                System.out.println(locale.getISO3Country());
                System.out.println(locale.getCountry());
                System.out.println(locale.getDisplayCountry());
                System.out.println("$" + currency.getCurrencyCode().toLowerCase());
                System.out.println("--------------------------------");
            }
        }
    }
}
