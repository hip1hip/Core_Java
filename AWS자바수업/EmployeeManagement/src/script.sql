delimiter //
CREATE PROCEDURE sp_insert_employee
(
	IN v_empno	VARCHAR(4),
    IN v_ename	VARCHAR(20),
    IN v_dname 	VARCHAR(20),
    IN v_grade	SMALLINT,
    IN v_setbonus	INT,
    IN v_familybonus INT,
    IN v_overtime INT,
    IN v_total INT,
    IN v_salary INT

)
BEGIN
	INSERT INTO employee
    VALUES (v_empno, v_ename, v_dname, v_grade, v_setbonus, v_familybonus, v_overtime, v_total, v_salary);
    COMMIT;
END
//
delimiter ;


DELIMITER $$
CREATE PROCEDURE sp_select_all_employees()
BEGIN
    SELECT *
    FROM employee
    ORDER BY empno;
END $$
DELIMITER ;