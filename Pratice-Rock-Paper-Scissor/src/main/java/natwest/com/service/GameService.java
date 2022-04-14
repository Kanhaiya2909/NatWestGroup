package natwest.com.service;

import org.springframework.stereotype.Service;

import natwest.com.model.Player;
import natwest.com.model.Result;
import natwest.com.model.State;

@Service
public class GameService {
	
	public State gameState;
	
	public void evaluateMoves(Player player1, Player player2) {

        if (player1.getMove().equals(player2.getMove())) {

            player1.setResult(Result.DRAW);
            player2.setResult(Result.DRAW);
        }

        else if (player1.getMove().winsOver(player2.getMove())) {
            player1.setResult(Result.WIN);
            player2.setResult(Result.LOSE);
        }
        else {
            player2.setResult(Result.WIN);
            player1.setResult(Result.LOSE);
        }

        gameState = State.ENDED;
    }

}
