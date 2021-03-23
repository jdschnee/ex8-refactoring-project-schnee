package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      contains(nodes, p);

      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      contains(edgeList, p);

      // other implementation
      return null;
   }

   //Extract Method Refactored
   <T extends Graph> void contains(List<T> objs, String p){
      for (T obj : objs) {
         if (obj.contains(p)){
            System.out.println(obj);
         }
      }
   }
}

class Graph {
   String name;
   
   boolean contains(String p){
      return name.contains(p);
   }
}

class Node extends Graph{
}

class Edge extends Graph{
}