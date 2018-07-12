package com.track;

/**
 * Hello world!
 *
 */
public class App 
{  
	public static String convert(String st ){
		String res ="";
        // st ="hellothereiam.";
       //  st = st.replaceAll("()([A-Z])","$1 $2");
       // System.out.println(s);*/
        String []words=st.split(" ");
        for(String word : words){
        	//if(word.length()>0)
        	//System.out.println(word);
        	res  += Character.toUpperCase(word.charAt(0))+word.substring(1);// + " ";
        	
        }
      //  System.out.println(res);
		return res;
		
	}
    public static void main( String[] args )
    { //"";
    	String r = "hello there ib am";
    	String f=App.convert(r);
    	//r=convert(r);
    	System.out.println(f);
    }
}
