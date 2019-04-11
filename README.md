# Polar

## Table of contents
1. [About](#about)
2. [Installation](#installation)
3. [Contributing](#contributing)
4. [Team](#team)
5. [License](#license)

## About

Polar is a Java application to make the you and your friends more aware of their ecological footprint and it will help you to reduce your footprint. Compete against friends and compare statistics with each other to see how green you are. Install it now and save the world.

## Installation

There are 2 ways of running our program, you can connect to the server on your local machine or you can connect to the one on Heroku.

To open the application without using any IDE, simply download the project through clicking on the download link of [this page](https://imnublet.github.io/Polar/) and run it.

If you want to use Intellij there are several steps:

1. Run the following commands.

```bash
git clone git@gitlab.ewi.tudelft.nl:cse1105/2018-2019/oopp-group-3/template.git
```

```bash
mvn clean install -U
```

2. After running the previous commands, if you still want to connect to Heroku, go directly to the client module, specifically the RestfulClient class from the classes package and replace every instance of "http://localhost:8080/" with "https://poolar.herokuapp.com/" and then simply run the Main class from the client package.

3. If you do not want to use Heroku, after running the previous commands, follow the next steps: 

4. Make sure you have PGADMIN("https://www.pgadmin.org/") installed on your computer and you know the login creadentials. 

5. Open PGADNIN and create a database called "test_gogreen". 

6. Change the application.properties file from the resources directory found in the server module and replace the login credentials.

7. Now, it's time to run the Application class from the server module.

8. And the only thing left now is to run the Main class from the client module.

9. If you experience any issues with the installation or you find any bugs, do not hesitate to contact any of us.


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Team
**Oliver Parfitt van Pallandt**:
`Student number: 4943945`

![Oliver Parfitt van Pallandt](https://docs.google.com/uc?id=1IRZN4DK2h423HfdPc2hQxt-U5QGpl2MO)

**Stelios Avgousti**  `Student number: 4822978`

![Stelios Avgousti](https://docs.google.com/uc?id=1cXPzBfvGFHcsS1L2J2t2ldR0E63SQyzF)

**Julian Holle** `Student number: 4893719`

![Julian Holle](https://docs.google.com/uc?id=1I3aUc1n8Tc_2rtw5yP1M69XMFAk-KhVV)

**Tijs Zijl** `Student number: 4645790`

![Tijs Zijl](https://docs.google.com/uc?id=1IVwkd-zjtyJVkspu9yYNzWxqe_7QNJAB)

**Hashim Karim** `Student number: 4811518`

![Hashim Karim](https://docs.google.com/uc?id=1OdiuUzGTZ68gf05Gajjbizk_H0CUWoPo)

**Sayf El Kaddouri** `Student number: 4687809`

![Sayf El Kaddouri](https://docs.google.com/uc?id=1k5-8syzS0L7mLqq1ExWkkiNNtFLo2OtI)

**Florentin-Ionut Arsene** `Student number: 4839684`

![Florentin-Ionut Arsene](https://docs.google.com/uc?id=1MxrZbUFPXh7hYQax38IY44IETB5p6H8b)

## License
[MIT](https://choosealicense.com/licenses/mit/)

