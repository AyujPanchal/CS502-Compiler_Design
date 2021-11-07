//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class GJDepthFirst1<R,A> implements GJVisitor<R,A> {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public R visit(NodeList n, A argu) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeListOptional n, A argu) {
      if ( n.present() ) {
         R _ret=null;
         int _count=0;
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this,argu);
            _count++;
         }
         return _ret;
      }
      else
         return null;
   }

   public R visit(NodeOptional n, A argu) {
      if ( n.present() )
         return n.node.accept(this,argu);
      else
         return null;
   }

   public R visit(NodeSequence n, A argu) {
      R _ret=null;
      int _count=0;
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
         e.nextElement().accept(this,argu);
         _count++;
      }
      return _ret;
   }

   public R visit(NodeToken n, A argu) { return null; }

   //
   // User-generated visitor methods below
   //
   String code = "";
   String code1 = "";
   int tmpCount = 0;
   String newTemp() {
	   return "tmp" + tmpCount++;
   }
   String exp = "";
   String Classlabel = "";
   Map<String,Map<String,String>> topass=new HashMap<String,Map<String,String>>();
   Map<String,String> classvar=new HashMap<String,String>();
   Map<String,String> methodvar=new HashMap<String,String>();
   Map<String,String> methodpara=new HashMap<String,String>();
   String latclass;
   String whileString = "";

   int method=0;   /**
    * f0 -> MainClass()
    * f1 -> ( TypeDeclaration() )*
    * f2 -> <EOF>
    */
   String ptype="int";
   public R visit(Goal n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      n.f2.accept(this, argu);
//      System.out.println(code);
      return _ret;
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> "public"
    * f4 -> "static"
    * f5 -> "void"
    * f6 -> "main"
    * f7 -> "("
    * f8 -> "String"
    * f9 -> "["
    * f10 -> "]"
    * f11 -> Identifier()
    * f12 -> ")"
    * f13 -> "{"
    * f14 -> PrintStatement()
    * f15 -> "}"
    * f16 -> "}"
    */
   public R visit(MainClass n, A argu) {
      R _ret=null;
      method=0;
      String klassName = (String) n.f1.accept(this, argu);
      Classlabel = klassName;
      String argsName = (String) n.f11.accept(this, argu);
      code += "class " + klassName + " {\n" + "public static void main("
    		  + "String[] " + argsName + ") {\n";
      System.out.println(code);
      code = "";
      n.f14.accept(this, argu);
      for(Map.Entry<String,String> i:classvar.entrySet()){
          code1+=i.getValue()+" "+i.getKey()+" ;\n";
        }
      System.out.println(code1);
      code1 ="";
      System.out.println(code);
      code = "";
      code += "}\n}\n";
      System.out.println(code);
      code = "";
      classvar.clear();
      return _ret;
   }

   /**
    * f0 -> ClassDeclaration()      
    *       | ClassExtendsDeclaration()
    */
   public R visit(TypeDeclaration n, A argu) {
      R _ret=null;
      _ret = n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( VarDeclaration() )*
    * f4 -> ( MethodDeclaration() )*
    * f5 -> "}"
    */      
   public R visit(ClassDeclaration n, A argu) {
      R _ret=null;
      latclass=n.f1.f0.tokenImage;
      String klassName = (String) n.f1.accept(this, argu);
      Classlabel = klassName;
      code += "class " + klassName + "{\n";
      System.out.println(code);
      code = "";
      n.f3.accept(this, argu);
      for(Map.Entry<String,String> i:classvar.entrySet()){
          code1+=i.getValue()+" "+i.getKey()+" ;\n";
      }
      System.out.println(code1);
      code1 = "";
      n.f4.accept(this, argu);
      code += "}\n";
      System.out.println(code);
      code = "";
      classvar.clear();
      return _ret;
   }

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "extends"
    * f3 -> Identifier()
    * f4 -> "{"
    * f5 -> ( VarDeclaration() )*
    * f6 -> ( MethodDeclaration() )*
    * f7 -> "}"
    */
   public R visit(ClassExtendsDeclaration n, A argu) {
      R _ret=null;
      latclass=n.f1.f0.tokenImage;
      String klassName1 = (String) n.f1.accept(this, argu);
      Classlabel = klassName1;
      String klassName2 = (String) n.f3.accept(this, argu);
      code += "class " + klassName1 + " extends " + klassName2 + "{\n" ;
      System.out.println(code);
      code = "";
      n.f5.accept(this, argu);
      for(Map.Entry<String,String> i:classvar.entrySet()){
          code1+=i.getValue()+" "+i.getKey()+" ;\n";
        }
      System.out.println(code1);
      code1 = "";
      n.f6.accept(this, argu);
      code += "}\n";
      System.out.println(code);
      code = "";
      classvar.clear();
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> ";"
    */
   public R visit(VarDeclaration n, A argu) {
      R _ret=null;
      String tmp = (String) n.f0.accept(this, argu);
      String argsName = (String) n.f1.accept(this, argu);
//      code += tmp + " " + argsName + ";\n";
      if(method==1){
          methodvar.put(argsName,tmp);
        }
        else{
            classvar.put(argsName,tmp);
        }
      return _ret;
   }

   /**
    * f0 -> "public"
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( FormalParameterList() )?
    * f5 -> ")"
    * f6 -> "{"
    * f7 -> ( VarDeclaration() )*
    * f8 -> ( Statement() )*
    * f9 -> "return"
    * f10 -> Expression()
    * f11 -> ";"
    * f12 -> "}"
    */
   public R visit(MethodDeclaration n, A argu) {
      method=1;
      R _ret=null;
      String type = (String) n.f1.accept(this, argu);
      String argsName = (String) n.f2.accept(this, argu);
      code += "public " + type + " " + argsName + "(";
      n.f4.accept(this, argu);
      code += "){\n";
      System.out.println(code);
      code = "";
      n.f7.accept(this, argu);
      n.f8.accept(this, argu);
      String tmp = (String) n.f10.accept(this, argu);
      for(Map.Entry<String,String> i:methodvar.entrySet()){
          if(!methodpara.containsKey(i.getKey())) {
          code1+=i.getValue()+" "+i.getKey()+" ;\n";
          }
        }
      System.out.println(code1);
      code1 = "";
      code += "return " + tmp + ";\n}\n";
      System.out.println(code);
      code = "";
      methodvar.clear();
      method=0;
      methodpara.clear();
      return _ret;
   }

   /**
    * f0 -> FormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public R visit(FormalParameterList n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public R visit(FormalParameter n, A argu) {
      R _ret=null;
      String type = (String) n.f0.accept(this, argu);
      String argsName = (String) n.f1.accept(this, argu);
      code += type + " " + argsName;
      methodpara.put(argsName,type);
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
    */
   public R visit(FormalParameterRest n, A argu) {
      R _ret=null;
      code += ", ";
      n.f1.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> ArrayType()
    *       | BooleanType()
    *       | IntegerType()
    *       | FloatType()
    *       | Identifier()
    */
   public R visit(Type n, A argu) {
      R _ret=null;
      _ret = n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "int" "[" "]"
    *       | "float" "[" "]"
    */
   public R visit(ArrayType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      if (n.f0.which == 0) {
        _ret = (R)"int[]";
      } else {
        _ret = (R)"float[]";
      }
      return (R)_ret;
   }

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      _ret=(R)"boolean";
      return (R)_ret;
   }

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      _ret=(R)"int";
      return _ret;
   }

   /**
    * f0 -> "float"
    */
   public R visit(FloatType n, A argu) {
      R _ret=null;
      n.f0.accept(this, argu);
      _ret=(R)"float";
      return _ret;
   }

   /**
    * f0 -> Block()
    *       | AssignmentStatement()
    *       | ArrayAssignmentStatement()
    *       | FieldAssignmentStatement()
    *       | IfStatement()
    *       | WhileStatement()
    *       | PrintStatement()
    */
   public R visit(Statement n, A argu) {
      R _ret=null;
      _ret = n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public R visit(Block n, A argu) {
      R _ret=null;
      code += "{\n";
      n.f1.accept(this, argu);
      code += "}\n";
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public R visit(AssignmentStatement n, A argu) {
      R _ret=null;
      String argsName = (String) n.f0.accept(this, argu);
      String tmp = (String) n.f2.accept(this, argu);
      code += argsName + " = " + tmp + ";\n";
      return _ret;
   }

   /**
    * f0 -> Identifier()
    * f1 -> "["
    * f2 -> Expression()
    * f3 -> "]"
    * f4 -> "="
    * f5 -> Expression()
    * f6 -> ";"
    */
   public R visit(ArrayAssignmentStatement n, A argu) {
      R _ret=null;
      String argsName = (String) n.f0.accept(this, argu);
      String tmp1 = (String) n.f2.accept(this, argu);
      String tmp2 = (String) n.f5.accept(this, argu);
      code += argsName + "[" + tmp1 + "]" + " = " + tmp2 + ";\n";
      return _ret;
   }

   /**
    * f0 -> Expression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "="
    * f4 -> Expression()
    * f5 -> ";"
    */
   public R visit(FieldAssignmentStatement n, A argu) {
      R _ret=null;
      String tmp1 = (String) n.f0.accept(this, argu);
      String argsName = (String) n.f2.accept(this, argu);
      String tmp2 = (String) n.f4.accept(this, argu);
      code += tmp1 + "." + argsName + " = " + tmp2 + ";\n";
      return _ret;
   }

   /**
    * f0 -> IfthenElseStatement()
    *       | IfthenStatement()
    */
   public R visit(IfStatement n, A argu) {
      R _ret=null;
      _ret = n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(IfthenStatement n, A argu) {
      R _ret=null;
      String tmp = (String) n.f2.accept(this, argu);
      if(method==1){
          methodvar.put(tmp,"boolean");
       }
       else{
          classvar.put(tmp,"boolean");
       }
      code += "if (" + tmp + ") {\n";
      n.f4.accept(this, argu);
      code += "}\n";
      return _ret;
   }

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> "else"
    * f6 -> Statement()
    */
   public R visit(IfthenElseStatement n, A argu) {
      R _ret=null;
      String tmp = (String) n.f2.accept(this, argu);
      if(method==1){
          methodvar.put(tmp,"boolean");
       }
       else{
          classvar.put(tmp,"boolean");
       }
      code += "if (" + tmp + ") {\n";
      n.f4.accept(this, argu);
      code += "} else {\n";
      n.f6.accept(this, argu);
      code += "}\n";
      return _ret;
   }

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public R visit(WhileStatement n, A argu) {
      R _ret=null;
      whileString = "";
      String tmp = (String) n.f2.accept(this, argu);
      code += "while (" + tmp + ") {\n";
      if(method==1){
          methodvar.put(tmp,"boolean");
       }
       else{
          classvar.put(tmp,"boolean");
       }
      n.f4.accept(this, argu);
      code += whileString;
      whileString = "";
      code += "}\n";
      return _ret;
   }

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintStatement n, A argu) {
      R _ret=null;
      String tmp = (String) n.f2.accept(this, argu);
      if(method==1){
          methodvar.put(tmp,ptype);
       }
       else{
          classvar.put(tmp,ptype);
       }
      code += "System.out.println(" +  tmp + ");\n";
      return _ret;
   }

   /**
    * f0 -> OrExpression()
    *       | AndExpression()
    *       | CompareExpression()
    *       | neqExpression()
    *       | PlusExpression()
    *       | MinusExpression()
    *       | TimesExpression()
    *       | DivExpression()
    *       | ArrayLookup()
    *       | ArrayLength()
    *       | MessageSend()
    *       | PrimaryExpression()
    */
   public R visit(Expression n, A argu) {
      R _ret=null;
      _ret = n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "&&"
    * f2 -> PrimaryExpression()
    */
   public R visit(AndExpression n, A argu) {
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"boolean");
         }
         else classvar.put(tmp,"boolean");
      code += tmp + " = " + tmp1 + " && " + tmp2 + ";\n";
      ptype="boolean";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "||"
    * f2 -> PrimaryExpression()
    */
   public R visit(OrExpression n, A argu) {
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"boolean");
         }
         else classvar.put(tmp,"boolean");
      code += tmp + " = " + tmp1 + " || " + tmp2 + ";\n";
      ptype="boolean";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "<="
    * f2 -> PrimaryExpression()
    */
   public R visit(CompareExpression n, A argu) {
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"boolean");
         }
         else classvar.put(tmp,"boolean");
      code += tmp + " = " + tmp1 + " <= " + tmp2 + ";\n";
      whileString += tmp + " = " + tmp1 + " <= " + tmp2 + ";\n";
      ptype="boolean";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "!="
    * f2 -> PrimaryExpression()
    */
   public R visit(neqExpression n, A argu) {
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"boolean");
         }
         else classvar.put(tmp,"boolean");
      code += tmp + " = " + tmp1 + " != " + tmp2 + ";\n";
      ptype="boolean";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "+"
    * f2 -> PrimaryExpression()
    */
   public R visit(PlusExpression n, A argu) {
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"int");
         }
         else classvar.put(tmp,"int");
      code += tmp + " = " + tmp1 + " + " + tmp2 + ";\n";
      ptype="int";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "-"
    * f2 -> PrimaryExpression()
    */
   public R visit(MinusExpression n, A argu) {
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"int");
         }
         else classvar.put(tmp,"int");
      code += tmp + " = " + tmp1 + " - " + tmp2 + ";\n";
      ptype="int";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "*"
    * f2 -> PrimaryExpression()
    */
   public R visit(TimesExpression n, A argu) {
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"int");
         }
         else classvar.put(tmp,"int");
      code += tmp + " = " + tmp1 + " * " + tmp2 + ";\n";
      ptype="int";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "/"
    * f2 -> PrimaryExpression()
    */
   public R visit(DivExpression n, A argu) {
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"int");
         }
         else classvar.put(tmp,"int");
      code += tmp + " = " + tmp1 + " / " + tmp2 + ";\n";
      ptype="int";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "["
    * f2 -> PrimaryExpression()
    * f3 -> "]"
    */
   public R visit(ArrayLookup n, A argu) {
      R _ret=null;
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"int");
         }
         else classvar.put(tmp,"int");
      code += tmp + " = " + tmp1 + "[" + tmp2 + "]" + ";\n";  
      ptype="int";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> "length"
    */
   public R visit(ArrayLength n, A argu) {
      R _ret=null;
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"int");
         }
         else classvar.put(tmp,"int");
      code += tmp + " = " + tmp1 + ".length" + ";\n";
      ptype="int";
      return (R) tmp;
   }

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( ExpressionList() )?
    * f5 -> ")"
    */
   public R visit(MessageSend n, A argu) {
      R _ret=null;
      String tmp1 = (String) n.f0.accept(this, argu);
      String tmp2 = (String) n.f2.accept(this, argu);
      String tmp = newTemp();
      String tmp3 = (String) n.f4.accept(this, argu);
      code += tmp + " = " + tmp1 + "." + tmp2 + "(";
      if(method==1){
          methodvar.put(tmp,ptype);
         }
         else classvar.put(tmp,ptype);
//      code += "MessageSend\n";
      if(tmp3 != null) {
    	  code += tmp3;
      }
      code += ");\n";
      return (R) tmp;
   }

   /**
    * f0 -> Expression()
    * f1 -> ( ExpressionRest() )*
    */
   public R visit(ExpressionList n, A argu) {
      R _ret=null;
      String tmp = (String) n.f0.accept(this, argu);
      exp += tmp;
      if(method==1){
          methodvar.put(tmp,ptype);
         }
         else classvar.put(tmp,ptype);
      n.f1.accept(this, argu);
      _ret = (R)exp;
//      code += exp;
      exp = "";
//      code += tmp;
      return _ret;
   }

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public R visit(ExpressionRest n, A argu) {
      R _ret=null;
      String tmp = (String) n.f1.accept(this, argu);
      exp += ", " + tmp;
      if(method==1){
          methodvar.put(tmp,ptype);
         }
         else classvar.put(tmp,ptype);
//      code += ", " + tmp;
      return _ret;
   }

   /**
    * f0 -> IntegerLiteral()
    *       | FloatLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | Identifier()
    *       | ThisExpression()
    *       | ArrayAllocationExpression()
    *       | AllocationExpression()
    *       | NotExpression()
    *       | BracketExpression()
    */
   public R visit(PrimaryExpression n, A argu) {
      R _ret=null;
      _ret = n.f0.accept(this, argu);
      return _ret;
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu) {
      R _ret=null;
      String tmp = newTemp();
      code += tmp + " = " + n.f0.tokenImage + ";\n";
      if(method==1){
          methodvar.put(tmp,"int");
         }
         else {classvar.put(tmp,"int");}
      ptype="int";
      _ret = (R) tmp;
      return _ret;
   }

   /**
    * f0 -> <FLOAT_LITERAL>
    */
   public R visit(FloatLiteral n, A argu) {
      R _ret=null;
      String tmp = newTemp();
      code += tmp + " = " + n.f0.tokenImage + ";\n";
      if(method==1){
          methodvar.put(tmp,"float");
         }
         else {classvar.put(tmp,"float");}
      ptype="float";
      _ret = (R) tmp;
      return _ret;
   }

   /**
    * f0 -> "true"
    */
   public R visit(TrueLiteral n, A argu) {
      R _ret=null;
      String tmp = newTemp();
      code += tmp + " = " + n.f0.tokenImage + ";\n";
      if(method==1){
          methodvar.put(tmp,"boolean");
         }
         else {classvar.put(tmp,"boolean");}
      ptype="boolean";
      _ret = (R) tmp;
      return _ret;
   }

   /**
    * f0 -> "false"
    */
   public R visit(FalseLiteral n, A argu) {
      R _ret=null;
      String tmp = newTemp();
      code += tmp + " = " + n.f0.tokenImage + ";\n";
      if(method==1){
          methodvar.put(tmp,"boolean");
         }
         else {classvar.put(tmp,"boolean");}
      ptype="boolean";
      _ret = (R) tmp;
      return _ret;
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n, A argu) {
      R _ret=null;
      if(methodpara.containsKey(n.f0.tokenImage)) ptype=methodpara.get(n.f0.tokenImage);
      if(methodvar.containsKey(n.f0.tokenImage)) ptype=methodvar.get(n.f0.tokenImage);
      if(classvar.containsKey(n.f0.tokenImage)) ptype=classvar.get(n.f0.tokenImage);
      _ret = (R)n.f0.tokenImage;
      return _ret;
   }

   /**
    * f0 -> "this"
    */
   public R visit(ThisExpression n, A argu) {
      R _ret=null;
      String tmp=newTemp();
      code+=tmp+" = this;\n";
      if(method==1){
          methodvar.put(tmp,Classlabel);
         }
         else classvar.put(tmp,Classlabel);
      _ret = (R)tmp;
//      ptype=latclass;
      return _ret;
   }

   /**
    * f0 -> "new"
    * f1 -> "int"
    * f2 -> "["
    * f3 -> Expression()
    * f4 -> "]"
    */
   public R visit(ArrayAllocationExpression n, A argu) {
      R _ret=null;
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"int[]");
         }
         else classvar.put(tmp,"int[]");
      String tmp2 = (String) n.f3.accept(this, argu);
      code += tmp + " = " + "new int[" + tmp2 + "];\n";
      _ret = (R)tmp;
      ptype="int[]";
      return _ret;
   }

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ")"
    */
   public R visit(AllocationExpression n, A argu) {
      R _ret=null;
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,n.f1.f0.tokenImage);
         }
         else classvar.put(tmp,n.f1.f0.tokenImage);
      String tmp2 = (String) n.f1.accept(this, argu);
      code += tmp + " = " + "new " + tmp2 + "();\n";
      _ret = (R)tmp;
      ptype=n.f1.f0.tokenImage;
      return _ret;
   }

   /**
    * f0 -> "!"
    * f1 -> Expression()
    */
   public R visit(NotExpression n, A argu) {
      R _ret=null;
      String tmp = newTemp();
      if(method==1){
          methodvar.put(tmp,"boolean");
         }
         else classvar.put(tmp,"boolean");
      String tmp2 = (String) n.f1.accept(this, argu);
      code += tmp + " = " + "!" + tmp2 + ";\n";
      _ret = (R)tmp;
      ptype="boolean";
      return _ret;
   }

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public R visit(BracketExpression n, A argu) {
      R _ret=null;
      String tmp = newTemp();
      String tmp2 = (String) n.f1.accept(this, argu);
//      code += tmp + " = " + "(" + tmp2 + ");\n";
      if(method==1){
          methodvar.put(tmp,ptype);
         }
         else classvar.put(tmp,ptype);
      _ret = (R)tmp;
      return _ret;
   }

}
