def swap_case(s):
    new_name = ''
    for i in s:
        if (i.isupper() == True):
            new_name += i.lower()
        elif (i.islower() == True):
            new_name += i.upper()
        elif (i.isspace() == True):
            new_name += i
        elif (i.isascii() == True):
            new_name += i
    return new_name

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
