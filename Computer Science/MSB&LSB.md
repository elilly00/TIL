## 목차
* LSB & MSB
    * LSB란?
    * MSB란?
* unsinged number

# LSB & MSB
## LSB란?
Least significant Bit의 약자로 하나의 데이터 형에서의 가장 낮은 위치(최하위)의 Bit를 의미한다. <br/>
unsigned char 데이터 형과 signed char 데이터 형에서 큰 차이점이 없다.

>값이 조금이라도 변경되면 데이터 형의 최하위 비트이므로 그 값이 변화가 발생하기 때문에 프로그래밍 시 주로 난수발생 함수, 해시 함수, 검사합(Checksum) 함수 등에서 많이 쓰인다.

## MSB란?
Most Significant Bit의 약자로 어떠한 데이터 형의 최상위 Bit를 의미한다. 
<br/>
unsigned char 데이터 형에선 ₂⁷이라는 값을 지니고 있는 가장 최상위 비트이며,
<br/> 
signed char 데이터 형에선 가장 최상위의 부호값 비트이다.
<br/>
>MSB를 확인하면 양수&음수인지 쉽게 알아낼 수 있다. <br/>
MSB가 0이면 양수, 1이면 음수를 나타낸다.

## 보수 (Complement)
컴퓨터에서 음수를 표시하기위해 사용되는 것이다.





