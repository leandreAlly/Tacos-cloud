package com.tacos;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import java.util.ArrayList;
import java.util.List;

@Data
public class Order {
    @NotBlank(message = "delivery Name is required")
    private String deliveryName;

    @NotBlank(message = "delivery Street is required")
    private String deliveryStreet;

    @NotBlank(message = "delivery City is required")
    private String deliveryCity;

    @NotBlank(message = "delivery State is required")
    private String deliveryState;

    @NotBlank(message = "Zip code is required")
    private String deliveryZip;

    @CreditCardNumber(message = "Not a valid credit card number")
    private String ccNumber;

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([2-9][0-9])$", message="Must be formatted MM/YY")
    private String ccExpiration;

    @Digits(integer = 3, fraction = 0, message = "Invalid CCV")
    private String ccCVV;

    private List<Taco> tacos = new ArrayList<>();
    public boolean addTaco(Taco taco) {
       return this.tacos.add(taco);

    }
}

