class Program9{

public static void main(String[]args){
 int age=17;
Boolean condition= age>=18;
System.out.println(condition);
String res=condition?"eligible":"not eligible";
System.out.println(res);
int res2=condition?10:20;
System.out.println(res2);



}
}
/*
conditional operator/ternary operator:
--it consist 3 operands
syntax:
	operand1?operand2:operand3
	(condition)
	-if condition satisfy it prints operand2
	if condition not satisfied it prints operand3
	

*/