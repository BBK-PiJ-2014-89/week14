import java.util.ArrayList;
import java.util.List;


public class Anagram {
	ArrayList<String> anagramList=null;
	
	public static List<String> getAnagram(String string){
		if (string.length() == 1) {
            List<String> result = new ArrayList<String>();
            result.add(string);
            return result;
        }else{
        	
        	List<String> anagram=new ArrayList<String>();
        	for(int i=0;i<string.length();i++){
        		List<String> anagramSub=getAnagram(string.substring(1));
        		for(int j=0;j<anagramSub.size();j++){
        			anagram.add(string.charAt(0)+anagramSub.get(j));
        		}
        		string=string.substring(1)+string.charAt(0);
        	}
        	return anagram;
        }
	}
	
	public static void main(String[] args) {
		System.out.println(getAnagram("cat"));
	}

}
