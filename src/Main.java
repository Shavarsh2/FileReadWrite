import java.io.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = null;
        FileWriter myWriter = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\FileReadWrite\\Test1\\test11");
            int i,count = 0;
            int index = 0;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char)i);
                if((char)i == 'a') {
                    count++;
                }
            }
            System.out.println();
            char[] arrayA = new char[count];
            inputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\FileReadWrite\\Test1\\test11");
            while ((i = inputStream.read()) != -1) {
                if((char)i == 'a') {
                    arrayA[index] = (char) i;
                    index++;
                }
            }
            String str = String.copyValueOf(arrayA);
            myWriter = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\FileReadWrite\\Test1\\test12_1");
            myWriter.write(str);
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                myWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}