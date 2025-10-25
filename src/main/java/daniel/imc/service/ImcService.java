package daniel.imc.service;

import daniel.imc.dto.ImcRequestDto;
import daniel.imc.dto.ImcResponseDto;
import daniel.imc.util.ImcCalculator;
import org.springframework.stereotype.Service;

@Service
public class ImcService {

    public ImcResponseDto calcularImc(ImcRequestDto request){

        double alturaCm = ImcCalculator.calcularAlturaCm(request.altura());
        double pesoIdeal = ImcCalculator.calcularPesoIdeal(alturaCm, request.peso());
        double imc = ImcCalculator.calcularImc(request.peso(), request.altura());
        String interpretacao = ImcCalculator.interpretarImc(imc);

        return new ImcResponseDto(imc,interpretacao, pesoIdeal);
    }
}
