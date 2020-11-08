package newAjax.controller;

import newAjax.domain.Country;
import newAjax.service.CountryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/selectAllCountry")
public class SelectAllCountryController extends HttpServlet {
    private CountryService service = new CountryService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Country> countryList = service.selectAllCountry();
        request.setAttribute("countryList",countryList);
        request.getRequestDispatcher("registTest.jsp").forward(request,response);
    }
}
