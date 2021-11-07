class Factorial {
public static void main(String[] a) {
int tmp1 ;
int tmp2 ;
Fac tmp0 ;
tmp0 = new Fac();
tmp2 = 10;
tmp1 = tmp0.ComputeFac(tmp2);
System.out.println(tmp1);
}
}
class Fac{
public int ComputeFac(int num){
int tmp11 ;
int tmp10 ;
int tmp9 ;
Fac tmp7 ;
int tmp8 ;
int tmp5 ;
int tmp6 ;
int num_aux ;
int tmp3 ;
boolean tmp4 ;
tmp3 = 0;
tmp4 = num <= tmp3;
if (tmp4) {
tmp5 = 1;
num_aux = tmp5;
} else {
tmp7 = this;
tmp9 = 1;
tmp10 = num - tmp9;
tmp8 = tmp7.ComputeFac(tmp10);
tmp11 = num * tmp6;
num_aux = tmp11;
}
return num_aux;
}
}

