## 문제 설명
![select4](https://user-images.githubusercontent.com/90914001/169267366-6286a8e5-c4a0-4c39-aadc-9d11465585d8.PNG)

## 코드
```sql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged'
ORDER BY ANIMAL_ID;