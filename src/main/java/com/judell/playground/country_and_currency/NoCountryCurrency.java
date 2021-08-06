package com.judell.playground.country_and_currency;

import java.util.Currency;
import java.util.Locale;

public class NoCountryCurrency {

    public static void main(String[] args) {
        String[] countries = Locale.getISOCountries();

        for (String country : countries) {
            Locale locale = new Locale("en", country);
            Currency currency = Currency.getInstance(locale);

            if (currency == null) {
                System.out.println(locale.getISO3Country());
                System.out.println(locale.getCountry());
                System.out.println(locale.getDisplayCountry());
                System.out.println("--------------------------------");
            }
        }
    }
}
