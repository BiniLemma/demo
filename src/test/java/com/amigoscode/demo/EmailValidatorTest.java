package com.amigoscode.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    private final EmailValidator underTest = new EmailValidator();

    @Test
    public void itShouldValidateCorrectEmail(){
        assertThat(underTest.test("hello@gmail.com")).isTrue();

    }

    @Test
    public void itShouldValidateAnInCorrectEmail(){
        assertThat(underTest.test("hellogmail.com")).isFalse();

    }

    @Test
    public void itShouldValidateAnInCorrectEmailWithoutDotAtTheEnd(){
        assertThat(underTest.test("hello@gmail")).isFalse();

    }



}