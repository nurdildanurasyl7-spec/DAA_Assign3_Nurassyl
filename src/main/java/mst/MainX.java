package mst;

import java.util.*;
import org.json.*;
import java.io.IOException;

public class MainX {
    public static void main(String[] aa) throws IOException {
        String in = aa.length>0? aa[0] : "data/assign_3_input.json";
        String out = aa.length>1? aa[1] : "out/assign_3_output.json";
        var gs = IO.r(in);
        var rs = new java.util.ArrayList<JSONObject>();
        for (IO.G g: gs){
            var pr = P.go(g.n, g.e);
            var kr = K.go(g.n, g.e);
            rs.add(M.p(g.id, g.n, g.e, pr, kr));
        }
        IO.w(out, rs);
        System.out.println("ok "+out);
    }
}
