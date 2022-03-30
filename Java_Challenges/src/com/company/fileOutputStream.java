package com.company;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {
    public static <Downloads> void main(String[] args) {
        String fileContent = "Hello Everyone";
        try (FileOutputStream outputStream = new FileOutputStream("java.io") {
            byte[] strToBytes = fileContent.getBytes();
            fileOutputStream.(strToBytes);

            outputStream.close();
        }
    }
}
