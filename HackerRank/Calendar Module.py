import calendar

mm, dd, yyyy = map(int, input().split())
print((calendar.day_name[calendar.weekday(yyyy, mm, dd)]).upper())

# contain = calendar.weekday(yyyy, mm, dd)
# if contain == 0:
#     print("MONDAY")
# elif contain == 1:
#     print("TUESDAY")
# elif contain == 2:
#     print("WEDNESDAY")
# elif contain == 3:
#     print("THURSDAY")
# elif contain == 4:
#     print("FRIDAY")
# elif contain == 5:
#     print("SATURDAY")
# elif contain == 6:
#     print("SUNDAY")
