package com.nix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {
    final static Logger logger = LoggerFactory.getLogger(MainTest.class);
    Director director;
    ReportBuilder reportBuilder;
    @Before
    public void before()
    {
        director = new Director();
        reportBuilder = new ReportBuilder();

    }

    @Test
    public void checkMilitaryBodyTest()
    {
        director.constructMilitary(reportBuilder);
        Report reportMilitary = reportBuilder.getResult();
        Assert.assertEquals("You are going to military", reportMilitary.body.body);
        logger.info("testing military report");
    }

    @Test
    public void checkExpulsionTest()
    {
        director.constructExpulsion(reportBuilder);
        Report reportExpulsion = reportBuilder.getResult();
        Assert.assertEquals("This is expulsion document", reportExpulsion.body.body);
        logger.info("testing expulsion report");
    }
}
