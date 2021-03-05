import com.bridgelabz.moodanalyzerproblem.Moodanalyser;
import com.bridgelabz.moodanalyzerproblem.MoodanalyserException;
import org.junit.jupiter.api.Test;

public class MoodanalyserTest {

    Moodanalyser mood;


    @Test
    public void testSadMood() throws MoodanalyserException {

        mood = new Moodanalyser("");

        System.out.println(mood.analyseMood());


    }
}