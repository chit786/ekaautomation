$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AddNewCompNegativeValidation.feature");
formatter.feature({
  "line": 1,
  "name": "User should see valid error messages for invalid computer details on add computer screen",
  "description": "",
  "id": "user-should-see-valid-error-messages-for-invalid-computer-details-on-add-computer-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5738715776,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Valid error messages should be displayed when user enters invalid details for adding new computer",
  "description": "",
  "id": "user-should-see-valid-error-messages-for-invalid-computer-details-on-add-computer-screen;valid-error-messages-should-be-displayed-when-user-enters-invalid-details-for-adding-new-computer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@errors"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User navigates to Hompage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks Add a new computer button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user sees add new computer screen",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User sets \"\" computer name, \"\" introduced date, \"\" Discontinued date, \"-- Choose a company --\" Company name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "clicks on \"Create this computer\" button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Computer name field should be highlighted in red",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User sets \"\" computer name, \"01-01-01\" introduced date, \"2017-01-01\" Discontinued date, \"Samsung Electronics\" Company name",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "clicks on \"Create this computer\" button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Computer name field should be highlighted in red",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Introduced date field highlighted in red",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User sets \"NIA123\" computer name, \"BBBB-01-01\" introduced date, \"AAAA-01-01\" Discontinued date, \"Samsung Electronics\" Company name",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "clicks on \"Create this computer\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Introduced date field highlighted in red",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Discontinued date field highlighted in red",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User sets \"NIA123\" computer name, \"2017-01-01\" introduced date, \"2017-BB-01\" Discontinued date, \"Samsung Electronics\" Company name",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "clicks on \"Create this computer\" button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Discontinued date field highlighted in red",
  "keyword": "Then "
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.user_navigates_to_Hompage()"
});
formatter.result({
  "duration": 313407403,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.user_clicks_Add_a_new_computer_button()"
});
formatter.result({
  "duration": 570281000,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.user_sees_add_new_computer_screen()"
});
formatter.result({
  "duration": 29745211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    },
    {
      "val": "",
      "offset": 29
    },
    {
      "val": "",
      "offset": 49
    },
    {
      "val": "-- Choose a company --",
      "offset": 71
    }
  ],
  "location": "AddNewCompNegativeValidationSDF.user_sets_computer_name_introduced_date_Discontinued_date_Company_name(String,String,String,String)"
});
formatter.result({
  "duration": 1223480889,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create this computer",
      "offset": 11
    }
  ],
  "location": "AddNewCompNegativeValidationSDF.clicks_on_button(String)"
});
formatter.result({
  "duration": 1962873984,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.computer_name_field_should_be_highlighted_in_red()"
});
formatter.result({
  "duration": 86609475,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 11
    },
    {
      "val": "01-01-01",
      "offset": 29
    },
    {
      "val": "2017-01-01",
      "offset": 57
    },
    {
      "val": "Samsung Electronics",
      "offset": 89
    }
  ],
  "location": "AddNewCompNegativeValidationSDF.user_sets_computer_name_introduced_date_Discontinued_date_Company_name(String,String,String,String)"
});
formatter.result({
  "duration": 1102834033,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create this computer",
      "offset": 11
    }
  ],
  "location": "AddNewCompNegativeValidationSDF.clicks_on_button(String)"
});
formatter.result({
  "duration": 492650293,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.computer_name_field_should_be_highlighted_in_red()"
});
formatter.result({
  "duration": 127027671,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.introduced_date_field_highlighted_in_red()"
});
formatter.result({
  "duration": 43242671,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat StepDefinitions.AddNewCompNegativeValidationSDF.introduced_date_field_highlighted_in_red(AddNewCompNegativeValidationSDF.java:48)\n\tat ✽.Then Introduced date field highlighted in red(AddNewCompNegativeValidation.feature:13)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "NIA123",
      "offset": 11
    },
    {
      "val": "BBBB-01-01",
      "offset": 35
    },
    {
      "val": "AAAA-01-01",
      "offset": 65
    },
    {
      "val": "Samsung Electronics",
      "offset": 97
    }
  ],
  "location": "AddNewCompNegativeValidationSDF.user_sets_computer_name_introduced_date_Discontinued_date_Company_name(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Create this computer",
      "offset": 11
    }
  ],
  "location": "AddNewCompNegativeValidationSDF.clicks_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.introduced_date_field_highlighted_in_red()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.discontinued_date_field_highlighted_in_red()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "NIA123",
      "offset": 11
    },
    {
      "val": "2017-01-01",
      "offset": 35
    },
    {
      "val": "2017-BB-01",
      "offset": 65
    },
    {
      "val": "Samsung Electronics",
      "offset": 97
    }
  ],
  "location": "AddNewCompNegativeValidationSDF.user_sets_computer_name_introduced_date_Discontinued_date_Company_name(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Create this computer",
      "offset": 11
    }
  ],
  "location": "AddNewCompNegativeValidationSDF.clicks_on_button(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AddNewCompNegativeValidationSDF.discontinued_date_field_highlighted_in_red()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 789034476,
  "status": "passed"
});
formatter.uri("AddNewCompPositiveValidation.feature");
formatter.feature({
  "line": 1,
  "name": "User should be able to add new computer to the database",
  "description": "",
  "id": "user-should-be-able-to-add-new-computer-to-the-database",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3759391520,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to add new computer : positive scenario",
  "description": "",
  "id": "user-should-be-able-to-add-new-computer-to-the-database;user-should-be-able-to-add-new-computer-:-positive-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@add"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User clicks on Add new computer button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Add a computer page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Homepage should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "note the total number of computers",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks on Add new computer button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Add a computer page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "\"Add a computer\" label should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "\"Computer name\" label should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "\"Introduced date\" label should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "\"Discontinued date\" label should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "\"Company\" label should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user enters \"NIA123\" as Computer name",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enters \"2017-01-04\" as Introduced date",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "enters \"2017-12-01\" as Discontinued date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "selects \"Samsung Electronics\" as company",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "clicks on Create this computer button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user should be redirected to homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "gets a confirmation message \"Done! Computer NIA123 has been created\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the total number of computers should be increased by 1",
  "keyword": "And "
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.user_is_on_homepage()"
});
formatter.result({
  "duration": 123876438,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.user_clicks_on_Add_new_computer_button()"
});
formatter.result({
  "duration": 418411438,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.add_a_computer_page_should_be_displayed()"
});
formatter.result({
  "duration": 29379524,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.user_clicks_on_Cancel_button()"
});
formatter.result({
  "duration": 383413949,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.homepage_should_be_displayed()"
});
formatter.result({
  "duration": 22538897,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.note_the_total_number_of_computers()"
});
formatter.result({
  "duration": 46872586,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.user_clicks_on_Add_new_computer_button()"
});
formatter.result({
  "duration": 440815137,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.add_a_computer_page_should_be_displayed()"
});
formatter.result({
  "duration": 18071952,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Add a computer",
      "offset": 1
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.label_should_be_displayed(String)"
});
formatter.result({
  "duration": 53777793,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computer name",
      "offset": 1
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.label_should_be_displayed(String)"
});
formatter.result({
  "duration": 66608810,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Introduced date",
      "offset": 1
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.label_should_be_displayed(String)"
});
formatter.result({
  "duration": 54168819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Discontinued date",
      "offset": 1
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.label_should_be_displayed(String)"
});
formatter.result({
  "duration": 59263413,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Company",
      "offset": 1
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.label_should_be_displayed(String)"
});
formatter.result({
  "duration": 47385066,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NIA123",
      "offset": 13
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.user_enters_as_Computer_name(String)"
});
formatter.result({
  "duration": 127140852,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2017-01-04",
      "offset": 8
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.enters_as_Introduced_date(String)"
});
formatter.result({
  "duration": 187774869,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2017-12-01",
      "offset": 8
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.enters_as_Discontinued_date(String)"
});
formatter.result({
  "duration": 198376657,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Samsung Electronics",
      "offset": 9
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.selects_as_company(String)"
});
formatter.result({
  "duration": 411324815,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.clicks_on_Create_this_computer_button()"
});
formatter.result({
  "duration": 506359768,
  "status": "passed"
});
formatter.match({
  "location": "AddNewCompPositiveValidationSDF.user_should_be_redirected_to_homepage()"
});
formatter.result({
  "duration": 7760144,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Done! Computer NIA123 has been created",
      "offset": 29
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.gets_a_confirmation_message(String)"
});
formatter.result({
  "duration": 39952389,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 53
    }
  ],
  "location": "AddNewCompPositiveValidationSDF.the_total_number_of_computers_should_be_increased_by(int)"
});
formatter.result({
  "duration": 49720689,
  "status": "passed"
});
formatter.after({
  "duration": 166406257,
  "status": "passed"
});
formatter.uri("ComputerListSortingValidation.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I should be able to see,filter and sort list of computers in database",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-see,filter-and-sort-list-of-computers-in-database",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4056709128,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "user should be able to filter computers by name on Computer database HomePage",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-see,filter-and-sort-list-of-computers-in-database;user-should-be-able-to-filter-computers-by-name-on-computer-database-homepage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@filter"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user navigates to the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user sees computer list table",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user sees the list of computers sorted alphabetically in ascending order",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the number of computers will be noted from the header",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks filter by name button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the list should not change",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the total computer count should be same",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user filters list by \"!@#$%^\u0026*\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the computer list table should be gone",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user sees label \"Nothing to display\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user filters list by \"testing\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user sees computer list sorted with the name \"testing\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user filters list by \"Z\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "the total number of computers found in the header must be noted",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user click on next button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "sees the next 10 computers in the list with name containing \"Z\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "the count of computers in the header should not change",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the text for current page should display \"Displaying 11 to 20 of \u003cTotal Count\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "previous button is enabled",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "next button is enabled",
  "keyword": "And "
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.user_navigates_to_the_homepage()"
});
formatter.result({
  "duration": 126694632,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.user_sees_computer_list_table()"
});
formatter.result({
  "duration": 52495295,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.user_sees_the_list_of_computers_sorted_alphabetically_in_ascending_order()"
});
formatter.result({
  "duration": 2098027698,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.the_number_of_computers_will_be_noted_from_the_header()"
});
formatter.result({
  "duration": 47738080,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.user_clicks_filter_by_name_button()"
});
formatter.result({
  "duration": 484442186,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.the_list_should_not_change()"
});
formatter.result({
  "duration": 73062409,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.the_total_computer_count_should_be_same()"
});
formatter.result({
  "duration": 51430387,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "!@#$%^\u0026*",
      "offset": 22
    }
  ],
  "location": "ComputerListSortingValidationSDF.user_filters_list_by(String)"
});
formatter.result({
  "duration": 457251521,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.the_computer_list_table_should_be_gone()"
});
formatter.result({
  "duration": 13027646001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nothing to display",
      "offset": 17
    }
  ],
  "location": "ComputerListSortingValidationSDF.user_sees_label(String)"
});
formatter.result({
  "duration": 34104441,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testing",
      "offset": 22
    }
  ],
  "location": "ComputerListSortingValidationSDF.user_filters_list_by(String)"
});
formatter.result({
  "duration": 660098561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testing",
      "offset": 46
    }
  ],
  "location": "ComputerListSortingValidationSDF.user_sees_computer_list_sorted_with_the_name(String)"
});
formatter.result({
  "duration": 563216058,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Z",
      "offset": 22
    }
  ],
  "location": "ComputerListSortingValidationSDF.user_filters_list_by(String)"
});
formatter.result({
  "duration": 1818459421,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.the_total_number_of_computers_found_in_the_header_must_be_noted()"
});
formatter.result({
  "duration": 49888670,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.user_click_on_next_button()"
});
formatter.result({
  "duration": 351059130,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 14
    },
    {
      "val": "Z",
      "offset": 61
    }
  ],
  "location": "ComputerListSortingValidationSDF.sees_the_next_computers_in_the_list_with_name_containing(int,String)"
});
formatter.result({
  "duration": 224682447,
  "status": "passed"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.the_count_of_computers_in_the_header_should_not_change()"
});
formatter.result({
  "duration": 21603290,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat StepDefinitions.ComputerListSortingValidationSDF.the_count_of_computers_in_the_header_should_not_change(ComputerListSortingValidationSDF.java:97)\n\tat ✽.Then the count of computers in the header should not change(ComputerListSortingValidation.feature:20)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Displaying 11 to 20 of \u003cTotal Count\u003e",
      "offset": 42
    }
  ],
  "location": "ComputerListSortingValidationSDF.the_text_for_current_page_should_display(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.previous_button_is_enabled()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ComputerListSortingValidationSDF.next_button_is_enabled()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 362235938,
  "status": "passed"
});
formatter.uri("DeleteComputerValidation.feature");
formatter.feature({
  "line": 1,
  "name": "As a user i should be able to delete any computer in the database",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-delete-any-computer-in-the-database",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3723511213,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Delete computer Validation for Computer Database website",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-delete-any-computer-in-the-database;verify-delete-computer-validation-for-computer-database-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@delete"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "note the total number of computers in the database",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "note the total number of computers in pagination footer",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks first computer name from the list",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Edit Computer page should be opened",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user sees delete this computer button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks delete this computer button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user navigates to HomePage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user sees the Delete confirmation message on the homepage",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "the total number of computers should be decreased by 1 in Header",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the total number of computers should be decreased by 1 in Pagination footer",
  "keyword": "And "
});
formatter.match({
  "location": "DeleteComputerValidationSDF.user_is_on_Homepage()"
});
formatter.result({
  "duration": 89956611,
  "status": "passed"
});
formatter.match({
  "location": "DeleteComputerValidationSDF.note_the_total_number_of_computers_in_the_database()"
});
formatter.result({
  "duration": 56167289,
  "status": "passed"
});
formatter.match({
  "location": "DeleteComputerValidationSDF.note_the_total_number_of_computers_in_pagination_footer()"
});
formatter.result({
  "duration": 58362221,
  "status": "passed"
});
formatter.match({
  "location": "DeleteComputerValidationSDF.user_clicks_first_computer_name_from_the_list()"
});
formatter.result({
  "duration": 515023444,
  "status": "passed"
});
formatter.match({
  "location": "DeleteComputerValidationSDF.edit_Computer_page_should_be_opened()"
});
formatter.result({
  "duration": 52731563,
  "status": "passed"
});
formatter.match({
  "location": "DeleteComputerValidationSDF.user_sees_delete_this_computer_button()"
});
formatter.result({
  "duration": 32557234,
  "status": "passed"
});
formatter.match({
  "location": "DeleteComputerValidationSDF.user_clicks_delete_this_computer_button()"
});
formatter.result({
  "duration": 499447171,
  "status": "passed"
});
formatter.match({
  "location": "DeleteComputerValidationSDF.user_navigates_to_HomePage()"
});
formatter.result({
  "duration": 20431721,
  "status": "passed"
});
formatter.match({
  "location": "DeleteComputerValidationSDF.user_sees_the_Delete_confirmation_message_on_the_homepage()"
});
formatter.result({
  "duration": 90226856,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 53
    }
  ],
  "location": "DeleteComputerValidationSDF.the_total_number_of_computers_should_be_decreased_by_in_Header(int)"
});
formatter.result({
  "duration": 33178222,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 53
    }
  ],
  "location": "DeleteComputerValidationSDF.the_total_number_of_computers_should_be_decreased_by_in_Pagination_footer(int)"
});
formatter.result({
  "duration": 40789210,
  "status": "passed"
});
formatter.after({
  "duration": 134442972,
  "status": "passed"
});
formatter.uri("EditComputerValidation.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I should be able to edit any computer details from the computer list",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-edit-any-computer-details-from-the-computer-list",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3564099490,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Edit computer Validation for Computer Database website",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-edit-any-computer-details-from-the-computer-list;verify-edit-computer-validation-for-computer-database-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@edit"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on homepage of computer database page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user note first computer details in the list",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "clicks on the name of first computer in the list",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Computer Edit page should be opened",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "header of the page should display \"Edit computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Edit page should display Save this computer and Cancel buttons",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Delete this computer button should exist",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks Cancel button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user sees homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "clicks on the name of first computer in the list",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Computer Edit page should be opened",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "append \"NIA123\" at the end of the name of the computer",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "change introduced date to \"0001-01-01\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "change discontinued date to \"0001-01-01\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "change company to \"Apple Inc.\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click Save this computer button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user navigates to homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user sees edit confirmation message",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user filters the list by new name",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user sees updated record for the computer",
  "keyword": "Then "
});
formatter.match({
  "location": "EditComputerValidationSDF.user_is_on_Homepage()"
});
formatter.result({
  "duration": 76932124,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.user_note_first_computer_details_in_the_list()"
});
formatter.result({
  "duration": 159766029,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.clicks_on_the_name_of_first_computer_in_the_list()"
});
formatter.result({
  "duration": 378784037,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.computer_Edit_page_should_be_opened()"
});
formatter.result({
  "duration": 62798614,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Edit computer",
      "offset": 35
    }
  ],
  "location": "EditComputerValidationSDF.header_of_the_page_should_display(String)"
});
formatter.result({
  "duration": 37570118,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.edit_page_should_display_Save_this_computer_and_Cancel_buttons()"
});
formatter.result({
  "duration": 72268207,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.delete_this_computer_button_should_exist()"
});
formatter.result({
  "duration": 31776643,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.user_clicks_Cancel_button()"
});
formatter.result({
  "duration": 366879971,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.user_sees_homepage()"
});
formatter.result({
  "duration": 6841538,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.clicks_on_the_name_of_first_computer_in_the_list()"
});
formatter.result({
  "duration": 408244626,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.computer_Edit_page_should_be_opened()"
});
formatter.result({
  "duration": 37439702,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NIA123",
      "offset": 8
    }
  ],
  "location": "EditComputerValidationSDF.append_at_the_end_of_the_name_of_the_computer(String)"
});
formatter.result({
  "duration": 81345306,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0001-01-01",
      "offset": 27
    }
  ],
  "location": "EditComputerValidationSDF.change_introduced_date_to(String)"
});
formatter.result({
  "duration": 152754983,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0001-01-01",
      "offset": 29
    }
  ],
  "location": "EditComputerValidationSDF.change_discontinued_date_to(String)"
});
formatter.result({
  "duration": 251138312,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple Inc.",
      "offset": 19
    }
  ],
  "location": "EditComputerValidationSDF.change_company_to(String)"
});
formatter.result({
  "duration": 244273187,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.click_Save_this_computer_button()"
});
formatter.result({
  "duration": 479052825,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.user_navigates_homepage()"
});
formatter.result({
  "duration": 7212302,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.user_sees_edit_confirmation_message()"
});
formatter.result({
  "duration": 30009928,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.user_filters_the_list_by_new_name()"
});
formatter.result({
  "duration": 405423405,
  "status": "passed"
});
formatter.match({
  "location": "EditComputerValidationSDF.user_sees_updated_record_for_the_computer()"
});
formatter.result({
  "duration": 97344013,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c0[4] Jan 0001\u003e but was:\u003c0[1] Jan 0001\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat StepDefinitions.EditComputerValidationSDF.user_sees_updated_record_for_the_computer(EditComputerValidationSDF.java:118)\n\tat ✽.Then user sees updated record for the computer(EditComputerValidation.feature:23)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 319099119,
  "status": "passed"
});
formatter.uri("HomePageUIValidation.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I should be able to see Computer Database Page",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-see-computer-database-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4163213346,
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
  "duration": 80845613,
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
  "duration": 7280280,
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
  "duration": 72496377,
  "status": "passed"
});
formatter.match({
  "location": "HomePageUIValidationSDF.label_for_total_computers_found_should_be_displayed()"
});
formatter.result({
  "duration": 43800255,
  "status": "passed"
});
formatter.match({
  "location": "HomePageUIValidationSDF.computer_database_list_table_should_be_displayed()"
});
formatter.result({
  "duration": 15800885,
  "status": "passed"
});
formatter.match({
  "location": "HomePageUIValidationSDF.input_field_to_filter_the_computers_by_name_should_be_displayed()"
});
formatter.result({
  "duration": 30061994,
  "status": "passed"
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
  "duration": 32018142,
  "status": "passed"
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
  "duration": 33012483,
  "status": "passed"
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
  "duration": 90716604,
  "status": "passed"
});
formatter.match({
  "location": "HomePageUIValidationSDF.pagination_should_be_present_in_the_footer()"
});
formatter.result({
  "duration": 46441131,
  "status": "passed"
});
formatter.after({
  "duration": 154158609,
  "status": "passed"
});
formatter.uri("SortByColumnValidation.feature");
formatter.feature({
  "line": 1,
  "name": "As A user I should be able to sort computer database table",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-sort-computer-database-table",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5514148008,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Sorting on the computer database table for Computer Database website",
  "description": "",
  "id": "as-a-user-i-should-be-able-to-sort-computer-database-table;verify-sorting-on-the-computer-database-table-for-computer-database-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sort"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to dashboard",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user sees database table",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks on Computer name column",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Computer details should arrange in descending alphabetical order",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on Introduced date column",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Computer details should arrange in descending alphabetical order by introduced date",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on Discontinued date column",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Computer details should arrange in descending alphabetical order by Discontinued date",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user clicks on company name column",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Computer details should arrange in descending alphabetical order by company name",
  "keyword": "And "
});
formatter.match({
  "location": "SortByColumnValidationSDF.user_navigates_to_dashboard()"
});
formatter.result({
  "duration": 73832726,
  "status": "passed"
});
formatter.match({
  "location": "SortByColumnValidationSDF.user_sees_database_table()"
});
formatter.result({
  "duration": 12415095,
  "status": "passed"
});
formatter.match({
  "location": "SortByColumnValidationSDF.user_clicks_on_Computer_name_column()"
});
formatter.result({
  "duration": 133221539,
  "status": "passed"
});
formatter.match({
  "location": "SortByColumnValidationSDF.computer_details_should_arrange_in_descending_alphabetical_order()"
});
formatter.result({
  "duration": 1517209180,
  "error_message": "java.lang.AssertionError\n\tat org.junit.Assert.fail(Assert.java:86)\n\tat org.junit.Assert.assertTrue(Assert.java:41)\n\tat org.junit.Assert.assertTrue(Assert.java:52)\n\tat StepDefinitions.SortByColumnValidationSDF.computer_details_should_arrange_in_descending_alphabetical_order(SortByColumnValidationSDF.java:29)\n\tat ✽.And Computer details should arrange in descending alphabetical order(SortByColumnValidation.feature:8)\n",
  "status": "failed"
});
formatter.match({
  "location": "SortByColumnValidationSDF.user_clicks_on_Introduced_date_column()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SortByColumnValidationSDF.computer_details_should_arrange_in_descending_alphabetical_order_by_introduced_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SortByColumnValidationSDF.user_clicks_on_Discontinued_date_column()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SortByColumnValidationSDF.computer_details_should_arrange_in_descending_alphabetical_order_by_Discontinued_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SortByColumnValidationSDF.user_clicks_on_company_name_column()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SortByColumnValidationSDF.computer_details_should_arrange_in_descending_alphabetical_order_by_company_name()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 334825361,
  "status": "passed"
});
});