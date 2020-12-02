# Saon Sikder
# Dhaka, Bangladesh

# way 1--------
import cmath

print(*cmath.polar(complex(input())), sep='\n')

# way 2--------
from cmath import polar

print(*polar(complex(input())), sep='\n')

# way 3--------
import cmath

com_num = complex(input().strip())
print(cmath.polar(com_num)[0])
print(cmath.polar(com_num)[1])
