package com.javarush.quest.shaposhnikov.Levels;

import org.apache.commons.lang3.StringUtils;

public class LevelQuest {
    private final String question;

    private LevelQuest nextLevelQuestIfAnswerOne;
    private LevelQuest nextLevelQuestIfAnswerTwo;

    private boolean isDefeat;

    private final String answerOne;
    private final String answerTwo;

    private String pathToImage;

    public LevelQuest(String quest, String answerOne, String answerTwo) {
        this.question = quest;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
    }

    public LevelQuest(String quest) {
        this.question = quest;
        this.answerOne = null;
        this.answerTwo = null;
    }

    public void markAsDefeated() {
        isDefeat = true;
    }

    public boolean isDefeat() {
        return isDefeat;
    }


    public String getQuestion() {
        return question;
    }

    public LevelQuest getNextLevel(String answer) {
        if (StringUtils.equals(answer, answerOne)) {
            return nextLevelQuestIfAnswerOne;
        } else if (StringUtils.equals(answer, answerTwo)) {
            return nextLevelQuestIfAnswerTwo;
        } else {
            return null;
        }
    }

    public void addNextLevels(LevelQuest levelQuestOne, LevelQuest levelQuestTwo) {
        nextLevelQuestIfAnswerOne = levelQuestOne;
        nextLevelQuestIfAnswerTwo = levelQuestTwo;
    }

    public void addImageForLevel(String pathToImage) {
        this.pathToImage = pathToImage;
    }


    public String getAnswerOne() {
        return answerOne;
    }

    public String getAnswerTwo() {
        return answerTwo;
    }

    public String getPathToImage() {
        return pathToImage;
    }
}
