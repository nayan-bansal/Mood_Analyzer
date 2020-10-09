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
		if(message==null)
			throw new MoodAnalysisException("Please provide valid details, dont provide null in arguments");
		else
			throw new MoodAnalysisException("Please provide valid details, dont keep empty in arguments");
	}
}

}
