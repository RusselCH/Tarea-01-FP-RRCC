#Declarar Variables

cantidad : float


cantidad = float(input("ingrese la cantidad de dinero: "))


if cantidad>251:
  print("Usted puede regalar un anillo")
else:
  if cantidad >= 101 and cantidad <= 250:
    print("Usted puede regalar flores")
  else:
    if cantidad >= 11 and cantidad <= 100:
      print("Usted puede regalar chocolates")
    else:
      if cantidad < 10:
        print("Usted puede regalar una tarjeta")
        