import java.io.*;
import java.net.URL;

public class Main {
    //read file

    /*
     public static void main(String[] args) {
         try{
             FileInputStream fileInputStream = new FileInputStream("C:\\Users\\admin\\Desktop\\NIIT\\html.txt");
             int i = 0;
             while ((i = fileInputStream.read()) != -1){
                 System.out.print((char) i);
             }
             fileInputStream.close();
     } catch (Exception e){
             System.out.println("file not found");
         }
     }
 }

     */

    //Change file to another folder or another disk

  /*  public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\admin\\Documents\\Zalo Received Files\\IMG_7478.jpg");
            OutputStream fileOutputStream = new FileOutputStream(("C:\\Users\\admin\\Downloads\\dep trai va khoai to.jpg"));
            int i = 0;
            while ((i = fileInputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            fileOutputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }*/

    //buffer reader
   /* public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("C:\\Users\\admin\\Desktop\\NIIT\\html.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }*/

    //download file in Internet
    public static void main(String[] args) {
        try{
        String imagePath = "https://hoanghamobile.com/tin-tuc/wp-content/uploads/2023/07/anh-dep-thien-nhien-2-1.jpg";
        URL url = new URL(imagePath);

        BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\admin\\Pictures\\anh dep.jpg");
        int i = 0;
        while ((i = bufferedInputStream.read()) != -1){
            fileOutputStream.write(i);

        }
        fileOutputStream.flush();

        bufferedInputStream.close();
        fileOutputStream.close();
    } catch (Exception e){
        System.out.println("flie not found");
    }
    }
    }
