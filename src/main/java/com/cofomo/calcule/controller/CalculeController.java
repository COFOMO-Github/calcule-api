package com.cofomo.calcule.controller;

import com.cofomo.calcule.services.CalculeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static com.cofomo.calcule.constants.PathConstant.CALCULE;

@RestController
@RequestMapping(CALCULE)
@RequiredArgsConstructor
public class CalculeController {

    private final CalculeService calculeService;

    @GetMapping(value = "/addition")
    public ResponseEntity<Integer> addition(@RequestParam int a, @RequestParam int b){

        return ResponseEntity.status(HttpStatus.OK).body(calculeService.addition(a,b));
    }

    @GetMapping(value = "/multiplication")
    public ResponseEntity<Integer> multiplication(@RequestParam int a, @RequestParam int b){

        return ResponseEntity.status(HttpStatus.OK).body(calculeService.multiplication(a,b));
    }

    @GetMapping(value = "/subtraction")
    public ResponseEntity<Integer> subtraction(@RequestParam int a, @RequestParam int b){

        return ResponseEntity.status(HttpStatus.OK).body(calculeService.subtraction(a,b));
    }

    @GetMapping(value = "/division")
    public ResponseEntity<Float> division(@RequestParam int a, @RequestParam int b) throws Exception {

        return ResponseEntity.status(HttpStatus.OK).body(calculeService.division(a,b));
    }

}
