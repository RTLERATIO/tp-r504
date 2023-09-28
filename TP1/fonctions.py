def puissance(a,b):
	p=1
	if not type(a) and type(b) is int :
		raise TypeError("Only integers are allowed")
		
	if a == 0 and b == 0 :
		return 1	
		
	if a < 0 and b == 0:
		return -1
			
	if a == 0 and b < 0:
		raise ValueError("B ne doit pas être une valeur negative")
		
	for i in range(b):
		p=p*a
	return p 
