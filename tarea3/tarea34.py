#tarea34

total : float
horas : int

horas = int(input("ingrese las horas: "))

if horas<=2:
    total = horas * 5
else:
    if horas <= 5:
        total =((horas - 2 )*4)+10
    else:
        if horas <= 10 :
            total = ((horas - 5)*3)+22
        else:
            total = ((horas - 10)*2)+37
print("El total a pagar por ",horas," horas es: s./",total)