package com.javarush.quest.shaposhnikov.Levels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelQuestTest {
    @Test
    void getNextLevelReturnsCorrectLevelBasedOnAnswer() {
        final String QUESTION = "Вопрос";
        final String ANSWER_ONE = "Да";
        final String ANSWER_TWO = "Нет";

        LevelQuest mainLevel = new LevelQuest(QUESTION, ANSWER_ONE, ANSWER_TWO);
        LevelQuest nextLevelIfAnswerOne = new LevelQuest(QUESTION);
        LevelQuest nextLevelIfAnswerTwo = new LevelQuest(QUESTION);

        mainLevel.addNextLevels(nextLevelIfAnswerOne, nextLevelIfAnswerTwo);

        assertEquals(nextLevelIfAnswerOne, mainLevel.getNextLevel(ANSWER_ONE));
        assertEquals(nextLevelIfAnswerTwo, mainLevel.getNextLevel(ANSWER_TWO));
        assertNull(mainLevel.getNextLevel(null));
        assertNull(mainLevel.getNextLevel("Некорректный ответ"));
    }

}