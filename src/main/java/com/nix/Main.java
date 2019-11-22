package com.nix;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {
    final static Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {


        Director director = new Director();
        ReportBuilder reportBuilder = new ReportBuilder();

        director.constructExpulsion(reportBuilder);
        Report reportExpulsion = reportBuilder.getResult();
        logger.info("created reportExpulsion");

        director.constructMilitary(reportBuilder);
        Report reportMilitary = reportBuilder.getResult();
        logger.info("created reportMilitary");
    }

}
