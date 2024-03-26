--view
SELECT * FROM EMP_DETAILS_VIEW edv ;

CREATE VIEW v_emp(
	emp_id, first_name, job_id, hiredate, dept_id	
)AS 
SELECT employee_id, first_name, job_id,
	   hire_date, department_id
FROM  EMPLOYEES e 
WHERE job_id = 'ST_CLERK';

SELECT * FROM v_EMP ve ;

CREATE VIEW v_emp2(
	emp_id, first_name, job_id, hiredate, dept_id	
)AS 
SELECT employee_id, first_name, job_id,
	   hire_date, department_id
FROM  EMPLOYEES e 
WHERE job_id = 'ST_CLERK'
;

--view 삭제
DROP VIEW v_emp2 ;
SELECT * FROM  V_EMP2 ve; 

CREATE  OR REPLACE VIEW v_emp3(
	emp_id, first_name, job_id, hirdate, cms_pct
)AS 
SELECT employee_id, first_name, job_id, hire_date,NVL(commission_pct,0)
FROM EMPLOYEES e 
;
SELECT *
FROM V_EMP3 
WHERE emp_id= 139;

--오류 : ORA-01733: virtual column not allowed here
--함수로 작성된 부분은 수정 불가
UPDATE V_EMP3 SET  cms_pct = 0.5
WHERE emp_id =139;

/*
 * v_emp_salary
 * emp_id, last_name, salary, annual_sal
 * annual_sal : (salaty + nvl(commission_pct,0)*salaty)*12
 * 15분 까지 
 */

CREATE VIEW v_emp_salary(
	emp_id, last_name,salary, annual_sal
)AS
SELECT employee_id,last_name,salary,(salary + NVL(commission_pct,0)*salary)*12
FROM EMPLOYEES e 
;

SELECT * FROM V_EMP_SALARY ves
WHERE emp_id = 100;

UPDATE V_EMP_SALARY SET last_name= 'kim'
WHERE emp_id = 100;



CREATE VIEW v_emp_salary2(
	emp_id, last_name,salary, annual_sal
)AS
SELECT employee_id,last_name,salary,(salary + NVL(commission_pct,0)*salary)*12
FROM EMPLOYEES e 
with READ only
;
--오류 ORA-42399: cannot perform a DML operation on a read-only view
UPDATE V_EMP_SALARY2 SET last_name= 'king'
WHERE emp_id = 100;


/* view 이름 : v_join
 * view 컬럼 : 사번 이름 부서번호 부서명 입사일 
 * 단, 동일한 veiw가 존재할떄 해당 뷰로 대체 생성 
 */

CREATE OR REPLACE VIEW V_jon(
	"사번" ,"이름" ,"부서번호" ,"부서명" ,"입사일"
)AS
SELECT e.employee_id ,e.first_name ||' '|| e.LAST_name,
        d.DEPARTMENT_ID, d.DEPARTMENT_NAME ,e.HIRE_DATE
FROM EMPLOYEES e 
LEFT outer JOIN DEPARTMENTS d  
ON e.department_id = d.department_id;
;


SELECT * FROM v_jon



--sequence
CREATE SEQUENCE seq_serial_no
INCREMENT BY 1
START WITH 100
MAXVALUE 110 
MINVALUE 99
CYCLE 
cache 2; 

-- 다음 값
CREATE TABLE goods(
	good_no 	number(3),
	good_name   varchar2(10)
);

-- nextval : 다읍 값을 출력하는 시퀀스의 펑션이다
INSERT INTO GOODS 
VALUES (seq_serial_no.nextval , '제품1');

--현재 시퀀스 값: 시퀀스이름.currvla 
INSERT INTO GOODS 
VALUES (seq_serial_no.nextval , '제품2');

SELECT * FROM GOODS g ;
SELECT seq_serial_no.currval FROM DUAL ;
DROP SEQUENCE seq_serial_no;


--index 102	Lex	De Haan	LDEHAAN	515.123.4569	2001-01-13 00:00:00.000
CREATE TABLE EMPLOYEES3 AS SELECT *FROM  EMPLOYEES e ;

--
SELECT  * FROM  EMPLOYEES3 e ;
INSERT INTO EMPLOYEES3 (
	employee_id, first_name, last_name)
VALUES  (102, 'John','De Haan');

--index 생성 
-- employee_id unique index
-- 에러 
CREATE UNIQUE INDEX idx_employee3_id2
ON EMPLOYEES3(employee_id);	


CREATE INDEX idx_employee3_id
ON EMPLOYEES3(employee_id);

SELECT *
--DELETE  
FROM  EMPLOYEES3 e 
WHERE e.EMPLOYEE_ID =102
AND FIRST_NAME = 'John'