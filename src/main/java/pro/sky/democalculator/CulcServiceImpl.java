package pro.sky.democalculator;

import org.springframework.stereotype.Service;

@Service
public class CulcServiceImpl implements CalcService {

    public String greeting() {
        return "Добро пожаловать в кулькулятор";
    }

    public String plusNum(int a, int b) {
        int result = a + b;
        return a + " + " + b + " = " + result;
    }

    public String minusNum(int a, int b) {
        int result = a - b;
        return a + " - " + b + " = " + result;
    }

    public String multiplyNum(int a, int b) {
        int result = a * b;
        return a + " * " + b + " = " + result;
    }

    public String divideNum(int a, int b) {
        if (b != 0) {
            int result = a / b;
            return a + " / " + b + " = " + result;
        } else
            return "На ноль делить запрещено!";
    }
}
