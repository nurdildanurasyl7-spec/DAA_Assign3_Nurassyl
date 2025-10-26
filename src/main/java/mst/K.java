package mst;

import java.util.*;
public class K {
    public static class R {
        public java.util.List<E> e = new java.util.ArrayList<>();
        public Integer c;
        public long o;
        public double t;
    }
    static class D {
        java.util.Map<String,String> p = new java.util.HashMap<>();
        java.util.Map<String,Integer> r = new java.util.HashMap<>();
        long q=0;
        D(Set<String> s){ for(String x:s){ p.put(x,x); r.put(x,0);} }
        String f(String x){
            q++;
            if (!p.get(x).equals(x)) p.put(x, f(p.get(x)));
            return p.get(x);
        }
        boolean u(String a, String b){
            String x=f(a), y=f(b);
            if (x.equals(y)) return false;
            if (r.get(x)<r.get(y)) p.put(x,y);
            else if (r.get(x)>r.get(y)) p.put(y,x);
            else { p.put(y,x); r.put(x, r.get(x)+1); }
            q++;
            return true;
        }
    }
    public static R go(Set<String> n, java.util.List<E> es){
        R r = new R();
        long a = System.nanoTime();
        var s = new java.util.ArrayList<>(es);
        s.sort((x,y)->x.w-y.w);
        var d = new D(n);
        int sum=0;
        long op=0;
        for(E e:s){
            op++;
            if(d.u(e.u,e.v)){
                r.e.add(e);
                sum+=e.w;
                if (r.e.size()==n.size()-1) break;
            }
        }
        op+=d.q;
        long b = System.nanoTime();
        r.c = (r.e.size()==n.size()-1)?sum:null;
        r.o = op;
        r.t = (b-a)/1_000_000.0;
        return r;
    }
}
