package document;
public class Document {
    public String fileName;
    public int fileSize;
    public String fileType;

    public void initialize( String fileName, int fileSize, String fileType)
    {
        if ((fileName.length()) >= 2 && isFileName(fileName)) {

        }
    }

    public boolean isFileName(String fileName)
    {
        int isAlphabet=0;
        for(int i=0;i<=fileName.length()-1;i++)
        {
            if (fileName.charAt(i) >= 'a' && fileName.charAt(i) <= 'z'||fileName.contains(" ")) {
                isAlphabet++;
            }
        }
        if (fileName.length() == isAlphabet) {
            return true;
        }
        else {
            return false;
        }
        
    }

    
}
