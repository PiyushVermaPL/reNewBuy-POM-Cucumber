$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/org/renewbuy/featureFiles/displayNewCarInsurance1.feature");
formatter.feature({
  "name": "New Car Insurance functionality from end to end",
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
  "name": "user open website for \"\" URL",
  "keyword": "Given "
});
formatter.match({
  "location": "org.renewbuy.stepDefinitions.newCarInsuranceStepDef1.user_open_website_for_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "New Car Insurance Scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@NewCarInsurance"
    }
  ]
});
formatter.step({
  "name": "user can see heading \"D2C INSURANCE BROKING PVT. LTD.\" on Home Page",
  "keyword": "When "
});
formatter.match({
  "location": "org.renewbuy.stepDefinitions.newCarInsuranceStepDef1.user_can_see_heading_on_Home_Page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see logo of renewBuy on Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "org.renewbuy.stepDefinitions.newCarInsuranceStepDef1.user_can_see_logo_of_renewBuy_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user Hover over Motor Insurance then Hover over Car Insurance then clicks on New Car Insurance",
  "keyword": "Then "
});
formatter.match({
  "location": "org.renewbuy.stepDefinitions.newCarInsuranceStepDef1.user_Hover_over_Motor_Insurance_then_Hover_over_Car_Insurance_then_clicks_on_New_Car_Insurance()"
});
