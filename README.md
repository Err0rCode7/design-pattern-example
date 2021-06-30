# Design-pattern-example



## 생성

### Abstraction Method

구체적인 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를 제공하는 패턴

### Factory Method

조건에 따른 객체 생성을 팩토리 클래스로 위임하여, 팩토리 클래스에서 객체를 생성하는 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536578-12fae280-d766-11eb-87d0-e582a7e2d164.png">
<p style="font-weight:bold" align="center">Factory Method</p>
</p>


### Abstraction Factory

서로 관련이 있는 객체들을 통째로 묶어서 팩토리 클래스로 만들고, 이들 팩토리를 조건에 따라 생성하도록 다시 팩토리르 만들어서 객체를 생성하는 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536610-535a6080-d766-11eb-9260-df4cf239929a.png">
<p style="font-weight:bold" align="center">Abstraction Factory</p>
</p>


### Prototype

기본 원형이 되는 인스턴스를 사용해서 생성할 객체의 종류를 명시하고 이렇게 만들어진 객체를 복사해서 새로운 객체를 생성하는 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536625-784ed380-d766-11eb-9df5-137aefed79ae.png">
<p style="font-weight:bold" align="center">Prototype</p>
</p>



## 구조

### Bridge

구현부에서 추상층을 분리하여 각자 독립적으로 변형할 수 있게 하는 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536668-bcda6f00-d766-11eb-9d59-b489b7382556.png">
<p style="font-weight:bold" align="center">Bridge</p>
</p>



### Facade

복잡한 시스템에 대하여 단순한 인터페이스를 제공함으로써 사용자의 시스템 간 도는 여타 시스템과의 결합도를 낮추어 시스템 구조에 대해 파악을 쉽게 하는 패턴, 오류에 대해서 단위별로 확인할 수 있게 하며, 사용자의 측면에서 단순한 인터페이스 제공을 통해 접근성을 높일 수 있는 디자인 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536692-e0051e80-d766-11eb-9c47-c4c6c5cd93f8.png">
<p style="font-weight:bold" align="center">Facade</p>
</p>



### Flyweight

어떤 클래스의 인스턴스 한 개만 가지고 여러 개의 `가상 인스턴스`를 제공하고 싶을 때 사용하는 패턴.

즉, **인스턴스를 가능한 대로 공유**시켜 new 메모리 할당을 통한 메모리 낭비를 줄이는 방식.

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536709-f14e2b00-d766-11eb-83b7-4769d7d6d30e.png">
<p style="font-weight:bold" align="center">Flyweight</p>
</p>



### Proxy

말 그대로 어떤 일을 대신 시키는 디자인 패턴. 구체적으로 인터페이스를 사용하고 실행시킬 클래스에 대한 객체가 들어갈 자리에 대리자 객체를 대신 투입해 클라이언트 쪽에서 실제 실행시킬 클래스에게서 메서드를 호출하고 반환받는지, 대리자 객체를 통해 메서드를 호출하고 반환받는지 전혀 모르게 처리하는 것

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536803-5b66d000-d767-11eb-8a1c-549cde621502.png">
<p style="font-weight:bold" align="center">Proxy</p>
</p>


### Composite

OOP에서 Composite는 하나 이상의 유사한 객체를 구성(필드와 메소드)으로 설계된 객체로 모두 유사한 기능을 나타낸다. 따라서 객체 그룹을 단일 객체로 조작할 수 있다.

Composite Pattern은 클라이언트가 복합 객체나 단일 객체를 동일하게 취급하는 것을 목적으로 한다. Composite Pattern의 의도는 트리 구조로 작성하며 전체-부분 관계를 표현한다. 따라서 Directory-file 같은 관계와 전체-부분 관계를 트리 구조로 표현하고 싶을 때 유리하다.

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123537369-024c6b80-d76a-11eb-9a3b-7879195c2445.png">
<p style="font-weight:bold" align="center">Composite</p>
</p>

## 행위

### Interpreter

문법 규칙을 클래스화 한 구조. 일련의 규칙으로 정의된 문법적 언어를 해석하는 패턴
SQL과 같은 계층적 언어를 해석하기 위해 계층 구조를 표현할 수 있다.

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123577694-4f364d80-d80f-11eb-9ce0-eb84575c0c46.png">
<p style="font-weight:bold" align="center">Interpreter</p>
</p>

### Template Method

알고리즘의 구조를 메소드에 정의하고, 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴

알고리즘이 단계별로 나누어 지거나, 같은 역할을 하는 메소드이지 여러곳에서 다른형태로 사용이 필요한 경우 유용한 패턴이다.

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123593242-405c9480-d829-11eb-95f9-e70dc9f4e5cd.png">
<p style="font-weight:bold" align="center">Template Method</p>
</p>

### Chain of Responsibility

어떤 프로세스가 일어났을 때, 그 프로세스를 처리할 책임을 적당한 대상한테 넘겨주는 패턴

요청을 보낸 쪽하고 받는 쪽을 분리시킬 수 있다. 즉, 다른 클래스에 대해서 낮은 결합도로 동일한 이벤트에 대한 핸들링을 가능하다.
사슬에 들어가는 객체를 바꾸거나 순서를 바꿈으로 역할을 동적으로 추가/제거 할 수 있따.

하지만 요청이 반드시 수행된다는 보장을 하지는 않는다. 만약 체인이 적절하게 구성되어 있지 않다면, 프로세스가 사슬의 끝을 만날때 까지 처리 되지 않을 수도 있다. 또한 사슬의 형태로 묶여있기 때문에 요청을 처리하는데 걸리는 시간을 정확히 예측하기 힘들다. 실행시에 과정을 살펴보거나 디버깅하기가 힘들수도 있다.

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123822264-16919380-d937-11eb-8d0d-5cfa86493d4f.png">
<p style="font-weight:bold" align="center">Chain of Responsibility</p>
</p>

### Command

요청을 객체의 형태로 캡슐화하여 사용자가 보낸 요청을 나중에 이요할 수 있도록 메서드 이름, 매개변수 등 요청에 필요한 정보를 저장 또는 로깅, 취소할 수 있게 하는 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123822553-5c4e5c00-d937-11eb-94d0-e95f4fc32981.png">
<p style="font-weight:bold" align="center">Command</p>
</p>

### Iterator

for문의 i++ 과 같은 문법으로 탐색을 하는 방식이 아니라 i의 기능을 일반화한 디자인 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123891385-ce548e80-d993-11eb-921c-5015a1737400.png">
<p style="font-weight:bold" align="center">Iterator</p>
</p>

### Mediator

클래스 간의 상호작용을 하나의 클래스에 위임하여 처리하는 패턴. 따라서 M:N의 관계에서 M:1 관계로 복잡도를 떨어뜨려 유지보수 및 확장성에 유리하다. 다른 객체의 존재를 모르는 상태에서도 메시지를 주고 받을 수 있다.

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123926820-3e303c80-d9c7-11eb-85b5-4497135d3adb.png">
<p style="font-weight:bold" align="center">Mediator</p>
</p>

### Memento

### Observer

### State

### Visitor



