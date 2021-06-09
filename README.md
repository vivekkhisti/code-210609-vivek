# Body Mass Index(BMI) Calculator API
There are one api in this demo.
* BMI Calculator (computing service)

## Prerequisite
1. [Oracle JDK 1.8+](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html)
2. [Maven 3.x](https://maven.apache.org/install.html)

## Quick Start(Windows)

1. Get the code
git clone https://github.com/vivekkhisti/code-210609-vivek.git

3. Run the API
(cd code-210608-vivek; mvn spring-boot:run)

4. Open postman and create a new POST request
	Enter URL as  **<a>localhost:8080/BMI</a>**.
	Goto Body ---> select raw --? select JSON from dropdown
	Enter request body as example below and send the request
	[
	    {
	        "Gender": "Male",
	        "HeightCm": 171,
	        "WeightKg": 96
	    },
	    {
	        "Gender": "Male",
	        "HeightCm": 161,
	        "WeightKg": 85
	    },
	    {
	        "Gender": "Male",
	        "HeightCm": 180,
	        "WeightKg": 77
	    },
	    {
	        "Gender": "Female",
	        "HeightCm": 166,
	        "WeightKg": 62
	    },
	    {
	        "Gender": "Female",
	        "HeightCm": 150,
	        "WeightKg": 70
	    },
	    {
	        "Gender": "Female",
	        "HeightCm": 167,
	        "WeightKg": 82
	    }
	]
