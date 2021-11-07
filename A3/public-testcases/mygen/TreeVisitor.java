class TreeVisitor {
public static void main(String[] a) {

TV tmp1 ;
TV tmp0 ;

tmp0 = new TV();
tmp1 = tmp0.Start();
System.out.println(tmp1);

}
}

class TV{


public int Start(){

int tmp20 ;
int tmp42 ;
int tmp41 ;
int tmp22 ;
Tree tmp21 ;
int tmp40 ;
Tree tmp5 ;
int tmp28 ;
int tmp6 ;
int tmp27 ;
int tmp3 ;
int tmp4 ;
int tmp29 ;
int tmp24 ;
Tree tmp2 ;
MyVisitor tmp23 ;
int tmp26 ;
MyVisitor tmp25 ;
Tree root ;
boolean ntb ;
int tmp31 ;
int tmp30 ;
int nti ;
int tmp11 ;
int tmp33 ;
int tmp10 ;
int tmp32 ;
int tmp17 ;
Tree tmp39 ;
int tmp16 ;
int tmp38 ;
int tmp19 ;
int tmp18 ;
int tmp13 ;
int tmp35 ;
int tmp12 ;
int tmp34 ;
int tmp15 ;
int tmp37 ;
int tmp14 ;
int tmp36 ;
int tmp9 ;
MyVisitor v ;
int tmp7 ;
int tmp8 ;

tmp2 = new Tree();
root = tmp2;
tmp4 = 16;
tmp3 = root.Init(tmp4);
ntb = tmp3;
tmp5 = root.Print();
ntb = tmp5;
tmp6 = 100000000;
System.out.println(tmp6);
tmp8 = 8;
tmp7 = root.Insert(tmp8);
ntb = tmp7;
tmp10 = 24;
tmp9 = root.Insert(tmp10);
ntb = tmp9;
tmp12 = 4;
tmp11 = root.Insert(tmp12);
ntb = tmp11;
tmp14 = 12;
tmp13 = root.Insert(tmp14);
ntb = tmp13;
tmp16 = 20;
tmp15 = root.Insert(tmp16);
ntb = tmp15;
tmp18 = 28;
tmp17 = root.Insert(tmp18);
ntb = tmp17;
tmp20 = 14;
tmp19 = root.Insert(tmp20);
ntb = tmp19;
tmp21 = root.Print();
ntb = tmp21;
tmp22 = 100000000;
System.out.println(tmp22);
tmp23 = new MyVisitor();
v = tmp23;
tmp24 = 50000000;
System.out.println(tmp24);
tmp25 = root.accept(v);
nti = tmp25;
tmp26 = 100000000;
System.out.println(tmp26);
tmp28 = 24;
tmp27 = root.Search(tmp28);
System.out.println(tmp27);
tmp30 = 12;
tmp29 = root.Search(tmp30);
System.out.println(tmp29);
tmp32 = 16;
tmp31 = root.Search(tmp32);
System.out.println(tmp31);
tmp34 = 50;
tmp33 = root.Search(tmp34);
System.out.println(tmp33);
tmp36 = 12;
tmp35 = root.Search(tmp36);
System.out.println(tmp35);
tmp38 = 12;
tmp37 = root.Delete(tmp38);
ntb = tmp37;
tmp39 = root.Print();
ntb = tmp39;
tmp41 = 12;
tmp40 = root.Search(tmp41);
System.out.println(tmp40);
tmp42 = 0;
return tmp42;
}

}

class Tree{

Tree left ;
boolean has_right ;
Tree my_null ;
Tree right ;
boolean has_left ;
int key ;

public boolean Init(int v_key){

boolean tmp44 ;
boolean tmp43 ;
boolean tmp45 ;

key = v_key;
tmp43 = false;
has_left = tmp43;
tmp44 = false;
has_right = tmp44;
tmp45 = true;
return tmp45;
}

public boolean SetRight(Tree rn){

boolean tmp46 ;

right = rn;
tmp46 = true;
return tmp46;
}

public boolean SetLeft(Tree ln){

boolean tmp47 ;

left = ln;
tmp47 = true;
return tmp47;
}

public Tree GetRight(){


return right;
}

public Tree GetLeft(){


return left;
}

public int GetKey(){


return key;
}

public boolean SetKey(int v_key){

boolean tmp48 ;

key = v_key;
tmp48 = true;
return tmp48;
}

public boolean GetHas_Right(){


return has_right;
}

public boolean GetHas_Left(){


return has_left;
}

public boolean SetHas_Left(boolean val){

boolean tmp49 ;

has_left = val;
tmp49 = true;
return tmp49;
}

public boolean SetHas_Right(boolean val){

boolean tmp50 ;

has_right = val;
tmp50 = true;
return tmp50;
}

public boolean Compare(int num1, int num2){

boolean tmp64 ;
int tmp63 ;
boolean tmp66 ;
boolean tmp65 ;
boolean tmp60 ;
int tmp62 ;
int tmp61 ;
boolean ntb ;
int tmp53 ;
int tmp52 ;
int nti ;
int tmp55 ;
int tmp54 ;
boolean tmp51 ;
boolean tmp57 ;
int tmp56 ;
boolean tmp59 ;
boolean tmp58 ;

tmp51 = false;
ntb = tmp51;
tmp52 = 1;
tmp53 = num2 + tmp52;
nti = tmp53;
tmp55 = 1;
tmp56 = num2 - tmp55;
tmp57 = num1 <= tmp54;
if (tmp57) {
tmp58 = false;
ntb = tmp58;
} else {
tmp62 = 1;
tmp63 = nti - tmp62;
tmp64 = num1 <= tmp61;
tmp59 = !tmp60;
if (tmp59) {
tmp65 = false;
ntb = tmp65;
} else {
tmp66 = true;
ntb = tmp66;
}
}
return ntb;
}

public boolean Insert(int v_key){

boolean tmp86 ;
boolean tmp85 ;
boolean tmp88 ;
Tree current_node ;
Tree tmp87 ;
boolean tmp82 ;
Tree tmp81 ;
boolean tmp84 ;
Tree tmp83 ;
int tmp68 ;
Tree tmp67 ;
int key_aux ;
Tree tmp69 ;
Tree new_node ;
boolean tmp80 ;
boolean cont ;
boolean ntb ;
boolean tmp75 ;
int tmp74 ;
Tree tmp77 ;
boolean tmp76 ;
Tree tmp71 ;
boolean tmp70 ;
int tmp73 ;
int tmp72 ;
boolean tmp79 ;
boolean tmp78 ;

tmp67 = new Tree();
new_node = tmp67;
tmp68 = new_node.Init(v_key);
ntb = tmp68;
tmp69 = this;
current_node = tmp69;
tmp70 = true;
cont = tmp70;
while (cont) {
{
tmp71 = current_node.GetKey();
key_aux = tmp71;
tmp73 = 1;
tmp74 = key_aux - tmp73;
tmp75 = v_key <= tmp72;
if (tmp75) {
{
tmp76 = current_node.GetHas_Left();
if (tmp76) {
tmp77 = current_node.GetLeft();
current_node = tmp77;
} else {
{
tmp78 = false;
cont = tmp78;
tmp80 = true;
tmp79 = current_node.SetHas_Left(tmp80);
ntb = tmp79;
tmp81 = current_node.SetLeft(new_node);
ntb = tmp81;
}
}
}
} else {
{
tmp82 = current_node.GetHas_Right();
if (tmp82) {
tmp83 = current_node.GetRight();
current_node = tmp83;
} else {
{
tmp84 = false;
cont = tmp84;
tmp86 = true;
tmp85 = current_node.SetHas_Right(tmp86);
ntb = tmp85;
tmp87 = current_node.SetRight(new_node);
ntb = tmp87;
}
}
}
}
}
tmp75 = v_key <= tmp72;
}
tmp88 = true;
return tmp88;
}

public boolean Delete(int v_key){

Tree current_node ;
Tree tmp118 ;
Tree tmp117 ;
boolean tmp119 ;
boolean is_root ;
Tree tmp89 ;
int key_aux ;
boolean found ;
int tmp103 ;
int tmp102 ;
boolean tmp105 ;
int tmp104 ;
boolean cont ;
boolean tmp121 ;
boolean ntb ;
boolean tmp120 ;
boolean tmp101 ;
Tree tmp100 ;
int tmp97 ;
int tmp96 ;
boolean tmp99 ;
boolean tmp98 ;
boolean tmp93 ;
Tree tmp107 ;
boolean tmp92 ;
boolean tmp106 ;
int tmp95 ;
boolean tmp109 ;
Tree tmp94 ;
boolean tmp108 ;
Tree parent_node ;
boolean tmp114 ;
boolean tmp113 ;
boolean tmp91 ;
Tree tmp116 ;
Tree tmp90 ;
Tree tmp115 ;
Tree tmp110 ;
Tree tmp112 ;
boolean tmp111 ;

tmp89 = this;
current_node = tmp89;
tmp90 = this;
parent_node = tmp90;
tmp91 = true;
cont = tmp91;
tmp92 = false;
found = tmp92;
tmp93 = true;
is_root = tmp93;
while (cont) {
{
tmp94 = current_node.GetKey();
key_aux = tmp94;
tmp96 = 1;
tmp97 = key_aux - tmp96;
tmp98 = v_key <= tmp95;
if (tmp98) {
tmp99 = current_node.GetHas_Left();
if (tmp99) {
{
parent_node = current_node;
tmp100 = current_node.GetLeft();
current_node = tmp100;
}
} else {
tmp101 = false;
cont = tmp101;
}
} else {
tmp103 = 1;
tmp104 = v_key - tmp103;
tmp105 = key_aux <= tmp102;
if (tmp105) {
tmp106 = current_node.GetHas_Right();
if (tmp106) {
{
parent_node = current_node;
tmp107 = current_node.GetRight();
current_node = tmp107;
}
} else {
tmp108 = false;
cont = tmp108;
}
} else {
{
if (is_root) {
tmp110 = current_node.GetHas_Right();
tmp109 = !tmp110;
tmp112 = current_node.GetHas_Left();
tmp111 = !tmp112;
tmp113 = tmp109 && tmp111;
if (tmp113) {
tmp114 = true;
ntb = tmp114;
} else {
tmp115 = this;
tmp116 = tmp115.Remove(parent_node, current_node);
ntb = tmp116;
}
} else {
tmp117 = this;
tmp118 = tmp117.Remove(parent_node, current_node);
ntb = tmp118;
}
tmp119 = true;
found = tmp119;
tmp120 = false;
cont = tmp120;
}
}
}
tmp121 = false;
is_root = tmp121;
}
tmp98 = v_key <= tmp95;
tmp105 = key_aux <= tmp102;
}
return found;
}

public boolean Remove(Tree p_node, Tree c_node){

boolean tmp139 ;
int auxkey1 ;
int auxkey2 ;
Tree my_null ;
boolean tmp140 ;
boolean tmp125 ;
Tree tmp124 ;
Tree tmp127 ;
Tree tmp126 ;
boolean ntb ;
Tree tmp123 ;
boolean tmp122 ;
Tree tmp129 ;
Tree tmp128 ;
Tree tmp130 ;
boolean tmp136 ;
boolean tmp135 ;
boolean tmp138 ;
Tree tmp137 ;
Tree tmp132 ;
Tree tmp131 ;
Tree tmp134 ;
boolean tmp133 ;

tmp122 = c_node.GetHas_Left();
if (tmp122) {
tmp123 = this;
tmp124 = tmp123.RemoveLeft(p_node, c_node);
ntb = tmp124;
} else {
tmp125 = c_node.GetHas_Right();
if (tmp125) {
tmp126 = this;
tmp127 = tmp126.RemoveRight(p_node, c_node);
ntb = tmp127;
} else {
{
tmp128 = c_node.GetKey();
auxkey1 = tmp128;
tmp130 = p_node.GetLeft();
tmp131 = tmp129.GetKey();
auxkey2 = tmp131;
tmp132 = this;
tmp133 = tmp132.Compare(auxkey1, auxkey2);
if (tmp133) {
{
tmp134 = p_node.SetLeft(my_null);
ntb = tmp134;
tmp136 = false;
tmp135 = p_node.SetHas_Left(tmp136);
ntb = tmp135;
}
} else {
{
tmp137 = p_node.SetRight(my_null);
ntb = tmp137;
tmp139 = false;
tmp138 = p_node.SetHas_Right(tmp139);
ntb = tmp138;
}
}
}
}
}
tmp140 = true;
return tmp140;
}

public boolean RemoveRight(Tree p_node, Tree c_node){

Tree my_null ;
boolean tmp141 ;
Tree tmp147 ;
Tree tmp146 ;
boolean tmp149 ;
boolean tmp148 ;
Tree tmp143 ;
boolean ntb ;
Tree tmp142 ;
Tree tmp145 ;
Tree tmp144 ;
boolean tmp150 ;

tmp141 = c_node.GetHas_Right();
while (tmp141) {
{
tmp144 = c_node.GetRight();
tmp145 = tmp143.GetKey();
tmp142 = c_node.SetKey(tmp145);
ntb = tmp142;
p_node = c_node;
tmp146 = c_node.GetRight();
c_node = tmp146;
}
}
tmp147 = p_node.SetRight(my_null);
ntb = tmp147;
tmp149 = false;
tmp148 = p_node.SetHas_Right(tmp149);
ntb = tmp148;
tmp150 = true;
return tmp150;
}

public boolean RemoveLeft(Tree p_node, Tree c_node){

Tree my_null ;
boolean tmp160 ;
boolean ntb ;
Tree tmp152 ;
boolean tmp151 ;
boolean tmp158 ;
Tree tmp157 ;
boolean tmp159 ;
Tree tmp154 ;
Tree tmp153 ;
Tree tmp156 ;
Tree tmp155 ;

tmp151 = c_node.GetHas_Left();
while (tmp151) {
{
tmp154 = c_node.GetLeft();
tmp155 = tmp153.GetKey();
tmp152 = c_node.SetKey(tmp155);
ntb = tmp152;
p_node = c_node;
tmp156 = c_node.GetLeft();
c_node = tmp156;
}
}
tmp157 = p_node.SetLeft(my_null);
ntb = tmp157;
tmp159 = false;
tmp158 = p_node.SetHas_Left(tmp159);
ntb = tmp158;
tmp160 = true;
return tmp160;
}

public int Search(int v_key){

Tree current_node ;
int ifound ;
int key_aux ;
Tree tmp161 ;
int tmp163 ;
boolean tmp162 ;
boolean tmp180 ;
boolean tmp169 ;
boolean tmp168 ;
boolean cont ;
int tmp165 ;
Tree tmp164 ;
int tmp167 ;
int tmp166 ;
int tmp172 ;
boolean tmp171 ;
int tmp174 ;
int tmp173 ;
Tree tmp170 ;
int tmp179 ;
boolean tmp176 ;
boolean tmp175 ;
boolean tmp178 ;
Tree tmp177 ;

tmp161 = this;
current_node = tmp161;
tmp162 = true;
cont = tmp162;
tmp163 = 0;
ifound = tmp163;
while (cont) {
{
tmp164 = current_node.GetKey();
key_aux = tmp164;
tmp166 = 1;
tmp167 = key_aux - tmp166;
tmp168 = v_key <= tmp165;
if (tmp168) {
tmp169 = current_node.GetHas_Left();
if (tmp169) {
tmp170 = current_node.GetLeft();
current_node = tmp170;
} else {
tmp171 = false;
cont = tmp171;
}
} else {
tmp173 = 1;
tmp174 = v_key - tmp173;
tmp175 = key_aux <= tmp172;
if (tmp175) {
tmp176 = current_node.GetHas_Right();
if (tmp176) {
tmp177 = current_node.GetRight();
current_node = tmp177;
} else {
tmp178 = false;
cont = tmp178;
}
} else {
{
tmp179 = 1;
ifound = tmp179;
tmp180 = false;
cont = tmp180;
}
}
}
}
tmp168 = v_key <= tmp165;
tmp175 = key_aux <= tmp172;
}
return ifound;
}

public boolean Print(){

Tree current_node ;
Tree tmp183 ;
Tree tmp182 ;
boolean tmp184 ;
Tree tmp181 ;
boolean ntb ;

tmp181 = this;
current_node = tmp181;
tmp182 = this;
tmp183 = tmp182.RecPrint(current_node);
ntb = tmp183;
tmp184 = true;
return tmp184;
}

public boolean RecPrint(Tree node){

boolean tmp185 ;
Tree tmp187 ;
boolean ntb ;
Tree tmp186 ;
boolean tmp189 ;
Tree tmp188 ;
Tree tmp194 ;
Tree tmp193 ;
boolean tmp196 ;
boolean tmp195 ;
Tree tmp190 ;
Tree tmp192 ;
boolean tmp191 ;

tmp185 = node.GetHas_Left();
if (tmp185) {
{
tmp186 = this;
tmp188 = node.GetLeft();
tmp187 = tmp186.RecPrint(tmp188);
ntb = tmp187;
}
} else {
tmp189 = true;
ntb = tmp189;
}
tmp190 = node.GetKey();
System.out.println(tmp190);
tmp191 = node.GetHas_Right();
if (tmp191) {
{
tmp192 = this;
tmp194 = node.GetRight();
tmp193 = tmp192.RecPrint(tmp194);
ntb = tmp193;
}
} else {
tmp195 = true;
ntb = tmp195;
}
tmp196 = true;
return tmp196;
}

public int accept(Visitor v){

int tmp200 ;
int nti ;
Visitor tmp198 ;
int tmp197 ;
Visitor tmp199 ;

tmp197 = 333;
System.out.println(tmp197);
tmp199 = this;
tmp198 = v.visit(tmp199);
nti = tmp198;
tmp200 = 0;
return tmp200;
}

}

class Visitor{

Tree r ;
Tree l ;

public int visit(Tree n){

Tree tmp202 ;
boolean tmp201 ;
Tree tmp204 ;
Tree tmp203 ;
Tree tmp209 ;
int nti ;
boolean tmp206 ;
int tmp205 ;
Tree tmp208 ;
Tree tmp207 ;
int tmp211 ;
int tmp210 ;

tmp201 = n.GetHas_Right();
if (tmp201) {
{
tmp202 = n.GetRight();
r = tmp202;
tmp204 = this;
tmp203 = r.accept(tmp204);
nti = tmp203;
}
} else {
tmp205 = 0;
nti = tmp205;
}
tmp206 = n.GetHas_Left();
if (tmp206) {
{
tmp207 = n.GetLeft();
l = tmp207;
tmp209 = this;
tmp208 = l.accept(tmp209);
nti = tmp208;
}
} else {
tmp210 = 0;
nti = tmp210;
}
tmp211 = 0;
return tmp211;
}

}

class MyVisitor extends Visitor{


public int visit(Tree n){

Tree tmp217 ;
int tmp216 ;
Tree tmp219 ;
boolean tmp218 ;
int tmp223 ;
int tmp220 ;
int tmp222 ;
int tmp221 ;
int nti ;
Tree tmp213 ;
boolean tmp212 ;
int tmp215 ;
int tmp214 ;

tmp212 = n.GetHas_Right();
if (tmp212) {
{
tmp213 = n.GetRight();
r = tmp213;
tmp215 = this;
tmp214 = r.accept(tmp215);
nti = tmp214;
}
} else {
tmp216 = 0;
nti = tmp216;
}
tmp217 = n.GetKey();
System.out.println(tmp217);
tmp218 = n.GetHas_Left();
if (tmp218) {
{
tmp219 = n.GetLeft();
l = tmp219;
tmp221 = this;
tmp220 = l.accept(tmp221);
nti = tmp220;
}
} else {
tmp222 = 0;
nti = tmp222;
}
tmp223 = 0;
return tmp223;
}

}

