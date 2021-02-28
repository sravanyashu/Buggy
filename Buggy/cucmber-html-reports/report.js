$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Buggy.feature");
formatter.feature({
  "line": 1,
  "name": "Test feature",
  "description": "",
  "id": "test-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 51,
  "name": "Verify Zonda model under Pagani Make category in overall rating",
  "description": "",
  "id": "test-feature;verify-zonda-model-under-pagani-make-category-in-overall-rating",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 50,
      "name": "@TestCase5"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User is logged into BuggyCarsRating Website \u003cUsername\u003e,\u003cPassword\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "user clicks on List of all registered models image",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "user clicks on Zonda model under Pagani Make category",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Pagani Zonda Model listed with Specification and Votes \u003cExpectedSpecs\u003e, \u003cExpectedVotes\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 58,
  "name": "",
  "description": "",
  "id": "test-feature;verify-zonda-model-under-pagani-make-category-in-overall-rating;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "ExpectedSpecs",
        "ExpectedVotes"
      ],
      "line": 59,
      "id": "test-feature;verify-zonda-model-under-pagani-make-category-in-overall-rating;;1"
    },
    {
      "cells": [
        "Jhon123",
        "Welly@12345",
        "Engine: 6.0l Max Speed: 350km/h",
        "Votes: 796"
      ],
      "line": 60,
      "id": "test-feature;verify-zonda-model-under-pagani-make-category-in-overall-rating;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 60,
  "name": "Verify Zonda model under Pagani Make category in overall rating",
  "description": "",
  "id": "test-feature;verify-zonda-model-under-pagani-make-category-in-overall-rating;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 50,
      "name": "@TestCase5"
    }
  ]
});
formatter.step({
  "line": 53,
  "name": "User is logged into BuggyCarsRating Website Jhon123,Welly@12345",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 54,
  "name": "user clicks on List of all registered models image",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "user clicks on Zonda model under Pagani Make category",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Pagani Zonda Model listed with Specification and Votes Engine: 6.0l Max Speed: 350km/h, Votes: 796",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Jhon123",
      "offset": 44
    },
    {
      "val": "Welly@12345",
      "offset": 52
    }
  ],
  "location": "Stepdefinitions.user_is_logged_into_buggycarsrating_website_(String,String)"
});
formatter.result({
  "duration": 3878038700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitions.user_clicks_on_list_of_all_registered_models_image()"
});
formatter.result({
  "duration": 212826300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitions.user_clicks_on_zonda_model_under_pagani_make_category()"
});
formatter.result({
  "duration": 559482300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Engine: 6.0l Max Speed: 350km/h",
      "offset": 55
    },
    {
      "val": "Votes: 796",
      "offset": 88
    }
  ],
  "location": "Stepdefinitions.pagani_zonda_model_listed_with_specification_and_votes_(String,String)"
});
formatter.result({
  "duration": 329983700,
  "status": "passed"
});
formatter.after({
  "duration": 91231300,
  "status": "passed"
});
});