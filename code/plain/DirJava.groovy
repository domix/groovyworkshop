//Que *&/%$#, esto es ceremonia...
import java.io.*

public class DirJava {
	public static void main(String[] args) {
		try {
			////En windows es cmd /C dir
			Process proc = Runtime.getRuntime().exec("ls -l");
			BufferedReader result = new BufferedReader(new InputStreamReader(proc.getInputStream()));
			String line;
			while((line = result.readLine()) != null) {
				System.out.println(line);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}