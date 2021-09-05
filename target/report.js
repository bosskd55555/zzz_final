$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/Login.feature");
formatter.feature({
  "name": "As a user, should be able to verify the deals page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As a user should be able to launch the application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageBDD.user_opens_the_URL()"
});
formatter.result({
  "status": "passed"
});
});