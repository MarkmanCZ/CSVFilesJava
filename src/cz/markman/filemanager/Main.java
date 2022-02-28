package cz.markman.filemanager;

public class Main {

    public static void main(String[] args) {
        FileManager flm = new FileManager("test.csv", "UTF-8");
        //flm.writeFile();
        flm.readFile();
    }

}