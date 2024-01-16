/**
 * 
 */document.getElementById('getWeather').addEventListener('click', function() {
	 const latitude = document.getElementById('latitude').value;
	 const longitude = document.getElementById('longitude').value;
	 getWeather(latitude, longitude);
 });

async function getWeather(lat, long) {
	const url = `https://yahoo-weather5.p.rapidapi.com/weather?lat=${lat}&long=${long}&format=json&u=f`;
	const options = {
		method: 'GET',
		headers: {
			'X-RapidAPI-Key': 'f8e22427demsh5bf954be73c6963p1568fdjsn186c9afb68fd',
			'X-RapidAPI-Host': 'yahoo-weather5.p.rapidapi.com'
		}
	};

	try {
		const response = await fetch(url, options);
		const result = await response.json();
		document.getElementById('weatherResult').innerText = JSON.stringify(result, null, 2);
	} catch (error) {
		console.error(error);
		document.getElementById('weatherResult').innerText = '获取天气信息失败';
	}
}
