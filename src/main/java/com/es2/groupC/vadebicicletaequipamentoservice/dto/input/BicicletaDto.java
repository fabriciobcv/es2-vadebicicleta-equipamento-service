package com.es2.groupC.vadebicicletaequipamentoservice.dto.input;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BicicletaDto {
    private String numero;
    private String marca;
    private String modelo;
    private String ano;
    private String status;
    private String localizacao;
}