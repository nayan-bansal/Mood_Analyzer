package MoodAnalyzer;


public class MoodAnalyzer {

private String message;


public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public String moodAnalyze() throws MoodAnalysisException {
	
	try {
	if(message.contains("Sad"))
		return "SAD";
	else
		return "HAPPY";
	}
	catch(NullPointerException e){
		throw new MoodAnalysisException("Please provide valid arguements, not null arguements");
	}
}

}
