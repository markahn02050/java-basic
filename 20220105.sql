use ict_practice;

SELECT * FROM testTbl1;

-- 지금 testTbl1같은 경우 id를 수동으로 입력해주고 있습니다.
-- 이 경우 매번 id값을 사용자가 계산해서 insert해야하기때문에
-- 굉장히 불편한데 auto_increment 속성을 컬럼에 걸어주면
-- 데이터를 입력받지 못한다면 컴퓨터가 순차적으로 컬럼에 중복되지 않고
-- 증가하는 숫자를 자동 입력해줍니다.

CREATE TABLE testtbl2(
	
    id int AUTO_INCREMENT primary key,
    user_name varchar(3),
    age int

);

-- id 컬럼에서는 AUTO_INCREMENT가 붙어있으므로 null로 처리해도
-- 자동으로 1부터 숫자가 1씩 증가하며 들어갑니다.
INSERT INTO testtbl2 VALUES(null, '알파카', 4);
INSERT INTO testtbl2 VALUES(null, '에뮤', 2);
INSERT INTO testtbl2 VALUES(null, '토끼', 1);

-- 현재 3개의 데이터가 들어갔으므로 AUTO_INCREMENT의 다음 값은 4입니다.
SELECT * FROM testtbl2;

-- AUTO_INCREMENT의 기준값은 1부터 1씩 자동으로 증가하지만
-- 만약에 사용자가 임의로 값을 바꾸고 싶다면 ALTER TABLE을 이용해
-- AUTO_INCREMENT의 값을 수정할 수도 있습니다.
-- AUTO_INCREMENT의 현재 값을 1000으로 수정하는 구문
ALTER TABLE testtbl2 AUTO_INCREMENT = 1000;
INSERT INTO testtbl2 VALUES(null, '반달곰', 10);
INSERT INTO testtbl2 VALUES(null, '산양', 3);

-- AUTO_INCREMENT는 기본적으로 1씩 증가하는데
-- 이 증가분을 수정하고 싶다면 서버측 변수인
-- @@auto_increment_increment를 바꿔야 합니다.
-- testtbl2와 모든 조건이 같고 이름만 testtbl3인 테이블을 하나 더 만들어주세요.
CREATE TABLE testtbl3(
	
    id int AUTO_INCREMENT primary key,
    user_name varchar(3),
    age int

);

ALTER TABLE testtbl3 AUTO_INCREMENT = 1500;

-- 증가분을 1이 아닌 3으로 세팅하는법
SET @@auto_increment_increment = 3;
-- 동물 3마리를 testtbl3에 추가해보세요.
INSERT INTO testtbl2 VALUES(null, '고양이', 3);
INSERT INTO testtbl2 VALUES(null, '강아지', 3);
INSERT INTO testtbl2 VALUES(null, '돌고래', 1);

SET @@auto_increment_increment = 1;
-- testtbl2에 하나의 데이터를 더 추가하고 증가량이 돌아왔는지 체크해주세요.
-- cmd에 해주세요.

-- 하나의 INSERT INTO 구문으로 여러 row를 추가할때는
-- VALUES 뒤쪽을 연달아 작성합니다.
INSERT INTO testtbl2 VALUES(null, '말', 4), (null, '오리', 1), (null, '닭', 2);

SELECT * FROM testtbl2;

-- UPDATE 구문은 기존에 입력되어 있는 값을 변경할때 사용합니다.
-- WHERE 조건절을 걸지 않는다면, 컬럼 하나의 값을 전부 바꿉니다.
-- 따라서 일반적으로는 무조건 조건절과 조합해서 사용합니다.
-- UPDATE 테이블명 SET 컬럼1 = 바꿀값1, 컬럼2 = 바꿀값2...;

-- testtbl2의 user_name을 전부 '소'로 바꾸는 구문
UPDATE testtbl2 SET user_name = '소';

-- workbench에서 WHERE절 없이 수정하고 싶다면 safe_update모드를 해제해야합니다
SET SQL_SAFE_UPDATES = 0;

-- testtbl2의 user_name을 전부 '말'로 고쳐보세요.
UPDATE testtbl2 SET user_name = '말';

-- 특정 나이대의 user_name을 여러분들이 좋아하는 동물로 교체해주세요.
UPDATE testtbl2 SET user_name = '돌고래' WHERE age BETWEEN 1 AND 5;

-- UPDATE구문이 전체 컬럼에 적용될 수 있다는것을 응용해 특정 컬럼의 값을
-- 일괄적으로 계산식에 따라 새로운 결과값으로 갱신하는것도 가능합니다.
-- 아래 코드는 나이를 2배한 결과물입니다.
UPDATE testtbl2 SET age = age * 2;
-- 다시 원래대로 돌려보세요.
UPDATE testtbl2 SET age = age / 2;

SELECT * FROM testtbl2;


-- DELETE FROM 구문은 데이터를 삭제하는 구문입니다.
-- SELECT는 특정한 컬럼들만 조회하거나, 전체를 모두 조회하는 등의
-- 경우의 수가 있었기 때문에 SELECT의 FROM 사이에 구체적은 컬럼며이나
-- 혹은 *을 붙여서 전체 컬럼을 조회했습니다.
-- DELETE 특정 컬럼만 삭제하는 경우가 없고 삭제할거면 전체 row를 삭제하거나
-- 삭제를 안 해 버리거나 이기 때문에
-- DELETE FROM 사이에 아무것도 적지 않습니다.
-- DELETE 역시 일반적으로는 WHERE절과 함께 사용합니다
-- id가 1에 해당하는 데이터만 삭제해보세요
DELETE FROM testtbl2 WHERE id = '1';


-- limit를 사용하면 상위 n개만 삭제할수도 있습니다.
-- 검색 결과물 중 상위 2개만 삭제
DELETE FROM testtbl2 limit 2;

DELETE FROM testtbl2;

-- DELETE FROM은 삭제할 때 시간이 조금 더 오래 걸리는 편인데
-- 이유는 트랜잭션 로그라는것을 한 로우마다 작성하기 때문이다.
-- 따라서 속도를 끌어올리고 싶다면 TRUNCATE를 DELETE FROM 대신 쓰는 경우도 있습니다.
TRUNCATE TABLE testTbl2;

-- TRUNCATE와 DELETE FROM의 속도 차이를 체험해보기 위해서
-- employees 테이블의 자료를 복사해보겠습니다.

CREATE TABLE testtbl4(

	id int,
    first_name varchar(50),
    last_name varchar(50)

);

INSERT INTO testtbl4 (SELECT emp_no, first_name, last_name FROM employees.employees);

SELECT * FROM testtbl4;

-- DELETE FROM 삭제 시간
-- mysql> DELETE FROM testtbl4;
-- Query OK, 300024 rows affected (1.70 sec)

-- TRUNCATATE TABLE 삭제시간
-- mysql> TRUNCATE TABLE testtbl4;
-- Query OK, 0 rows affected (0.04 sec)



-- 조건부로 데이터 입력하기
-- 예를 들어 100개의 데이터를 입력하라고 하는데 첫번째 자료만
-- 기존 데이터의 id와 중복되는 값이 있고, 이후 99건은 PK가 중복되지 않는다고해도
-- SQL 시스템 상 전체 데이터가 입력되지 않는 문제가 발생합니다.
-- 따라서 이 때 중복되는 데이터 1건은 중복된다면 무시하고
-- 이후 나머지 99개 데이터는 중단 없이 정상적으로 입력하도록 만들 수 있습니다.

CREATE TABLE membertbl(

	user_id VARCHAR(6) primary key,
	user_name VARCHAR(3) not null,
	addr VARCHAR(3) not null

);

-- MYSQL은 구문을 통째로 묶어서 실행할 경우 모두 실행하거나 모두 실행하지 않습니다.
INSERT INTO membertbl VALUES('LSH', '이상혁', '서울');
INSERT INTO membertbl VALUES('HS', '허수', '울산');
INSERT INTO membertbl VALUES('JJH', '정지훈', '인천');


-- 추가 데이터를 입력하되 한 건은 중복, 두 건은 중복 없도록 세팅
INSERT IGNORE INTO membertbl VALUES('LSH', '이상혁', '서울');
INSERT IGNORE INTO membertbl VALUES('KHK', '김혁규', '경기');
INSERT IGNORE INTO membertbl VALUES('PDH', '박도현', '충청');

SELECT * FROM membertbl;

-- IGNORE는 기존 데이터를 유지하고 신규데이터를 막는 구문이었는데
-- 이미 존재하는 데이터가 있어도 신규데이터로 갱신해서 넣고 싶은 경우
INSERT INTO membertbl VALUES('LSH', '이상혁', '제주');

-- ON DUPLICATE KEY UPDATE 구문을 쓰면 됩니다.
INSERT INTO membertbl VALUES('LSH', '이상혁', '제주')
	ON DUPLICATE KEY UPDATE user_name = '이상혁', addr = '제주';
    

SELECT * FROM membertbl;

-- ON DUPLICATE KEY UPDATE는 자료가 없으면 INSERT INTO에 적힌대로
-- 데이터를 넣고 자료가 겹치는 상황인 경우에 ON DUPLICATE KEY UPDATE를
-- 실행하는 구문이기 때문에 만약 데이터가 겹치지 않아도 잘 작동합니다.
-- 기존 테이블 요소와 겹치지 않는것을 넣어서 잘 들어가는지 cmd를 이용해 실행.


-- workbench에서 계정생성 및 권한부여하기
-- 1. 좌측의 navigator에서 administration 탭을 클릭합니다.
-- 2. Users and Privileges를 클릭합니다
-- 3. 열리는 화면에서 좌하단 Add Account를 클릭한 다음
--   login name, password등을 입력합니다.
-- 4. 우하단 apply를 누르면 계정생성이 완료됩니다.
-- 5. Account limit는 시간당 기능 사용 가능 횟수를 설정합니다.
-- 6. Administrative Roles는 어떤 구문 실행까지 허용할지입니다.


-- 계정 접속 방법
-- 커맨드라인 접속시 mysql -u 계정명 -p 연결 가능
-- 접속 후 show databases; 를 이용해 db목록 확인가능
-- SELECT user, host FROM user;를 할 경우 생성된 계정목록 조회가능

show databases; -- DB목록 조회




-- 계정 권한주기
-- GRANT 권한1, 권한2... ON DB명.테이블명 TO 아이디@'%';
-- ict_practice 데이터베이스의 testtbl3 테이블에 대한 SELECT, DELETE 권한을
-- icttest계정에 권한을 부여한다면
-- GRANT SELECT, DELETE ON ict_practice.testtbl3 TO icttest@'%';
-- GRANT <권한1, 권한2...> ON DB명.테이블명 TO 계정명@'%';
GRANT SELECT, DELETE ON ict_practice.testtbl3 TO icttest@'%';

-- workbench에서 주기
-- Navigator하단 Administration에서 유저 선택 후 Administrative Roles에서
-- 주고싶은 권한을 체크해주면 됩니다(DBA 선택시 모든 권한 획득)

SELECT * FROM testtbl3;

