class BubbleSort {
public static void main(String[] a) {

int tmp1 ;
int tmp2 ;
BBS tmp0 ;

tmp0 = new BBS();
tmp2 = 10;
tmp1 = tmp0.Start(tmp2);
System.out.println(tmp1);

}
}

class BBS{

int[] number ;
int size ;

public int Start(int sz){

int tmp11 ;
BBS tmp10 ;
int tmp9 ;
int tmp7 ;
BBS tmp8 ;
int aux01 ;
BBS tmp5 ;
int tmp6 ;
BBS tmp3 ;
int tmp4 ;
int tmp12 ;

tmp3 = this;
tmp4 = tmp3.Init(sz);
aux01 = tmp4;
tmp5 = this;
tmp6 = tmp5.Print();
aux01 = tmp6;
tmp7 = 99999;
System.out.println(tmp7);
tmp8 = this;
tmp9 = tmp8.Sort();
aux01 = tmp9;
tmp10 = this;
tmp11 = tmp10.Print();
aux01 = tmp11;
tmp12 = 0;
return tmp12;
}

public int Sort(){

int tmp20 ;
int tmp41 ;
int tmp22 ;
boolean tmp21 ;
int aux05 ;
int aux04 ;
int nt ;
int aux07 ;
int tmp40 ;
int aux06 ;
int tmp28 ;
int tmp27 ;
int aux02 ;
int tmp29 ;
int tmp24 ;
boolean tmp23 ;
int tmp26 ;
int tmp25 ;
boolean tmp31 ;
int tmp30 ;
int tmp33 ;
int tmp32 ;
int tmp17 ;
int tmp39 ;
int i ;
int tmp16 ;
int tmp38 ;
int j ;
int tmp19 ;
int tmp18 ;
int tmp13 ;
int tmp35 ;
int tmp34 ;
int tmp15 ;
int tmp37 ;
int tmp14 ;
int tmp36 ;
int t ;

tmp13 = 1;
tmp14 = size - tmp13;
i = tmp14;
tmp15 = 0;
tmp16 = 1;
tmp17 = tmp15 - tmp16;
aux02 = tmp17;
tmp19 = 1;
tmp20 = i - tmp19;
tmp21 = aux02 <= tmp18;
while (tmp21) {
{
tmp22 = 1;
j = tmp22;
tmp23 = j <= i;
while (tmp23) {
{
tmp24 = 1;
tmp25 = j - tmp24;
aux07 = tmp25;
tmp26 = number[aux07];
aux04 = tmp26;
tmp27 = number[j];
aux05 = tmp27;
tmp29 = 1;
tmp30 = aux04 - tmp29;
tmp31 = aux05 <= tmp28;
if (tmp31) {
{
tmp32 = 1;
tmp33 = j - tmp32;
aux06 = tmp33;
tmp34 = number[aux06];
t = tmp34;
tmp35 = number[j];
number[aux06] = tmp35;
number[j] = t;
}
} else {
tmp36 = 0;
nt = tmp36;
}
tmp37 = 1;
tmp38 = j + tmp37;
j = tmp38;
}
tmp23 = j <= i;
tmp31 = aux05 <= tmp28;
}
tmp39 = 1;
tmp40 = i - tmp39;
i = tmp40;
}
}
tmp41 = 0;
return tmp41;
}

public int Print(){

int tmp42 ;
int tmp44 ;
int tmp43 ;
int tmp49 ;
boolean tmp46 ;
int tmp45 ;
int tmp48 ;
int tmp47 ;
int tmp50 ;
int j ;

tmp42 = 0;
j = tmp42;
tmp44 = 1;
tmp45 = size - tmp44;
tmp46 = j <= tmp43;
while (tmp46) {
{
tmp47 = number[j];
System.out.println(tmp47);
tmp48 = 1;
tmp49 = j + tmp48;
j = tmp49;
}
tmp46 = j <= tmp43;
}
tmp50 = 0;
return tmp50;
}

public int Init(int sz){

int tmp64 ;
int tmp63 ;
int tmp66 ;
int tmp65 ;
int tmp60 ;
int tmp62 ;
int tmp61 ;
int tmp68 ;
int tmp67 ;
int tmp69 ;
int tmp53 ;
int tmp52 ;
int tmp55 ;
int tmp54 ;
int tmp71 ;
int tmp70 ;
int[] tmp51 ;
int tmp72 ;
int tmp57 ;
int tmp56 ;
int tmp59 ;
int tmp58 ;

size = sz;
tmp51 = new int[sz];
number = tmp51;
tmp52 = 0;
tmp53 = 20;
number[tmp52] = tmp53;
tmp54 = 1;
tmp55 = 7;
number[tmp54] = tmp55;
tmp56 = 2;
tmp57 = 12;
number[tmp56] = tmp57;
tmp58 = 3;
tmp59 = 18;
number[tmp58] = tmp59;
tmp60 = 4;
tmp61 = 2;
number[tmp60] = tmp61;
tmp62 = 5;
tmp63 = 11;
number[tmp62] = tmp63;
tmp64 = 6;
tmp65 = 6;
number[tmp64] = tmp65;
tmp66 = 7;
tmp67 = 9;
number[tmp66] = tmp67;
tmp68 = 8;
tmp69 = 19;
number[tmp68] = tmp69;
tmp70 = 9;
tmp71 = 5;
number[tmp70] = tmp71;
tmp72 = 0;
return tmp72;
}

}

