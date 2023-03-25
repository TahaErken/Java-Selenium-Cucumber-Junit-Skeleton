$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/LoginDemo.feature");
formatter.feature({
  "name": "Test login funcitonality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check login is succesfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@logintest"
    }
  ]
});
formatter.step({
  "name": "browser is opened",
  "keyword": "Given "
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Raghav",
        "12345"
      ]
    },
    {
      "cells": [
        "Ele",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login is succesfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@logintest"
    }
  ]
});
formatter.step({
  "name": "browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.userIsOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Raghav and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.user_is_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Check login is succesfull with valid credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@logintest"
    }
  ]
});
formatter.step({
  "name": "browser is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.userIsOnLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters Ele and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.user_enters_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.userClicksOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginDemoStepsPageFactory.user_is_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});