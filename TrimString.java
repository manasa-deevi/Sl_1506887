package ex2;

import java.util.ArrayList;
import java.util.List;

public class TrimString {
	
	public static List<String> stringTrimmer(List<String> strings)
	{
		List<String> newList=new ArrayList<String>();
		for (String string : strings) {
			newList.add(string.trim());
		}
		return newList;
	}
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Manasa A ");
		list.add(" Hari  ");
		list.add("  Sanvi  ");
		
		List<String> trimmedList=TrimString.stringTrimmer(list);
		
		for (String string : trimmedList) {
			System.out.println(string);
		}
		
		
	}

}
