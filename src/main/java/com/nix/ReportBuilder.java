package com.nix;

public class ReportBuilder implements Builder{
    private Header header;
    private Footer footer;
    private Body body;


    @Override
    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public void setHeader(Header header){
        this.header = header;
    }

    @Override
    public void setFooter(Footer footer) {
        this.footer = footer;
    }

    public Report getResult(){
        return new Report(header, body, footer);
    }
}
