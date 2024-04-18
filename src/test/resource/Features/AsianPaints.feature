Feature: To test AsianPaints functionality

  Background: 
    Given User is on homepage of Asian Paints and hover on Inspiration


	 #===============================  Scenario 1  ==================================================================

  @FilterRoomsDesign
  Scenario: To view different types of room designs
    When Click on Gallery option
    And Click on Exterior designs
    And Select Room and its Category
    Then It should display the room designs


  #===============================  Scenario 2  ==================================================================
  
  @valid
  Scenario Outline: To test Appoinment booking functionality for valid credentials
    When Click on Where The Heart Is option
    And User enters the "<Name>", "<MobileNumber>", "<PINCode>" and <Email>
    And Click on Book an appoinment
    Then It should schedule a visit by an expert

    Examples: 
      | Name     | MobileNumber | PINCode | Email               |
      | Vaidehii |   9307870789 |  442302 | vaidehi62@gmail.com |



   #===============================    Scenario3   ==============================================================
  
  @invalid
  Scenario: To test Appoinment booking functionality for invalid credentials
    When Click on Where The Heart Is
    And User enters their details with Name1, MobileNumber1, PINCode1
      | Vaidehi | 9307870780 | 441304 |
    And Enters invalid Email1 for book an appoinment
      | vaidehi6gmail |
    And Click on Book an appoinment button
    Then It should give an error message



  #==================================   Scenario4   =============================================================
  
  @Download&Subscribe
  Scenario Outline: To validate that user is able to Download report and Subscribe for latest design inspiration
    When User is click on Colour Trends
    And Click on Forecast report
    And User is able to click on Download report
    And User is able to enter <Email>
    And Click on Subscribe for latest design inspiration
    Then It should download the report and user receives subscription message

    Examples: 
      | Email                       |
      | vaidehishirbhate6@gmail.com |
      
    
    
    #===================================  Scenario5   ====================================================== 
     
    @RegisterComplaint
    Scenario: To validate Register a complaint functionality
    When User click on Guides option
    And Click on Kitchen from Our Division Section
    And Click on Register a complaint
    And User Register complaint with their Name, Email, Mobile and City
    |Shruti|shruti29@gmail.com|9307870789|Mumbai|
    And Select Nature of complaint
    And User enter their reason for complaint
    |The Cabinets are old-fashioned and lacking in storage|
    And Click on Submit button
    Then It should give Thank you message
      
      
    #===================================  Scenario6   ========================================================
    
    @LikeIcon
    Scenario: To validate the Like icon is clickable
    When User click on Inspiration
    And User select testimonials
    And Click on View more Videos button 
    And User Click on Videos and LIKE the icon
    Then User is able to click on like icon and view the videos in wishlist
      
      
