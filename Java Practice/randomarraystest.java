public class randomarraystest {
	
	public static void main(String[] args){
		randomarrays tool = new randomarrays();
		int[][] x, y, z;
		int size;
		
		if (args.length==0)
			size = 5;
		else
			size = Integer.parseInt(args[0]);
		
		x = tool.makeArray(size);
		y = tool.makeArray(size);
		z = tool.makeArray(size);
		tool.zeroArray(z);
		
		for (int i = 0; i < z.length; i++)
			for (int j = 0; j < z[i].length; j++)
				z[i][j] = x[i][j] + y[i][j];
		
		System.out.println("2D Array X:");
		tool.display(x);
		System.out.println();
		System.out.println("2D Array Y:");
		tool.display(y);
		System.out.println();
		System.out.println("2D Array Z:");
		tool.display(z);
		System.out.println();
	}

}