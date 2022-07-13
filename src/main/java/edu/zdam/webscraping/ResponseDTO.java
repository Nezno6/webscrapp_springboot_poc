package edu.zdam.webscraping;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ResponseDTO {
    String title;
    String url;
    Integer bedrooms;
    BigDecimal price;
    String town;
}
