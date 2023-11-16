# London School of TDD

1. A qué llamamos la Escuela de Londres
    * Es el estilo de TDD planteado por **Steve Freeman** y **Nat Pryce** en su libro _Growing Object-Oriented Software Guided by tests (prólogo por... **Kent Beck**).
    * También se conoce esta estrategia como **Mockist TDD**, **Outside In** o **Top Down**.
    * No hay enfrentamiento entre Londres y Chicago, en realidad la escuela de Londres añade valor a la escuela de Chicago.
    * Pone el foco en probar la relación entre los elementos clave del proyecto y sus mensajes, **las interacciones**.  
    * A la vez se hace un extensivo uso de los tests unitarios probado las clases en aislamiento (**Solitary Unit Tests**).
    * Para probar las interacciones entre clases o módulos, pero de manera aislada, se usan **Mocks**.
2. En qué consiste esta estratégia
    * Se aconseja empezar a probar el comportamiento mediante tests de tipo aceptación al estilo del BDD en nuestra capa **superior/exterior**.
    * Este estilo está muy relacionado con ATDD, se usa un ciclo de TDD con tests de aceptación que contiene otro ciclo de TDD de tests unitarios.
    * No se recomienda el uso de mocks con código de terceros, lo ideal es crear una abstracción para hacer más manejable esa "_frontera_".
    * La recomendación de trabajar con mocks y abstracciones para controlar las relaciones lo hace ideal para trabajar con **arquitectura hexagonal**.
    * La regla de oro es poner el foco en las abstracciones que representan las interacciones, intentando limitar las dependencias de estas.
     > Si para hacer un test ves que estás usando muchos mocks es que algo está mal en tu diseño.
    * Si se hace bien, deberíamos tener muchos tests unitarios con alguna interfaz mockeada, y unos pocos tests de aceptación con las implementaciones reales.
3. Ventajas
    * Este enfoque en el uso de mocks nos permite **poder trabajar sin tener las versiones reales implementadas** o completamente definidas. 
    * Esto también nos permite centrarnos en **una sóla cosa cada vez**.
    * Nos permite desarrollar más rápido cuando no tenemos del todo claras las interacciones entre clases o módulos.
    * El uso de los mocks nos ayuda a tener una suit de tests extensiva y rápida al no depender de los objetos reales.
4. Desventajas
    * El planteamiento de probar las interacciones entre nuestros objetos nos puede llevar a tener un código de tests muy acoplado al de producción.
    * Esto hace que cualquier cambio en el código pueda romper los tests y, por lo tanto, sea más difícil refactorizar.
    * No es recomendable si no tenemos claras las dependencias externas de nuestra arquitectura.
    * También podemos experimentar problemas con la integración, si nos enfocamos mucho a los tests unitarios que abusen del uso de los mocks.
5. Cuándo elegir esta estratégia
    * Cuando tenemos muy clara la arquitectura y no esperamos cambios.
    * Cuando las colaboraciones entre módulos, las integraciones, son complejas.
    * Si no importa acoplar la implementación a los test (de nuevo esperamos pocos cambios).
6. Conclusiones
   * Ninguna de las estratégias para el uso del TDD impide llevar a cabo un análisis previo del diseño que esperamos que tenga nuestra aplicación. 
   * TDD nos ayudará con el diseño de los detalles de la implementación a medida que vamos desarrollando con los tests como conductor. 
   * Pero eso no quiere decir que no necesitemos saber qué necesitamos hacer y qué herramientas (diseño, patrones, etc.) debemos usar.
   * No hay que escoger una de las dos estratégias, sino saber cambiar el zoom de nuestro desarrollo para usar una u otra dependiendo de las circunstancias. 
