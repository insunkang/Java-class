package oop.chap06;
//Ŭ������ �����ϰ� ��������� �����ϴ� ���
// - ��������� �����Ҷ��� Ư���� ��츦 �����ϰ� �ʱⰪ�� ���� �ʴ´�.
// - �ʱⰪ�� �������� �ʾƵ� �������� null, ������ 0, �Ǽ��� 0.0, boolean�� false
// - ��������� �����Ҷ� ���� �����ڸ� �߰��ؼ� ������ ������ �� �ִ�.
//   public
//   default
//   protected
//   private
//Ŭ������ �����Ҷ� ��������� private���� �����ؼ� �ܺο��� ������ �� ������ ������ �����ϰ�
//public�޼ҵ带 ���ؼ� ������ �� �ֵ��� �����Ѵ�.
public class Person {
	private String name;//Ŭ������ Ư���� ��Ÿ���� ������ - ������� or �ʵ�
	private String addr;
	private int age;
	public Person() {
		
	}
	public Person(String name,String addr,int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}
	//��� ��������� private���� ����Ǿ� �ֱ� ������ ���� �����ϴ� �޼ҵ��
	//���� ������ �� �ִ� �޼ҵ尡 �ʿ��ϴ�.
	//�̷� ������ �ϴ� �޼ҵ带 �����ϴ� ���
	
	//name������ ���� �����ϴ� �޼ҵ�
	//�޼ҵ�� : set + ���������(ù ���ڸ� �빮�ڷ� �ٲ�)
	//        setName
	public void setName(String name) { //setter�޼ҵ�
		this.name = name;
	}
	
	//name������ ����� ���� ȣ���ϴ� ������ �Ѱ��� �޼ҵ�
	//�޼ҵ�� : get + ���������(ù ���ڸ� �빮�� �ٲ�)
	//        getName
	public String getName() {//getter�޼ҵ�
		return this.name;
	}
	
	public void setAddr(String addr) { //setter�޼ҵ�
		this.addr = addr;
	}
	public String getAddr() {//getter�޼ҵ�
		return this.addr;
	}
	public void setAge(int age) { //setter�޼ҵ�
		this.age = age;
	}
	public int getAge() {//getter�޼ҵ�
		return this.age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", addr=" + addr + ", age=" + age + "]";
	}
	
}














