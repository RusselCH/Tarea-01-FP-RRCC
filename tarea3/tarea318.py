#ejercicio 3.18
	
Aantiguedad : int
sueldo : float
bono : float
	
Aantiguedad = int(input("ingrese su antiguedad en años: "))
	
sueldo = float(input("Ingresa tu sueldo: "))
	
if Aantiguedad>4 or sueldo<2000:
		bono = sueldo*.25
		print("Bono del 25%")
else:
		bono = sueldo*.20
		print("Bono del 20%")
print("Te corresponde un bono de: S./",bono)
