package com.secretdiary.test.diary;

import com.secretdiary.app.Diary;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
            Diary testDiary = new Diary();
            //Act
            testDiary.write("dijshoigdikdkjgdiopjoignkuerhhgehjioreadiogte8hrtjoigtjihdfsiunfdpsjojrehjrfhkonfdhruhiufhkofeoirfhshfrnkvnjifgjngffgdhrfhjfedouauhrjhhtoifg");
            //Assert
            assertEquals("dijshoigdikdkjgdiopjoignkuerhhgehjioreadiogte8hrtjoigtjihdfsiunfdpsjojrehjrfhkonfdhruhiufhkofeoirfhshfrnkvnjifgjngffgdhrfhjfedouauhrjhhtoifg", testDiary.readEntry(1));
        }

        @Test
        public void testWriteEntryHandlesIncorrectTypes(){
            //Arrange
            Diary testDiary = new Diary();
            //Act
            //Assert
            assertThrows(IllegalArgumentException.class, () -> {
                testDiary.write(null);
            });
        }
    }

    @Nested
    @DisplayName("Secret Diary Read Tests")
    class SecretDiaryReadTests{

        @Test
        public void testWriteEntrySuccessfullyAddsValidInput(){
            //Arrange
            Diary testDiary = new Diary();
            //Act
            testDiary.write("This is a test entry!");
            testDiary.write("This is a test entry too!");
            testDiary.write("This is a test entry aswell!");
            //Assert
            assertEquals("This is a test entry too!", testDiary.readEntry(2));
        }

    }
}
