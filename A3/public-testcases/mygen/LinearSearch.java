class LinearSearch {
public static void main(String[] a) {

int tmp1 ;
int tmp2 ;
LS tmp0 ;

tmp0 = new LS();
tmp2 = 10;
tmp1 = tmp0.Start(tmp2);
System.out.println(tmp1);

}
}

class LS{

int[] number ;
int size ;

public int Start(int sz){

int tmp20 ;
LS tmp11 ;
int tmp10 ;
int aux01 ;
LS tmp5 ;
LS tmp17 ;
int tmp6 ;
int tmp16 ;
LS tmp3 ;
int tmp19 ;
int aux02 ;
int tmp4 ;
int tmp18 ;
int tmp13 ;
int tmp12 ;
int tmp15 ;
LS tmp14 ;
int tmp9 ;
int tmp7 ;
LS tmp8 ;

tmp3 = this;
tmp4 = tmp3.Init(sz);
aux01 = tmp4;
tmp5 = this;
tmp6 = tmp5.Print();
aux02 = tmp6;
tmp7 = 9999;
System.out.println(tmp7);
tmp8 = this;
tmp10 = 8;
tmp9 = tmp8.Search(tmp10);
System.out.println(tmp9);
tmp11 = this;
tmp13 = 12;
tmp12 = tmp11.Search(tmp13);
System.out.println(tmp12);
tmp14 = this;
tmp16 = 17;
tmp15 = tmp14.Search(tmp16);
System.out.println(tmp15);
tmp17 = this;
tmp19 = 50;
tmp18 = tmp17.Search(tmp19);
System.out.println(tmp18);
tmp20 = 55;
return tmp20;
}

public int Print(){

int tmp22 ;
int tmp21 ;
int tmp28 ;
int tmp27 ;
int j ;
int tmp29 ;
int tmp24 ;
int tmp23 ;
int tmp26 ;
boolean tmp25 ;

tmp21 = 1;
j = tmp21;
tmp23 = 1;
tmp24 = size - tmp23;
tmp25 = j <= tmp22;
while (tmp25) {
{
tmp26 = number[j];
System.out.println(tmp26);
tmp27 = 1;
tmp28 = j + tmp27;
j = tmp28;
}
tmp25 = j <= tmp22;
}
tmp29 = 0;
return tmp29;
}

public int Search(int num){

int tmp42 ;
int tmp41 ;
int tmp44 ;
boolean tmp43 ;
int nt ;
int tmp40 ;
int ifound ;
int aux01 ;
int tmp49 ;
int aux02 ;
boolean tmp46 ;
boolean tmp45 ;
int tmp48 ;
int tmp47 ;
boolean tmp31 ;
int tmp53 ;
int tmp30 ;
boolean tmp52 ;
int tmp33 ;
int tmp55 ;
int tmp32 ;
int tmp54 ;
int tmp51 ;
boolean tmp50 ;
int tmp39 ;
int tmp38 ;
int j ;
int tmp35 ;
int tmp34 ;
int tmp37 ;
boolean tmp36 ;
boolean ls01 ;

tmp30 = 1;
j = tmp30;
tmp31 = false;
ls01 = tmp31;
tmp32 = 0;
ifound = tmp32;
tmp34 = 1;
tmp35 = size - tmp34;
tmp36 = j <= tmp33;
while (tmp36) {
{
tmp37 = number[j];
aux01 = tmp37;
tmp38 = 1;
tmp39 = num + tmp38;
aux02 = tmp39;
tmp41 = 1;
tmp42 = num - tmp41;
tmp43 = aux01 <= tmp40;
if (tmp43) {
tmp44 = 0;
nt = tmp44;
} else {
tmp48 = 1;
tmp49 = aux02 - tmp48;
tmp50 = aux01 <= tmp47;
tmp45 = !tmp46;
if (tmp45) {
tmp51 = 0;
nt = tmp51;
} else {
{
tmp52 = true;
ls01 = tmp52;
tmp53 = 1;
ifound = tmp53;
j = size;
}
}
}
tmp54 = 1;
tmp55 = j + tmp54;
j = tmp55;
}
tmp36 = j <= tmp33;
tmp43 = aux01 <= tmp40;
tmp50 = aux01 <= tmp47;
}
return ifound;
}

public int Init(int sz){

int tmp64 ;
boolean tmp63 ;
int tmp66 ;
int tmp65 ;
int tmp60 ;
int tmp62 ;
int tmp61 ;
int aux01 ;
int aux02 ;
int tmp68 ;
int tmp67 ;
int tmp69 ;
int tmp71 ;
int tmp70 ;
int tmp73 ;
int tmp72 ;
int j ;
int k ;
int tmp57 ;
int[] tmp56 ;
int tmp59 ;
int tmp58 ;

size = sz;
tmp56 = new int[sz];
number = tmp56;
tmp57 = 1;
j = tmp57;
tmp58 = 1;
tmp59 = size + tmp58;
k = tmp59;
tmp61 = 1;
tmp62 = size - tmp61;
tmp63 = j <= tmp60;
while (tmp63) {
{
tmp64 = 2;
tmp65 = tmp64 * j;
aux01 = tmp65;
tmp66 = 3;
tmp67 = k - tmp66;
aux02 = tmp67;
tmp68 = aux01 + aux02;
number[j] = tmp68;
tmp69 = 1;
tmp70 = j + tmp69;
j = tmp70;
tmp71 = 1;
tmp72 = k - tmp71;
k = tmp72;
}
tmp63 = j <= tmp60;
}
tmp73 = 0;
return tmp73;
}

}

