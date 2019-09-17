package game;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;


import game.Enumeration.PlayerNum;

public class GhostData {
	// to get sizing for arrays - to be fixed later
	GameMap g = new GameMap();

	private String name;
	private int speed, startx, starty;
	private int maxMapSize = (g.getHeight() * g.getWidth());

	Map<Integer, Point> path = new HashMap<Integer, Point>();
	private Point startPath, goalPosition;

	public GhostData(String name, int speed, int startx, int starty) {
		this.name = name;
		this.speed = speed;
		this.startx = startx;
		this.starty = starty;
	}

	public void PathFinding() {
		//this code needs to be moved but just for testing purposes im putting it here for now
		PlayerData p1 = new PlayerData(PlayerNum.PLAYER_ONE, 10, 8);
		
		//setting x and y locations
		startPath.setLocation(this.startx, this.starty);
		goalPosition.setLocation(p1.getX(), p1.getY());
		
		//starting the path
		path.put(0, startPath);
		
		//initialiisng arrays
		Point[] cameFrom = new Point[maxMapSize];
		Point[] costSoFar = new Point[maxMapSize];
		
		while(path.size() != 0) {
			
			Point currentPosition = path.get(0);
			
				if (currentPosition == goalPosition) {
					break;
				}
			
			
		}
		
	}

	// getters and setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getStartX() {
		return this.startx;
	}

	public void setStartX(int startx) {
		this.startx = startx;
	}

	public int getStartY() {
		return this.starty;
	}

	public void setStartY(int starty) {
		this.starty = starty;
	}

}
