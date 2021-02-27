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


package aplicacion;
/**
 * Esta clase contiene el método main que imprimirá el resultado más tarde
 *
 * @author Javier Martínez
 * @version final 26/02/2021
 */

import mates.Matematicas;

public class Principal{
    /**
     * Este método main sirve para calcular nuestro resultado
     *
     * @param args se establece un parametro para que se guarde el número que quiera el usuario
     */

    public static void main(String[] args){
        long dardosTotales = Long.parseLong(args[0]);
        Matematicas.calculoNumeroPi(dardosTotales);
    }
}

