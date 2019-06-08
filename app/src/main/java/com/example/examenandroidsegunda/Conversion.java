package com.example.examenandroidsegunda;

import android.util.Log;

import java.util.Arrays;

public class Conversion {

    public byte[] convertirDecimalBinario(byte decimal){
        byte res[] = null;

        String resultado = Integer.toBinaryString(decimal);
        char arrayAux[] = resultado.toCharArray();
        byte arrayByte[] = new byte[resultado.length()];
        for(int i = 0;i<arrayByte.length;i++){
            arrayByte[i] = Byte.parseByte(String.valueOf(arrayAux[i]));
        }

        Log.i("BINARIO -->", Arrays.toString(res));
        return arrayByte;
    }

    public byte[] complemento1(byte binario[]){
        byte res[] = binario;

        for (int i=0; i<binario.length; i++){
            if(binario[i]==0){
                res[i] = 1;
            }else{
                res[i] = 0;
            }
        }

        return res;
    }

    public byte[] complemento2(byte binarioA1[]){
        byte res[] = binarioA1;

        String cadenaBinarioA1 = "";

        for(int i=0; i<binarioA1.length; i++){
            cadenaBinarioA1+= binarioA1[i];
        }

        int n1 = Integer.parseInt(cadenaBinarioA1, 2);

        int n2 = Integer.parseInt("1", 2);

        int r = n1 + n2;

        String cadr = Integer.toString(r);

        for (int i=0; i<cadr.length(); i++){
            res[i] = Byte.parseByte(String.valueOf(cadr.charAt(i)));
        }

        return res;
    }
}

