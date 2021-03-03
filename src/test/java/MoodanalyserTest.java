import com.bridgelabz.moodanalyzerproblem.Moodanalyser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodanalyserTest {

    Moodanalyser mood;


    @BeforeEach
    public void objectMethod() {
        mood = new Moodanalyser();
    }


        @Test
    public void testSadMood(){

        System.out.println("i am sad in mood ");


    }
    @Test
    public void testHappyMood(){



        System.out.println("I am in happy mood");

    }

}
