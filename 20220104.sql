-- ict_practice 스키마 사용모드로 전환
use ict_practice;

SELECT * FROM userTbl;

-- ORDER BY는 결과물의 개수나 종류에는 영향을 미치지 않지만
-- 결과물을 순서대로(오름차순, 내림차순) 정렬하는 기능을 가집니다.
-- SELECT 컬럼명 FROM 테이블명 ORDER BY 기준컬럼 정렬기준;
-- 정렬기준은 ASC(오름차순), DESC(내림차순)이 있으며
-- 입력이 따로 없는 경우는 기본을 ASC로 잡습니다.

-- 가입한 순서(reg_date순으로 오름차순 조회를 해보겠습니다)
SELECT * FROM userTbl ORDER BY reg_date DESC;

-- 키 작은 순으로 나열해 주세요
SELECT * FROM userTbl ORDER BY height;

-- 정렬시 동점인 부분을 처리하기 위해 ORDER BY 절을 두 개 이상 동시에 나열할수도 있습니다.
-- 아래 코드는 키로 오름차순으로 하되, 동점이면 생년 내림차순으로 나열합니다.
SELECT * FROM userTbl ORDER BY height ASC, birth_year DESC;

-- 만약에 문자라면 아스키코드 순으로 ORDER BY 정렬이 들어갑니다.
-- user_name으로 ORDER BY를 걸어보세요.
SELECT * FROM userTbl ORDER BY user_name;

-- 지역 가나다라 역순으로 나열해주시되, 만약 지역이 같다면 이름 오름차순으로 정렬해주세요.
SELECT * FROM userTbl ORDER BY addr DESC, user_name ASC;

-- DISTINCT는 결과물로 나온 컬럼의 중복값을 다 제거하고
-- 고유값을 남겨줍니다.

-- 아래 코드는 지역 종류 5개(데이터 개수는 10개)를 파악하기 어렵습니다.
SELECT addr FROM userTbl;

-- 중복값을 하나로 출력하기 위해 출력 컬럼 앞에 distinct를 붙입니다.
SELECT distinct addr FROM userTbl;

-- employees 스키마로 돌아옵니다.
use employees;

-- 출력 요소의 개수를 제한할때는 limit 구문을 사용합니다.
-- 데이터가 170000개에 가깝다보니 모든 데이터를 보여주지 않고
-- 1000개만 보여주도록 설정되어있음
SELECT * FROM employees;

-- 테이블명 뒤에 limit 숫자; 가 오는 경우는 적은 숫자 개수만큼만
-- 결과창에 보여줍니다.
-- 숫자를 하나만 적으면 자동으로 0번자료부터 n개를 보여줍니다.
SELECT * FROM employees limit 10;

-- limit는 ORDER BY와 결합해 쓸 수 있습니다.
SELECT * FROM employees ORDER BY hire_date DESC limit 10;

-- 일정 데이터셋을 먼저 얻어놓고 그 내부적으로 정렬시킬때는 서브쿼리를 씁니다.
SELECT * FROM (SELECT * FROM employees limit 10) e ORDER BY hire_date DESC;

-- 만약 limit 숫자1, 숫자2; 와 같이 숫자 2개를 넣는경우
-- 숫자 1번부터 숫자 2에 기입한 갯수만큼 보여줍니다.
SELECT * FROM employees limit 5, 10;


-- GROUP BY는 같은 데이터를 하나의 그룹으로 묶어줍니다.
-- 조건절은 WHERE가 아닌 HAVING절로 처리하게 됩니다.
use ict_practice;

-- 하기 데이터에서 각 인물별로 구매한 개수 총합을 구해보겠습니다.
SELECT user_id, amount FROM buyTbl ORDER BY user_id;

-- SELECT 컬럼명, 집계함수(컬럼명2)... FROM 테이블명 GROUP BY 묶을컬럼명;
SELECT user_id, sum(amount) FROM buyTbl GROUP BY user_id;

-- 각 유저별 총 구매액을 구해주세요.
-- 충 구매액은 가격 * 개수의 결과를 다 더한것입니다.
-- 가격은 price컬럼에, 개수는 amount컬럼에 있습니다.
-- 집계함수 sum()의 소괄호 사이에서 +, * 등의 연산을 할 수 있습니다.
SELECT user_id, sum(price * amount) as purchase FROM buyTbl GROUP BY user_id;

-- 각 유저별 구매 물품의 평균가를 구해보세요(총액 아님) 평균은 avg()로 처리합니다.
SELECT user_id, avg(price) as 평균가 FROM buyTbl GROUP BY user_id;

SELECT COUNT(*) FROM employees.employees;

-- userTbl에서 키가 제일 큰 회원의 이름과 키를 표시해주세요.
SELECT user_name, max(height) FROM userTbl;

SELECT user_name, height FROM userTbl WHERE height = 
	(SELECT max(height) FROM userTbl);
    
-- userTbl에서 키가 가장 작은 회원을 찾아주세요.
SELECT user_name, height FROM userTbl WHERE height =
	(SELECT min(height) FROM userTbl);

-- usertbl 사용자 전체 키 평균을 구해주세요.
SELECT avg(height) as '평균 키' FROM userTbl;

SELECT * FROM userTbl;


-- 기존 쿼리문에서의 조건절은 WHERE절을 이용해서 처리했었습니다.
-- 하지만 GROUP BY를 통해 집계하는 경우 WHERE절을 받을수가 없습니ㅏㄷ.
-- 대신 조건절을 HAVING으로 대체해 사용합니다.
-- 우선 사용자별 총 구매액(buyTbl)다시 구해보겠습니다.
-- sum(price * amount)를 활용해서 작성해주세요.
SELECT user_id, sum(price * amount) as '총구매액' 
	FROM buyTbl GROUP BY user_id;

-- 구매액이 250000을 넘는 사람만 남겨보겠습니다.
SELECT user_id, sum(price * amount) as '총구매액' 
	FROM buyTbl GROUP BY user_id HAVING sum(price * amount) > 250000;

-- 키가 평균보다 큰 사람들만 화면에 출력해주세요(userTbl)
SELECT user_name, height FROM userTbl GROUP BY user_name
	HAVING height > (SELECT avg(height) FROM userTbl);
    
-- 키가 평균보다 큰 지역만 화면에 출력해주세요(userTbl)
SELECT addr, avg(height) FROM userTbl
	GROUP BY addr HAVING avg(height) > (SELECT avg(height) FROM userTbl);
    

-- SQL 구문의 분류
-- DML : Data Manipulation Language
-- 데이터 조작언어로 SELECT, INSERT, UPDATE, DELETE 구문을 의미
-- 테이블의 데이터를 조회하거나 변경하기 위해서 사용한다.

-- DDL : Data Definition Language
-- 데이터 정의언어로 데이터베이스, 테이블, 뷰, 인덱스 등을 생성하고
-- 삭제하는 구문으로 CREATE, DROP, ALTER가 있습니다.
-- DML과는 달리 commit; 없어도 바로바로 서버에 반영됩니다.

-- DCL : Data COntrol Language
-- 데이터 제어 언어로 특정 계정에 대한 권한을 부여하거나 뺏을 때 사용합니다.
-- GRANT, REVOKE, DENY 등이 있습니다.


-- 테이블 생성하기
-- 테이블명 : testTbl1, 
-- id int, user_name varchar(3), age int 형식으로 생성해주세요.
CREATE TABLE testTbl1(
	
    id int primary key,
    user_name varchar(3),
    age int

);

-- 테이블명 뒤에 컬럼정보를 적지 않으면, CREATE TABLE시 설정한
-- 컬럼 정보가 순서대로 대입됩니다(id, user_name, age 순으로)
INSERT INTO testTbl1 VALUES(1, '홍길동', 25);

-- id와 이름쪽에만 데이터를 넣을 때에는 컬럼명을 생략할 수 없습니다.
INSERT INTO testTbl1(id, user_name) VALUES(2, '김길동');

-- 만약 컬럼명 지정을 안했지만 age에는 null을 넣고 싶다면
INSERT INTO testTbl1 VALUES(3, '이호영', null);

-- 만약 입력하는 컬럼(열)의 순서를 바꿔서 지정하는 경우는
-- (id, user_name, age가 아닌순으로 넣음)
-- 모든 컬럼에 값을 입력하는 상황이어도 컬럼명을 따로 기입해야합니다.
INSERT INTO testTbl1(user_name, age, id) VALUES('안해찬', 10, 4);

SELECT * FROM testtbl1;

    