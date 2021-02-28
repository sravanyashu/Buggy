$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Features/Buggy.feature");
formatter.feature({
  "line": 1,
  "name": "Test feature",
  "description": "",
  "id": "test-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "This is the test scenario",
  "description": "",
  "id": "test-feature;this-is-the-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I have logged into the BuggyCarsRating Website \u003cURl\u003e",
  "keyword": "Given "
});
formatter.examples({
  "comments": [
    {
      "line": 5,
      "value": "#And"
    },
    {
      "line": 6,
      "value": "#Then"
    }
  ],
  "line": 7,
  "name": "",
  "description": "",
  "id": "test-feature;this-is-the-test-scenario;",
  "rows": [
    {
      "cells": [
        "URl"
      ],
      "line": 8,
      "id": "test-feature;this-is-the-test-scenario;;1"
    },
    {
      "cells": [
        "http://buggy.justtestit.org/"
      ],
      "line": 9,
      "id": "test-feature;this-is-the-test-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "This is the test scenario",
  "description": "",
  "id": "test-feature;this-is-the-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "I have logged into the BuggyCarsRating Website http://buggy.justtestit.org/",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});