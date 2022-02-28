package cz.markman.filemanager;

import java.io.*;

public class FileManager {

    private InputStreamReader flreader;
    private OutputStreamWriter flwriter;

    private BufferedReader bfreader;
    private BufferedWriter bfwriter;

    private String fileName;
    private String charSet;

    public FileManager(String name, String chars) {
        this.fileName = name;
        this.charSet = chars;
    }

    protected void readFile() {
        try {
            flreader = new InputStreamReader(new FileInputStream(fileName), charSet);
            bfreader = new BufferedReader(flreader);

            String line;

            try {
                while ((line = bfreader.readLine()) != null) {
                    String[] values = line.split(",");
                    System.out.println("Policy ID: " + values[0] + " State code: " + values[0]);
                }
                bfreader.close();
            }catch (IOException ex) {
                ex.printStackTrace();
            }

        }catch (FileNotFoundException | UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }

    protected void writeFile() {
        try {
            flwriter = new OutputStreamWriter(new FileOutputStream(fileName), charSet);
            bfwriter = new BufferedWriter(flwriter);

            try {
                //

                bfwriter.close();
            }catch (IOException ex) {
                ex.printStackTrace();
            }
        }catch (FileNotFoundException | UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }

}