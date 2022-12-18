package array_Study;

public class array1 {

	public static void main(String[] args) 
	{//array program
		int [] rollnumber=new int[10];
		//array intialisation
		rollnumber[0]=10;
		rollnumber[1]=23;
		rollnumber[2]=54;
		rollnumber[3]=43;
		rollnumber[4]=22;
		rollnumber[5]=21;
		//array usage
		System.out.println(rollnumber[4]);
		System.out.println("===================================================================");
		for(int j=0;j<=5;j++)
		{
			System.out.println(rollnumber[j]);
		}
		//reverse array
		System.out.println("Print reverse array");
		for (int i=5;i>=0;i--)
		{
			System.out.println(rollnumber[i]);
		}
		//array declaration
		String name[]=new String[6];
		name[0]="Sachin";
		name[1]="Virendra";
		name[2]="Sourao";
		name[3]="Rahul";
		name[4]="Yuvraj";
		//array usage
		System.out.println("====================================================================");
		for (int i=0;i<=5;i++)
		{
			System.out.println(name[i]);
		}
		//print reverse string array
		System.out.println("Print reverse string array");
		for(int i=4;i>=0;i--)
		{
			System.out.println(name[i]);
		}

	}

}
