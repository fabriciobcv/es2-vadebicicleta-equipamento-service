package com.es2.groupC.vadebicicletaequipamentoservice.dto.input;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class IncluirTrancaDto {
    private String numeroTranca;
    private String numeroTotem;
}
