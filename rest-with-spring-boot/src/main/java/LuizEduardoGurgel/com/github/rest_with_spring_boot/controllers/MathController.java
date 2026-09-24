package LuizEduardoGurgel.com.github.rest_with_spring_boot.controllers;

import LuizEduardoGurgel.com.github.rest_with_spring_boot.exception.UnsupportedMathOperationException;
import LuizEduardoGurgel.com.github.rest_with_spring_boot.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static LuizEduardoGurgel.com.github.rest_with_spring_boot.request.converters.NumberConverter.convertToDouble;
import static LuizEduardoGurgel.com.github.rest_with_spring_boot.request.converters.NumberConverter.isNumberic;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    // math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumberic(numberOne) || !isNumberic(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sum(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    // math/subtraction/3/5
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumberic(numberOne) || !isNumberic(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.subtraction(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    // math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumberic(numberOne) || !isNumberic(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.division(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    // math/multiplication/3/5
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumberic(numberOne) || !isNumberic(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.multiplication(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    // math/average/3/5
    @RequestMapping("/average/{numberOne}/{numberTwo}")
    public Double average(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumberic(numberOne) || !isNumberic(numberTwo))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.average(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    // math/sqrRoot/3
    @RequestMapping("/sqrroot/{number}")
    public Double sqrRoot(
            @PathVariable("number") String number
    ) throws Exception {
        if(!isNumberic(number))
            throw new UnsupportedMathOperationException("Please set a numeric value");
        return math.sqrRoot(convertToDouble(number));
    }

}
