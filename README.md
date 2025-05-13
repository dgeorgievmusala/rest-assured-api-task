REST-Assured Java API Automation Framework




📖 Overview

A Maven-based Java framework to automate REST API testing for Books and Authors endpoints. Built with:

RestAssured for HTTP requests

JUnit 5 for test execution

ExtentReports for rich HTML reporting

SOLID design for maintainability and extensibility

🚀 Prerequisites

Java JDK 11+ installed and JAVA_HOME configured

Maven 3.6+ installed and on your PATH

Internet access to download dependencies

(Optional) IntelliJ IDEA or equivalent IDE

🛠️ Setup & Run

Clone the repository

git clone https://github.com/your-org/rest-assured-java-api-automation-demo.git
cd rest-assured-java-api-automation-demo

Select environment (default: dev)

# Dev (default)
mvn clean test

# QA
mvn clean test -Pqa

# Prod
mvn clean test -Denv=prod

View test report
After tests finish, open:

reports/TestExecutionSummary.html

in your browser to see pass/fail status and logs.

📁 Project Structure

rest-assured-java-api-automation-demo
├── pom.xml                         # Maven configuration
├── src
│   ├── main
│   │   └── java
│   │       └── musala.testautomationtutorials
│   │           ├── config
│   │           │   ├── Constants.java         # Loads env props
│   │           │   └── EnvironmentLoader.java # Reads .properties
│   │           ├── enums
│   │           │   └── ApiEndpoint.java       # HTTP methods/paths enum
│   │           ├── model
│   │           │   └── BookRequest.java       # DTO for book payload
│   │           └── service
│   │               ├── ApiService.java        # CRUD abstraction
│   │               ├── BookService.java       # Books API implementation
│   │               └── AuthorService.java     # Authors API implementation
│   ├── test
│   │   └── java
│   │       └── musala.testautomationtutorials
│   │           ├── BaseTest.java             # RestAssured & report setup
│   │           ├── BookApiTest.java          # Books API tests
│   │           └── AuthorApiTest.java        # Authors API tests
│   └── resources
│       └── environments
│           ├── dev.properties
│           ├── qa.properties
│           ├── uat.properties
│           ├── pre-prod.properties
│           └── prod.properties
└── .github
    └── workflows
        └── ci.yml                         # GitHub Actions CI

⚙️ Environment Configuration

Place URLs and other env-specific values in src/main/resources/environments/{env}.properties.

Set active environment via Maven profile (-Pqa) or system property (-Denv=prod).

✅ Test Coverage

Covers CRUD operations for Books and Authors:

Endpoint

Happy Path

Validation Errors

Edge Cases

GET /api/v1/Books

✔️

N/A

N/A

GET /api/v1/Books/{id}

✔️

404

N/A

POST /api/v1/Books

✔️

400

empty/malformed JSON

PUT /api/v1/Books/{id}

✔️

400/404

unknown fields

DELETE /api/v1/Books/{id}

✔️

404

double delete

GET /api/v1/Authors

✔️

N/A

N/A

GET /api/v1/Authors/{id}

✔️

404

N/A

POST /api/v1/Authors

✔️

400

empty/malformed JSON

PUT /api/v1/Authors/{id}

✔️

400/404

invalid types

DELETE /api/v1/Authors/{id}

✔️

404

double delete

📊 Reporting

ExtentReports generates an HTML report at reports/TestExecutionSummary.html.

Includes pass/fail status, detailed logs, and timestamps.

🧹 Code Quality

Clean Code: SOLID design, clear naming conventions, no magic literals.

Static Analysis: Integrate Checkstyle or SonarQube in CI.

Automated CI: GitHub Actions runs tests on each push/PR and publishes artifacts.

🛡️ CI/CD

GitHub Actions workflow at .github/workflows/ci.yml:

Runs on push and pull requests to main.

Sets up JDK 11, caches Maven, executes mvn clean test.

Uploads test report HTML as artifact for download.

🙋‍♂️ Support

For issues or questions, please open a GitHub issue or contact Diyan Georgiev.
