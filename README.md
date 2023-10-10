# Proyecto - Poligono Regular

El alumno debe implementar una clase PoligonoRegular que obtenga el area y perimetro del poligono

## Ejecución

Tu programa debería ejecutarse de la siguiente manera:

```
Poligono Regular
================

Poligono Regular 1:
Proporcione el valor de n:4
Proporcione el valor de lado:3
Proporcione el valor de x:1
Proporcione el valor de y:2
Poligono Regular 2:
Proporcione el valor de n:5
Proporcione el valor de lado:4

Poligonos Regulares creados:
PoligonoRegular: N=4, Lado=3.00, Perimetro=12.00, Area=9.00
PoligonoRegular: N=5, Lado=4.00, Perimetro=20.00, Area=27.53
PoligonoRegular: N=3, Lado=1.00, Perimetro=3.00, Area=0.43
```
## Diagrama de clases
[Editor en línea](https://mermaid.live/)
```mermaid
---
title: PoligonoRegular
---
classDiagram
      class PoligonoRegular
      PoligonoRegular: -n
      PoligonoRegular: -lado
      PoligonoRegular: -x
      PoligonoRegular: -y
      PoligonoRegular: +getArea()
      PoligonoRegular: +getPerimetro()
```
[Referencia-Mermaid](https://mermaid.js.org/syntax/classDiagram.html)

## Diagrama de clases UML con draw.io
El repositorio está configurado para crear Diagramas de clases UML con ```draw.io```. Para usarlo simplemente agrega un archivo con extensión ```.drawio.png```, das doble clic sobre el mismo y se activará el editor ```draw.io``` incrustado en ```VSCode``` para edición. Asegúrate de agregar las formas UML en el menú de formas del lado izquierdo (opción ```+Más formas```).

## Uso del proyecto con make

### Default - Compilar+Probar+Ejecutar
```
make
```
### Compilar
```
make compile
```
### Probar todo
```
make test
```
### Ejecutar App
```
make run
```
### Limpiar binarios
```
make clean
```
## Comandos Git-Cambios y envío a Autograding

### Por cada cambio importante que haga, actualice su historia usando los comandos:
```
git add .
git commit -m "Descripción del cambio"
```
### Envíe sus actualizaciones a GitHub para Autograding con el comando:
```
git push origin main
```
## Comandos individuales
### Compilar

```
find ./ -type f -name "*.java" > compfiles.txt
javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```
Ejecutar ambos comandos en 1 sólo paso:

```
find ./ -type f -name "*.java" > compfiles.txt ; javac -d build -cp lib/junit-platform-console-standalone-1.5.2.jar @compfiles.txt
```


### Ejecutar Todas la pruebas locales de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-class miTest.AppTest
```
### Ejecutar 1 prueba local de 1 Test Case

```
java -jar lib/junit-platform-console-standalone-1.5.2.jar -class-path build --select-method miTest.AppTest#appHasAGreeting
```
### Ejecutar App
```
java -cp build miPrincipal.Principal
```
Los comandos anteriores están considerados para un ambiente Linux. [Referencia.](https://www.baeldung.com/junit-run-from-command-line)
