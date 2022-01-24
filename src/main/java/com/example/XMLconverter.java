package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;


/**
 * Hello world!
 *
 */
public class XMLconverter 
{   
    static final File ROOT = new File("./src/main/resources");
	static final String XML_FILE = "classe.xml";

    public ArrayList<String> openers;
    
    public XMLconverter() {
    }

    public void deserialize_to_java() throws IOException {
        File file = new File(ROOT, XML_FILE);
        XmlMapper xmlMapper = new XmlMapper();
        String xml = inputStreamToString(new FileInputStream(file));
        Root value = xmlMapper.readValue(xml, Root.class);
    }

    public String inputStreamToString(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        String line;
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        return sb.toString();
    }

}
