package com.example.quiz;

public class Questions {


    public String ques[]={
            "Who is the PrimeMinsiter Of India ?",
            "Who is the President Of India ?",
            "Who is the CheifMinster Of TamilNadu ?"
    };
    private String choice[][]={
            {"ManmohanSingh","NarendraModi"},
            {"SusmaSwaraj","RamNathGovindh"},
            {"EPS","OPS"}


    };
    private String correct[]={"NarendraModi","RamNathGovindh","EPS"};


    public String getQuestion(int a)
    {
        String question=ques[a];
                return question;
    }

    public String getChoice1(int a)
    {
        String cho=choice[a][0];
        return cho;
    }

    public String getChoice2(int a)
    {
        String cho=choice[a][1];
        return cho;
    }
    public String getCorrectAnswer(int a)
    {
        String answer=correct[a];
        return answer;
    }
}
