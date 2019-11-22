package com.nix;

public class Report {
    private final Header header;
    private final Footer footer;
    public final Body body;

    public Report(Header header, Body body, Footer footer) {
        this.header = header;
        this.footer = footer;
        this.body = body;
    }
}
