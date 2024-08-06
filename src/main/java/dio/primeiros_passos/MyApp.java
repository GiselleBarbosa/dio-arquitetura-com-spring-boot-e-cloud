package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        try {
            System.out.println("Carregando...");
            Thread.sleep(5000);
            System.out.println("RESULTADO = " + calculadora.somar(2, 2));
            System.out.println("Finalizado!");
        } catch (InterruptedException e) {
            System.err.println("Ocorreu uma interrupção!");
        }
    }
}
