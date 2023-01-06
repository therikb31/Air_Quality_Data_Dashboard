var tempChart = null;
var C2H5OHChart = null;
var COChart = null;
var DDChart = null;
var HIChart = null;
var HMDChart = null;
var MQ135Chart = null;
var MQ2Chart = null;
var MQ7Chart = null;
var globalLabel = ['', '', '', '', '', ''];

async function fetchInitialData() {
	const url = './GetSensorData';
	const response = await fetch(url);
	const datapoints = await response.json();
	plotTemperature(datapoints);
	plotC2H5OH(datapoints);
	plotCO(datapoints);
	plotDD(datapoints);
	plotHI(datapoints);
	plotHMD(datapoints);
	plotMQ135(datapoints);
	plotMQ2(datapoints);
	plotMQ7(datapoints);
};
async function fetchLiveData() {
	const url = './GetLastSensorData';
	const response = await fetch(url);
	const datapoints = await response.json();
	update(tempChart, datapoints.data.TMP);
	document.getElementById("temperature").innerHTML=datapoints.data.TMP;
	
	update(C2H5OHChart, datapoints.data.C2H5OH);
	document.getElementById("c2h5oh").innerHTML=datapoints.data.C2H5OH;
	
	update(COChart, datapoints.data.CO);
	document.getElementById("co").innerHTML=datapoints.data.CO;
	
	update(DDChart, datapoints.data.DD);
	document.getElementById("dd").innerHTML=datapoints.data.DD;
	
	update(HIChart, datapoints.data.HI);
	document.getElementById("hi").innerHTML=datapoints.data.HI;
	
	update(HMDChart, datapoints.data.HMD);
	document.getElementById("hmd").innerHTML=datapoints.data.HMD;
	
	update(MQ135Chart, datapoints.data.MQ135);
	document.getElementById("mq135").innerHTML=datapoints.data.MQ135;
	
	update(MQ2Chart, datapoints.data.MQ2);
	document.getElementById("mq2").innerHTML=datapoints.data.MQ2;
	
	update(MQ7Chart, datapoints.data.MQ7);
	document.getElementById("mq7").innerHTML=datapoints.data.MQ7;
};
function plot(elementId, label, labels, data) {
	const ctx = document.getElementById(elementId).getContext('2d');
	const myChart = new Chart(ctx, {
		type: 'line',
		data: {
			labels: labels,
			datasets: [{
				label: label,
				data: data,
				borderWidth: 1
			}]
		},
		options: {
			scales: {
			}
		}
	});
	return myChart;
};

function plotTemperature(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.TMP;
	});
	console.log(temps);
	tempChart = plot("TMP", "Temperature", globalLabel, temps);
}
function plotC2H5OH(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.C2H5OH;
	});
	console.log(temps);
	C2H5OHChart = plot("C2H5OH", "C2H5OH", globalLabel, temps);
}
function plotCO(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.CO;
	});
	console.log(temps);
	COChart = plot("CO", "CO", globalLabel, temps);
}
function plotDD(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.DD;
	});
	DDChart = plot("DD", "DD", globalLabel, temps);
}
function plotHI(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.HI;
	});
	console.log(temps);
	HIChart = plot("HI", "HI", globalLabel, temps);
}
function plotHMD(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.HMD;
	});
	console.log(temps);
	HMDChart = plot("HMD", "HMD", globalLabel, temps);
}
function plotMQ135(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.MQ135;
	});
	console.log(temps);
	MQ135Chart = plot("MQ135", "MQ135", globalLabel, temps);
}
function plotMQ2(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.MQ2;
	});
	console.log(temps);
	MQ2Chart = plot("MQ2", "MQ2", globalLabel, temps);
}
function plotMQ7(datapoints) {
	const temps = datapoints.data.map(function(index) {
		return index.MQ7;
	});
	console.log(temps);
	MQ7Chart = plot("MQ7", "MQ7", globalLabel, temps);
}
function update(chart, value) {
	chart.config.data.labels.push('');
	chart.config.data.datasets[0].data.push(value);
	chart.config.data.labels.shift();
	chart.config.data.datasets[0].data.shift();
	chart.update();
}
fetchInitialData().then(
	setInterval(fetchLiveData, 2000));