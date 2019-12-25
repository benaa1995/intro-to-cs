
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] r1 = {3, 6, 5, 6}  ;
		int [] r2 ={1,2,4};
		Array a1=new Array(r1);
		Array a2=new Array(r2);
		System.out.println(a1.isPrefix(a2));
		System.out.println(a1.isSuffix(a2));
		Array z= a1.longestCommonSuffix(a2);
	    System.out.println(a1.uniteWith(a2));
		//System.out.println(a1.removeSub(a2));	
		
		}

}
