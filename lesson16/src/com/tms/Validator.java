package com.tms;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;

public class Validator {
    public static void main(String[] args) {
        String filename = "src/com/tms/text.xml";
        String schemaname = "src/com/tms/text.xsd";
        String longname = "log.txt";
        Schema schema = null;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory factory = SchemaFactory.newInstance(language);
        try {
            schema = factory.newSchema(new File(schemaname));
            SAXParserFactory spf = SAXParserFactory.newInstance();

            spf.setSchema(schema);
            SAXParser parser = spf.newSAXParser();
            parser.parse(filename, new CheckingSchemas(longname));
            System.out.println(filename + " is valid");
        } catch (ParserConfigurationException | IOException e) {
            System.err.println(filename + "config error: " + e.getMessage());
        } catch (SAXException e) {
            System.err.println(filename + "SAX error: " + e.getMessage());
        }
    }
}
