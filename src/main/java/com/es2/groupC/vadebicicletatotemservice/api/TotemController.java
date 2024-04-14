package com.es2.groupC.vadebicicletatotemservice.api;

import com.es2.groupC.vadebicicletatotemservice.dto.input.ColocarNaTrancaDTO;
import com.es2.groupC.vadebicicletatotemservice.dto.input.IncluirTrancaDTO;
import com.es2.groupC.vadebicicletatotemservice.dto.input.RetirarDaTrancaDTO;
import com.es2.groupC.vadebicicletatotemservice.dto.output.RespostaPadrao;
import com.es2.groupC.vadebicicletatotemservice.dto.output.RetirarTrancaDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/operacao")
public class TotemController {
    @PostMapping("/retirar-da-tranca")
    public ResponseEntity<RespostaPadrao> retirarBicicleta(@RequestBody RetirarDaTrancaDTO dto){
        return ResponseEntity.ok(new RespostaPadrao());
    }

    @PostMapping("/colocar-na-tranca")
    public ResponseEntity<RespostaPadrao> colocarBicicleta(@RequestBody ColocarNaTrancaDTO dto){
        return ResponseEntity.ok(new RespostaPadrao());
    }

    @PostMapping("/totens/{numeroTotem}/incluir-tranca")
    public ResponseEntity<RespostaPadrao> incluirTranca(@PathVariable String numeroTotem, @RequestBody IncluirTrancaDTO dto){
        return ResponseEntity.ok(new RespostaPadrao());
    }

    @PostMapping("/totens/{numeroTotem}/retirar-tranca")
    public ResponseEntity<RespostaPadrao> retirarTranca(@PathVariable String numeroTotem, @RequestBody RetirarTrancaDTO dto){
        return ResponseEntity.ok(new RespostaPadrao());
    }
}
