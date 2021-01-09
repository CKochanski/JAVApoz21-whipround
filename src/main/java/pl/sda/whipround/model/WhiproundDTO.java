package pl.sda.whipround.model;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class WhiproundDTO {

    String name;
    BigDecimal goal;
    String description;

}
