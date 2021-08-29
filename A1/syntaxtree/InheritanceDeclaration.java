//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> "class"
 * f1 -> Identifier()
 * f2 -> "extends"
 * f3 -> Identifier()
 * f4 -> "{"
 * f5 -> "}"
 */
public class InheritanceDeclaration implements Node {
   public NodeToken f0;
   public Identifier f1;
   public NodeToken f2;
   public Identifier f3;
   public NodeToken f4;
   public NodeToken f5;

   public InheritanceDeclaration(NodeToken n0, Identifier n1, NodeToken n2, Identifier n3, NodeToken n4, NodeToken n5) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
   }

   public InheritanceDeclaration(Identifier n0, Identifier n1) {
      f0 = new NodeToken("class");
      f1 = n0;
      f2 = new NodeToken("extends");
      f3 = n1;
      f4 = new NodeToken("{");
      f5 = new NodeToken("}");
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
