## 문제 설명
![select7](https://user-images.githubusercontent.com/90914001/170829861-ecf13936-594c-47a0-be76-b26e2cdd81c4.PNG)

## 코드
```sql
SELECT  A.NAME
 FROM ( SELECT NAME, DATETIME
          FROM ANIMAL_INS
        ORDER BY DATETIME
      ) A
WHERE ROWNUM = 1