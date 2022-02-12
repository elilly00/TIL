# 목차
* [WebSocket](https://github.com/elilly00/TIL/blob/main/Computer%20Science/WebSocket.md#websocket)
* [STOMP](https://github.com/elilly00/TIL/blob/main/Computer%20Science/WebSocket.md#stomp)
* [프로토콜이란?](https://github.com/elilly00/TIL/blob/main/Computer%20Science/WebSocket.md#%ED%94%84%EB%A1%9C%ED%86%A0%EC%BD%9C%EC%9D%B4%EB%9E%80)

<br/>

## WebSocket
* TCP 연결에 완전한 이중 통신 채널을 제공하는 컴퓨터 통신 프로토콜
* Server와 Client 간 열결을 유지한 상태로 데이터를 교환 할 수 있다.

데이터는 <b>패킷(Packet)</b>형태로 전달되며, 전송은 커넥션 중단과 추가 HTTP 요청 없이 양방향으로 이뤄진다. <br/>

한 번 커넥션이 맺어지면 커넥션을 종료하기 전까지 계속 통신이 가능하다. <br/>

→ 온라인 게임이나 주식 트레이딩 시스템같이 데이터 교환이 지속적으로 이뤄져야하는 서비스에 매우 적합하다.

## STOMP
특정 토픽이 특정 user에게만 메시지를 보내는 방법을 담당하는 프로토콜 <br/>

STOMP에 정의한 규칙만 잘 지키면 여러 언어, 여러 플랫폼간에서 메세지를 상호 운영할 수 있다.
* WebSocket은 단지 통신 프로토콜

→ STOMP는 웹 상에서 텍스트를 송·수신 하기위해 미리 정의된 특정한 규칙이다.

기존 AMQP 나 MQTT 와 같은 메세지 전송을 위한 다른 프로토콜들과 다르게 binary 기반이 아닌 텍스트 기반 프로토콜이다.

## 프로토콜이란?
원거리에서 메시지를 서로 주고 받을 때 정의된 양식 규칙 체계