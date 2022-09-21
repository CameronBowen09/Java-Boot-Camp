/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book8.Chapter1;

/**
 *
 * @author User
 */
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;

public class FilerVisiter
{
    public static void main(String[] args)
    {
        Path start = Paths.get("c:\\Windows\\System32"); //→9
        MyFileVisitor visitor = new MyFileVisitor();// →10
        try
        {
            Files.walkFileTree(start, visitor); //→13
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    private static class MyFileVisitor extends SimpleFileVisitor <Path> //→21
    {
        public FileVisitResult visitFile(Path file, //→23
        BasicFileAttributes attr)
        {
            System.out.println(file.toString());
            return FileVisitResult.CONTINUE; //→27
        }
        public FileVisitResult visitFileFailed(Path file, //→30
        BasicFileAttributes attr)
        {
            System.out.println(file.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
        public FileVisitResult preVisitDirectoryFailed //→36
        (Path dir, IOException e)
        {
            System.out.println(dir.toString() + " COULD NOT ACCESS!");
            return FileVisitResult.CONTINUE;
        }
    }
}
