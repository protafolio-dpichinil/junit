package cl.dpichinil.test.junit.controller;

import cl.dpichinil.test.junit.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/operations")
@RestController
public class CalculatorController {
    CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService){
        this.calculatorService = calculatorService;
    }

    @GetMapping("sum")
    public int sum(int number1, int number2){
        return calculatorService.suma(number1, number2);
    }

    @GetMapping("deduct")
    public int deduct(int number1, int number2){
        return calculatorService.resta(number1, number2);
    }

    @GetMapping("multiply")
    public int multiply(int number1, int number2){
        return calculatorService.multiplica(number1, number2);
    }

    @GetMapping("divide")
    public int divide(int number1, int number2){
        return calculatorService.divide(number1, number2);
    }
}
