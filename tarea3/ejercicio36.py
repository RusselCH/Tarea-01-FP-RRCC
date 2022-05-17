preciof : float
precio : float
descuento :float
precio = float(input("ingrese el precio del articulo: "))
if precio >=200:
    descuento = precio*0.15
    print("Se desconto 15%")
else:
    if precio >=100:
        descuento = precio*0.12
        print("Se desconto 12%")
    else:
        if precio < 100:
            descuento = precio*0.10
            print("Se desconto 10%")
preciof = precio - descuento

print("El precio con descuento es: ",preciof)
print("el descuento aplicado es: ",descuento)