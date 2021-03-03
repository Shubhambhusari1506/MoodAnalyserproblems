package com.bridgelabz.moodanalyzerproblem;

public class Moodanalyser {

    public String message;
    public Moodanalyser(String message){

            this.message = message;

        }

        public String analyseMood(){

            if (message.contains("sad")){

                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }
    }
