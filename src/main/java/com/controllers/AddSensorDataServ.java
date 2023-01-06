package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.database.SensorDataDAO;
import com.models.SensorData;

/**
 * Servlet implementation class AddSensorDataServ
 */
@WebServlet("/AddSensorDataServ")
public class AddSensorDataServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSensorDataServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SensorData data = new SensorData();
		String MQ2 = request.getParameter("MQ2");
		data.setMQ2(MQ2);
		String MQ7 = request.getParameter("MQ7");
		data.setMQ7(MQ7);
		String MQ135 = request.getParameter("MQ135");
		data.setMQ135(MQ135);
		String NO2 = request.getParameter("NO2");
		data.setNO2(NO2);
		String C2H5OH = request.getParameter("C2H5OH");
		data.setC2H5OH(C2H5OH);
		String VOC = request.getParameter("VOC");
		data.setVOC(VOC);
		String CO = request.getParameter("CO");
		data.setCO(CO);
		String HMD = request.getParameter("HMD");
		data.setHMD(HMD);
		String TMP = request.getParameter("TMP");
		data.setTMP(TMP);
		String HI = request.getParameter("HI");
		data.setHI(HI);
		String RAWPM = request.getParameter("RAWPM");
		data.setRAWPM(RAWPM);
		String DD = request.getParameter("DD");
		data.setDD(DD);
		String LAT = request.getParameter("LAT");
		data.setLAT(LAT);
		String LON = request.getParameter("LON");
		data.setLON(LON);
		SensorDataDAO.insertSensorData(data);
		response.getWriter().write("success");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
