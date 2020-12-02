def mutate_string(string, position, character):
    name = string
    l = list(name)
    l[position] = character
    name = ''.join(l)
    return name

if __name__ == '__main__':
    s = input()
    i, c = input().split()
    s_new = mutate_string(s, int(i), c)
    print(s_new)
