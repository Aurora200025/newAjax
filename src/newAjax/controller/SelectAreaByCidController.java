package newAjax.controller;

import com.alibaba.fastjson.JSONObject;
import newAjax.domain.Area;
import newAjax.service.AreaService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/selectAreaByCid")
public class SelectAreaByCidController extends HttpServlet {
    private AreaService service = new AreaService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受参数
        int cid = Integer.parseInt(request.getParameter("cid"));
        System.out.println(cid);
        ArrayList<Area> areaList = service.selectAreaByCid(cid);
        JSONObject JObject = new JSONObject();
        JObject.put("areaList",areaList);
        System.out.println(JObject.toJSONString());
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(JObject.toJSONString());


//        request.setAttribute("areaList",areaList);
//        request.getRequestDispatcher("handleAreaList.jsp").forward(request,response);
//        StringBuilder builder = new StringBuilder();
//        builder.append("[");
//        for (Area area : areaList) {
//            builder.append("{");
//            builder.append("aid:");
//            builder.append(area.getAid());
//            builder.append(",");
//            builder.append("aname:");
//            builder.append(area.getAname());
//            builder.append("}");
//            builder.append(";");
//        }
//        builder.delete(builder.length()-1,builder.length());
//        builder.append("]");
//        response.setCharacterEncoding("UTF-8");
//        response.getWriter().write(builder.toString());
    }
}
