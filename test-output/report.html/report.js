$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/org/renewbuy/featureFiles/compareHealthInsurance.feature");
formatter.feature({
  "name": "Compare Health Insurance functionality from end to end",
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
formatter.step({
  "name": "user open website for \"\" URL CHI",
  "keyword": "Given "
});
formatter.match({
  "location": "org.renewbuy.stepDefinitions.CompareHealthInsuranceStepDef2.user_open_website_for_URL_CHI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Compare Health Insurance Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CompareHealthInsurance"
    }
  ]
});
formatter.step({
  "name": "user can see heading \"D2C INSURANCE BROKING PVT. LTD.\" on Home Page CHI",
  "keyword": "When "
});
formatter.match({
  "location": "org.renewbuy.stepDefinitions.CompareHealthInsuranceStepDef2.user_can_see_heading_on_Home_Page_CHI(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see logo of renewBuy on Home Page CHI",
  "keyword": "Then "
});
formatter.match({
  "location": "org.renewbuy.stepDefinitions.CompareHealthInsuranceStepDef2.user_can_see_logo_of_renewBuy_on_Home_Page_CHI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Hover over Health Insurance then clicks on Compare Health Insurance CHI",
  "keyword": "Then "
});
formatter.match({
  "location": "org.renewbuy.stepDefinitions.CompareHealthInsuranceStepDef2.user_Hover_over_Health_Insurance_then_clicks_on_Compare_Health_Insurance_CHI()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});