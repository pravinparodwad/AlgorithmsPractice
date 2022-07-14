package com.test;

public class FindOutput7 {
		public static void main(String args[]) {
			String s = new String("I am Pravin Parodwad");
			
			System.out.println(s);
			int stringLength = s.length();
			//System.out.println(stringLength);
			for(int i = stringLength-1; i>=0;i--) {
				System.out.print(s.charAt(i));
			}
			
			StringBuffer sbf = new StringBuffer(s);
			System.out.println();
			System.out.println(sbf.reverse());
			
			StringBuilder sbld = new StringBuilder(s);
			System.out.println(sbld.reverse());
			
			FindOutput7 f = new FindOutput7();
			
			System.out.println(f.rev(s));
			f.eachWordInNewLine(s);
		}
		
		String rev(String str) {
			if(str.length() == 0)
			return " ";
			return str.charAt(str.length()-1) + rev(str.substring(0,str.length()-1)); 
			}
		public void eachWordInNewLine(String str) {
			String[] temp = str.split("\\s");
			for(String st : temp) {
				System.out.println(st);
			}
		}

}

