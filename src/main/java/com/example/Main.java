package com.example;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        XMLconverter ahah = new XMLconverter();
        try{
        ahah.deserialize_to_java();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
	}
}
