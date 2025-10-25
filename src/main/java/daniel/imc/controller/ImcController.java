package daniel.imc.controller;

import daniel.imc.dto.ImcRequestDto;
import daniel.imc.dto.ImcResponseDto;
import daniel.imc.service.ImcService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/imc")
public class ImcController {

    private final ImcService imcService;

    public ImcController(ImcService imcService){
        this.imcService = imcService;
    }

    @PostMapping("/calcular")
    public ResponseEntity<ImcResponseDto> calcular(@RequestBody ImcRequestDto request){
        return ResponseEntity.ok(imcService.calcularImc(request));
    }

}
