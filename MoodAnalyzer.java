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
	
	try {
	if(message.contains("Sad"))
		return "SAD";
	else
		return "HAPPY";
	}
	catch(NullPointerException e){
		return "HAPPY";
	}
}

}
