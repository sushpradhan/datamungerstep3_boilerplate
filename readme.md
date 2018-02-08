## Seed code - Boilerplate for step 3 - Database Engine Assignment

### Problem Statement

In the previous assignment 2, we extracted different parts of the query and stored the query parameters/parts in separate classes with properties and methods. 
The classes were given meaningful names like **AggregateFunctions, Restrictions, QueryParameter and QueryParser** based on to the operations they performed.

In this Assignment 3, we will 

    1. Read the header.  
    2. Identify the Data type of each field 

**Read the header**
The CSV file contains a set of data, where the first line is the header, for example: in our ipl.csv the following are the header 
**id, season, city, date, team1, team2, toss_winner, toss_decision, result, dl_applied, winner, win_by_runs, win_by_wickets, player_of_match, venue, umpire1, umpire2, umpire3** 

**Identify the Datatype of each field**
We cannot identify the data type of the field just by reading the header. We need to read a row which contains actual data.

All the data in the CSV file are in string format. We need to convert the nonstring data into its respective data type, this is needed because whenever we perform some sort of conditional operations we will be in need of the respective data type. 

For example, the following is the single line data of the CSV file 
**1, 2008, Bangalore, 2008-04-18, Kolkata Knight Riders, Royal Challengers Bangalore, Royal Challengers Bangalore, field, normal, 0, Kolkata Knight Riders, 140, 0, BB McCullum, M Chinnaswamy Stadium, Asad Rauf, RE Koertzen,**

here you can easily find data which is not a string **(for example 2008, 2008-04-18, 140 etc.,).** The numeric data should be converted into an integer or double. 

However, for this assignment, we will not try to convert date. It will be addressed in the next assignment.

**Note : Once you have cloned boilerplate from the given gitlab URL, import the project into eclipse. 
Your project’s test cases might show compile time errors for methods, as you have not written the complete code.**

### Expected Output
Display each column header along with its data type
     
                Enter the file name:
                (Input from User) data/ipl.csv
                
                Output
                id:java.lang.Integer
                season:java.lang.Integer
                city:java.lang.String
                date:java.lang.String
                team1:java.lang.String
                team2:java.lang.String
                toss_winner:java.lang.String
                toss_decision:java.lang.String
                result:java.lang.String
                dl_applied:java.lang.Integer
                winner:java.lang.String
                win_by_runs:java.lang.Integer
                win_by_wickets:java.lang.Integer
                player_of_match:java.lang.String
                venue:java.lang.String
                umpire1:java.lang.String
                umpire2:java.lang.String
                umpire3:java.lang.String

### Project structure

The folders and files you see in this repositories is how it is expected to be in projects, which are submitted for automated evaluation by Hobbes

    Project
    |
    ├── resources                                     // If a project needs any data file, it can be found here/placed here, if data is huge they can be mounted, no need put it in your repository
    |
    ├── com.stackroute.datamunger                      // all your java file will be stored in this package
    |    └── query
    |        └── DataTypeDefinitions.java            // this class contains a String array to hold the column data types
    |        └── Header.java                         // This class implements the getHeader method to return a Header object which contains a String array for containing headers.
    |    └── reader
    |        └── CsvQueryProcessor.java              // This class is used to read data from CSV file
    |        └── QueryProcessingEngine.java          //abstract class containing three abstract methods that should be implemented in CsvQueryProcessor class
    |    └── test                                     // all your test cases are written using JUnit, these test cases can be run by selecting Run As -> JUnit Test 
    |
    ├── .classpath                                    // This file is generated automatically while creating the project in eclipse
    |
    ├── .hobbes                                       // Hobbes specific config options, such as type of evaluation schema, type of tech stack etc., Have saved default values for convenience
    |
    ├── .project                                    // This is automatically generated by eclipse if this file is removed your eclipse will not recognize this as your eclipse project. 
    |
    ├── pom.xml                                     // This is a default file generated by maven if this file is removed your project will not get recognized in hobbes.
    |
    └── PROBLEM.md                                  // This files describes the problem of the assignment/project, you can provide as much as information and clarification you want about the project in this file

> PS: All lint rule files are by default copied during the evaluation process, however, if need to be customizing, you should copy from this repo and modify in your project repo


#### To use this as a boilerplate for your new project, you can follow these steps

1. Clone the base boilerplate in the folder **assignment-solution-step3** of your local machine
     
    `git clone https://gitlab-dev.stackroute.in/datamunger-java/step-3-boilerplate.git assignment-solution-step3`

2. Navigate to assignment-solution-step3 folder

    `cd assignment-solution-step3`

3. Remove its remote or original reference

     `git remote rm origin`

4. Create a new repo in gitlab named `assignment-solution-step3` as private repo

5. Add your new repository reference as remote

     `git remote add origin https://gitlab.training.com/{{yourusername}}/assignment-solution-step3.git`

     **Note: {{yourusername}} should be replaced by your username from gitlab**

5. Check the status of your repo 
     
     `git status`

6. Use the following command to update the index using the current content found in the working tree, to prepare the content staged for the next commit.

     `git add .`
 
7. Commit and Push the project to git

     `git commit -a -m "Initial commit | or place your comments according to your need"`

     `git push -u origin master`

8. Check on the git repo online, if the files have been pushed


### Important instructions for Participants
> - We expect you to write the assignment on your own by following the guidelines, learning plan, and the practice exercises
> - The code must not be plagiarized, the mentors will randomly pick the submissions and may ask you to explain the solution
> - The code must be properly indented, code structure maintained as per the boilerplate and properly commented
> - Follow the problem statement and stories shared with you

### Further Instructions on Release

*** Release 0.1.0 ***

- Right-click on the Assignment select Run As -> Java Application to run your Assignment.
- Right-click on the Assignment select Run As -> JUnit Test to run your Assignment.