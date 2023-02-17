import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        FileWriter fileWriter = null;
        try {
            inputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\FileReadWrite\\Test1\\test11");
            int i,count = 0;
            int index = 0;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char)i);
                if((char)i == 'a' || (char)i == 'e' || (char)i == 'o' || (char)i == 'u' || (char)i == 'i') {
                    count++;
                }
            }
            System.out.println();
            char[] arrayA = new char[count];
            inputStream = new FileInputStream("C:\\Users\\Admin\\IdeaProjects\\FileReadWrite\\Test1\\test11");
            while ((i = inputStream.read()) != -1) {
                if((char)i == 'a' || (char)i == 'e' || (char)i == 'o' || (char)i == 'u' || (char)i == 'i') {
                    arrayA[index] = (char) i;
                    index++;
                }
            }
            String str = String.copyValueOf(arrayA);
            fileWriter = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\FileReadWrite\\Test1\\test12_1");
            fileWriter.write(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
