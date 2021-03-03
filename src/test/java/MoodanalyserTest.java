import com.bridgelabz.moodanalyzerproblem.Moodanalyser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodanalyserTest {

    Moodanalyser mood;

    @Test
    public void testSadMood(){

        mood = new Moodanalyser(null);

        System.out.println(mood.analyseMood());

    }
    @Test
    public void testHappyMood(){
        mood = new Moodanalyser("I am in Happy mood");
        System.out.println(mood.analyseMood());
    }
}