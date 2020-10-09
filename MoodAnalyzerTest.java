package MoodAnalyzer;

import static org.junit.Assert.*;
import org.junit.Test;


public class MoodAnalyzerTest {


@Test
public void Analyze_Happy_Shoul_return_Happy_Mood() {

	MoodAnalyzer moodAnalyzer = new  MoodAnalyzer();

	String mood = moodAnalyzer.moodAnalyze_Sad("I am in Happy Mood");
	 assertSame("Please check the method in main", "HAPPY", mood);
	}
}


