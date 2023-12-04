import java.io.*;

class BRRead {
    public static void main(String[] args) throws IOException {
         c;
        BufferedReader br = new BufferedReader(new 
            InputStreamReader(System.in, System.console().charset()));
        System.out.println("To escape input QQ");
        do {
            c = (char) br.read();
            System.out.print(c);
        } while(c != 'q');
    }
}
