Feature: To test the Travel application

Scenario: 
Given To launch the application and navigate to url
When To click the getstart button
Then Navigate to the triptype page
Then Navigate to the Destination page
Then Navigate to the contact page
Then Enter the "<yourname>" , "<youremail>" , "<yoursubject>" and "<yourmessage>"
Then Navigate to the trips page 
Then Select a package
Then Navigate to the Availability of package
Then Select date and member
Then Enter the "<username>" and "<password>"
Then Enter Billing info "<firstname>" , "<Lasetname>" , "<Email>" , "<Address>" , "<city>" and "<Country>"
And Screenshot of trip booking bill