import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class StationCodeFinder {
	public static String getStationName(String code)
	{
		String stnName = null;
		
		Properties prop = new Properties();
		InputStream input = null;
		
		int line = 0;
		if(code.charAt(0)=='A' || code.equalsIgnoreCase("X1") || code.equalsIgnoreCase("X2"))
			line = 1;
		else if(code.charAt(0)=='B' || code.equalsIgnoreCase("X3"))
			line = 2;
		else if(code.charAt(0)=='C')
			line = 3;
		
		try 
		{
			if(line==1)
				input = new FileInputStream("line1.properties");
			else if(line==2)
				input = new FileInputStream("line2.properties");
			else if(line==3)
				input = new FileInputStream("line3.properties");
			
			prop.load(input);
			stnName = prop.getProperty(code);

		} catch (IOException ex) {
			//ex.printStackTrace();
			stnName = "Station Code not initialized";
		} catch (NullPointerException ex) {
			//ex.printStackTrace();
			stnName = "Incorrect station Code";
		}
		finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return stnName;
	}
}
