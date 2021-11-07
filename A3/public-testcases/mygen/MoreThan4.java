class MoreThan4 {
public static void main(String[] a) {

int tmp7 ;
int tmp5 ;
int tmp6 ;
int tmp3 ;
int tmp4 ;
int tmp1 ;
int tmp2 ;
MT4 tmp0 ;

tmp0 = new MT4();
tmp2 = 1;
tmp3 = 2;
tmp4 = 3;
tmp5 = 4;
tmp6 = 5;
tmp7 = 6;
tmp1 = tmp0.Start(tmp2, tmp3, tmp4, tmp5, tmp6, tmp7);
System.out.println(tmp1);

}
}

class MT4{


public int Start(int p1, int p2, int p3, int p4, int p5, int p6){

int tmp9 ;
int aux ;
MT4 tmp8 ;

System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
tmp8 = this;
tmp9 = tmp8.Change(p6, p5, p4, p3, p2, p1);
aux = tmp9;
return aux;
}

public int Change(int p1, int p2, int p3, int p4, int p5, int p6){

int tmp10 ;

System.out.println(p1);
System.out.println(p2);
System.out.println(p3);
System.out.println(p4);
System.out.println(p5);
System.out.println(p6);
tmp10 = 0;
return tmp10;
}

}

