document.addEventListener('DOMContentLoaded', function () {
    // 绑定获取坐标的事件
    document.getElementById('getCoordinates').addEventListener('click', function() {
        getAddressToLatitudeLongitude();
    });

    // 绑定跳转页面的事件
    document.getElementById('redirectToIndex2').addEventListener('click', function() {
        redirectToIndex2();
    });
});

async function getAddressToLatitudeLongitude() {
    const address = document.getElementById('address').value;
    const url = `https://address-from-to-latitude-longitude.p.rapidapi.com/geolocationapi?address=${encodeURIComponent(address)}`;
    const options = {
        method: 'GET',
        headers: {
            'X-RapidAPI-Key': 'f8e22427demsh5bf954be73c6963p1568fdjsn186c9afb68fd',
            'X-RapidAPI-Host': 'address-from-to-latitude-longitude.p.rapidapi.com'
        }
    };

    try {
        const response = await fetch(url, options);
        const result = await response.text();
        document.getElementById('coordinatesResult').innerText = result;
    } catch (error) {
        console.error(error);
        document.getElementById('coordinatesResult').innerText = 'Error: ' + error;
    }
}

function redirectToIndex2() {
    const username = document.getElementById('address').value;
    window.location.href = `index2.html?username=${encodeURIComponent(username)}`;
}
