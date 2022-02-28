package cz.markman.filemanager;

public class Main {

    public static void main(String[] args) {
        FileManager flm = new FileManager("C:/Users/vicha/Desktop/test.txt", "UTF-8");
        //flm.writeFile();
        flm.readFile();
    }

}