class Factorial {
    public static void main(String[] a) {
        Fac mtTmp2;
        int mtTmp3;
        int mtTmp1;
        mtTmp2 = new Fac();
        mtTmp3 = 10;
        /* PRINTLIVEVARIABLES */                     // OUTPUT : mtTmp2,mtTmp3
        mtTmp1 = mtTmp2.ComputeFac(mtTmp3);
        System.out.println(mtTmp1);
    }
}
class Fac {
    public int ComputeFac(int num) {
        int num_aux;
        boolean mtTmp4;
        int mtTmp5;
        int mtTmp6;
        int mtTmp7;
        Fac mtTmp9;
        int mtTmp10;
        int mtTmp11;
        int mtTmp8;
        int mtTmp13;
        int mtTmp12;		                     // Needs to be removed in A5
        mtTmp5 = 0;
        mtTmp13 = 10;
        mtTmp10 = mtTmp13 - mtTmp5;		     // Needs to be removed in A5
        mtTmp12 = mtTmp13 + mtTmp5;		     // Needs to be removed in A5
        /* PRINTLIVEVARIABLES */                     // OUTPUT : mtTmp5,num
        mtTmp4 = num <= mtTmp5;
        if (mtTmp4) {
            mtTmp6 = 1;
            num_aux = mtTmp6;
            /* PRINTLIVEVARIABLES */                 // OUTPUT : num_aux
        } else {
            mtTmp9 = this;
            mtTmp11 = 1;
            mtTmp10 = num - mtTmp11;
            mtTmp8 = mtTmp9.ComputeFac(mtTmp10);
            mtTmp7 = num * mtTmp8;
            num_aux = mtTmp7;
            /* PRINTLIVEVARIABLES */               // OUTPUT : num_aux
        }
        /* PRINTLIVEVARIABLES */                   // OUTPUT : num_aux
        return num_aux;
    }
}
