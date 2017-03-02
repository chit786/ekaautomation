$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePageUIValidation.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I should be able to see Computer Database Page",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-see-computer-database-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6008086470,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User navigates to the website and see Computer Database Home page with desired controls",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-see-computer-database-page;user-navigates-to-the-website-and-see-computer-database-home-page-with-desired-controls",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@home"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "\"Chrome\" is launched and user navigates to homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title of the page is \"Computers database\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "header of the page should display the \"Play sample application — Computer database\" link having \"black\" background color",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "label for total computers found should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "computer database list table should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "input field to filter the computers by name should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "\"Filter by name\" button of \"blue\" color should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "\"Add a new computer\" button of \"green\" color should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "\"Next\" and \"Previous\" buttons in the footer is visible",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "pagination should be present in the footer",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Chrome",
      "offset": 1
    }
  ],
  "location": "HomePageUIValidationSDF.is_launched_and_user_navigates_to_homepage(String)"
});
formatter.result({
  "duration": 1114918204,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers database",
      "offset": 22
    }
  ],
  "location": "HomePageUIValidationSDF.title_of_the_page_is(String)"
});
formatter.result({
  "duration": 30937510,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Play sample application — Computer database",
      "offset": 39
    },
    {
      "val": "black",
      "offset": 97
    }
  ],
  "location": "HomePageUIValidationSDF.header_of_the_page_should_display_the_link_having_background_color(String,String)"
});
formatter.result({
  "duration": 90820058,
  "status": "passed"
});
formatter.match({
  "location": "HomePageUIValidationSDF.label_for_total_computers_found_should_be_displayed()"
});
formatter.result({
  "duration": 34282607,
  "status": "passed"
});
formatter.match({
  "location": "HomePageUIValidationSDF.computer_database_list_table_should_be_displayed()"
});
formatter.result({
  "duration": 24624010,
  "status": "passed"
});
formatter.match({
  "location": "HomePageUIValidationSDF.input_field_to_filter_the_computers_by_name_should_be_displayed()"
});
formatter.result({
  "duration": 34968290,
  "error_message": "java.lang.AssertionError: test\n\tat org.junit.Assert.fail(Assert.java:88)\n\tat StepDefinitions.HomePageUIValidationSDF.input_field_to_filter_the_computers_by_name_should_be_displayed(HomePageUIValidationSDF.java:42)\n\tat ✽.And input field to filter the computers by name should be displayed(HomePageUIValidation.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Filter by name",
      "offset": 1
    },
    {
      "val": "blue",
      "offset": 28
    }
  ],
  "location": "HomePageUIValidationSDF.button_of_color_should_be_displayed(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Add a new computer",
      "offset": 1
    },
    {
      "val": "green",
      "offset": 32
    }
  ],
  "location": "HomePageUIValidationSDF.button_of_color_should_be_displayed(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Next",
      "offset": 1
    },
    {
      "val": "Previous",
      "offset": 12
    }
  ],
  "location": "HomePageUIValidationSDF.and_buttons_in_the_footer_is_visible(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HomePageUIValidationSDF.pagination_should_be_present_in_the_footer()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 792531152,
  "status": "passed"
});
});