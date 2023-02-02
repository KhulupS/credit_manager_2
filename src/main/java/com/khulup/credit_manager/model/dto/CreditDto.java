package com.khulup.credit_manager.model.dto;

import com.khulup.credit_manager.entities.Credit;
import lombok.Data;

@Data
public class CreditDto {
    private int id;
    private String creditName;
    private Long creditValue;

    public static CreditDto from(Credit credit) {
        CreditDto creditDto = new CreditDto();
        creditDto.setId(credit.getId());
        creditDto.setCreditName(creditDto.getCreditName());
        creditDto.setCreditValue(creditDto.getCreditValue());
        return creditDto;
    }
}
