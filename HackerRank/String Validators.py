# i took help from discussion forum

# 1st way

str = input()
print(any(c.isalnum() for c in str))
print(any(c.isalpha() for c in str))
print(any(c.isdigit() for c in str))
print(any(c.islower() for c in str))
print(any(c.isupper() for c in str))

# 2nd way

str = input()
t = type(str)
for method in [t.isalnum, t.isalpha, t.isdigit, t.islower, t.isupper]:
    print (any(method(c) for c in str))
