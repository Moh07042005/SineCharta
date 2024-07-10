import SC_Core_Engine.dev.GameAction;
import SC_Core_Engine.dev.HandleDevInput;

/**
 * GameHandler handles the different GameStates
 */
public class GameHandler {
    static GameEngine game;

    public static void main(String[] args) {
        game = new GameEngine();
        GameAction action = HandleDevInput.promptForGameStart();

        if (action == GameAction.NEW_GAME) {
            game.createNewGame();
        } else if (action == GameAction.LOAD_GAME) {
            game.loadExistingGame();
        }

    }
}