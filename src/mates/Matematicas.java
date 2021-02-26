/*Copyright [2021] [Javier Martínez]

  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/

package mates;

public class Matematicas{

    public static void calcularNumeroPi(long dardosTotales){
        double dentro = 0;
        double areaCuadrado = 4;
        for (long i = 1; i <= dardosTotales; i++){
            double x = Math.random()*2-1;
            double y = Math.random()*2-1;
            double distancia = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
            if(distancia<=1){
                dentro++;
            }
        }

        double radio = 1;
        double areaCirculo = areaCuadrado*(dentro/dardosTotales);
        double estimacionPi = areaCirculo/Math.pow(radio, 2);
        System.out.println("La estimación del número Pi es " + estimacionPi);
    }

}
