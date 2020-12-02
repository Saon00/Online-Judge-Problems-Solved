# python 3.8 or above

day_1 = int(input())
hour_1 = int(input())
mint_1 = int(input())
sec_1 = int(input())

day_2 = int(input())
hour_2 = int(input())
mint_2 = int(input())
sec_2 = int(input())

day_2_1 = day_2 - day_1 - 1

if hour_1>hour_2:
    h_2_1 = hour_2-hour_1+24
elif hour_2>hour_1:
    h_2_1 = hour_2 - hour_1
elif hour_1==hour_2:
    h_2_1 = 0

if mint_1<mint_2:
    mint_2_1 = mint_2 - mint_1
elif mint_1>mint_2:
    mint_2_1 = mint_2 - mint_1 + 60
elif mint_1==mint_2:
    mint_2_1 = 0

if sec_1<sec_2:
    sec_2_1 = sec_2 - sec_1
elif sec_1>sec_2:
    sec_2_1 = sec_2 - sec_1 + 60
elif sec_1==sec_2:
    sec_2_1 = 0

print(day_2_1,'dia(s)')
print(h_2_1,'hora(s)')
print(mint_2_1,'minuto(s)')
print(sec_2_1,'segundo(s)')

