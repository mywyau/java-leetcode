package dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import dsa.binary_trees.BFSTraversals;

class BFSTraversalsSpec {

    BFSTraversals bfsTraversals = new BFSTraversals();

    @Test
    void testDemoTreeProduces123456() {
        String result = bfsTraversals.bfs();
        assertEquals("123456", result);
    }

}
