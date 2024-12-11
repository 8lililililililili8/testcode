package ex01;

import org.junit.jupiter.api.*;

class StudyTest {

    @Test
    void create() {
        System.out.println("create");
    }

    @Test
    @Disabled //테스트에서 제외
    void create1(){
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll() {
        /**
         * - 모든 테스트를 실행하기 전에 딱 한 번만 호출
         * - 반드시 static void 사용
         */
        System.out.println("before All");
    }

    @AfterAll
    static void afterAll() {
        /**
         * - 모든 테스트가 실행된 이후에 딱 한 번만 호출
         * - 반드시 static void 사용
         */
        System.out.println("after All");
    }

    @BeforeEach
    void beforeEach() {
        //각각의 테스트 수행 이전에 호출
        System.out.println("before Each");
    }

    @AfterEach
    void afterEach() {
        //각각의 테스트 이후에 호출
        System.out.println("after Each");
    }

}