package ru.geekbrains.checkequalitywithtests;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class CheckEqualsTest {
    @Test
    public void CheckEquals_Compare_Test() {
        CheckEquals checkEquals = new CheckEquals();
        String actual = checkEquals.Compare("2", "2");
        assertEquals("Равно!", actual);
    }
    @Test
    public void CheckEquals_Compare_WrongTest() {
        CheckEquals checkEquals = new CheckEquals();
        String actual = checkEquals.Compare("2", "3");
        assertEquals("Не равно!", actual);
    }
    @Test
    public void CheckEquals_Compare_BigValueTest() {
        CheckEquals checkEquals = new CheckEquals();
        String actual = checkEquals.Compare("2000", "2000");
        assertEquals("Равно!", actual);
    }
    @Test
    public void CheckEquals_Compare_NullTest() {
        CheckEquals checkEquals = new CheckEquals();
        String actual = checkEquals.Compare(null, null);
        assertEquals("Введите числа!", actual);
    }
    @Test
    public void CheckEquals_Compare_EmptyTest() {
        CheckEquals checkEquals = new CheckEquals();
        String actual = checkEquals.Compare("", null);
        assertEquals("Введите числа!", actual);
    }
    @Test
    public void CheckEquals_Compare_NotNumberTest() {
        CheckEquals checkEquals = new CheckEquals();
        String actual = checkEquals.Compare("ss", "null");
        assertEquals("Введите числа!", actual);
    }
}