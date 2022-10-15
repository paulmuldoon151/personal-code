/* Department Table */

ALTER TABLE university.department
ADD CONSTRAINT Department_PK PRIMARY KEY department(DepartmentCode);

/* Staff Table */

ALTER TABLE university.staff
ADD CONSTRAINT Staff_PK PRIMARY KEY (StaffID)

ALTER TABLE university.staff
ADD CONSTRAINT Staff_FK1 FOREIGN KEY (MentorID) REFERENCES university.staff(StaffID);

ALTER TABLE university.staff
ADD CONSTRAINT Staff_FK2 FOREIGN KEY (StaffDepartment) REFERENCES university.department(DepartmentCode);

ALTER TABLE university.staff
ADD CHECK(Sex IN('M', 'F', 'O'));

ALTER TABLE university.staff
ADD CONSTRAINT Staff_AltKey UNIQUE KEY (NetworkID);

/* Course Table */

ALTER TABLE university.course 
ADD CONSTRAINT Course_PK PRIMARY KEY (CourseCode);

ALTER TABLE university.course 
ADD CONSTRAINT Course_FK1 FOREIGN KEY (CourseDepartment) REFERENCES university.department(DepartmentCode);

ALTER TABLE university.course 
ADD CONSTRAINT Course_FK2 FOREIGN KEY (CourseCoordinator) REFERENCES university.staff(StaffID);

/* Student Table */

ALTER TABLE university.student
ADD CONSTRAINT Student_PK PRIMARY KEY (StudentID);

ALTER TABLE university.student
ADD CONSTRAINT Student_AltKey UNIQUE KEY (NetworkID);

ALTER TABLE university.student
ADD CONSTRAINT Student_FK FOREIGN KEY (Course) REFERENCES university.course(CourseCode);

ALTER TABLE university.student
ADD CHECK(Sex IN('M', 'F', 'O'));

/* Module Table */

ALTER TABLE university.module
ADD CONSTRAINT Module_PK PRIMARY KEY (ModuleCode);

ALTER TABLE university.module
ADD CONSTRAINT Module_FK1 FOREIGN KEY (Course) REFERENCES university.course(CourseCode);

ALTER TABLE university.module
ADD CONSTRAINT Module_FK2 FOREIGN KEY (ModuleCoordinator) REFERENCES university.staff(StaffID);

ALTER TABLE university.module
ADD CHECK (ExamPercentage >=0 AND ExamPercentage <=100);

ALTER TABLE university.module
ADD CHECK (CourseworkPercentage >=0 AND CourseworkPercentage <=100);

/* StudentModule Table */

ALTER TABLE university.studentmodule
ADD CONSTRAINT StudentModule_PK PRIMARY KEY (StudentID, ModuleCode);

ALTER TABLE university.studentmodule
ADD CONSTRAINT StudentModule_FK1 FOREIGN KEY (StudentID)
REFERENCES university.student(StudentID);

ALTER TABLE university.studentmodule
ADD CONSTRAINT StudentModule_FK2 FOREIGN KEY (ModuleCode) 
REFERENCES university.module(ModuleCode);

ALTER TABLE university.studentmodule
ADD CHECK (Performance IN('pass', 'fail'));

/* ModuleTextbooks Table */

ALTER TABLE university.moduletextbooks
ADD CONSTRAINT ModuleTextbooks_PK PRIMARY KEY (ModuleCode, TextbookISBN);

ALTER TABLE university.moduletextbooks
ADD CONSTRAINT ModuleTextbooks_FK FOREIGN KEY (ModuleCode) REFERENCES university.module(ModuleCode);

/* StaffQualifications Table */

ALTER TABLE university.staffqualifications
ADD CONSTRAINT StaffQ_PK PRIMARY KEY (StaffID, Qualification);

ALTER TABLE university.staffqualifications
ADD CONSTRAINT StaffQ_FK FOREIGN KEY (StaffID) REFERENCES university.staff(StaffID);






    
    

    
	