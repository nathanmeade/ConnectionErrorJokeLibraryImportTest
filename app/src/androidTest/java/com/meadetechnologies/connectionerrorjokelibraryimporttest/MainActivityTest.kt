package com.meadetechnologies.connectionerrorjokelibraryimporttest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.meadetechnologies.connectionerrorknockknockjokes.ConnectionErrorKnockKnockJokes
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testTextView() {
        onView(withId(R.id.textView))
            .check(matches(isDisplayed()))
            //.check(matches(withText(ConnectionErrorKnockKnockJokes.getKnockKnockJoke())))
    }
}
