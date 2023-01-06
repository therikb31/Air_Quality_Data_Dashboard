<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Dashboard</title>
<script
	src="https://cdn.jsdelivr.net/npm/chart.js@3.9.1/dist/chart.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
</head>
<body>
	<%@include file="../includes/navbar.html"%>
	<div class="row">
		<div class="col border">
			<!-- style='font-size: 16px;font-family: "Lucida Console", "Courier New", monospace;' -->
			<canvas id="TMP" class="d-flex justify-content-center chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>Temperature: </span><span id="temperature">50</span>
			</div>
		</div>
		<div class="col border">
			<canvas id="C2H5OH" class="chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>C2H5OH: </span><span id="c2h5oh">50</span>
			</div>
		</div>
		<div class="col border">
			<canvas id="CO" class="chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>CO: </span><span id="co">50</span>
			</div>
		</div>
		<div class="col border">
			<canvas id="DD" class="chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>DD: </span><span id="dd">50</span>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col border">
			<canvas id="HI" class="chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>HI: </span><span id="hi">50</span>
			</div>
		</div>
		<div class="col border">
			<canvas id="HMD" class="chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>Humidity: </span><span id="hmd">50</span>
			</div>
		</div>
		<div class="col border">
			<canvas id="MQ135" class="chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>MQ135: </span><span id="mq135">50</span>
			</div>
		</div>
		<div class="col border">
			<canvas id="MQ2" class="chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>MQ2: </span><span id="mq2">50</span>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-3  border">
			<canvas id="MQ7" class="chart col"></canvas>
			<div class="d-flex justify-content-center" style="margin-bottom:20px;">
				<span>MQ7: </span><span id="mq7">50</span>
			</div>
		</div>
	</div>
	<script src="charts.js"></script>
</body>
</html>