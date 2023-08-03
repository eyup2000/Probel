@patient_registration
Feature: Patient_Registration_Functionality

  Background: go_to_outpatient_clinic_examination_registration_page
    Given user_is_on_the_polyclinic_examination_registration_page

  @Precondition
  Scenario: TC01_Precondition
      And   user enters user name
      And   user enters password
      And   user enters webpassword
      And   user clicks the login button
      And   user clicks the patient button
      And   user enters institution
      And   user enters institution details
      When  user confirms that they are on the Patient Registration page
      Then  user is on the Patient Registration page


 #  @patient_type
 # Scenario:   TC02_patient_type_enter
