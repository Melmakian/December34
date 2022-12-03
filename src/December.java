import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class December {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int z = 0;
        while (fileInputStream.available()>0){
            if (fileInputStream.read()==44){
                z++;
            }
        }
        System.out.println(z);
        fileInputStream.close();
        reader.close();
    }
}
