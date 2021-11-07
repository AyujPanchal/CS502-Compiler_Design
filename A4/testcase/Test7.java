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
        boolean dipanshu0;
        int dipanshu1;
        int dipanshu2;
        int dipanshu3;
        mtTmp5 = 0;
        mtTmp13 = 10;
        mtTmp10 = mtTmp10 - mtTmp5;		     // Needs to be removed in A5
        mtTmp12 = mtTmp12 + mtTmp5;		     // Needs to be removed in A5
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
        mtTmp4 = false;
        dipanshu1 = 10;
        dipanshu0 = true;
        dipanshu3 = 99;
        while(dipanshu0) {
            dipanshu2 = dipanshu1 * dipanshu1;
            if(mtTmp4) {
                while(mtTmp4) {
                    System.out.println(dipanshu0);
                }
            }
            else {
                while(mtTmp4) {
                    System.out.println(dipanshu0);
                }
            }
            while (mtTmp4) {
                if(mtTmp4) {
                    System.out.println(dipanshu1);
                    while (mtTmp4) {
                        /* PRINTLIVEVARIABLES */
                        mtTmp8 = mtTmp13;
                        mtTmp10 = 1;
                        mtTmp7 = mtTmp10;
                        if (mtTmp4) {
                        } else {
                            {
                                mtTmp8 = mtTmp13;
                                /* PRINTLIVEVARIABLES */
                            }
                            if (mtTmp12) {
                                mtTmp13 = mtTmp8;
                            }
                        }
                        /* PRINTLIVEVARIABLES */
                    }
                }
            }
            dipanshu1 = dipanshu1 * dipanshu3;
            /* PRINTLIVEVARIABLES */               // OUTPUT: dipanshu0,dipanshu1,dipanshu3,mtTmp4,num_aux
        }
        /* PRINTLIVEVARIABLES */                   // OUTPUT : num_aux
        return num_aux;
    }
}