package sample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TicTacToeTest {

    /**
     * 初期ボードの状態確認テスト
     * BoardSizeTest() を参考に、TicTacToe.initalize()を実行した
     * 直後のボード内の要素が全て 'e' であることを確認するテスト。
     */
    @Test
    void initializeTest() {
        TicTacToe ttt = new TicTacToe();
        ttt.initialize();
        assertEquals(true, ttt.getTurn());
        assertEquals('e', ttt.getBoard()[0][0]);
    }

}
