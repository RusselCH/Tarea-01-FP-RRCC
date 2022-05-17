#ejercicio 3.19
#variables

edad : int
sexo : int
vacuna : float
edad = int(input("ingrese la edad del paciente: "))
if edad > 69:
    vacuna = print("La vacuna que le coresponde es : C")
else:
    if edad < 16:
        vacuna = print("La vacuna que le coresponde es : A")
    else:
        sexo = int(input("ingresa 1 si es mujer y 2 si es hombre: "))
        if sexo == 1:
                vacuna = print("La vacuna que le coresponde es : B")
        else:
            if sexo == 2:
                vacuna = print("La vacuna que le coresponde es : A")
            else:
                print("ingrese un sexo correcto")