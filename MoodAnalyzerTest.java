package MoodAnalyzer;

import static org.junit.Assert.*;
import org.junit.Test;


public class MoodAnalyzerTest {

@Test
public void Analyze_Happy() {

	MoodAnalyzer moodAnalyzer = new  MoodAnalyzer();

	try {
		String mood = moodAnalyzer.moodAnalyze();
		assertSame("Please provide valid details, dont provide null", mood);
	} 
	catch (MoodAnalysisException e) {
		e.getMessage();
	}

}

@Test
public void Analyze_Empty() {

	MoodAnalyzer moodAnalyzer = new  MoodAnalyzer();

	try {
		String mood = moodAnalyzer.moodAnalyze();
		assertSame("Please provide valid details, dont provide empty", mood);
	} 
	catch (MoodAnalysisException e) {
		e.getMessage();
	}

}

}
