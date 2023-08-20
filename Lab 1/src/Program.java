/**
 * @author Senzo Nkosi
 * @version 1.0
 */
import java.util.Scanner;

public class Program {
	
	public static void drawSnake(String snakeLine, int snakeNumber, int[][] matrix) {
		String[] pointsStr = snakeLine.split(" ");
        for (int i = 0; i < pointsStr.length - 1; i++) {
            drawLine(matrix, pointsStr[i], pointsStr[i + 1], snakeNumber);
        }
	}
	public static void drawLine(int[][] matrix, String point1, String point2, int snakeNumber) {
		String[] coords1 = point1.split(",");
        String[] coords2 = point2.split(",");

        int x1 = Integer.parseInt(coords1[0]);
        int y1 = Integer.parseInt(coords1[1]);
        int x2 = Integer.parseInt(coords2[0]);
        int y2 = Integer.parseInt(coords2[1]);

        int minX = Math.min(x1, x2);
        int maxX = Math.max(x1, x2);
        int minY = Math.min(y1, y2);
        int maxY = Math.max(y1, y2);

        for (int x = minX; x <= maxX; x++) {
            for (int y = minY; y <= maxY; y++) {
                matrix[y][x] = snakeNumber;
            }
        }
	}
	
	public static void printBoard(final int[][] myBoard, int width, int height) {
		
		for(int i=0; i < width; i++) {
			for(int j=0; j < height; j++) {
				System.out.print(myBoard[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}
	
	public static void main(String[] args) {
		
		int numberOfSnakes, width, height, fouthNumber;
		
		final int FOUTH_NUMBER = 1;
		
		Scanner inn = new Scanner(System.in);
		numberOfSnakes = inn.nextInt();
		width = inn.nextInt();
		height = inn.nextInt();
		fouthNumber = inn.nextInt();
		inn.nextLine();
		
		
		if(fouthNumber==FOUTH_NUMBER) {
			int[][] board = new int[height][width];
		
			for (int snakeNumber = 1; snakeNumber <= numberOfSnakes; snakeNumber++) {
	            String snakeLine = inn.nextLine();
	            drawSnake(snakeLine, snakeNumber, board);
	        }
			inn.close();
			printBoard(board,width, height);
		}
		else {
			System.out.println("Fourth number is always 1");
		}
	}

}
