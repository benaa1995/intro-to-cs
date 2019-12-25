
public class Array {
	int [] numbers;
//We opened a place in their memory
	public Array(int [] array) {
		this.numbers = new int [array.length];
		for (int i=0;i<array.length;i++) {
			numbers [i]=array [i];
			//We have been given an array of integers and will initialize the numbers
		}
	}
	public boolean isPrefix(Array other) {
		if(this.numbers.length<=other.numbers.length) 
			return false;
		for (int i=0;i<other.numbers.length;i++) {
			if(this.numbers[i]!=other.numbers[i])
				return false;	 
		}
		return true;
		//A method that checks the first numbers each time according to the array to see if it is Prefix

	}
	public boolean isSuffix(Array other) {
        if (this.numbers.length<=other.numbers.length)
	        return false;
        for(int i=this.numbers.length-1,j=other.numbers.length-1;j>0;j--,i--) {
	    if (this.numbers[i]!=other.numbers[j])
		    return false;
         }
        return true;
        //A method that checks the last numbers each time according to the array to see if it is Suffix

	}
	public Array longestCommonPrefix(Array other) {
		int temp=0;
			for (int i=0;i<other.numbers.length;i++) { 
				if(this.numbers[i]!=other.numbers[i])
					break;
					temp++;	
				
	}
			int []longestCommonPrefix=new int[temp];
			for(int i=0;i<temp;i++)
				longestCommonPrefix[i]=this.numbers[i];
						return new Array(longestCommonPrefix);
//A method for comparing two arrays and checking the first numbers each time according to the array to see if it is Prefix			
	}
	public Array longestCommonSuffix(Array other) {
		int temp1 = 0;
		for(int i=this.numbers.length-1,j=other.numbers.length-1;j>=0;j--,i--) {
			if (this.numbers[i]!=other.numbers[j])
				break;
			    temp1++;
		}
		int []longestCommonSuffix=new int[temp1];
		for(int i=0;i<temp1;i++) {
			longestCommonSuffix[i]=other.numbers[i];
		}
		return new Array(longestCommonSuffix);
		//A method for comparing two arrays and checking the last numbers each time according to the array to see if it is Suffix
	}
	public int longestPrefixAndSuffix() {
	int temp= this.numbers.length;
	int num= 0;
	if (temp<2)
		return 0;
	
	for(int i=temp/2;i<this.numbers.length;i++) {
		if(this.numbers[i]==this.numbers[num]) 
			num++;
		}
		return num;
		//A method that checks if it is Suffix and if it is both Suffix and Proffix then it checks the largest number that meets the conditions
		
	
	}
	public Array uniteWith(Array other) {
		 int len = this.numbers.length + other.numbers.length;
	        int[] uniteWith = new int[len];
	        for(int i = 0; i < this.numbers.length; i++)
	        	uniteWith[i] = this.numbers[i];
	        for(int i = this.numbers.length, j = 0;i<len; i++, j++)
	        	uniteWith[i] = other.numbers[j];
	        return new Array(uniteWith);
	        //A method that unites the other first evaluates this and then adds the other array so that a union is created
	    }
	public void removeSub(Array other) {
			int [] remove= new int[this.numbers.length-other.numbers.length];
			boolean flag=true;
			int i=0,j=0,z=0,iLocation=0,zLocation=0;
			while(flag)
			{
				if(this.numbers[i]!=other.numbers[j])
				{
					remove[z]=this.numbers[i];
					z++;
					i++;
					if(z>=remove.length || i>=this.numbers.length)
						flag=false;
				}
				if(this.numbers[i]==other.numbers[j])//
				{
					j++;
					i++;
					if(j>=other.numbers.length || i>=this.numbers.length)
					{
						iLocation=i;
						zLocation=z;
						flag=false;
					}
				}
			}
			for(;zLocation<remove.length;zLocation++,iLocation++)
				remove[zLocation]=this.numbers[iLocation];

			numbers=remove ;
			System.out.println(new Array(numbers));
			//The method will remove from the array represented by this the array represented by other
			//Once we loop on this array and save After that we will loop on the other array and save
			//return remove = Unification of arrays, after subtraction from the array represented by this the array represented by other
		}
	public String toString() {
		String z = "{";
		for(int i=0; i<numbers.length;i++) 
			if(i!=numbers.length-1)
				z+=numbers[i]+",";
				else
					z+=numbers[i];
				return z+"}";
				//A method that arranges the input: starts and ends with curly brackets and then within the array verses
	}

	}
