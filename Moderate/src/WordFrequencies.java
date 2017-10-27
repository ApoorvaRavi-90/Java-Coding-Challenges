import java.util.*;
public class WordFrequencies {
	int wordFreq(String[] book,String word)
	{
		int count=0;
		word=word.trim().toLowerCase();
		for(String w: book)
		{
			if(w.trim().equals(word))
			{
				count++;
			}
		}
		return count;
	}
	
	HashMap<String,Integer> storeFreq (String[] book)
	{
		HashMap<String,Integer> dict = new HashMap<String,Integer>();
		for(String w:book)
		{
			w=w.toLowerCase();
			if(w.trim()!="")
			{
				if(!dict.containsKey(w))
				{
					dict.put(w,0);
				}
				else
				{
					dict.put(w,dict.get(w)+1);
				}
			}
		}
		return dict;
		
	}
	int getFreq(String word, HashMap<String,Integer> dict)
	{
		if (dict==null||word==null)
			{
			return -1;
			}
		word=word.toLowerCase();
		if (dict.containsKey(word)){
			return dict.get(word);
		}
		 return 0;
	}

}
