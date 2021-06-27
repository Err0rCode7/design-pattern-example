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
<p style="font-weight:bold" align="center"></p>
</p>

## 구조

### Bridge

구현부에서 추상층을 분리하여 각자 독립적으로 변형할 수 있게 하는 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536668-bcda6f00-d766-11eb-9d59-b489b7382556.png">
<p style="font-weight:bold" align="center"></p>
</p>

### Facade

복잡한 시스템에 대하여 단순한 인터페이스를 제공함으로써 사용자의 시스템 간 도는 여타 시스템과의 결합도를 낮추어 시스템 구조에 대해 파악을 쉽게 하는 패턴, 오류에 대해서 단위별로 확인할 수 있게 하며, 사용자의 측면에서 단순한 인터페이스 제공을 통해 접근성을 높일 수 있는 디자인 패턴

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536692-e0051e80-d766-11eb-9c47-c4c6c5cd93f8.png">
<p style="font-weight:bold" align="center"></p>
</p>

### Flyweight

어떤 클래스의 인스턴스 한 개만 가지고 여러 개의 `가상 인스턴스`를 제공하고 싶을 때 사용하는 패턴.

즉, **인스턴스를 가능한 대로 공유**시켜 new 메모리 할당을 통한 메모리 낭비를 줄이는 방식.

<p align="center">
<img src="https://user-images.githubusercontent.com/48249549/123536709-f14e2b00-d766-11eb-83b7-4769d7d6d30e.png">
<p style="font-weight:bold" align="center"></p>
</p>

### Proxy



### Composite



### Adapter



## 행위

### Interpreter

### Template Methdo

### Chain of Responsibility

### Command

### Iterator

### Mediator

### Memento

### Observer

### State

### Visitor



