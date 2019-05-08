package com.example.tldhandler;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDT extends SimpleTagSupport {

    String color;
    String size;


    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void doTag() throws JspException, IOException //render custom tag
    {
        JspWriter out = getJspContext().getOut();
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        if (color != null)

            out.write(String.format("<span style='color:%s; font-size:%s;'>%s</span>", color, size, ft.format(dNow)));
        else
            out.write(String.format("<span>%s</span>", ft.format(dNow)));

    }
}

