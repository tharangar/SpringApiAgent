# SpringApiAgent

## Table of Contents (Optional)

> If you're `README` has a lot of info, section headers might be nice.

- [Features](#features)
- [Installation](#installation)
- [Contributing](#contributing)
- [Support](#support)
- [License](#license)


---

## Features
- Rest full web services
- Basic Authentication
- Data retrive from database
- XML based response

### Technical stack

- Thsi spring based Rest API program is consists of following features.
- Mevan build 
- Spring Rest API frame work
- Spring Basic Authentication
- Spring mvc Architecture
- Hibernate Data Object mapping framework
- JPA anotanation
- mysql database 


## Installation

- This spring mvc ,rest api project is build with maven . So any one can download it and build it localy and run it .

### Clone
- Install git first.
- Then clone the project

```shell
- git clone https://github.com/tharangar/SpringApiAgent.git
```

### Setup
- Create a database "rest" in your localdata base
- Create a user with privileges to this database username "rest" and password "rest".
- use the rest.sql database dump file for importing the database to your local machine.
- mysql -u root -psomepassword rest < rest.sql

- Download and install maven first.
- change to the cloned directory
- mvn compile
- mvn test
- mvn package
- Then target folder will be created and restCore.war can be found inside.
- Deploy it in local tomcat server

Or you can import as a maven project to your eclipse IDE.
After import the project build and run on tomcat web server.

### Test
- Use a browser or postman tool to check the API.
- http://localhost:8080/restCore/API/um/login/fnh/fnh@123
- Wehn enter above URL it will ask a username and password first.
- this is due to Basic Authentication feature in the project.
- give bill as username and abc123 as password.
- Response should be {"login":"success"} and then change the fnh or fnh@123 in the url and you will see failed message.

## FAQ

- **How do we generate the model classes of a new database?**
    - You may use jpa plugins in eclipse to generate model classes (pojo) from a database.

---

## Support






---

## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
- Copyright 2015 ©


