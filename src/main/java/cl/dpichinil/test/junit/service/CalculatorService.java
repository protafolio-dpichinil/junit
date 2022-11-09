package cl.dpichinil.test.junit.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CalculatorService {
    private final String LOG_NUMBERS = "datos de la operacion %s: { num1: %d num2: %d }";
    private final String LOG_RESULT = "el resultado de la operacion %s es %d";


    public int suma(int number1, int number2) {
        String operacion = "suma";
        log.info(String.format(this.LOG_NUMBERS, operacion, number1, number2));
        int result = number1 + number2;
        log.info(String.format(this.LOG_RESULT, operacion, result));
        return result;
    }

    public int resta(int number1, int number2) {
        String operacion = "resta";
        log.info(String.format(this.LOG_NUMBERS, operacion, number1, number2));
        int result = number1 - number2;
        log.info(String.format(this.LOG_RESULT, operacion, result));
        return result;
    }

    public int divide(int number1, int number2) {
        String operacion = "division";
        log.info(String.format(this.LOG_NUMBERS, operacion, number1, number2));
        int result = number1 / number2;
        log.info(String.format(this.LOG_RESULT, operacion, result));
        return result;
    }

    public int multiplica(int number1, int number2) {
        String operacion = "multiplicacion";
        log.info(String.format(this.LOG_NUMBERS, operacion, number1, number2));
        int result = number1 * number2;
        log.info(String.format(this.LOG_RESULT, operacion, result));
        return result;
    }

}
