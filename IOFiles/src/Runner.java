package IOFiles.src;

import java.io.*;

public class Runner {
    public static void ReadInputAndReverseDataToOutPutFile()throws IOException{
        FileReader in = null;
        FileWriter out =null;
        try{
            in = new FileReader("IOFiles/src/input.txt");
            out = new FileWriter("IOFiles/src/output.txt");
            //approach 1
            StringBuilder res = new StringBuilder();
            int b ;
            while ((b= in.read()) != -1){
                res.append((char)b);
            }
            res.reverse();
            int i = 0;
            while (i< res.length()){
                out.write(res.charAt(i));
                i++;
            }



        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }finally {
            if(in !=null)
                in.close();
            if(out != null)
                out.close();
        }
    }
    public static void doExit() throws IOException {
        InputStreamReader input = null;
        FileWriter out = null;
        try{
            input = new InputStreamReader(System.in);
            out = new FileWriter("IOFiles/src/output.txt");

            System.out.println("Type 'i' to exit");
            char ch ;
            do{
                ch = (char) input.read();
                out.write(ch);
            }while (ch != 'i');
        }
//        in java8 we don't need catch
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
         finally {
            if(input !=null)
                input.close();
            if(out != null)
                out.close();
        }

    }
    public static void main(String [] args) throws IOException {
//        ReadInputAndReverseDataToOutPutFile();
        doExit();
    }
}
