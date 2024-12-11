package ex02;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class DisplayNameTest {

    @Test
    void create_new_study() {
        System.out.println("create new study");
    }

    @Test
    @DisplayName("스터디 만들기")
    void create_new_study_again() {
        System.out.println("create new study");
    }
}
