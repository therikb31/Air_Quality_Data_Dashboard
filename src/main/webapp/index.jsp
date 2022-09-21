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
<link rel="stylesheet" href="styles.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<nav>AQSensor</nav>
	<div class="row">
		<div class="chart">
			<canvas id="TMP" class="chart col"></canvas>
		</div>
		<div class="chart">
			<canvas id="C2H5OH" class="chart col"></canvas>
		</div>
		<div class="chart">
			<canvas id="CO" class="chart col"></canvas>
		</div>
	</div>
	<div class="row">
		<div class="chart">
			<canvas id="DD" class="chart col"></canvas>
		</div>
		<div class="chart">
			<canvas id="HI" class="chart col"></canvas>
		</div>
		<div class="chart">
			<canvas id="HMD" class="chart col"></canvas>
		</div>
	</div>
	<div class="row">
		<div class="chart">
			<canvas id="MQ135" class="chart col"></canvas>
		</div>
		<div class="chart">
			<canvas id="MQ2" class="chart col"></canvas>
		</div>
		<div class="chart">
			<canvas id="MQ7" class="chart col"></canvas>
		</div>
	</div>
	<script src="charts.js"></script>
</body>
</html>