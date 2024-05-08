package com.secretdiary.test.diary;

import com.secretdiary.app.Diary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestSecretDiary {
    @Nested
    @DisplayName("Secret Diary Write Tests")
    class SecretDiaryWriteTests{

        @Test
        public void testWriteEntrySuccessfullyAddsValidInput(){
            //Arrange
            Diary testDiary = new Diary();
            //Act
            testDiary.write("This is a test entry!");
            //Assert
            assertEquals("This is a test entry!", testDiary.readEntry(1));
        }

        @Test
        public void testWriteEntrySuccessfullyAddsExtremeValidInput(){
            //Arrange
            //Act
            //Assert
        }

        @Test
        public void testWriteEntryHandlesIncorrectTypes(){
            //Arrange
            //Act
            //Assert
        }
    }
}
