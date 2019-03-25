package rocks.zipcode.io.quiz3.objectorientation.enums;

import jdk.internal.util.xml.impl.ReaderUTF8;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    // make enums for the game.
    ROCK,
    PAPER,
    SCISSOR;



    public RockPaperScissorHandSign getWinner() {

        if (this == ROCK) {
            return PAPER;
        } else if (this == PAPER) {
            return SCISSOR;
        }else
            return ROCK;

    }

    public RockPaperScissorHandSign getLoser() {
        if (this == ROCK) {
            return SCISSOR;
        } else if (this == PAPER) {
            return ROCK;
        }else
            return PAPER;

    }
}
