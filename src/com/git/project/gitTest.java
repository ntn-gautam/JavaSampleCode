package com.git.project;

public class gitTest {

	public static void main(String[] args) {
		
//	    ********************************************************************************

//      //Reverse an array without taking another array

//

//      int[] a = new int[] {1,2,3,4,5,6,7,8,9,10};

//      int temp = 0;

//      for(int i=0;i<a.length/2;i++) {

//            temp=a[i];

//            a[i]=a[(a.length-1)-i];

//            a[(a.length-1)-i]=temp;

//           

//      }

//      System.out.println(Arrays.toString(a));

//

//**********************************************************************************

       

//      //Shorting an array

//     

//      int[] a = {5,4,1,10,7};

//      int temp = 0;

//      for(int i=0;i<a.length;i++) {

//            for(int j=i+1;j<a.length;j++) {

//                   if(a[i]>a[j]) {

//                          temp=a[i];

//                          a[i]=a[j];

//                          a[j]=temp;

//                   }

//            }

//           

//      }

//System.out.println(Arrays.toString(a));

//     

//***********************************************************************************           

       

//      //Convert String into an character array

//     

//      String s1 = "Nitin";

//      char[] c1 = new char[s1.length()] ;

//      for(int i=0;i<s1.length();i++) {

//            c1[i]=s1.charAt(i);

//      }

//      System.out.println(Arrays.toString(c1));

//     

//**********************************************************************************

       

        //Palindrome

       

       

//      String s1 = "Rahul";

//      String s2 = "";

//      s1=s1.toLowerCase();

//      for(int i=s1.length()-1;i>=0;i--) {

//            s2+=s1.charAt(i);

//      }

//      if(s2.equals(s1)) {

//            System.out.println("Palindrome");

//      }else {

//            System.out.println("Not a Palindrome");

//      }

//     

//      xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        //Checking Palindrome using characters

       

//      String s3 ="NiTIn";

//      s3=s3.toLowerCase();

//      boolean a =true;

//      for(int i=0;i<s3.length()/2;i++) {

//      if(s3.charAt(i)!=s3.charAt((s3.length()-1)-i)){

//            a=false;

//            break;

//      }     

//      }

//      if(a) {

//            System.out.println("Palindrome");

//      }else {

//            System.out.println("Not a Palindrome");

//      }

//     

//      ***********************************************************************************

       

       

//      //Reverse a Sentence

//     

//      String s1 = " Hi This is Nitin ";

//      String s2 ="";

//      String[] s3 = s1.split(" ");

//      for(int i=s3.length-1;i>=0;i--) {

//            s2=s2+" "+s3[i];

//            s2=s2.trim();

//           

//      }

//      System.out.println(s2);

//     

//      xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

       

//      //Reverse a Sentence as well as the word

//      String inputString = "This is Rahul";

//  String[] words = inputString.split(" ");

//  String reverseString = "";

// 

//  for (int i = 0; i < words.length; i++)

//  {

//      String word = words[i];

//     

//      String reverseWord = "";

//     

//      for (int j = word.length()-1; j >= 0; j--)

//      {

//          reverseWord = reverseWord + word.charAt(j);

//      }

//      System.out.println(reverseString = reverseString + reverseWord + " ");

//    

//  }

// 

//***************************************************************************************** 

       

        //Find Duplicate element in an Array

       

       

        int[] a = {2,3,4,2,4,2,4,2,4};

        for(int i=0;i<a.length;i++) {

              

               for(int j=i+1;j<a.length;j++) {

              

               if(a[i]==a[j]) {

                     System.out.println(a[i]+" ");   

               }

        }

        }

       

//      *****************************************************************************************

       

       
		
		
	}

}
