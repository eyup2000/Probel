@patient_registration
Feature: Patient_Registration_Functionality

  Background: go_to_outpatient_clinic_examination_registration_page
    Given user_is_on_the_polyclinic_examination_registration_page
    And   user enters user name
    And   user enters password
    And   user enters webpassword
    And   user clicks the login button
    And   user clicks the patient button
    And   user enters institution
    Then  user enters institution details

  # @Precondition
 #  Scenario: TC01_Precondition

Scenario: TC0064_other countries
    Given user select uyrugu as other countries except turkey
    And   User select hasta turu
    And   Enter all other required data under the kisi bilgileri tab
    And   Enter all required data under the iletisim ve diger bilgiler tab
    And   User clicks the kaydet button.
    Then  User assert the bilgi islem basarili pop-up




