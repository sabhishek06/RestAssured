Feature: Validating place API's

Scenario: Verify add a place functionality using add place api
	Given Add place payload
	When user call the "addPlaceAPI" api with "post" http request
	Then added place api should be success with status code 200
	And the "status" in response is "OK"
	And "scope" in response body is "APP"