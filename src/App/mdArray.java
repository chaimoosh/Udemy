package App;

public class mdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] grid = {
				{3, 6,56667},
				{4, 76545, 666646, 55},
				{54, 87, 55}
		};
		
		System.out.println(grid[1][2]);
		
		String [][] texts = new String[2][3];
		System.out.println(texts[1][2]);
		
		for (int i = 0; i < grid.length; i++) {
			for (int k = 0; k < grid[i].length; k++) {
				System.out.print(grid[i][k] + "\t");
			}
		}
	}

}
