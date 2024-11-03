import csYa_ronny.PairFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PairFinderTest {
    @Test
    public void testFindPairWithSum() {
        PairFinder pairFinder = new PairFinder();
        int[] array = {1, 2, 3, 4, 5};
        int target = 9;

        // הציפייה שהזוג {4, 5} יוחזר
        int[] result = pairFinder.findPairWithSum(array, target);
        assertArrayEquals(new int[]{4, 5}, result);
    }
}
