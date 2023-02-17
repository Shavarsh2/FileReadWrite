import java.io.*;

public class Main3 {
    public static void main(String[] args) {
        InputStream inputStream = null;
        FileReader fileReader = null;
        String[] arr = null;
        try {
            String s;
            fileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\FileReadWrite\\Test1\\test13_1");
            int i;
            int count = 0;
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((s = bufferedReader.readLine()) != null){
                arr = s.split(" ");
            }
            //int k = 1;
            for(int j = 0;j < arr.length;j++){
                for (int k = j + 1; k < arr.length; k++) {
                    if(arr[j].equals(arr[k])){
                        count++;
                        System.out.println(arr[j]);
                        arr[k] = "o";
                    }
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
