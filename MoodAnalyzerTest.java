package MoodAnalyzer;

import static org.junit.Assert.*;
import org.junit.Test;


public class MoodAnalyzerTest {

@Test
public void Analyze() {

	MoodAnalyzer moodAnalyzer = new  MoodAnalyzer();

	String mood = moodAnalyzer.moodAnalyze_Sad("I am in Any Mood");
	 assertSame("Please check the method in main", "HAPPY", mood);
	}
}


