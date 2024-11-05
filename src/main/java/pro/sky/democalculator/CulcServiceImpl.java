package pro.sky.democalculator;

import org.springframework.stereotype.Service;

@Service
public class CulcServiceImpl implements CalcService {

    public int plusNum(int a, int b) {
        return a + b;
    }

    public int minusNum(int a, int b) {
        return a - b;
    }

    public int multiplyNum(int a, int b) {
        return a * b;
    }

    public int divideNum(int a, int b) {
        return a / b;
    }
}
