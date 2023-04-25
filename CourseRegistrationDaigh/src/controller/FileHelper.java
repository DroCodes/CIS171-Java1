package controller;
import java.util.ArrayList;

/**  
* Deon Daigh - dmdaigh
* CIS171 23355
* Apr 19, 2023
* MacOS 13.2
*/
public interface FileHelper {
	public boolean doesAFileExist( );
	public boolean writeFile(ArrayList<?> list);
	public ArrayList<?> readFile( );
}
