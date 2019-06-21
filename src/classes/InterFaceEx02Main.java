mpackage classes;

public class InterFaceEx02Main {


}

class ClassEx01{}
class ClassEx02{}
class ClassEx03{}
class ClassEx04{}

interface InterfaceEx01{}
interface InterfaceEx02{}
interface InterfaceEx03{}


// 인터페이스 다중  종속은 가능함
// 클래스 다중 종속은 한개만 가능
// 클래스 to 인터 페이스는 implements
// 클래스 to 클래스는  extends
class ClassT01 extends ClassEx01{}
class ClassT02 extends ClassEx01{}
class ClassT03 extends ClassEx01, ClassEx02{}
class ClassT04 implements InterfaceEx01{}
class ClassT05 implements InterfaceEx01, InterfaceEx02{}

//인터페이스간에 종속은 여러개 가능.
//인터페이스와 클래스는 종속이 불가능. 추상화 메소드 이기에 기입이 안되기 때문.
// 인터페이스 to 인터페이스 extends
// 인터페이스 to 클래스 라는건 존재 하지 않는다. 
interface InterFaceT01 extends ClassEx01{}
interface InterFaceT02 extends InterfaceEx01{}
interface InterFaceT03 extends InterfaceEx01, InterfaceEx02{}
interface InterFaceT04 implements ClassEx01{}
interface InterFaceT04 implements InterfaceEx01{}
