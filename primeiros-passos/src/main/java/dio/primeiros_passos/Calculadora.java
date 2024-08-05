package dio.primeiros_passos;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
    public int somar(int numero1, int numero2){
      var resultado = numero1 + numero2;
        return resultado;

    }
}
