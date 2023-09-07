def puissance(a,b):

	if not type(a) and type(b) is int :
		raise TypeError("Only integers are allowed")

	resultat =int(a**b)
	print(resultat)

