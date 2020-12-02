package galacom;

import com.fs.starfarer.api.BaseModPlugin;

import galacom.board.GalacomBoard;

public class GalacomMod extends BaseModPlugin {

    @Override
    public void onNewGame() {
        init();
    }

    @Override
    public void onGameLoad(boolean newGame) {
        init();
    }

    private void init() {
        GalacomBoard.getInstance();
    }
}