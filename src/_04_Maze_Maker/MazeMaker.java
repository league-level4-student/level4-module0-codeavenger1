package _04_Maze_Maker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	
	private static Maze maze;
	
	private static Random randGen = new Random();
	private static Stack<Cell> uncheckedCells = new Stack<Cell>();
	
	
	public static Maze generateMaze(int w, int h){
		width = w;
		height = h;
		maze = new Maze(width, height);
		
		//4. select a random cell to start
		int randX;
		int randY;
		
	    randX = randGen.nextInt(5);
		randY = randGen.nextInt(5);
		
		
		
		//5. call selectNextPath method with the randomly selected cell
		selectNextPath(maze.getCell(randX, randY));
		
		return maze;
	}

	//6. Complete the selectNextPathMethod
	private static void selectNextPath(Cell currentCell) {
		//A. mark cell as visited
		currentCell.hasBeenVisited();
		
		//B. check for unvisited neighbors using the cell
		ArrayList<Cell> list = getUnvisitedNeighbors(currentCell);
		
		//C. if has unvisited neighbors,
		if (list.size()>0) {
			
			//C1. select one at random.
			Cell neighbor = list.get(randGen.nextInt(list.size()));
			list.get(randGen.nextInt(list.size()));
	
			//C2. push it to the stack
			uncheckedCells.push(neighbor);
			//C3. remove the wall between the two cells
			removeWalls(currentCell, neighbor);
			//C4. make the new cell the current cell and mark it as visited
			Cell newCell = currentCell;
			currentCell.hasBeenVisited();
			//C5. call the selectNextPath method with the current cell
			selectNextPath(currentCell);
			}
			
		//D. if all neighbors are visited
		if (list.size()==0) {
			
			//D1. if the stack is not empty
			if (uncheckedCells.isEmpty()==false) {
				
				// D1a. pop a cell from the stack
				currentCell = uncheckedCells.pop();
				// D1b. make that the current cell
				
				// D1c. call the selectNextPath method with the current cell
				selectNextPath(currentCell);
		
				}

			}
		
	}

	//7. Complete the remove walls method.
	//   This method will check if c1 and c2 are adjacent.
	//   If they are, the walls between them are removed.
	private static void removeWalls(Cell c1, Cell c2) {
		if (c1.getX()-c2.getX()==1) {
			c1.setWestWall(false);
			c2.setEastWall(false);
		}
		
		if (Math.abs(c1.getX()-c2.getX())==1 && Math.abs(c1.getY()-c2.getY())==1) {
		
		}
		
	}
	
	//8. Complete the getUnvisitedNeighbors method
	//   Any unvisited neighbor of the passed in cell gets added
	//   to the ArrayList
	private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
		return null;
	}
}
