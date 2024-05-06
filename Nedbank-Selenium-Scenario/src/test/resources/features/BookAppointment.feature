Feature: Book Appointment
  Scenario: Valid Appointment
    Given the User has Logged in using the username 'John Doe' and the password 'ThisIsNotAPassword'
    When the user selects Hong Kong Center with readmission
    And  the user completes the appointment by entering the visit Date "22/05/2024", comments "It is just an appointment"
    Then the appointment is created