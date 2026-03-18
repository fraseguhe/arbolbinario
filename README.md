# Nombre del proyexto.
## _**ArbolBinario de fraseguhe**_
# Qué es un árbol binario.
>## Un árbol binario es una estructura de datos jerárquica y no lineal en la que cada nodo puede tener, como máximo, dos hijos, denominados "hijo izquierdo" e "hijo derecho". Se utiliza ampliamente para organizar datos de manera eficiente, permitiendo búsquedas rápidas al dividir la información en subárboles izquierdo (menores) y derecho (mayores) desde un nodo raíz. 
# Cómo se implementó.
>## ArbolBinario.java
>>### El árbol se implementó en 3 modulos:
>>### Nodo — este es una clase que permite que un objeto de esta clase almacene un número y dos nodos adicionales de valor prefefdifinido a null (izquierda y derecha)
>>### Arbol — contiene la raíz que es donde empezara a iterar el los métodos
>>### main — ya es el programa en si y es el que crea el árbol, inserta los números del arreglo y prueba todos los métodos
>>### el proyecto cuenta con 3 metodos:
>>### añadir — baja recursivamente por el árbol hasta encontrar un espacio null y luego alli almacena el valor y crea otros 2 nodos, la verdad inicialmente fue muy confuso el uso recursivo de un metodo dentro de si mismo pero luego ded una extensa busqueda y ejemplos en linea pude entender y familiarizarme con el concepto
>>### buscar — recorre el árbol con un while comparando en cada nodo para ver si en el nodo actual se encuentra el valor o en caso de ser menor o mayor moverse en dirección adecuada
>>### orden — este metodo visita todos los nodos e imprime los números de menor a mayor
# Capturas de pantalla de la ejecución.
![Captura de ejecución de .java](https://github.com/fraseguhe/arbolbinario/blob/main/%7BA6B72B77-3E63-43FC-B59B-D195A4827FA8%7D.png "Captura de pantalla 1")
# Contribuyentes
_**Frank Sebastián guzmán hernández**_
