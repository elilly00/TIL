# SELECT 

### 테이블의 모든 필드 조회
```MySQL
SELECT * FROM 테이블명
```

### 특정 필드 조회
```MySQL
SELECT 필드명 FROM 테이블명
```

### 조건에 맞는 필드 조회
```MySQL
SELECT * or 필드명
FROM 테이블명
WHERE 조건식
```

### 데이터 정렬
ORDER BY 구문을 사용해 특정 컬럼을 기준으로 데이터를 정렬할 수 있다.

정렬 구문을 따로 작성하지 않았다면 기본 설정인 ASC(오름차순)으로 데이터가 정렬된다.
```MySQL
SELECT 필드명
FROM 테이블명
WHERE 조건식
ORDER BY 컬럼 (ASC) or DESC
```

### 결과 값 제한
```MySQL
SELECT 필드명
FROM 테이블 명
LIMIT (건너뛸 갯수), 가져올 갯수
```

### 필드명 별명 설정
```MySQL
SELECT 필드명 AS 별명, 필드명 AS '별명'
FROM 테이블명
```
