import {http} from '../../lib/index.js'

export const getAddress = params => {
  return http.post('/address/getAddress',params);
};