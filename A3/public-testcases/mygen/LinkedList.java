class LinkedList {
public static void main(String[] a) {

LL tmp1 ;
LL tmp0 ;

tmp0 = new LL();
tmp1 = tmp0.Start();
System.out.println(tmp1);

}
}

class Element{

int Salary ;
boolean Married ;
int Age ;

public boolean Init(int v_Age, int v_Salary, boolean v_Married){

boolean tmp2 ;

Age = v_Age;
Salary = v_Salary;
Married = v_Married;
tmp2 = true;
return tmp2;
}

public int GetAge(){


return Age;
}

public int GetSalary(){


return Salary;
}

public boolean GetMarried(){


return Married;
}

public boolean Equal(Element other){

int tmp20 ;
int Salary ;
int nt ;
int aux01 ;
boolean tmp5 ;
Element tmp6 ;
boolean tmp3 ;
int aux02 ;
Element tmp4 ;
boolean Married ;
int Age ;
Element tmp11 ;
boolean tmp10 ;
int tmp17 ;
boolean tmp16 ;
boolean tmp19 ;
boolean tmp18 ;
boolean ret_val ;
boolean tmp13 ;
int tmp12 ;
Element tmp15 ;
boolean tmp14 ;
Element tmp9 ;
int tmp7 ;
boolean tmp8 ;

tmp3 = true;
ret_val = tmp3;
tmp4 = other.GetAge();
aux01 = tmp4;
tmp6 = this;
tmp7 = tmp6.Compare(aux01, Age);
tmp5 = !tmp7;
if (tmp5) {
tmp8 = false;
ret_val = tmp8;
} else {
{
tmp9 = other.GetSalary();
aux02 = tmp9;
tmp11 = this;
tmp12 = tmp11.Compare(aux02, Salary);
tmp10 = !tmp12;
if (tmp10) {
tmp13 = false;
ret_val = tmp13;
} else {
if (Married) {
tmp15 = other.GetMarried();
tmp14 = !tmp15;
if (tmp14) {
tmp16 = false;
ret_val = tmp16;
} else {
tmp17 = 0;
nt = tmp17;
}
} else {
tmp18 = other.GetMarried();
if (tmp18) {
tmp19 = false;
ret_val = tmp19;
} else {
tmp20 = 0;
nt = tmp20;
}
}
}
}
}
return ret_val;
}

public boolean Compare(int num1, int num2){

int tmp22 ;
boolean tmp21 ;
boolean tmp28 ;
boolean tmp27 ;
int aux02 ;
boolean tmp29 ;
int tmp24 ;
int tmp23 ;
int tmp26 ;
int tmp25 ;
int tmp31 ;
boolean tmp30 ;
int tmp33 ;
int tmp32 ;
boolean tmp35 ;
boolean tmp34 ;
boolean retval ;
boolean tmp36 ;

tmp21 = false;
retval = tmp21;
tmp22 = 1;
tmp23 = num2 + tmp22;
aux02 = tmp23;
tmp25 = 1;
tmp26 = num2 - tmp25;
tmp27 = num1 <= tmp24;
if (tmp27) {
tmp28 = false;
retval = tmp28;
} else {
tmp32 = 1;
tmp33 = aux02 - tmp32;
tmp34 = num1 <= tmp31;
tmp29 = !tmp30;
if (tmp29) {
tmp35 = false;
retval = tmp35;
} else {
tmp36 = true;
retval = tmp36;
}
}
return retval;
}

}

class List{

Element elem ;
List next ;
boolean end ;

public boolean Init(){

boolean tmp38 ;
boolean tmp37 ;

tmp37 = true;
end = tmp37;
tmp38 = true;
return tmp38;
}

public boolean InitNew(Element v_elem, List v_next, boolean v_end){

boolean tmp39 ;

end = v_end;
elem = v_elem;
next = v_next;
tmp39 = true;
return tmp39;
}

public List Insert(Element new_elem){

boolean tmp42 ;
List tmp41 ;
boolean tmp43 ;
List tmp40 ;
List aux03 ;
List aux02 ;
boolean ret_val ;

tmp40 = this;
aux03 = tmp40;
tmp41 = new List();
aux02 = tmp41;
tmp43 = false;
tmp42 = aux02.InitNew(new_elem, aux03, tmp43);
ret_val = tmp42;
return aux02;
}

public boolean SetNext(List v_next){

boolean tmp44 ;

next = v_next;
tmp44 = true;
return tmp44;
}

public List Delete(Element e){

List tmp64 ;
boolean tmp63 ;
int tmp66 ;
int tmp65 ;
boolean aux05 ;
int tmp60 ;
int aux04 ;
int nt ;
int tmp62 ;
List prev ;
int tmp61 ;
List aux01 ;
int tmp49 ;
boolean tmp46 ;
List tmp68 ;
List tmp45 ;
int tmp67 ;
int tmp48 ;
int tmp47 ;
List tmp69 ;
boolean var_end ;
Element var_elem ;
boolean tmp53 ;
List tmp75 ;
boolean tmp52 ;
boolean tmp74 ;
boolean tmp55 ;
List tmp77 ;
boolean tmp54 ;
List tmp76 ;
int tmp71 ;
int tmp70 ;
List tmp51 ;
int tmp73 ;
List tmp50 ;
int tmp72 ;
boolean ret_val ;
boolean tmp57 ;
int tmp79 ;
boolean tmp56 ;
int tmp78 ;
int tmp59 ;
boolean tmp58 ;
List my_head ;

tmp45 = this;
my_head = tmp45;
tmp46 = false;
ret_val = tmp46;
tmp47 = 0;
tmp48 = 1;
tmp49 = tmp47 - tmp48;
aux04 = tmp49;
tmp50 = this;
aux01 = tmp50;
tmp51 = this;
prev = tmp51;
var_end = end;
var_elem = elem;
tmp53 = !var_end;
tmp55 = !ret_val;
tmp56 = tmp52 && tmp54;
while (tmp56) {
{
tmp57 = e.Equal(var_elem);
if (tmp57) {
{
tmp58 = true;
ret_val = tmp58;
tmp60 = 0;
tmp61 = 1;
tmp62 = tmp60 - tmp61;
tmp63 = aux04 <= tmp59;
if (tmp63) {
{
tmp64 = aux01.GetNext();
my_head = tmp64;
}
} else {
{
tmp65 = 0;
tmp66 = 555;
tmp67 = tmp65 - tmp66;
System.out.println(tmp67);
tmp69 = aux01.GetNext();
tmp68 = prev.SetNext(tmp69);
aux05 = tmp68;
tmp70 = 0;
tmp71 = 555;
tmp72 = tmp70 - tmp71;
System.out.println(tmp72);
}
}
}
} else {
tmp73 = 0;
nt = tmp73;
}
tmp74 = !ret_val;
if (tmp74) {
{
prev = aux01;
tmp75 = aux01.GetNext();
aux01 = tmp75;
tmp76 = aux01.GetEnd();
var_end = tmp76;
tmp77 = aux01.GetElem();
var_elem = tmp77;
tmp78 = 1;
aux04 = tmp78;
}
} else {
tmp79 = 0;
nt = tmp79;
}
}
tmp63 = aux04 <= tmp59;
}
return my_head;
}

public int Search(Element e){

List tmp86 ;
int tmp85 ;
List tmp88 ;
List tmp87 ;
boolean tmp82 ;
List tmp81 ;
int nt ;
int tmp84 ;
boolean tmp83 ;
List aux01 ;
int tmp80 ;
boolean var_end ;
Element var_elem ;
int int_ret_val ;

tmp80 = 0;
int_ret_val = tmp80;
tmp81 = this;
aux01 = tmp81;
var_end = end;
var_elem = elem;
tmp82 = !var_end;
while (tmp82) {
{
tmp83 = e.Equal(var_elem);
if (tmp83) {
{
tmp84 = 1;
int_ret_val = tmp84;
}
} else {
tmp85 = 0;
nt = tmp85;
}
tmp86 = aux01.GetNext();
aux01 = tmp86;
tmp87 = aux01.GetEnd();
var_end = tmp87;
tmp88 = aux01.GetElem();
var_elem = tmp88;
}
}
return int_ret_val;
}

public boolean GetEnd(){


return end;
}

public Element GetElem(){


return elem;
}

public List GetNext(){


return next;
}

public boolean Print(){

List aux01 ;
List tmp89 ;
boolean var_end ;
Element var_elem ;
List tmp93 ;
List tmp92 ;
boolean tmp95 ;
List tmp94 ;
Element tmp91 ;
boolean tmp90 ;

tmp89 = this;
aux01 = tmp89;
var_end = end;
var_elem = elem;
tmp90 = !var_end;
while (tmp90) {
{
tmp91 = var_elem.GetAge();
System.out.println(tmp91);
tmp92 = aux01.GetNext();
aux01 = tmp92;
tmp93 = aux01.GetEnd();
var_end = tmp93;
tmp94 = aux01.GetElem();
var_elem = tmp94;
}
}
tmp95 = true;
return tmp95;
}

}

class LL{


public int Start(){

int tmp118 ;
boolean tmp117 ;
int tmp119 ;
int tmp125 ;
boolean tmp124 ;
boolean tmp127 ;
int tmp126 ;
Element tmp121 ;
boolean tmp120 ;
Element tmp123 ;
List tmp122 ;
int tmp107 ;
List tmp106 ;
boolean tmp109 ;
Element tmp108 ;
List tmp114 ;
Element tmp113 ;
Element tmp116 ;
int tmp115 ;
int tmp110 ;
boolean tmp112 ;
int tmp111 ;
Element el03 ;
Element tmp139 ;
Element el02 ;
Element el01 ;
boolean aux01 ;
List head ;
int tmp141 ;
List tmp140 ;
int tmp103 ;
int tmp102 ;
Element tmp105 ;
boolean tmp104 ;
List tmp143 ;
Element tmp142 ;
boolean tmp101 ;
int tmp145 ;
Element tmp100 ;
int tmp144 ;
List tmp97 ;
List last_elem ;
List tmp96 ;
List tmp99 ;
List tmp98 ;
Element tmp129 ;
Element tmp128 ;
int tmp130 ;
Element tmp136 ;
boolean tmp135 ;
int tmp138 ;
List tmp137 ;
boolean tmp132 ;
Element tmp131 ;
int tmp134 ;
int tmp133 ;

tmp96 = new List();
last_elem = tmp96;
tmp97 = last_elem.Init();
aux01 = tmp97;
head = last_elem;
tmp98 = head.Init();
aux01 = tmp98;
tmp99 = head.Print();
aux01 = tmp99;
tmp100 = new Element();
el01 = tmp100;
tmp102 = 25;
tmp103 = 37000;
tmp104 = false;
tmp101 = el01.Init(tmp102, tmp103, tmp104);
aux01 = tmp101;
tmp105 = head.Insert(el01);
head = tmp105;
tmp106 = head.Print();
aux01 = tmp106;
tmp107 = 10000000;
System.out.println(tmp107);
tmp108 = new Element();
el01 = tmp108;
tmp110 = 39;
tmp111 = 42000;
tmp112 = true;
tmp109 = el01.Init(tmp110, tmp111, tmp112);
aux01 = tmp109;
el02 = el01;
tmp113 = head.Insert(el01);
head = tmp113;
tmp114 = head.Print();
aux01 = tmp114;
tmp115 = 10000000;
System.out.println(tmp115);
tmp116 = new Element();
el01 = tmp116;
tmp118 = 22;
tmp119 = 34000;
tmp120 = false;
tmp117 = el01.Init(tmp118, tmp119, tmp120);
aux01 = tmp117;
tmp121 = head.Insert(el01);
head = tmp121;
tmp122 = head.Print();
aux01 = tmp122;
tmp123 = new Element();
el03 = tmp123;
tmp125 = 27;
tmp126 = 34000;
tmp127 = false;
tmp124 = el03.Init(tmp125, tmp126, tmp127);
aux01 = tmp124;
tmp128 = head.Search(el02);
System.out.println(tmp128);
tmp129 = head.Search(el03);
System.out.println(tmp129);
tmp130 = 10000000;
System.out.println(tmp130);
tmp131 = new Element();
el01 = tmp131;
tmp133 = 28;
tmp134 = 35000;
tmp135 = false;
tmp132 = el01.Init(tmp133, tmp134, tmp135);
aux01 = tmp132;
tmp136 = head.Insert(el01);
head = tmp136;
tmp137 = head.Print();
aux01 = tmp137;
tmp138 = 2220000;
System.out.println(tmp138);
tmp139 = head.Delete(el02);
head = tmp139;
tmp140 = head.Print();
aux01 = tmp140;
tmp141 = 33300000;
System.out.println(tmp141);
tmp142 = head.Delete(el01);
head = tmp142;
tmp143 = head.Print();
aux01 = tmp143;
tmp144 = 44440000;
System.out.println(tmp144);
tmp145 = 0;
return tmp145;
}

}

