import java.io.*;
import java.net.URL;

public class List {
    public static void main(String[] args) {
        readImg();

        downloadImg();
    }

    public static void readImg() {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\admin\\java\\list_img.txt");
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }

    public static void downloadImg() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\admin\\java\\list_img.txt"));
            String imgUrl;
            int count = 1;

            while ((imgUrl = bufferedReader.readLine()) != null) {
                try {
                    URL url = new URL(imgUrl);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                    FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\admin\\java\\downloaded_image_" + count + ".jpg");

                    int i = 0;
                    while ((i = bufferedInputStream.read()) != -1) {
                        fileOutputStream.write(i);
                    }

                    bufferedInputStream.close();
                    fileOutputStream.flush();
                    System.out.println("Downloaded: " + imgUrl);
                    count++;
                } catch (Exception e) {
                    System.out.println("Failed to download image: " + imgUrl);
                }
            }

            bufferedReader.close();
        } catch (Exception ex) {
            System.out.println("File not found");
        }
    }
}