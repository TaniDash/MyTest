$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Loginfeature_TF.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios billling website login functionality validation",
  "description": "",
  "id": "techfios-billling-website-login-functionality-validation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TF"
    },
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2164433600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Techfios_login_page()"
});
formatter.result({
  "duration": 1679180800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User shpould be able to login with valid credentials from Database",
  "description": "",
  "id": "techfios-billling-website-login-functionality-validation;user-shpould-be-able-to-login-with-valid-credentials-from-database",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@TF_2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User enters \"username\" from database",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User enters \"password\" from database",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User clicks on signin button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_from_database(String)"
});
formatter.result({
  "duration": 3506800900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "LoginStepDefinition.user_enters_as_from_database(String)"
});
formatter.result({
  "duration": 3187043200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 6895036600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 272376000,
  "status": "passed"
});
formatter.after({
  "duration": 909052600,
  "status": "passed"
});
});