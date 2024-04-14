package com.es2.groupC.vadebicicletatotemservice.dto.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class RetirarDaTrancaDTO {
    private String numeroTranca;
    private Integer codOperacao;
}
