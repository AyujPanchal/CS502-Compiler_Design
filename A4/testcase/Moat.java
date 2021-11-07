// ArrayAssignmentStatement
class Moat {
  public static void main(String[] a) {
    int tmp1;
    float tmp2;
    int[] tmp3;

    /* PRINTLIVEVARIABLES */  // tmp1, tmp2
    tmp3 = new int[tmp1];

    /* PRINTLIVEVARIABLES */  // tmp1, tmp2, tmp3
    tmp3[tmp1] = tmp2;

  }
}

// FieldAssignmentStatement
class T1 {
  int f;
  public int dummy(int r) {
    T1 tmp1;
    int tmp2;
    /* PRINTLIVEVARIABLES */  // tmp1, tmp2
    tmp1.f = tmp2;
    /* PRINTLIVEVARIABLES */  // tmp2
    return tmp2;
 }
}

// Simple Binop
class T2 {
  int f;
  public int dummy(int r) {
    int t2_1;
    int t2_2;
    int t2_3;
    int t2_4;
    int t2_5;
    int t2_6;
    int t2_7;
    int t2_8;
    int t2_9;
    int t2_10;
    int t2_11;
    int t2_12;
    int t2_13;
    int t2_14;
    int t2_15;
    int t2_16;
    int t2_17;
    int t2_18;
    int t2_19;
    int t2_20;
    int t2_21;
    int t2_22;
    int t2_23;
    int t2_24;

    // OR EXPRESSION
    t2_1 = 10;
    t2_2 = 10;
    t2_3 = 10;
    /* PRINTLIVEVARIABLES */  // t2_2, t2_3
    t2_1 = t2_2 || t2_3;

    // AND EXPRESSION
    t2_4 = 10;
    t2_5 = 10;
    t2_6 = 10;
    /* PRINTLIVEVARIABLES */  // t2_5, t2_6
    t2_4 = t2_5 && t2_6;

    // COMPARE EXPRESSION
    t2_7 = 10;
    t2_8 = 10;
    t2_9 = 10;
    /* PRINTLIVEVARIABLES */  // t2_8, t2_9
    t2_7 = t2_8 <= t2_9;

    // NEQ EXPRESSION
    t2_10 = 10;
    t2_11 = 10;
    t2_12 = 10;
    /* PRINTLIVEVARIABLES */  // t2_11, t2_12
    t2_10 = t2_11 != t2_12;

    // PLUS EXPRESSION
    t2_13 = 10;
    t2_14 = 10;
    t2_15 = 10;
    /* PRINTLIVEVARIABLES */  // t2_14, t2_15
    t2_13 = t2_14 + t2_15;

    
    // MINUS EXPRESSION
    t2_16 = 10;
    t2_17 = 10;
    t2_18 = 10;
    /* PRINTLIVEVARIABLES */  // t2_17 t2_18
    t2_16 = t2_17 - t2_18;

    // MULTIPLY EXPRESSION
    t2_19 = 10;
    t2_20 = 10;
    t2_21 = 10;
    /* PRINTLIVEVARIABLES */  // t2_20 t2_21
    t2_19 = t2_20 * t2_21;

    // DIVIDE EXPRESSION
    t2_22 = 10;
    t2_23 = 10;
    t2_24 = 10;
    /* PRINTLIVEVARIABLES */  // t2_23 t2_24
    t2_22 = t2_23 / t2_24;

    /* PRINTLIVEVARIABLES */  // t2_1
    return t2_1;
 }
}

// Array lookup
class T3 {
  int f;
  public int dummy() {
    int[] arr_1;
    int arr_2;
    int arr_3;
    /* PRINTLIVEVARIABLES */  // arr_1, arr_3
    arr_2 = arr_1[arr_3];
    /* PRINTLIVEVARIABLES */  // arr_2
    return arr_2;
 }
}

// Array length
class T4 {
  public int dummy() {
    int[] arr_1;
    int len;
    /* PRINTLIVEVARIABLES */  // arr_1
    len = arr_1.length;
    /* PRINTLIVEVARIABLES */  // len
    return len;
 }
}

// Message Send
class T5 {
  public int callee(int a, int b, int c, int d) {
    return d;
  }
  public int dummy() {
    int arg1;
    int arg2;
    int arg3;
    int arg4;
    int result;
    T3 obj;
    /* PRINTLIVEVARIABLES */  // arg1, arg2, arg3, arg4
    result = obj.callee(arg1, arg2, arg3, arg4);
    /* PRINTLIVEVARIABLES */  // result
    return result;
 }
}

// Primary Expression
class T6 {
  public int dummy() {
    int intVal;
    float fltVal;
    boolean bolVal;
    T6 tisVal;
    T6 tasVal;
    int[] intArr;
    
    // Integer Literal
    /* PRINTLIVEVARIABLES */ // fltVal
    intVal = 10;
    bolVal = false;
    bolVal = true;
    tasVal = new T6();

    
    /* PRINTLIVEVARIABLES */ // bolVal, fltVal, intVal, tasVal
    intVal = intVal;
    tisVal = tasVal; // 'this' is never not live
    
    intArr = new int[fltVal];
    
    bolVal = !bolVal;

    return intVal;
 }
}

// If ---
class T7 {
  public int dummy() {
    int marge;
    int homer;
    int maggie;
    int lisa;
    int donut;
    boolean bart;
    boolean noBart;

    /* PRINTLIVEVARIABLES */ // donut,homer,noBart
    if (noBart) {
      homer = donut;
    }
    /* PRINTLIVEVARIABLES */ // homer

    return homer;
 }
}

// Poke ---
class T8 {
  public int dummy() {
    int ash;
    int[] pokeMart;
    boolean charmander;
    boolean bulbasaur;
    boolean squirtle;
    int tmp;

    /* PRINTLIVEVARIABLES */ // ash,bulbasaur,charmander,pokeMart,squirtle
    if (charmander) {
      tmp = 0;
      ash = pokeMart[tmp];
    } else if (bulbasaur) {
      tmp = 1;
      ash = pokeMart[tmp];
    } else if (squirtle) {
      tmp = 2;
      ash = pokeMart[tmp];
    }
    /* PRINTLIVEVARIABLES */ // ash

    return ash;
 }
}

// While we wait
class T9 {
  public int dummy() {
    boolean coffee;
    boolean tmpB;
    int res;
    int tmp;
    int inc;
    int work;

    coffee = true;
    tmp = 0;
    inc = 1;
    work = 100;
    res = 0;
    while (coffee) {
      /* PRINTLIVEVARIABLES */ // coffee,inc,res,tmp,work
      System.out.println(res);
      tmp = tmp + inc;
      tmpB = work <= tmp;
      if (tmpB) {
        /* PRINTLIVEVARIABLES */ // inc,res,tmp,work
        coffee = false;
      }
    }

    /* PRINTLIVEVARIABLES */ // work

    return work;
 }
}

// If I may
class T10 {
  public int dummy() {
    int one;
    int two;
    int three;
    int four;
    boolean a;
    boolean b;
    boolean c;
    boolean d;

    
    /* PRINTLIVEVARIABLES */ // a,b,c,d,four,one,three,two
    if (a) {
      System.out.println(one);
      if (b) {
        System.out.println(two);
        if (c) {
          System.out.println(three);
          if (d) {
            System.out.println(four);
          }
        }
      }
    }


    /* PRINTLIVEVARIABLES */ // one

    return one;
 }
}
