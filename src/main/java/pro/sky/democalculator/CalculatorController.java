package pro.sky.democalculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalcService calcService;

    public CalculatorController(CalcService calcService) {
        this.calcService = calcService;
    }

    @GetMapping(path = "/calculator")
    public String greeting() {
        return calcService.greeting();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusNum(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calcService.plusNum(a, b);
    }

    @GetMapping(path = "/calculator/minus")
    public String minusNum(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calcService.minusNum(a, b);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyNum(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calcService.multiplyNum(a, b);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideNum(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        return calcService.divideNum(a, b);
    }
}
