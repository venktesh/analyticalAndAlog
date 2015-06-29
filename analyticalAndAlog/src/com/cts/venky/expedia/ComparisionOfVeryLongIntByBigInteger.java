package com.cts.venky.expedia;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ComparisionOfVeryLongIntByBigInteger {
	 
    public static void main(String[] args) {
           // TODO Auto-generated method stub

           String  myArray[]=ComparisionOfVeryLongIntByBigInteger.readFromFile();
           BigInteger myBigInt[]=ComparisionOfVeryLongIntByBigInteger.convertArrayToBigInteger(myArray);
           int numberofTopEliment=5;
           ComparisionOfVeryLongIntByBigInteger.getMeTopEliment(myBigInt, numberofTopEliment);
          
}
   
public static BigInteger[] convertArrayToBigInteger(String  myArray[])
{
BigInteger myBigInt[]= new BigInteger[myArray.length];
   
    int i=0;
    for (String s: myArray)
    {
           myBigInt[i]=new BigInteger(s);
           i++;
    }
   
    return myBigInt;
}



public static String [] readFromFile()
{
    String  myArray[]= new String  [10];
    myArray[0]="897123489728913478";
    myArray[1]="902813490234901845";
    myArray[2]="89372459082349085908";
    myArray[3]="897123489728913478";
    myArray[4]="8971234897289134789234908590234858923405908";
    myArray[5]="897123489789072158908234908528913478";
    myArray[6]="8971234897289134789048329082349058";
    myArray[7]="09821390485902384897123489728913478";
    myArray[8]="00000000000000000000000000000000000000000000000000000000000000000000020000";
    myArray[9]="89728913923485908234905890238490589023859089023484598890723145908902348587092348590858478";
return myArray;
}

public static void  getMeTopEliment(BigInteger myBigInt[],int numberofTopEliment)
{

       List<BigInteger> al= Arrays.asList(myBigInt);
       List <BigInteger>al2= new ArrayList<BigInteger>(new HashSet<BigInteger>(al));
       Collections.sort(al2);
       Collections.reverse(al2);
       int j=1;
     
       for(BigInteger bi: al2)
       {
              System.out.println(bi);
       if(j==numberofTopEliment)
       {
              break;
       }
       j++;
       }
      


}

}