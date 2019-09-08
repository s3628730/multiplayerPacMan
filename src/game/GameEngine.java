package game;

import game.interfaces.GameEngineInterface;

public class GameEngine implements GameEngineInterface {

	GameMap map = new GameMap();
	Player player = new Player();
	Ghost ghost = new Ghost();
	
	
	//update game state
	public void updategameState(GameState gameState) {
		gameState.update();
	}
	
	
	public void movementUpdateX() {
		/* for (GameObject gameObject : gameObjects) {
		 * 	if (gameObject.getPosX > 1 && gameObject.getPosX < 10 && curDirection == RIGHT) {
		 * 		gameObject.setPosX(getPosX += 1)
		 * 		}
		 *  if else (gameObject.getPosX > 1 && gameObject.getPosX < 10 && curDirection == LEFT) {
		 * 		gameObject.setPosX(getPosX -= 1)
		 * 		}
		 * }
		 * 
		 */
	}
	
	public void movementUpdateY() {
		/* for (GameObject gameObject : gameObjects) {
		 * 	if (gameObject.getPosY > 1 && gameObject.getPosY < 10 && curDirection == DOWN) {
		 * 		gameObject.setPosY(getPosY += 1)
		 * 		}
		 *  if else (gameObject.getPosY > 1 && gameObject.getPosY < 10 && curDirection == UP) {
		 * 		gameObject.setPosY(getPosY -= 1)
		 * 		}
		 * }
		 * 
		 */
	}
