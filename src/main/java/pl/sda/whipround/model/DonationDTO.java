package pl.sda.whipround.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class DonationDTO {

    String name;
    BigDecimal value;
    String message;
    int whiproundId;

}
