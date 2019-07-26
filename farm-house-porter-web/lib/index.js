import Request from './request'

const http = new Request();
http.setConfig((config) => { /* 设置全局配置 */
	config.baseUrl = 'http://127.0.0.1:8080'; /* 根域名不同 */
	config.header = {
		'Content-Type': 'application/x-www-form-urlencoded'
	}
	return config
})
http.interceptor.request((config, cancel) => { /* 请求之前拦截器 */
	config.header = {
		...config.header
	}
	console.log('发送请求之前被我拦截了' + config.header['Content-Type'] + '---' + JSON.stringify(config.data));
	/*
	if (!token) { // 如果token不存在，调用cancel 会取消本次请求，但是该函数的catch() 仍会执行
		cancel('token 不存在') // 接收一个参数，会传给catch((err) => {}) err.errMsg === 'token 不存在'
	}
	*/
	return config;
})
http.interceptor.response((response) => { /* 请求之后拦截器 */
	console.log('返回的请求被我拦截了'+response);
	return response.data;
})
export {
	http
};