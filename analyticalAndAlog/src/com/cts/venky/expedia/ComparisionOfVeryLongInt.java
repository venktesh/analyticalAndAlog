package com.cts.venky.expedia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class ComparisionOfVeryLongInt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al= new ArrayList();
		al.add("1119898778796787786786786785646549436459659596596569465496964451");
		al.add("2222984645654656596598559655965958859859659659586556526559965592");
		al.add("3334655469565652656596596569569569569596596555596596559659659633");
		al.add("4449565665565566556566526599522259995559955995595959955959955944");
		al.add("5965954959596559659595959545596226596256659696252962535295595555");
		al.add("6696596595959523295923529523259629593265956236529956259996559666");
		al.add("7779895526295235295952329523629523295625495652295462599599999977");
		al.add("8887878787898967676786767867867676776767867678676787644546646888");
		al.add("8995959595295952695295929529299922999299292929992219897498948888");
		al.add("2564945945994594594594494494494444944949454941218498499449442222");
		al.add("11145454562123484565666549854056458421415948151515515414514154311");
		  al=new ArrayList( new HashSet(al));
		Collections.sort(al, new VeryLongIntegerStringSorting());
	    
		Iterator<String> i= al.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
			
		}
	
	}
}
 class VeryLongIntegerStringSorting   implements Comparator
{
	public int compare(Object num1, Object num2) {
		if(num1.toString().length()<num2.toString().length())
		{
			return 1;
		}
		else if(num1.toString().length()>num2.toString().length())
		{
			
			return -1;
		} 
		else if(num1.toString().length()==num2.toString().length())
		{
		char[] no1=num1.toString().toCharArray();
		char[] no2=num2.toString().toCharArray();
		for  (int i=0; i<no1.length;i++)
		{
			
		if(	Integer.parseInt(""+no1[i])<Integer.parseInt(""+no2[i]))
		{
			return -1;
		}
		else if(Integer.parseInt(""+no1[i])>Integer.parseInt(""+no2[i]))
		{
			return 1;
			
		}
		else if (Integer.parseInt(""+no1[i])==Integer.parseInt(""+no2[i]))
		{
			return 0;
			
		}
		}
			return 0;
		}
		return 0;
	}
	






}
