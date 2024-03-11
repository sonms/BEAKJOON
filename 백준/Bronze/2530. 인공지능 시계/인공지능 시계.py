#1시간 = 3600초 1분 = 60초
h,m,s = tuple(input().split(" "))
d = int(input())
temp = int(h) * 3600 + int(m) * 60 + int(s) + d #전부계산한 시간(초)

answer = []
a = temp // 3600
b = temp // 60 - a * 60
c = temp % 60
if a >= 24:
    a = a % 24
    answer.append(a)
answer.append(b)
answer.append(c)
print(a,b,c,sep = " ")
