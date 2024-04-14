package com.es2.groupC.vadebicicletatotemservice.dto.output;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RetirarTrancaDTO {
    private String numeroTranca;
    private Integer codOperacao;
}
