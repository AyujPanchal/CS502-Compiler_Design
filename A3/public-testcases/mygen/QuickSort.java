class QuickSort {
public static void main(String[] a) {

int tmp1 ;
int tmp2 ;
QS tmp0 ;

tmp0 = new QS();
tmp2 = 10;
tmp1 = tmp0.Start(tmp2);
System.out.println(tmp1);

}
}

class QS{

int[] number ;
int size ;

public int Start(int sz){

int tmp11 ;
QS tmp10 ;
int aux01 ;
QS tmp5 ;
int tmp6 ;
QS tmp3 ;
int tmp4 ;
QS tmp13 ;
int tmp12 ;
int tmp15 ;
int tmp14 ;
int tmp9 ;
int tmp7 ;
int tmp8 ;

tmp3 = this;
tmp4 = tmp3.Init(sz);
aux01 = tmp4;
tmp5 = this;
tmp6 = tmp5.Print();
aux01 = tmp6;
tmp7 = 9999;
System.out.println(tmp7);
tmp8 = 1;
tmp9 = size - tmp8;
aux01 = tmp9;
tmp10 = this;
tmp12 = 0;
tmp11 = tmp10.Sort(tmp12, aux01);
aux01 = tmp11;
tmp13 = this;
tmp14 = tmp13.Print();
aux01 = tmp14;
tmp15 = 0;
return tmp15;
}

public int Sort(int left, int right){

boolean tmp20 ;
int tmp64 ;
int tmp63 ;
int tmp22 ;
int tmp21 ;
int tmp65 ;
QS tmp60 ;
int tmp62 ;
int tmp61 ;
int tmp28 ;
int tmp27 ;
boolean cont02 ;
boolean tmp29 ;
boolean cont01 ;
boolean tmp24 ;
int tmp23 ;
int tmp26 ;
boolean tmp25 ;
int tmp31 ;
boolean tmp30 ;
int tmp33 ;
int tmp32 ;
int tmp39 ;
int tmp38 ;
boolean tmp35 ;
boolean tmp34 ;
boolean tmp37 ;
boolean tmp36 ;
boolean tmp42 ;
boolean tmp41 ;
int tmp44 ;
int tmp43 ;
int nt ;
int tmp40 ;
int tmp49 ;
int aux03 ;
boolean tmp46 ;
int tmp45 ;
boolean tmp48 ;
boolean tmp47 ;
boolean tmp53 ;
boolean tmp52 ;
int tmp55 ;
int tmp54 ;
boolean tmp51 ;
int tmp50 ;
int tmp17 ;
int i ;
int tmp16 ;
int j ;
int tmp19 ;
int tmp18 ;
int tmp57 ;
QS tmp56 ;
int tmp59 ;
int tmp58 ;
int t ;
int v ;

tmp16 = 0;
t = tmp16;
tmp18 = 1;
tmp19 = right - tmp18;
tmp20 = left <= tmp17;
if (tmp20) {
{
tmp21 = number[right];
v = tmp21;
tmp22 = 1;
tmp23 = left - tmp22;
i = tmp23;
j = right;
tmp24 = true;
cont01 = tmp24;
while (cont01) {
{
tmp25 = true;
cont02 = tmp25;
while (cont02) {
{
tmp26 = 1;
tmp27 = i + tmp26;
i = tmp27;
tmp28 = number[i];
aux03 = tmp28;
tmp32 = 1;
tmp33 = v - tmp32;
tmp34 = aux03 <= tmp31;
tmp29 = !tmp30;
if (tmp29) {
tmp35 = false;
cont02 = tmp35;
} else {
tmp36 = true;
cont02 = tmp36;
}
}
tmp34 = aux03 <= tmp31;
}
tmp37 = true;
cont02 = tmp37;
while (cont02) {
{
tmp38 = 1;
tmp39 = j - tmp38;
j = tmp39;
tmp40 = number[j];
aux03 = tmp40;
tmp44 = 1;
tmp45 = aux03 - tmp44;
tmp46 = v <= tmp43;
tmp41 = !tmp42;
if (tmp41) {
tmp47 = false;
cont02 = tmp47;
} else {
tmp48 = true;
cont02 = tmp48;
}
}
tmp46 = v <= tmp43;
}
tmp49 = number[i];
t = tmp49;
tmp50 = number[j];
number[i] = tmp50;
number[j] = t;
tmp51 = j <= i;
if (tmp51) {
tmp52 = false;
cont01 = tmp52;
} else {
tmp53 = true;
cont01 = tmp53;
}
}
tmp51 = j <= i;
}
tmp54 = number[i];
number[j] = tmp54;
tmp55 = number[right];
number[i] = tmp55;
number[right] = t;
tmp56 = this;
tmp58 = 1;
tmp59 = i - tmp58;
tmp57 = tmp56.Sort(left, tmp59);
nt = tmp57;
tmp60 = this;
tmp62 = 1;
tmp63 = i + tmp62;
tmp61 = tmp60.Sort(tmp63, right);
nt = tmp61;
}
} else {
tmp64 = 0;
nt = tmp64;
}
tmp65 = 0;
return tmp65;
}

public int Print(){

int tmp66 ;
int tmp68 ;
int tmp67 ;
int tmp69 ;
int tmp74 ;
int tmp71 ;
boolean tmp70 ;
int tmp73 ;
int tmp72 ;
int j ;

tmp66 = 0;
j = tmp66;
tmp68 = 1;
tmp69 = size - tmp68;
tmp70 = j <= tmp67;
while (tmp70) {
{
tmp71 = number[j];
System.out.println(tmp71);
tmp72 = 1;
tmp73 = j + tmp72;
j = tmp73;
}
tmp70 = j <= tmp67;
}
tmp74 = 0;
return tmp74;
}

public int Init(int sz){

int[] tmp75 ;
int tmp77 ;
int tmp76 ;
int tmp79 ;
int tmp78 ;
int tmp86 ;
int tmp85 ;
int tmp88 ;
int tmp87 ;
int tmp82 ;
int tmp81 ;
int tmp84 ;
int tmp83 ;
int tmp89 ;
int tmp80 ;
int tmp96 ;
int tmp93 ;
int tmp92 ;
int tmp95 ;
int tmp94 ;
int tmp91 ;
int tmp90 ;

size = sz;
tmp75 = new int[sz];
number = tmp75;
tmp76 = 0;
tmp77 = 20;
number[tmp76] = tmp77;
tmp78 = 1;
tmp79 = 7;
number[tmp78] = tmp79;
tmp80 = 2;
tmp81 = 12;
number[tmp80] = tmp81;
tmp82 = 3;
tmp83 = 18;
number[tmp82] = tmp83;
tmp84 = 4;
tmp85 = 2;
number[tmp84] = tmp85;
tmp86 = 5;
tmp87 = 11;
number[tmp86] = tmp87;
tmp88 = 6;
tmp89 = 6;
number[tmp88] = tmp89;
tmp90 = 7;
tmp91 = 9;
number[tmp90] = tmp91;
tmp92 = 8;
tmp93 = 19;
number[tmp92] = tmp93;
tmp94 = 9;
tmp95 = 5;
number[tmp94] = tmp95;
tmp96 = 0;
return tmp96;
}

}

