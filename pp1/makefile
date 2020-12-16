limpiar:
	rm -rf bin
compilar:limpiar
	find src -name "*.java" | xargs javac -cp bin -d bin
jar:compilar
	jar cvfm catalogo.jar manifest.txt -C bin .
