Feature: To test Inspiration functionality


Background:
Given User is on homepage of Asian Paints
When User hover on Inspiration functionality 
#Then It displays options after hovering on Inspiraton option


@designTypes
Scenario: To view different types of room designs
#Given User is able to view the Inspiration options
When Click on Gallery option
And Click on Exterior designs
And Select Room, Category and Colour and select radio button
Then It should display the room designs


