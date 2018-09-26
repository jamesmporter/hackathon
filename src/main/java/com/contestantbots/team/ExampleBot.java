package com.contestantbots.team;

import com.contestantbots.util.GameStateLogger;
import com.scottlogic.hackathon.game.Bot;
import com.scottlogic.hackathon.game.GameState;
import com.scottlogic.hackathon.game.Move;

import java.util.ArrayList;
import java.util.List;

public class ExampleBot extends Bot {
    @Override
    public List<Move> makeMoves(final GameState gameState) {
        GameStateLogger.process(getId(), gameState);
        return new ArrayList<>();
    }

    @Override
    public String getDisplayName() {
        return "Example Bot";
    }
}
