package net.erickcaron.mybudget.currency;

import org.springframework.http.HttpStatus;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CurrencyErrorControllerAdvice {

    @ExceptionHandler(JpaSystemException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public String JpaHandleException() {
        return "/in/currencies/JpaSystemExceptionDisplaying";
    }
}
