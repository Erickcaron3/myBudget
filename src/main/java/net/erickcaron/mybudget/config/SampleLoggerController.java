package net.erickcaron.mybudget.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class SampleLoggerController {
    private final Logger logger = LoggerFactory.getLogger(SampleLoggerController.class);

}