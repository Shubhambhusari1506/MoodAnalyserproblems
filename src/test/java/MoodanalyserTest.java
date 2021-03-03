import com.bridgelabz.moodanalyzerproblem.Moodanalyser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodanalyserTest {

    Moodanalyser mood;

    @Test
    public void testSadMood() {

        mood = new Moodanalyser(null);

        System.out.println(mood.analyseMood());

    }
}