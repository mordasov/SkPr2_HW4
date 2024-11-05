package pro.sky.democalculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.democalculator.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalcService calcService;

    public CalculatorController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping
    public String greeting() {
        return "Добро пожаловать в кулькулятор";
    }

    @GetMapping(path = "/plus")
    public String plusNum(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " + " + b + " = " + calcService.plusNum(a, b);
    }

    @GetMapping(path = "/minus")
    public String minusNum(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " - " + b + " = " + calcService.minusNum(a, b);
    }

    @GetMapping(path = "/multiply")
    public String multiplyNum(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return a + " * " + b + " = " + calcService.multiplyNum(a, b);
    }

    @GetMapping(path = "/divide")
    public String divideNum(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        if (b != 0) {
            return a + " / " + b + " = " + calcService.divideNum(a, b);
        } else {
            return "На ноль делить запрещено";
        }
    }
}
