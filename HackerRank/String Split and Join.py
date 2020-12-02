def split_and_join(name):
    name = name.split(" ")
    name = "-".join(name)
    return name


if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
    
    
# for clarify

name = 'my name is saon'
name = name.split(" ")
name = "-".join(name)
print(name)

>>> my-name-is-saon
