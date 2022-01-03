-- employees를 사용 스키마로 지정해주세요.
use employees;

-- employees 내부의 employees 테이블을 조회해주세요.
-- SQL구문은 명령구문은 무조건 대문자, 테이블명이나 호칭 등은
-- 소문자로 작성하는 것이 관례입니다.
-- 무조건 지키지 않아도 실행은 가능하지만, 가독성을 위해 되도록이면 지켜주세요.
SELECT * FROM employees;

-- 컬럼을 전체가 아닌 임의로 가져올때는 컬럼명을 ,로 구분합니다.
-- 이 경우 모든 컬럼이 아닌 일부 컬럼만 조회할 수도 있으며
-- 심지어 한 개의 컬럼만 조회하는 등 개수조절도 가능합니다.
SELECT gender, first_name, last_name FROM employees;


-- CMD환경에서는 좌측 스키마처럼 스키마 목록을 보여주는 창이 없으므로
-- 아래 명령어를 이용해 SCHEMA 목록을 확인할 수 있습니다.
SHOW databases;

-- 현재 DB정보를 조회하기 위해서는
SHOW TABLE STATUS;

-- 특정 테이블의 컬럼정보를 조회하고 싶다면 아래 명령어를 씁니다.
-- DESCRIBE 테이블명; 혹은 DESC 테이블명;
DESCRIBE employees;

-- ict_practice를 디폴드 스키마로 잡아주세요.
use ict_practice;

CREATE TABLE userTbl(
	
    user_id varchar(8) primary key,
    user_name varchar(10) not null,
    birth_year int(4) not null,
    addr varchar(4) not null,
    phone_number varchar(11),
    height int(3),
    reg_date DATE
);


-- AUTO INCREMENT(자동증가)
-- INT(정수) 자료형이 붙은 컬럼에만 붙일 수 있고, 이게 붙은 컬럼은 자동으로 1씩 증가하는 숫자를 배정받습니다.
-- INSERT INTO 구문이 실행될 때 마다 해당 컬럼에 들어갈 숫자를 자동으로 배정해줍니다.
-- 한 번 쓰인 숫자는 다시는 사용되지 않습니다.

-- FOREIGN KEY(외래 키)
-- 쇼핑몰의 구매자는 반드시 회원이어야 합니다.
-- 특정 테이블에 존재하는 값만 해당 컬럼에 들여올 수 있도록 거는 제약조건
-- FOREIGN KEY를 거는 컬럼의 자료형과 크기는 참조하는 폭과 원본 모두 같아야합니다.
-- 참조컬럼에 있는 값만(userTbl의 user_id에 존재하는 값만) butTbl의 user_id에 올 수 있습니다.
CREATE TABLE buyTbl(
	order_number INT AUTO_INCREMENT primary key,
    user_id varchar(8) not null,
    prod_name varchar(6) not null,
    group_name varchar(10),
    price int(7) not null,
    amount int(3) not null,
	foreign key(user_id) references userTbl(user_id)

);

INSERT INTO userTbl VALUES('AHC', '안해찬', 1999, '서울', 01111111111, 185, '2021-12-31');
INSERT INTO userTbl VALUES('AAC', '안해춘', 1985, '경기', 01111112551, 183, '2021-12-31');
INSERT INTO userTbl VALUES('SHM', '손흥민', 1985, '런던', 01134252551, 182, '2021-12-31');
INSERT INTO userTbl VALUES('EM', '일론머스크', 1980, '뉴욕', 01162614261, 170, '2021-12-31');
SELECT * FROM userTbl;

-- 가입한 회원이 물건을 산 이력이 남도록 하겠습니다.
INSERT INTO buyTbl VALUES(null, 'AHC', '기계식키보드', '주변기기', 200000, 1);
-- order_number는 값을 null로 주면 AUTO_INCREMENT에 의해 자동으로 1씩 증가된 숫자를 배정받음.
INSERT INTO buyTbl VALUES(null, 'AHC', '듀얼모니터', '전자기기', 20000, 1);
-- 없는 회원 아이디로 INSERT를 시도해보겠습니다.
INSERT INTO buyTbl VALUES(null, 'SHM', '유니폼', '의류', 300000, 1);
INSERT INTO buyTbl VALUES(null, 'EM', '도지코인', '가상회폐', 5000, 100000);
INSERT INTO buyTbl VALUES(null, 'AHC', '그래픽카드', '채굴도구', 3000000, 1);
SELECT * FROM buyTbl;







