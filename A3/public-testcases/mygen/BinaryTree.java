class BinaryTree {
public static void main(String[] a) {

BT tmp1 ;
BT tmp0 ;

tmp0 = new BT();
tmp1 = tmp0.Start();
System.out.println(tmp1);

}
}

class BT{


public int Start(){

int tmp20 ;
Tree tmp22 ;
int tmp21 ;
Tree tmp5 ;
int tmp28 ;
int tmp6 ;
int tmp27 ;
int tmp3 ;
int tmp4 ;
int tmp29 ;
int tmp24 ;
Tree tmp2 ;
int tmp23 ;
int tmp26 ;
int tmp25 ;
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
int tmp16 ;
int tmp38 ;
int tmp19 ;
int tmp18 ;
int tmp13 ;
Tree tmp35 ;
int tmp12 ;
int tmp34 ;
int tmp15 ;
int tmp37 ;
int tmp14 ;
int tmp36 ;
Tree tmp9 ;
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
tmp9 = root.Print();
ntb = tmp9;
tmp11 = 24;
tmp10 = root.Insert(tmp11);
ntb = tmp10;
tmp13 = 4;
tmp12 = root.Insert(tmp13);
ntb = tmp12;
tmp15 = 12;
tmp14 = root.Insert(tmp15);
ntb = tmp14;
tmp17 = 20;
tmp16 = root.Insert(tmp17);
ntb = tmp16;
tmp19 = 28;
tmp18 = root.Insert(tmp19);
ntb = tmp18;
tmp21 = 14;
tmp20 = root.Insert(tmp21);
ntb = tmp20;
tmp22 = root.Print();
ntb = tmp22;
tmp24 = 24;
tmp23 = root.Search(tmp24);
System.out.println(tmp23);
tmp26 = 12;
tmp25 = root.Search(tmp26);
System.out.println(tmp25);
tmp28 = 16;
tmp27 = root.Search(tmp28);
System.out.println(tmp27);
tmp30 = 50;
tmp29 = root.Search(tmp30);
System.out.println(tmp29);
tmp32 = 12;
tmp31 = root.Search(tmp32);
System.out.println(tmp31);
tmp34 = 12;
tmp33 = root.Delete(tmp34);
ntb = tmp33;
tmp35 = root.Print();
ntb = tmp35;
tmp37 = 12;
tmp36 = root.Search(tmp37);
System.out.println(tmp36);
tmp38 = 0;
return tmp38;
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

boolean tmp41 ;
boolean tmp40 ;
boolean tmp39 ;

key = v_key;
tmp39 = false;
has_left = tmp39;
tmp40 = false;
has_right = tmp40;
tmp41 = true;
return tmp41;
}

public boolean SetRight(Tree rn){

boolean tmp42 ;

right = rn;
tmp42 = true;
return tmp42;
}

public boolean SetLeft(Tree ln){

boolean tmp43 ;

left = ln;
tmp43 = true;
return tmp43;
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

boolean tmp44 ;

key = v_key;
tmp44 = true;
return tmp44;
}

public boolean GetHas_Right(){


return has_right;
}

public boolean GetHas_Left(){


return has_left;
}

public boolean SetHas_Left(boolean val){

boolean tmp45 ;

has_left = val;
tmp45 = true;
return tmp45;
}

public boolean SetHas_Right(boolean val){

boolean tmp46 ;

has_right = val;
tmp46 = true;
return tmp46;
}

public boolean Compare(int num1, int num2){

boolean tmp60 ;
boolean tmp62 ;
boolean tmp61 ;
int tmp49 ;
int tmp48 ;
boolean tmp47 ;
boolean ntb ;
boolean tmp53 ;
int tmp52 ;
int nti ;
boolean tmp55 ;
boolean tmp54 ;
int tmp51 ;
int tmp50 ;
int tmp57 ;
boolean tmp56 ;
int tmp59 ;
int tmp58 ;

tmp47 = false;
ntb = tmp47;
tmp48 = 1;
tmp49 = num2 + tmp48;
nti = tmp49;
tmp51 = 1;
tmp52 = num2 - tmp51;
tmp53 = num1 <= tmp50;
if (tmp53) {
tmp54 = false;
ntb = tmp54;
} else {
tmp58 = 1;
tmp59 = nti - tmp58;
tmp60 = num1 <= tmp57;
tmp55 = !tmp56;
if (tmp55) {
tmp61 = false;
ntb = tmp61;
} else {
tmp62 = true;
ntb = tmp62;
}
}
return ntb;
}

public boolean Insert(int v_key){

int tmp64 ;
Tree tmp63 ;
boolean tmp66 ;
Tree current_node ;
Tree tmp65 ;
boolean tmp82 ;
boolean tmp81 ;
boolean tmp84 ;
Tree tmp83 ;
int tmp68 ;
Tree tmp67 ;
int key_aux ;
int tmp69 ;
Tree new_node ;
boolean tmp80 ;
boolean cont ;
boolean ntb ;
boolean tmp75 ;
boolean tmp74 ;
Tree tmp77 ;
boolean tmp76 ;
boolean tmp71 ;
int tmp70 ;
Tree tmp73 ;
boolean tmp72 ;
Tree tmp79 ;
boolean tmp78 ;

tmp63 = new Tree();
new_node = tmp63;
tmp64 = new_node.Init(v_key);
ntb = tmp64;
tmp65 = this;
current_node = tmp65;
tmp66 = true;
cont = tmp66;
while (cont) {
{
tmp67 = current_node.GetKey();
key_aux = tmp67;
tmp69 = 1;
tmp70 = key_aux - tmp69;
tmp71 = v_key <= tmp68;
if (tmp71) {
{
tmp72 = current_node.GetHas_Left();
if (tmp72) {
tmp73 = current_node.GetLeft();
current_node = tmp73;
} else {
{
tmp74 = false;
cont = tmp74;
tmp76 = true;
tmp75 = current_node.SetHas_Left(tmp76);
ntb = tmp75;
tmp77 = current_node.SetLeft(new_node);
ntb = tmp77;
}
}
}
} else {
{
tmp78 = current_node.GetHas_Right();
if (tmp78) {
tmp79 = current_node.GetRight();
current_node = tmp79;
} else {
{
tmp80 = false;
cont = tmp80;
tmp82 = true;
tmp81 = current_node.SetHas_Right(tmp82);
ntb = tmp81;
tmp83 = current_node.SetRight(new_node);
ntb = tmp83;
}
}
}
}
}
tmp71 = v_key <= tmp68;
}
tmp84 = true;
return tmp84;
}

public boolean Delete(int v_key){

Tree tmp86 ;
Tree tmp85 ;
boolean tmp88 ;
Tree current_node ;
boolean tmp87 ;
boolean tmp118 ;
boolean tmp117 ;
boolean tmp119 ;
boolean is_root ;
boolean tmp89 ;
int key_aux ;
boolean found ;
Tree tmp103 ;
boolean tmp102 ;
boolean tmp105 ;
boolean tmp104 ;
boolean cont ;
boolean ntb ;
boolean tmp101 ;
int tmp100 ;
boolean tmp97 ;
Tree tmp96 ;
int tmp99 ;
int tmp98 ;
int tmp93 ;
Tree tmp107 ;
int tmp92 ;
boolean tmp106 ;
boolean tmp95 ;
boolean tmp109 ;
boolean tmp94 ;
boolean tmp108 ;
Tree parent_node ;
Tree tmp114 ;
Tree tmp113 ;
int tmp91 ;
Tree tmp116 ;
Tree tmp90 ;
Tree tmp115 ;
Tree tmp110 ;
boolean tmp112 ;
boolean tmp111 ;

tmp85 = this;
current_node = tmp85;
tmp86 = this;
parent_node = tmp86;
tmp87 = true;
cont = tmp87;
tmp88 = false;
found = tmp88;
tmp89 = true;
is_root = tmp89;
while (cont) {
{
tmp90 = current_node.GetKey();
key_aux = tmp90;
tmp92 = 1;
tmp93 = key_aux - tmp92;
tmp94 = v_key <= tmp91;
if (tmp94) {
tmp95 = current_node.GetHas_Left();
if (tmp95) {
{
parent_node = current_node;
tmp96 = current_node.GetLeft();
current_node = tmp96;
}
} else {
tmp97 = false;
cont = tmp97;
}
} else {
tmp99 = 1;
tmp100 = v_key - tmp99;
tmp101 = key_aux <= tmp98;
if (tmp101) {
tmp102 = current_node.GetHas_Right();
if (tmp102) {
{
parent_node = current_node;
tmp103 = current_node.GetRight();
current_node = tmp103;
}
} else {
tmp104 = false;
cont = tmp104;
}
} else {
{
if (is_root) {
tmp107 = current_node.GetHas_Right();
tmp106 = !tmp107;
tmp110 = current_node.GetHas_Left();
tmp109 = !tmp110;
tmp111 = tmp105 && tmp108;
if (tmp111) {
tmp112 = true;
ntb = tmp112;
} else {
tmp113 = this;
tmp114 = tmp113.Remove(parent_node, current_node);
ntb = tmp114;
}
} else {
tmp115 = this;
tmp116 = tmp115.Remove(parent_node, current_node);
ntb = tmp116;
}
tmp117 = true;
found = tmp117;
tmp118 = false;
cont = tmp118;
}
}
}
tmp119 = false;
is_root = tmp119;
}
tmp94 = v_key <= tmp91;
tmp101 = key_aux <= tmp98;
}
return found;
}

public boolean Remove(Tree p_node, Tree c_node){

int auxkey1 ;
int auxkey2 ;
Tree my_null ;
Tree tmp125 ;
Tree tmp124 ;
Tree tmp127 ;
Tree tmp126 ;
Tree tmp121 ;
boolean ntb ;
boolean tmp120 ;
boolean tmp123 ;
Tree tmp122 ;
Tree tmp129 ;
Tree tmp128 ;
Tree tmp130 ;
boolean tmp136 ;
Tree tmp135 ;
boolean tmp138 ;
boolean tmp137 ;
Tree tmp132 ;
boolean tmp131 ;
boolean tmp134 ;
boolean tmp133 ;

tmp120 = c_node.GetHas_Left();
if (tmp120) {
tmp121 = this;
tmp122 = tmp121.RemoveLeft(p_node, c_node);
ntb = tmp122;
} else {
tmp123 = c_node.GetHas_Right();
if (tmp123) {
tmp124 = this;
tmp125 = tmp124.RemoveRight(p_node, c_node);
ntb = tmp125;
} else {
{
tmp126 = c_node.GetKey();
auxkey1 = tmp126;
tmp128 = p_node.GetLeft();
tmp129 = tmp127.GetKey();
auxkey2 = tmp129;
tmp130 = this;
tmp131 = tmp130.Compare(auxkey1, auxkey2);
if (tmp131) {
{
tmp132 = p_node.SetLeft(my_null);
ntb = tmp132;
tmp134 = false;
tmp133 = p_node.SetHas_Left(tmp134);
ntb = tmp133;
}
} else {
{
tmp135 = p_node.SetRight(my_null);
ntb = tmp135;
tmp137 = false;
tmp136 = p_node.SetHas_Right(tmp137);
ntb = tmp136;
}
}
}
}
}
tmp138 = true;
return tmp138;
}

public boolean RemoveRight(Tree p_node, Tree c_node){

boolean tmp139 ;
Tree my_null ;
Tree tmp141 ;
Tree tmp140 ;
boolean tmp147 ;
boolean tmp146 ;
boolean tmp148 ;
Tree tmp143 ;
boolean ntb ;
Tree tmp142 ;
Tree tmp145 ;
Tree tmp144 ;

tmp139 = c_node.GetHas_Right();
while (tmp139) {
{
tmp142 = c_node.GetRight();
tmp143 = tmp141.GetKey();
tmp140 = c_node.SetKey(tmp143);
ntb = tmp140;
p_node = c_node;
tmp144 = c_node.GetRight();
c_node = tmp144;
}
}
tmp145 = p_node.SetRight(my_null);
ntb = tmp145;
tmp147 = false;
tmp146 = p_node.SetHas_Right(tmp147);
ntb = tmp146;
tmp148 = true;
return tmp148;
}

public boolean RemoveLeft(Tree p_node, Tree c_node){

Tree my_null ;
boolean tmp149 ;
boolean ntb ;
Tree tmp150 ;
Tree tmp152 ;
Tree tmp151 ;
boolean tmp158 ;
boolean tmp157 ;
Tree tmp154 ;
Tree tmp153 ;
boolean tmp156 ;
Tree tmp155 ;

tmp149 = c_node.GetHas_Left();
while (tmp149) {
{
tmp152 = c_node.GetLeft();
tmp153 = tmp151.GetKey();
tmp150 = c_node.SetKey(tmp153);
ntb = tmp150;
p_node = c_node;
tmp154 = c_node.GetLeft();
c_node = tmp154;
}
}
tmp155 = p_node.SetLeft(my_null);
ntb = tmp155;
tmp157 = false;
tmp156 = p_node.SetHas_Left(tmp157);
ntb = tmp156;
tmp158 = true;
return tmp158;
}

public int Search(int v_key){

Tree current_node ;
int ifound ;
int key_aux ;
int tmp161 ;
boolean tmp160 ;
int tmp163 ;
Tree tmp162 ;
boolean tmp169 ;
Tree tmp168 ;
boolean cont ;
int tmp165 ;
int tmp164 ;
boolean tmp167 ;
boolean tmp166 ;
int tmp172 ;
int tmp171 ;
boolean tmp174 ;
boolean tmp173 ;
int tmp170 ;
Tree tmp159 ;
boolean tmp176 ;
Tree tmp175 ;
boolean tmp178 ;
int tmp177 ;

tmp159 = this;
current_node = tmp159;
tmp160 = true;
cont = tmp160;
tmp161 = 0;
ifound = tmp161;
while (cont) {
{
tmp162 = current_node.GetKey();
key_aux = tmp162;
tmp164 = 1;
tmp165 = key_aux - tmp164;
tmp166 = v_key <= tmp163;
if (tmp166) {
tmp167 = current_node.GetHas_Left();
if (tmp167) {
tmp168 = current_node.GetLeft();
current_node = tmp168;
} else {
tmp169 = false;
cont = tmp169;
}
} else {
tmp171 = 1;
tmp172 = v_key - tmp171;
tmp173 = key_aux <= tmp170;
if (tmp173) {
tmp174 = current_node.GetHas_Right();
if (tmp174) {
tmp175 = current_node.GetRight();
current_node = tmp175;
} else {
tmp176 = false;
cont = tmp176;
}
} else {
{
tmp177 = 1;
ifound = tmp177;
tmp178 = false;
cont = tmp178;
}
}
}
}
tmp166 = v_key <= tmp163;
tmp173 = key_aux <= tmp170;
}
return ifound;
}

public boolean Print(){

Tree current_node ;
boolean tmp182 ;
Tree tmp181 ;
Tree tmp180 ;
boolean ntb ;
Tree tmp179 ;

tmp179 = this;
current_node = tmp179;
tmp180 = this;
tmp181 = tmp180.RecPrint(current_node);
ntb = tmp181;
tmp182 = true;
return tmp182;
}

public boolean RecPrint(Tree node){

boolean tmp183 ;
Tree tmp185 ;
Tree tmp184 ;
boolean tmp187 ;
boolean ntb ;
Tree tmp186 ;
boolean tmp189 ;
Tree tmp188 ;
boolean tmp194 ;
boolean tmp193 ;
Tree tmp190 ;
Tree tmp192 ;
Tree tmp191 ;

tmp183 = node.GetHas_Left();
if (tmp183) {
{
tmp184 = this;
tmp186 = node.GetLeft();
tmp185 = tmp184.RecPrint(tmp186);
ntb = tmp185;
}
} else {
tmp187 = true;
ntb = tmp187;
}
tmp188 = node.GetKey();
System.out.println(tmp188);
tmp189 = node.GetHas_Right();
if (tmp189) {
{
tmp190 = this;
tmp192 = node.GetRight();
tmp191 = tmp190.RecPrint(tmp192);
ntb = tmp191;
}
} else {
tmp193 = true;
ntb = tmp193;
}
tmp194 = true;
return tmp194;
}

}

