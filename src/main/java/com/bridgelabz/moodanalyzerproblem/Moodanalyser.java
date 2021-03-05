package com.bridgelabz.moodanalyzerproblem;

public class Moodanalyser {

    public String message;
    public Moodanalyser(String message) {

        this.message = message;

    }
    public String analyseMood() throws MoodanalyserException {

        try {
            if(message == (null)){
                throw new MoodanalyserException("Invalid mood");
            }
            return message.contains("sad") ? "SAD" : "HAPPY";

        }
        catch (MoodanalyserException e) {
            return "Exception got handled";

        }

    }


}


