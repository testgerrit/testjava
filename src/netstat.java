import java.io.BufferedReader;
import java.io.InputStreamReader;
public class netstat {
	public static void main(String[] args){
		final String cmd = "netstat -ano";
        try {
        	         	
            Process process = Runtime.getRuntime().exec(cmd);

            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line=null;      

            while((line=input.readLine()) != null) {
                System.out.println(line);
            }
		} catch (Exception e) {
				e.printStackTrace(System.err);
		}
	}
}