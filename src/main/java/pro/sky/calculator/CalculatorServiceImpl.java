package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }
}
