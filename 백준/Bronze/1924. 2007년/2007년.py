dayList = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]

month1List = [1, 3, 5, 7, 8, 10, 12]
month2List = [4, 6, 9, 11]
month3List = [2]

x, y = map(int, input().split())

# 월의 첫 날을 올바르게 계산
if x == 1:
    last_day = 0  # 1월 1일은 월요일
else:
    total_days = sum([31 if m in month1List else 30 if m in month2List else 28 for m in range(1, x)])
    # 현재 월 이전까지의 일수를 7로 나눈 나머지를 이용하여 첫 날 요일을 계산
    #ex 2월을 구하고 싶으면 1월의 마지막 날짜의 요일을 구함
    last_day = (total_days % 7)


# 요일 계산
day_index = (last_day + y) % 7

answer = dayList[day_index]
print(answer)
