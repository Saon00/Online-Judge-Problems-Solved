t = int(input())
hedron = {"Tetrahedron": 4,
          "Cube": 6,
          "Octahedron": 8,
          "Dodecahedron": 12,
          "Icosahedron": 20}
sum = 0
while (t > 0):
    name = input()
    sum += hedron[name]
    t -= 1
print(sum)

# https://codeforces.com/problemset/problem/785/A
