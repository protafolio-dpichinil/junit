package cl.dpichinil.test.junit.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

/**
 * Est import debe realizarse como estatico
 */
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
public class CalculatorServiceTest {
    private CalculatorService calculatorService;

    /**
     * metodo ejecutado al inicio de la clase antes de las anotaciones
     * @BeforeEach
     * @Test
     * solo se ejecuta 1 vez
     */
    @BeforeAll
    public static void BeforeAll(){
        log.info("======= inicio Test clase CalculatorService =======");
    }

    /**
     * Metodo ejecutado despues de los metodos marcados con la anotaciones
     * @BeforeAll
     * @BeforeEach
     * @Test
     * @AfterEach
     */
    @AfterAll
    public static void AfterAll(){
        log.info("======= Fin Test clase CalculatorService =======");
    }

    /**
     * Medodo ejecutado ANTES de la ejecucion de un metodo marcado con la anotacion
     * @Test
     */
    @BeforeEach
    public void BeforeEach(){
        log.info("------- inicio metodo test -------------");
        this.calculatorService = new CalculatorService();
    }

    /**
     * Metodo ejecutado DESPUES de un metodo marcado con la anotacion
     * @Test
     */
    @AfterEach
    public void AfterEach(){
        log.info("------- final metodo test -------------");
    }

    @Test
    public void testSuma(){
        int expected = 10;
        int result = calculatorService.suma(5,5);
        assertEquals(expected, result);
    }

    @Test
    public void testResta(){
        int expected = 5;
        int result = calculatorService.resta(8,3);
        assertEquals(expected, result);
    }

    @Test
    public void testMultiplicacion(){
        int expected = 15; // 3 * 5 = 15
        int resultado = calculatorService.multiplica(3,5);
        assertEquals(expected, resultado);
    }

    @Test
    public void testDivicion(){
        int expected = 3; // 15 * 5 = 3
        int resultado = calculatorService.divide(15,5);
        assertEquals(expected, resultado);
    }

    @Test
    public void testDivicionPorCero(){
        assertThrows(ArithmeticException.class, () -> {
            calculatorService.divide(15,0);
        }, "No es posible una division por cero");
    }
}
