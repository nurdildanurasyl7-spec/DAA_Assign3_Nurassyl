package mst;

import java.util.*;
public class P {
    public static class R {
        public java.util.List<E> e = new java.util.ArrayList<>();
        public Integer c;
        public long o;
        public double t;
    }
    public static R go(Set<String> n, java.util.List<E> es){
        java.util.Map<String, java.util.List<E>> g = new java.util.HashMap<>();
        for (String s: n) g.put(s, new java.util.ArrayList<>());
        for (E x: es){ g.get(x.u).add(x); g.get(x.v).add(new E(x.v,x.u,x.w)); }
        R r = new R();
        if (n.isEmpty()){ r.c=0; return r; }
        String st = n.iterator().next();
        var v = new java.util.HashSet<String>();
        v.add(st);
        var q = new java.util.PriorityQueue<E>((a,b)->a.w-b.w);
        long op=0;
        long a = System.nanoTime();
        for (E x: g.get(st)){ q.offer(x); op++; }
        int sum=0;
        while(!q.isEmpty() && v.size()<n.size()){
            E cur = q.poll(); op++;
            if (v.contains(cur.v)) continue;
            v.add(cur.v);
            r.e.add(new E(cur.u,cur.v,cur.w));
            sum+=cur.w;
            for (E x: g.get(cur.v)){
                op++;
                if (!v.contains(x.v)){ q.offer(x); op++; }
            }
        }
        long b = System.nanoTime();
        r.c = (v.size()==n.size())?sum:null;
        r.o = op;
        r.t = (b-a)/1_000_000.0;
        return r;
    }
}
