package Lab9FilesIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1
        File file = new File("files/text.txt");
        System.out.println(textFileToStringList(file));

        //2
        //writeStringToFile("Java programming language", "files/modifiedText.txt");
        String stringToFile = "Java is a high-level, class-based, object-oriented programming language©Wiki";
        writeStringToFile(stringToFile, "files/modifiedText.txt");

        //3
        mergeFiles("files/text.txt", "files/modifiedText.txt", "files/mergedFile.txt");

        //4
        replaceCharacters("files/text.txt", "files/replaced.txt");
    }

    //1
    public static List<String> textFileToStringList(File textFile) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(textFile))) {
            String input;
            while ((input = reader.readLine()) != null) {
                list.add(input);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    //2
    public static void writeStringToFile(String string, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(string);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //3
    public static void mergeFiles(String firstFilePath, String secondFilePath, String resultFilePath) {
        // Add first file
        try (BufferedReader reader = new BufferedReader(new FileReader(firstFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(resultFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        // Append second file
        try (BufferedReader reader = new BufferedReader(new FileReader(secondFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(resultFilePath, true))) {  //append arg
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //4
    public static void replaceCharacters(String inputPath, String outputPath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = line.replaceAll("[^a-zA-Zа-яА-ЯёЁ0-9]", "\\$");
                writer.write(processedLine);
                writer.newLine();
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}