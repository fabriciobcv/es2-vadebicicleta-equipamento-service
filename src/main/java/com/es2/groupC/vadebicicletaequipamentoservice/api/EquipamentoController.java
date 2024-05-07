package com.es2.groupC.vadebicicletaequipamentoservice.api;

import com.es2.groupC.vadebicicletaequipamentoservice.dto.input.*;
import com.es2.groupC.vadebicicletaequipamentoservice.dto.output.RespostaPadraoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EquipamentoController {

    @PostMapping("/bicicleta/aluguel")
    public ResponseEntity<RespostaPadraoDTO> alugarBicicleta(@RequestBody AlugarBicicletaDTO dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/bicicleta/devolucao")
    public ResponseEntity<RespostaPadraoDTO> devolverBicileta(@RequestBody DevolverBicicletaDTO dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/tranca/{id-tranca}/liberacao-tranca")
    public ResponseEntity<RespostaPadraoDTO> liberarTranca(@PathVariable(name = "id-tranca") String idTranca,
                                                           @RequestBody LiberarTrancaDto dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/tranca/{id-tranca}/travamento-tranca")
    public ResponseEntity<RespostaPadraoDTO> travarTranca(@PathVariable(name = "id-tranca") String idTranca,
                                                          @RequestBody TravarTrancaDto dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/bicicleta/inclusao-bicicleta")
    public ResponseEntity<RespostaPadraoDTO> incluirBicicleta(@RequestBody InclusaoBicicletaDto dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/bicicleta/retirada-bicicleta")
    public ResponseEntity<RespostaPadraoDTO> retirarBicicleta(@RequestBody RetirarBicicletaDto dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/tranca/inclusao-tranca")
    public ResponseEntity<RespostaPadraoDTO> incluirTranca(@RequestBody IncluirTrancaDto dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/tranca/retirada-tranca")
    public ResponseEntity<RespostaPadraoDTO> retirarTranca(@RequestBody RetirarTrancaDto dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/bicicleta/{id-bicicleta}/atualizacao-status")
    public ResponseEntity<RespostaPadraoDTO> atualizarStatusBicicleta(@PathVariable(name = "id-bicicleta") String idBicicleta,
                                                                      @RequestBody AtualizarStatusBicicletaDto dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }

    @PostMapping("/tranca/{id-tranca}/atualizacao-status")
    public ResponseEntity<RespostaPadraoDTO> atualizarStatusTranca(@PathVariable(name = "id-tranca") String idTranca,
                                                                   @RequestBody AtualizarStatusTrancaDto dto){
        return ResponseEntity.ok(new RespostaPadraoDTO());
    }
}
