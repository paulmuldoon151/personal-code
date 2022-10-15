/* Query a) */
SELECT (ModuleTitle), (StartDate), (EndDate)
FROM university.module
WHERE (Course) = 
		(SELECT (CourseCode)
		 FROM university.course
		 WHERE (CourseTitle) = 'Information Technologies');
		 
/* Query b) */
SELECT (Surname), (Post), (Qualification)
FROM university.staff LEFT OUTER JOIN university.staffqualifications
ON (staff.StaffID) = (staffqualifications.StaffID)
WHERE (StaffDepartment) =
		(SELECT (DepartmentCode)
		 FROM university.department
		 WHERE (DepartmentName) = 'Computing, Engineering and Intelligent Systems');
		
/* Query c) */
SELECT (StudentID), (Surname), (Sex)
FROM university.student
WHERE (StudentID) IN (SELECT StudentID
    FROM university.studentmodule
    WHERE (ModuleCode) = (SELECT ModuleCode
        FROM Module
        WHERE (ModuleTitle) = 'Database Systems'))
        ORDER BY (Surname);
       
/* Query d) */
SELECT (StaffID), (Surname), (Sex), (Post)
FROM university.staff
WHERE (Salary) = (SELECT MAX(salary) AS HIGHEST_SALARY
        FROM university.staff);

/* Query e) */
SELECT (StaffID), (Surname), (Sex), (Post)
FROM university.staff
WHERE Salary = (SELECT MAX(Salary) AS SECOND_HIGHEST_SALARY
        FROM university.staff 
        WHERE (Salary) < (SELECT MAX(salary) AS HIGHEST_SALARY
              FROM university.staff));

/* Query f) */
SELECT StaffID, Surname, Sex, Post 
FROM university.staff 
WHERE (Salary) > (SELECT AVG(Salary) FROM university.staff);

/* Query g) */
SELECT COUNT(CASE WHEN sex = 'M' THEN 1 END) AS MaleStaff, 
       COUNT(CASE WHEN sex = 'F' THEN 1 END) AS FemaleStaff
       FROM university.staff
       WHERE StaffDepartment = 
              (SELECT DepartmentCode 
              FROM university.department
              WHERE DepartmentName = 'Computing, Engineering and Intelligent Systems');
  
/* Query h) */
SELECT CourseTitle
  FROM Course 
     INNER JOIN Student
       ON Course = CourseCode
        GROUP BY CourseTitle
          HAVING COUNT(*) > 6;

/* Query i) */
SELECT (Surname), (WorkingHours), (ModuleTitle)
FROM university.staff RIGHT OUTER JOIN university.module
ON (StaffID) = (ModuleCoordinator)
WHERE (WorkingHours) > 6;

/* Query j) */
UPDATE university.staff
SET Salary = Salary*1.025
WHERE (StaffDepartment) =
		(SELECT (DepartmentCode)
		 FROM university.department
		 WHERE (DepartmentName) = 'Biomedical Sciences');
		 

		
		

