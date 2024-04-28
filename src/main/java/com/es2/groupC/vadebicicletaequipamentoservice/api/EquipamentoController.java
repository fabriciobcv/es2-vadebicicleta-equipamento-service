package com.es2.groupC.vadebicicletaequipamentoservice.api;

import com.es2.groupC.vadebicicletaequipamentoservice.dto.input.*;
import com.es2.groupC.vadebicicletaequipamentoservice.dto.output.RespostaPadraoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EquipamentoController {

    @PostMapping("/alugueis")
    public ResponseEntity<RespostaPadraoDTO> alugarBicicleta(@RequestBody AlugarBicicletaDTO dto){
        return  ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PatchMapping("/alugueis/{numeroBicicleta}")
    public ResponseEntity<RespostaPadraoDTO> devolverBicileta(@PathVariable String numeroBicicleta,
                                                              @RequestBody DevolverBicicletaDTO dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PatchMapping("/trancas/{numeroTranca}/bicicletas")
    public ResponseEntity<RespostaPadraoDTO> incluirBicicleta(@PathVariable String numeroTranca,
                                                              @RequestBody ManejarBicicletaDTO dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PatchMapping("/totens/{numeroTotem}/trancas")
    public ResponseEntity<RespostaPadraoDTO> incluirTranca(@PathVariable String numeroTotem,
                                                           @RequestBody ManejarTranca dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }
}
