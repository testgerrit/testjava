//---------------------------------------------------------------------
//id					date			version				changes
//fellipe.c.moreira		02-Jan-2012		1.0					first version
//---------------------------------------------------------------------
import java.io.*;

public class Ping {
	public static void main(String[] args){
        try {
        	         	
            Runtime rt = Runtime.getRuntime();
            Process pr = rt.exec("c:\\Windows\\System32\\ping");

            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            String line=null;      

            while((line=input.readLine()) != null) {
                System.out.println(line);
            }

            int exitVal = pr.waitFor();
            System.out.println("Exited with error code "+exitVal);

        } catch(Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
	}
}
