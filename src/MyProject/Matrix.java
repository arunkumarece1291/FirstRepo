package MyProject;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]num= {
						{4, 5, 6},
						{7, 8, 9},
						{7, 4, 1}
					};
		int columnTotal=0;
		for(int i=0; i<num.length; i++)
		{
			columnTotal +=num [i][0];
			 columnTotal +=num [i][1];	
			 columnTotal +=num [i][2];
		}
		
		System.out.println("Sum of Each Column:" + columnTotal);
}
	
	}

