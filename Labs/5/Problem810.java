// JA: There is something wrong with this logic
public class Problem810 {

	public static void main(String[] args) {
		// John Kendrat CMPT 220
        //If number in index, add one to number in column and number in row
		int numberincolumn1 = 0;
		int numberincolumn2 = 0;
		int numberincolumn3 = 0;
		int numberincolumn4 = 0;
		int numberinrow1 = 0;
		int numberinrow2 = 0;
		int numberinrow3 = 0;
		int numberinrow4 = 0;
		int [][] matrix;
		matrix = new int[4][4];
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				double random = Math.random() * 50 - 1;
				if(random < 25){
					matrix[i][j] = 1;
				} else{
					matrix[i][j] = 0;
				}
			
			}
		}
		System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2] + " " + matrix[0][3]);
		System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2] + " " + matrix[1][3]);
		System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2] + " " + matrix[2][3]);
		System.out.println(matrix[3][0] + " " + matrix[3][1] + " " + matrix[3][2] + " " + matrix[3][3]);
		for(int i = 0; i < 4; i++){
			if(matrix[i][0] == 1){
				numberinrow1++;
				numberincolumn1++;
				numberincolumn2++;
				numberincolumn3++;
				numberincolumn4++;
			} else if(matrix[i][1] == 1){
				numberinrow2++;
				numberincolumn1++;
				numberincolumn2++;
				numberincolumn3++;
				numberincolumn4++;
			} else if(matrix[i][2] == 1){
				numberinrow2++;
				numberincolumn1++;
				numberincolumn2++;
				numberincolumn3++;
				numberincolumn4++;
			} else if(matrix[i][3] == 1){
				numberinrow3++;
				numberincolumn1++;
				numberincolumn2++;
				numberincolumn3++;
				numberincolumn4++;
			} 
		
		
		}
	if(numberincolumn1 > numberincolumn2 && numberincolumn1 > numberincolumn3 && numberincolumn1 > numberincolumn4){
		System.out.println("The largest column index is column 1");
	} else if(numberincolumn2 > numberincolumn1 && numberincolumn2 > numberincolumn3 && numberincolumn2 > numberincolumn4){
		System.out.println("The largest column index is column 2");
	} else if(numberincolumn3 > numberincolumn2 && numberincolumn3 > numberincolumn1 && numberincolumn3 > numberincolumn4){
		System.out.println("The largest column index is column 3");
	} else if(numberincolumn4 > numberincolumn2 && numberincolumn4 > numberincolumn3 && numberincolumn1 > numberincolumn1){
		System.out.println("The largest column index is column 4");
	} else{
		System.out.println("There is no greatest column.");
	}
		
	if(numberinrow1 > numberinrow2 && numberinrow1 > numberinrow3 && numberinrow1 > numberinrow4){
		System.out.println("The largest row index is row 1");
	} else if(numberinrow2 > numberinrow1 && numberinrow2 > numberinrow3 && numberinrow2 > numberinrow4){
		System.out.println("The largest row index is row 2");
	} else if(numberinrow3 > numberinrow2 && numberinrow3 > numberinrow1 && numberinrow3 > numberinrow4){
		System.out.println("The largest row index is row 3");
	} else if(numberinrow4 > numberinrow2 && numberinrow4 > numberinrow3 && numberinrow1 > numberinrow1){
		System.out.println("The largest row index is row 4");
	} else{
		System.out.println("There is no greatest row.");
	}
		
	}

}
