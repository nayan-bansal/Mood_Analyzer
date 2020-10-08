
package MoodAnalyzer;


public class MoodAnalyzer {

private String message;


public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String moodAnalyze_Sad(String message) {
	if(message.contains("Sad"))
		return "SAD";
	else
		return "HAPPY";
}

}
