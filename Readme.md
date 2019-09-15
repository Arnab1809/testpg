![UiS](https://www.uis.no/getfile.php/13391907/Biblioteket/Logo%20og%20veiledninger/UiS_liggende_logo_liten.png)

# Assgnment 2: Java OO Programming and I/O

| Lab 1:		| Java OO Programing tools		|
| -------------------- 	| ------------------------------------- |
| Subject: 		| DAT240 Advanced Programming 		|
| Deadline:		| Sep 17 2019 23:59			|
| Expected effort:	| 10-15 hours 				|
| Grading: 		| Pass/fail 				|
| Submission: 		| Individually				|


## Introduction

The overall aim of the labs in this course is to learn how to develop applications,
deploy them as APIs and microservices. We will do this through a series of
lab exercises that will expose you to developing an application in the Java programming language, and some of
the tools that people frequently use to develop and deploy such applications. 

In Assignment 2 you will work on object oriented programming and File I/O operations.



To see the assignment2 in your local directory where you cloned the assignments repository (from previous assignment) first run:
```git pull origin master.```



**Exercise 1 - Reading files in Java: (30% points)**

Change directory to: cd assignments/assignment2 and confirm that the files for assignment2 resides in that folder. They should, assuming that you followed the steps above. The goal of this exercise is to build a lookup table using a hashmap to get the image files for a given label or label of a given image. The information about the data is present in two files (label_mapping.csv and image_mapping.csv). The images to label mapping are done via an integer id. The goal is to read these files and build a HashMap or any other (datastructure you feel is appropriate) to create a look up table. The data for this exercise comes from your project so you can reuse this code later for your project. The file under assignment2/src/main/java/assignment2/ImageLabelReader.java contains the following skeleton code:

```
package assignment2;

public class ImageLabelReader {

	public ImageLabelReader(String file1, String file2) {
		
	}
     	
	//Given an image file get it's label
	//Note that each image has a single label
	public String getLabel(String imageFileName){
		return null;
	}
	
	//Given a label get all the image files corresponding to this label
	//Note that there could be multiple images for a given label
	public String[] getImageFiles(String label){
		return null;
	
	}
	
	
	
}

```

 Implement the function body according to the specification. 
 
 **Exercise 2 - Object design: (70% points)**
 
In this exercise you are required to implement a system for the students to get help from the faculty. There are three ranks of faculty in the increasing order of ranks: StudentAssistant, Professor and HeadofTheDepartment. Each issue has a minimum rank requirement. i.e, the issue which the rank requirement of Professor can only be resolved by a Professor or the HeadofTheDepartment. Students create issues and the IssueHandler assigns it to the first available faculty which meets the rank requirement of the issue. If the issue cannot be assigned to any Faculty members the student issue is added to a queue. When a faculty becomes free (after calling issueCompleted method), one of the rank-appropriate waiting issues will be assigned to that faculty member. The tests will look for the appropriate rank for the allocated issues and wait queue size of the faculty members. The initial stub of the code to start working is in assignment2/src/main/java/assignment2.issueresolver folder.


 
  
For all exercises we have some unit tests but you should write more unit tests using junit to make sure it works and thorough coverage.

Once you are done changing to submit follow instructions below:

- If you haven't already added a remote, run ```git remote add dat240labs https://github.com/uis-dat240-fall19/username-labs``` where username should be replaced with your own GitHub username and dat240labs can be replaced with any name you prefer.
- After you have made the changes commit them with ```git commit -m "Comment"``` and run ```git push dat240labs``` to have the changes pushed up to your own username-labs repository on GitHub. Note that you cloned the original repository but pushing to your own private repository.
- If you make changes to your own username-labs repository using the GitHub web interface, and want to pull those changes down to your own computer, you can run the command:
```git pull dat240labs master```
