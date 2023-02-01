import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {
    private final long[] testCase = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void checkSumSales() {
        int actual = new StatsService().sumSales(testCase);
        int expected = 180;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void checkAvgSales() {
        double actual = new StatsService().avgSales(testCase);
        double expected = 15.0;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void checkMaxSales() {
        int actual = new StatsService().maxSales(testCase);
        int expected = 8;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void checkMinSales() {
        int actual = new StatsService().minSales(testCase);
        int expected = 9;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void checkLessAvgSales() {
        int actual = new StatsService().numLessAvgSales(testCase);
        int expected = 5;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void checkMoreAvgSales() {
        int actual = new StatsService().numMoreAvgSales(testCase);
        int expected = 5;

        assertEquals(expected, actual);
    }
}
