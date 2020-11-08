package newAjax.test;

import newAjax.domain.Area;
import newAjax.service.AreaService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//import java.util.Set;

public class TestMain {

    public static void main(String[] args) {
//        AreaService service = new AreaService();
//        ArrayList<Area> areaList = service.selectAreaByCid(1);
//        for (Area a : areaList) {
//            System.out.println(a);
//        }
        Set<Character>[] set = new Set[9];
        set[1] = new HashSet<>();
        set[2] = new HashSet<>();
        System.out.println(set[1] == set[2]);
        set[1].add('c');

        set[2].add('b');

        System.out.println(set);
    }

}
