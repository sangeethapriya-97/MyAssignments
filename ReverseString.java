package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String name= "TestLeaf";
     char[] result=name.toCharArray();
     
     for(int i=result.length-1; i>=0; i--)
     {
    	 System.out.println(result[i]);
     }

}
}