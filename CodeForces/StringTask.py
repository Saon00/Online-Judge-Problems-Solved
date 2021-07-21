line = input().lower()
newline = ""
vowel = ['a', 'e', 'i', 'o', 'u', 'y']
for i in line:
    if(i not in vowel):
        newline += i
        print("."+newline, end="")
        newline = ""

# https://codeforces.com/problemset/problem/118/A
