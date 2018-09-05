package com.capgemini.ftp;

import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@RequestMapping("/move")
	public String move() throws IOException
    {
        Path temp = Files.move
        (Paths.get("D:\\test\\a\\demo.txt.txt"), 
        Paths.get("D:\\test\\b\\xxx.txt"));
 
        if(temp != null)
        {
            System.out.println("File renamed and moved successfully");
            return "File renamed and moved successfully";
        }
        else
        {
            System.out.println("Failed to move the file");
            return "Failed to move the file";
        }
        
    }
	
	@RequestMapping("/copy")
	public String copy() throws IOException
    {
        Path temp = Files.copy
        (Paths.get("D:\\test\\a\\copy.txt"), 
        Paths.get("D:\\test\\b\\copy.txt"));
 
        if(temp != null)
        {
            System.out.println("File copied successfully");
            return "File copied successfully";
        }
        else
        {
            System.out.println("Failed to copy the file");
            return "Failed to copy the file";
        }
        
    }
	
	@RequestMapping("/delete")
	public String delete() throws IOException
    {
		 File file = new File("D:\\test\\a\\copy.txt");
		 boolean b= file.delete();
 
        if(b)
        {
            System.out.println("File deleted successfully");
            return "File deleted successfully";
        }
        else
        {
            System.out.println("Failed to del the file");
            return "Failed to del the file";
        }
        
    }
}
