import * as CryptoJS from "crypto-js";
import { environment } from "src/environments/environment";

export const encrypt=(dato:string):string => {
  return CryptoJS.AES.encrypt(dato,environment.keyEncryot).toString();
};

export const descryp=(valorEncrypt:string): string =>{
  const valueDescryp = CryptoJS.AES.decrypt(valorEncrypt, environment.keyEncryot).toString(CryptoJS.enc.Utf8);
  if(!valorEncrypt){
    return null;
  }
  return JSON.parse(valueDescryp) as string;
}
