package com.learning.productservices.java.Advance.Stream.StreamAPI;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Sale {
    private String product;
    private LocalDate date;
    private int amount;
}
