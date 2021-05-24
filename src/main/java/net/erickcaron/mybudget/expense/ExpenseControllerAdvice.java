package net.erickcaron.mybudget.expense;

import org.hibernate.LazyInitializationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class ExpenseControllerAdvice {

    @ExceptionHandler(LazyInitializationException.class)
    @ResponseStatus(value= HttpStatus.NOT_FOUND)
    public String handleException(){
        return "in/expenses/EntityNotFoundExceptionDisplay";
    }
}
