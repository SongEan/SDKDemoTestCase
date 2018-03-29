import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Test {

    public String getDevice_Name() throws IOException, InterruptedException {
        String[] cmds = {"/bin/sh", "-c", "adb devices | awk '{print $1}'"};
        Process pro = Runtime.getRuntime().exec(cmds);
        pro.waitFor();
        InputStream in = pro.getInputStream();
        BufferedReader read = new BufferedReader(new InputStreamReader(in));
        String line = null;
        while ((line = read.readLine()) != null) {
            System.out.println(line);
        }
        return line;
    }


    public static void main(String[] args) throws Exception {

        Test test=new Test();
        System.out.println("获取devicesName:"+test.getDevice_Name());
    }
}