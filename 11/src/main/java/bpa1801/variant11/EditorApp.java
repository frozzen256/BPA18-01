package bpa1801.variant11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import bpa1801.variant11.editor.Buffer;
import bpa1801.variant11.editor.Figure;
import bpa1801.variant11.editor.FigureFactory;

public class EditorApp 
{

    private static final Scanner scanner = new Scanner(System.in);

    private static final Buffer buffer = new Buffer();

    public static void main(String[] args) throws IOException {
        System.out.println("Specify scene file");
        String file = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while (line != null) {
                Figure figure = FigureFactory.deserialize(line);
                if (figure != null) {
                    buffer.add(figure);
                } else {
                    System.out.println(String.format("Wrong figure line: %s", line));
                }
                line = reader.readLine();
            }
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(String.format("Loaded scene with %d figure(s)", buffer.size()));
    }
}
