compilar:limpiar
mkdir bin
find src -name *.java | xargs javac -cp bin -d bin
ejecutar:compilar
java -cp bin aplicacion.Principal
limpiar:
rm -rf bin
jar:compilar
jar cvfm principal.jar manifest.txt -C bin .
run:jar
java -jar principal.jar
javadoc:
javadoc -d doc src/mates/* src/aplicacion/*
