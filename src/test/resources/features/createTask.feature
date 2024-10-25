Feature: Create New Task
  Scenario: The user can add new task
    Given Click Add new task
    Given Enter TaskName
    Given Enter TaskDesc
    When click save
    Then Task added successfully
