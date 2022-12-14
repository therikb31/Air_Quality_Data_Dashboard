package com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.models.SensorData;
import com.properties.SQLQueries;

public class SensorDataDAO {
	@SuppressWarnings("finally")
	public static Vector<SensorData> getSensorData() {
		Vector<SensorData> sensordata = new Vector<SensorData>();
		Connection conn = DBConnector.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement(SQLQueries.RETRIEVE_GAS);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				SensorData row = new SensorData();
				row.setID(rs.getInt("ID"));
				row.setC2H5OH(rs.getString("C2H5OH"));
				row.setCO(rs.getString("CO"));
				row.setDD(rs.getString("DD"));
				row.setHI(rs.getString("HI"));
				row.setHMD(rs.getString("HMD"));
				row.setLAT(rs.getString("LAT"));
				row.setLON(rs.getString("LON"));
				row.setMQ135(rs.getString("MQ135"));
				row.setMQ2(rs.getString("MQ2"));
				row.setMQ7(rs.getString("MQ7"));
				row.setNO2(rs.getString("NO2"));
				row.setRAWPM(rs.getString("RAWPM"));
				row.setTIMESTAMP(rs.getTimestamp("TIMESTAMP"));
				row.setTMP(rs.getString("TMP"));
				row.setVOC(rs.getString("VOC"));
				sensordata.add(row);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return sensordata;
		}
	}

	@SuppressWarnings("finally")
	public static SensorData getLastSensorData() {
		Connection conn = DBConnector.getConnection();
		SensorData row = new SensorData();
		try {
			PreparedStatement ps = conn.prepareStatement(SQLQueries.RETRIEVE_LAST_GAS);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				row.setID(rs.getInt("ID"));
				row.setC2H5OH(rs.getString("C2H5OH"));
				row.setCO(rs.getString("CO"));
				row.setDD(rs.getString("DD"));
				row.setHI(rs.getString("HI"));
				row.setHMD(rs.getString("HMD"));
				row.setLAT(rs.getString("LAT"));
				row.setLON(rs.getString("LON"));
				row.setMQ135(rs.getString("MQ135"));
				row.setMQ2(rs.getString("MQ2"));
				row.setMQ7(rs.getString("MQ7"));
				row.setNO2(rs.getString("NO2"));
				row.setRAWPM(rs.getString("RAWPM"));
				row.setTIMESTAMP(rs.getTimestamp("TIMESTAMP"));
				row.setTMP(rs.getString("TMP"));
				row.setVOC(rs.getString("VOC"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return row;
		}
	}
	public static void insertSensorData(SensorData row) {
		Connection conn = null;
		try {
			conn = DBConnector.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQLQueries.INSERT_GAS);
			ps.setString(1,row.getC2H5OH());
			ps.setString(2,row.getCO());
			ps.setString(3,row.getDD());
			ps.setString(4,row.getHI());
			ps.setString(5,row.getHMD());
			ps.setString(6,row.getLAT());
			ps.setString(7,row.getLON());
			ps.setString(8,row.getMQ135());
			ps.setString(9,row.getMQ2());
			ps.setString(10,row.getMQ7());
			ps.setString(11,row.getNO2());
			ps.setString(12,row.getRAWPM());
			ps.setString(13,row.getTMP());
			ps.setString(14,row.getVOC());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}public static void main(String[] args) {
//	Vector<SensorData> sensordata = getSensorData();
//	for (int i=0;i<sensordata.size();i++) {
//	    System.out.println(sensordata.elementAt(i).toString());
//	}
		SensorData sd = getLastSensorData();
		System.out.println(sd.toString());
	}
}
