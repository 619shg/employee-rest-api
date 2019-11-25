# employee-rest-api
Steps
1.Clone the project.
2.Import in IDE.
3.Add JDBC properties in application.properties file.
4.Run the EmployeeRestApplication.java
5. Open postman
a. Check post endpoint- http://localhost:8080/api/employees(POST HTTP method)
request body-
{
	"firstName":"abc",
	"lastName":"xyz",
	"gender":"female",
	"dateOfBirth":"1994-06-06",
	"department":"IT"
}
b. check get endpoint-http://localhost:8080/api/employees(GET HTTP method)
