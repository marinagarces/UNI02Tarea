Algoritmo sin_titulo
	
	Escribir "Ingrese la cantidad de alumnos:"
    Leer n
	
    Para i <- 1 Hasta n Hacer
		
		Escribir "Notas del Alumno ", i
		Escribir "Ingrese la primera nota"
		Leer nota1
		Escribir "Ingrese la segunda nota"
		Leer nota2
		
		
		notaFinal <- nota1 * 0.3 + nota2 * 0.3
		
		notaNecesaria <- (4 - notaFinal) / 0.4
		
		Escribir "Para aprobar necesitas obtener la siguiente nota: ",notaNecesaria
		
    FinPara
	
FinAlgoritmo