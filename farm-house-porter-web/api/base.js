import {http} from '../lib/index.js'
import qs from 'qs';

export function fetch(url, params = {}) {
	return new Promise((resolve, reject) => {
		http.post(url,qs.stringify(params)).then(res => {
           resolve(res);
        });
	});
}