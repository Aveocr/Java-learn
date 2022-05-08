package com.example.App.work6;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

// Класс для записи в файл
public class Write2File {
    public void write(String fileName, String text, boolean append) {
        try(FileWriter writer = new FileWriter(fileName, append))
        {
            writer.append(text);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
