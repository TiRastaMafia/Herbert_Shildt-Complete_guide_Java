import java.io.*;

class BRReadLines {
    public static void main(String[] args) throws IOException {
        //Создать объект BufferedRaeder, используя System.in
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in, System.console().charset()));
        String str;
        System.out.println("Please input some text\n. For break input STOP");
        do{
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("STOP"));
    }
}
