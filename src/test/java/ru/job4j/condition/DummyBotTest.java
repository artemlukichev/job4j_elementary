package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Hi, Bot.";
        String result = DummyBot.answer(in);
        String expected = "Hi, SmartAss.";
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Bye.";
        String result = DummyBot.answer(in);
        String expected = "See you later.";
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenUnknownBot() {
        String in = "Can you add two plus two?";
        String result = DummyBot.answer(in);
        String expected = "I don't know. Please, ask another question.";
        Assert.assertEquals(result, expected);
    }

}