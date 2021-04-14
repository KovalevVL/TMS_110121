package com.tms;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CheckingSchemas extends DefaultHandler {
    boolean element;

    public CheckingSchemas(String longname) {
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println(qName);
        if (attributes.getLength() > 0) {
            System.out.println(attributes.getValue(0));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("/" + qName);
    }

    @Override
    public void characters(char[] ch, int start, int lenght) throws SAXException {
        String string = new String(ch, start, lenght).trim();
        if (string.length()>0){
            System.out.println(string);
        }

    }

}
