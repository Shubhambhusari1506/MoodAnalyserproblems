import com.bridgelabz.moodanalyzerproblem.Moodanalyser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodanalyserTest {

    Moodanalyser mood;

    @BeforeEach
    public void objectMethod(){

        mood = new Moodanalyser();

    }

    @Test
    public void testSadMood(){

        System.out.println(mood.analyseMood("I am in sad mood"));

    }

}
