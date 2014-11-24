/**
 * This is the code for Homework Problem #17 on page 280.
 * 
 * @author (Josh Ross) 
 * @version (11-09-14)
 */
public class FileValidator
{
    public static String validFileName(String fileName)
    {
        fileName = fileName.toUpperCase();
        if (fileName.indexOf(':') != -1 || fileName.indexOf('?') != -1 
        || fileName.indexOf('*') != -1)
        {
                return null;
        }
        
        if (fileName.indexOf('.') != -1)
        {
            String test = fileName.substring(0,fileName.indexOf('.'));
            int length_test = (test.length()) - 1;
            if (length_test > 8)
            {
                return null;
            }
            String post_test = fileName.substring(fileName.indexOf('.'));
            int length_post_test = (post_test.length()) - 1;
            if (length_post_test > 3)
            {
                return null;
            }
            
            else if (length_post_test == 0)
            {
                return fileName.substring(0,fileName.indexOf('.'));
            }
        }    
        
        if (fileName.indexOf('.') == -1)
        {
            if (fileName.length() > 8)
            {
                return null;
            }
            
            else
            {
                fileName = fileName + ".TXT";
            }
        }
        return fileName;
    }
}
