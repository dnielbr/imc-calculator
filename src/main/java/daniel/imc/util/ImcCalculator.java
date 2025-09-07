package daniel.imc.util;

import org.springframework.stereotype.Component;

@Component
public class ImcCalculator {

    public static double calcularAlturaCm(double alturaM){
        return alturaM * 100;
    }

    public static double calcularPesoIdeal(double alturaCm, double pesoKg){
        return (alturaCm - 100) - (((alturaCm - pesoKg)/4) * (5.0/100));
    }

    public static double calcularImc(double pesoKg, double alturaM){
        return pesoKg / Math.pow(alturaM, 2);
    }

    public static String interpretarImc(double imc){
        if (imc < 20) return "Abaixo do Peso";
        if (imc < 25) return "Normal";
        if (imc <= 30) return "Acima do peso";
        return "Obeso";
    }

}
