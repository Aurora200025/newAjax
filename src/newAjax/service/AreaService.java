package newAjax.service;

import newAjax.dao.AreaDao;
import newAjax.domain.Area;

import java.util.ArrayList;

public class AreaService {
    private AreaDao dao = new AreaDao();
    public ArrayList<Area> selectAreaByCid(int cid) {
        return dao.selectAreaByCid(cid);
    }
}
