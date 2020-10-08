package MoodAnalyzer;

import static org.junit.Assert.*;
import org.junit.Test;


public class MoodAnalyzerTest {


@Test
public void Analyze_Sad_Shoul_return_Sad_Mood() {

	MoodAnalyzer moodAnalyzer = new  MoodAnalyzer();

	String mood = moodAnalyzer.moodAnalyze_Sad("I am in Sad Mood");
	 assertSame("Please check the method in main", "SAD", mood);
	}
}


