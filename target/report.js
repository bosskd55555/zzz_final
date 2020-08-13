$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/Background.feature");
formatter.feature({
  "name": "Background using login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user entering the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageBDD.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the deals",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardBDD.user_enters_the_deals()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Without examples",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Entering all the details in deals Page",
  "keyword": "And "
});
formatter.match({
  "location": "DealsPageBDD.entering_all_the_details_in_deals_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user entering the username and password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageBDD.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the deals",
  "keyword": "Then "
});
formatter.match({
  "location": "DashBoardBDD.user_enters_the_deals()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "With examples",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "name": "the list string lecture details are",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commision"
      ]
    },
    {
      "cells": [
        "Doe",
        "30",
        "Associate",
        "new"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "DealsPageBDD.theListStringLectureDetailsAre(String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});