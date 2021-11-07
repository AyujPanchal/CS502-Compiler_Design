class BinarySearch {
public static void main(String[] a) {

int tmp1 ;
int tmp2 ;
BS tmp0 ;

tmp0 = new BS();
tmp2 = 20;
tmp1 = tmp0.Start(tmp2);
System.out.println(tmp1);

}
}

class BS{

int[] number ;
int size ;

public int Start(int sz){

int tmp20 ;
BS tmp42 ;
int tmp41 ;
BS tmp22 ;
int tmp44 ;
int tmp21 ;
boolean tmp43 ;
int tmp40 ;
int aux01 ;
BS tmp5 ;
boolean tmp28 ;
int tmp6 ;
BS tmp27 ;
BS tmp3 ;
int aux02 ;
int tmp4 ;
int tmp29 ;
int tmp24 ;
int tmp46 ;
boolean tmp23 ;
int tmp45 ;
int tmp26 ;
int tmp25 ;
int tmp47 ;
int tmp31 ;
int tmp30 ;
int tmp11 ;
boolean tmp33 ;
int tmp10 ;
BS tmp32 ;
BS tmp17 ;
int tmp39 ;
int tmp16 ;
boolean tmp38 ;
int tmp19 ;
boolean tmp18 ;
boolean tmp13 ;
int tmp35 ;
BS tmp12 ;
int tmp34 ;
int tmp15 ;
BS tmp37 ;
int tmp14 ;
int tmp36 ;
int tmp9 ;
BS tmp7 ;
boolean tmp8 ;

tmp3 = this;
tmp4 = tmp3.Init(sz);
aux01 = tmp4;
tmp5 = this;
tmp6 = tmp5.Print();
aux02 = tmp6;
tmp7 = this;
tmp9 = 8;
tmp8 = tmp7.Search(tmp9);
if (tmp8) {
tmp10 = 1;
System.out.println(tmp10);
} else {
tmp11 = 0;
System.out.println(tmp11);
}
tmp12 = this;
tmp14 = 19;
tmp13 = tmp12.Search(tmp14);
if (tmp13) {
tmp15 = 1;
System.out.println(tmp15);
} else {
tmp16 = 0;
System.out.println(tmp16);
}
tmp17 = this;
tmp19 = 20;
tmp18 = tmp17.Search(tmp19);
if (tmp18) {
tmp20 = 1;
System.out.println(tmp20);
} else {
tmp21 = 0;
System.out.println(tmp21);
}
tmp22 = this;
tmp24 = 21;
tmp23 = tmp22.Search(tmp24);
if (tmp23) {
tmp25 = 1;
System.out.println(tmp25);
} else {
tmp26 = 0;
System.out.println(tmp26);
}
tmp27 = this;
tmp29 = 37;
tmp28 = tmp27.Search(tmp29);
if (tmp28) {
tmp30 = 1;
System.out.println(tmp30);
} else {
tmp31 = 0;
System.out.println(tmp31);
}
tmp32 = this;
tmp34 = 38;
tmp33 = tmp32.Search(tmp34);
if (tmp33) {
tmp35 = 1;
System.out.println(tmp35);
} else {
tmp36 = 0;
System.out.println(tmp36);
}
tmp37 = this;
tmp39 = 39;
tmp38 = tmp37.Search(tmp39);
if (tmp38) {
tmp40 = 1;
System.out.println(tmp40);
} else {
tmp41 = 0;
System.out.println(tmp41);
}
tmp42 = this;
tmp44 = 50;
tmp43 = tmp42.Search(tmp44);
if (tmp43) {
tmp45 = 1;
System.out.println(tmp45);
} else {
tmp46 = 0;
System.out.println(tmp46);
}
tmp47 = 999;
return tmp47;
}

public boolean Search(int num){

int tmp64 ;
int tmp63 ;
int tmp66 ;
int tmp65 ;
int tmp60 ;
int nt ;
boolean tmp62 ;
int tmp61 ;
int aux01 ;
boolean tmp49 ;
int medium ;
boolean tmp68 ;
BS tmp67 ;
int tmp48 ;
boolean tmp69 ;
boolean tmp80 ;
int tmp53 ;
boolean tmp75 ;
int tmp52 ;
boolean tmp74 ;
int tmp55 ;
BS tmp77 ;
boolean tmp54 ;
int tmp76 ;
int tmp71 ;
boolean tmp70 ;
int tmp51 ;
int tmp73 ;
int tmp50 ;
int tmp72 ;
int right ;
int tmp57 ;
boolean tmp79 ;
BS tmp56 ;
boolean tmp78 ;
int tmp59 ;
int tmp58 ;
boolean var_cont ;
int left ;
boolean bs01 ;

tmp48 = 0;
aux01 = tmp48;
tmp49 = false;
bs01 = tmp49;
tmp50 = number.length;
right = tmp50;
tmp51 = 1;
tmp52 = right - tmp51;
right = tmp52;
tmp53 = 0;
left = tmp53;
tmp54 = true;
var_cont = tmp54;
while (var_cont) {
{
tmp55 = left + right;
medium = tmp55;
tmp56 = this;
tmp57 = tmp56.Div(medium);
medium = tmp57;
tmp58 = number[medium];
aux01 = tmp58;
tmp60 = 1;
tmp61 = aux01 - tmp60;
tmp62 = num <= tmp59;
if (tmp62) {
tmp63 = 1;
tmp64 = medium - tmp63;
right = tmp64;
} else {
tmp65 = 1;
tmp66 = medium + tmp65;
left = tmp66;
}
tmp67 = this;
tmp68 = tmp67.Compare(aux01, num);
if (tmp68) {
tmp69 = false;
var_cont = tmp69;
} else {
tmp70 = true;
var_cont = tmp70;
}
tmp72 = 1;
tmp73 = left - tmp72;
tmp74 = right <= tmp71;
if (tmp74) {
tmp75 = false;
var_cont = tmp75;
} else {
tmp76 = 0;
nt = tmp76;
}
}
tmp62 = num <= tmp59;
tmp74 = right <= tmp71;
}
tmp77 = this;
tmp78 = tmp77.Compare(aux01, num);
if (tmp78) {
tmp79 = true;
bs01 = tmp79;
} else {
tmp80 = false;
bs01 = tmp80;
}
return bs01;
}

public int Div(int num){

int tmp86 ;
int tmp85 ;
boolean tmp88 ;
int tmp87 ;
int tmp82 ;
int tmp81 ;
int count02 ;
int tmp84 ;
int count01 ;
int tmp83 ;
int aux03 ;
int tmp89 ;
int tmp92 ;
int tmp91 ;
int tmp90 ;

tmp81 = 0;
count01 = tmp81;
tmp82 = 0;
count02 = tmp82;
tmp83 = 1;
tmp84 = num - tmp83;
aux03 = tmp84;
tmp86 = 1;
tmp87 = aux03 - tmp86;
tmp88 = count02 <= tmp85;
while (tmp88) {
{
tmp89 = 1;
tmp90 = count01 + tmp89;
count01 = tmp90;
tmp91 = 2;
tmp92 = count02 + tmp91;
count02 = tmp92;
}
tmp88 = count02 <= tmp85;
}
return count01;
}

public boolean Compare(int num1, int num2){

int aux02 ;
int tmp103 ;
boolean tmp102 ;
int tmp105 ;
int tmp104 ;
boolean tmp101 ;
boolean tmp100 ;
int tmp97 ;
int tmp96 ;
boolean tmp99 ;
int tmp98 ;
boolean tmp93 ;
boolean tmp107 ;
boolean tmp106 ;
int tmp95 ;
int tmp94 ;
boolean tmp108 ;
boolean retval ;

tmp93 = false;
retval = tmp93;
tmp94 = 1;
tmp95 = num2 + tmp94;
aux02 = tmp95;
tmp97 = 1;
tmp98 = num2 - tmp97;
tmp99 = num1 <= tmp96;
if (tmp99) {
tmp100 = false;
retval = tmp100;
} else {
tmp104 = 1;
tmp105 = aux02 - tmp104;
tmp106 = num1 <= tmp103;
tmp101 = !tmp102;
if (tmp101) {
tmp107 = false;
retval = tmp107;
} else {
tmp108 = true;
retval = tmp108;
}
}
return retval;
}

public int Print(){

int tmp118 ;
int tmp117 ;
int tmp109 ;
int j ;
int tmp114 ;
boolean tmp113 ;
int tmp116 ;
int tmp115 ;
int tmp110 ;
int tmp112 ;
int tmp111 ;

tmp109 = 1;
j = tmp109;
tmp111 = 1;
tmp112 = size - tmp111;
tmp113 = j <= tmp110;
while (tmp113) {
{
tmp114 = number[j];
System.out.println(tmp114);
tmp115 = 1;
tmp116 = j + tmp115;
j = tmp116;
}
tmp113 = j <= tmp110;
}
tmp117 = 99999;
System.out.println(tmp117);
tmp118 = 0;
return tmp118;
}

public int Init(int sz){

int[] tmp119 ;
int aux01 ;
int aux02 ;
int tmp125 ;
int tmp124 ;
int tmp127 ;
boolean tmp126 ;
int tmp121 ;
int tmp120 ;
int tmp123 ;
int tmp122 ;
int tmp129 ;
int tmp128 ;
int j ;
int k ;
int tmp130 ;
int tmp136 ;
int tmp135 ;
int tmp132 ;
int tmp131 ;
int tmp134 ;
int tmp133 ;

size = sz;
tmp119 = new int[sz];
number = tmp119;
tmp120 = 1;
j = tmp120;
tmp121 = 1;
tmp122 = size + tmp121;
k = tmp122;
tmp124 = 1;
tmp125 = size - tmp124;
tmp126 = j <= tmp123;
while (tmp126) {
{
tmp127 = 2;
tmp128 = tmp127 * j;
aux01 = tmp128;
tmp129 = 3;
tmp130 = k - tmp129;
aux02 = tmp130;
tmp131 = aux01 + aux02;
number[j] = tmp131;
tmp132 = 1;
tmp133 = j + tmp132;
j = tmp133;
tmp134 = 1;
tmp135 = k - tmp134;
k = tmp135;
}
tmp126 = j <= tmp123;
}
tmp136 = 0;
return tmp136;
}

}

