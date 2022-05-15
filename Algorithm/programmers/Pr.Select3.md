## 문제 설명
![SELECT3](https://user-images.githubusercontent.com/90914001/168471182-f5f19aa2-f142-4d9d-a4f4-4b4d2ae9b763.PNG)

## 코드
```sql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick'
ORDER BY ANIMAL_ID;