/** ****************************************************************************
 * StudentScoresInFileJUnitTest.java
 * Kevin Bell
 *
 * Objects read from files, calculate & display lowest, highest, & average score
 **************************************************************************** */
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

/**
 *
 * @author 4800590195
 */
@RunWith(Parameterized.class)
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @Parameterized.Parameter(0)
    public double lowScore;
    @Parameterized.Parameter(1)
    public double highScore;
    @Parameterized.Parameter(2)
    public double averageScore;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{
            {0, 100, 70},
            {1, 99, 75},
            {2, 98, 74},
            {3, 97, 73},
            {4, 96, 72}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testLowScore() {
        Scores scores = new Scores(lowScore);
        double actual = Scores.getLowScore(lowScore);
        double result = lowScore;
        assertEquals(result, actual, 0.01);
    } // end testLowScore method

    @Test
    public void testHighScore() {
        Scores scores = new Scores(highScore);
        double actual = Scores.getHighScore(highScore);
        double result = highScore;
        assertEquals(result, actual, 0.01);
    } // end testHighScore method

    @Test
    public void testAverageScore() {
        Scores scores = new Scores(sumOfScores, countOfScores);
        double actual = Scores.getAverageScore(sumOfScores / countOfScores);
        double result = sumOfScores / countOfScores;
        assertEquals(result, actual, 0.01);
    } // end testAverageScore method
} // end StudentScoresInFileJUnitTest class