package com.example.demo2;

import org.apache.commons.lang3.StringUtils;

public class LevelQuest {
    private final String question;
    private LevelQuest nextLevelQuestIfAnswerOne;
    private LevelQuest nextLevelQuestIfAnswerTwo;

    private final String answerOne;
    private final String answerTwo;

    public LevelQuest(String quest, String answerOne, String answerTwo) {
        this.question = quest;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
    }

    public String getQuestion() {
        return question;
    }

    public LevelQuest getNextLevel(String answer) {
        if (StringUtils.equals(answer, answerOne)) {
            return nextLevelQuestIfAnswerOne;
        } else {
            return nextLevelQuestIfAnswerTwo;
        }
    }

    public void addNextLevels(LevelQuest levelQuestOne,LevelQuest levelQuestTwo) {
        nextLevelQuestIfAnswerOne = levelQuestOne;
        nextLevelQuestIfAnswerTwo = levelQuestTwo;
    }



    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }
}
