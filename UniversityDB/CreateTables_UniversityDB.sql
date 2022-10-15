CREATE DATABASE University;

/* Create Tables */

CREATE TABLE University.Student (
	StudentID varchar(9) NOT NULL,
	NetworkID varchar(15) NOT NULL,
	FirstName varchar(20) NOT NULL,
	Surname varchar(25) NOT NULL,
	Street varchar(20) NOT NULL,
	City varchar(10) NOT NULL,
	Postcode varchar(8) NOT NULL,
	DOB date NOT NULL,
	Sex varchar(1) NOT NULL,
	Course varchar(20) NOT NULL,
	Finance double NOT NULL
);

CREATE TABLE University.Module (
	ModuleCode varchar(6) NOT NULL,
	ModuleTitle varchar(25) NOT NULL,
	StartDate date NOT NULL,
	EndDate date NOT NULL,
	Course varchar(5) NOT NULL,
	ModuleCoordinator varchar(9) NOT NULL,
	ExamPercentage double NOT NULL,
	CourseworkPercentage double NOT NULL
);

CREATE TABLE University.StudentModule (
StudentID varchar(9) NOT NULL,
ModuleCode varchar(6) NOT NULL,
Performance varchar(4) NOT NULL
);

CREATE TABLE University.ModuleTextbooks (
ModuleCode varchar(6) NOT NULL,
TextbookISBN varchar(17) NOT NULL,
Author varchar(30) NOT NULL,
Title varchar(50) NOT NULL,
Version varchar(15) NOT NULL
);

CREATE TABLE University.Staff (
	StaffID varchar(9) NOT NULL,
	NetworkID varchar(15) NOT NULL,
	FirstName varchar(20) NOT NULL,
	Surname varchar(25) NOT NULL,
	Address varchar(65) NOT NULL,
	NatInsNumber varchar(9) NOT NULL,
	OfficeNumber varchar(5) NOT NULL,
	Sex varchar(1) NOT NULL,
	Salary DOUBLE NOT NULL,
	Post varchar(20) NOT NULL,
	Email varchar(40) NOT NULL,
	MentorID varchar(9),
	StaffDepartment varchar(10) NOT NULL,
	WorkingHours int NOT NULL
);

CREATE TABLE University.StaffQualifications (
	StaffID varchar(9) NOT NULL,
	Qualification varchar(15) NOT NULL
);

CREATE TABLE University.Department (
		DepartmentCode varchar(10) NOT NULL,
		DepartmentName varchar(30) NOT NULL,
		PhoneNumber varchar(11) NOT NULL,
		FaxNumber varchar(11) NOT NULL,
		Location varchar(6) NOT NULL
		);
		
CREATE TABLE University.Course (
		CourseCode varchar(5) NOT NULL,
		CourseTitle varchar(75) NOT NULL,
		CourseDuration varchar(9) NOT NULL,
		CourseDepartment varchar(10) NOT NULL,
		CourseCoordinator varchar(9) NOT NULL
		);
