n = int(input())
call = list(map(int, input().split(" ")))
y = 0
m = 0
for i in range(n):
    if (call[i] < 30):
        y += 10
    elif call[i] >= 30:
         y += ((call[i] // 30) + 1) * 10

    if call[i] < 60:
        m += 15
    elif call[i] >= 60:
         m += ((call[i] // 60)+1) * 15

if (y > m):
    print(f"M {m}")
elif(y < m):
    print(f"Y {y}")
elif(y == m):
    print(f"Y M {y}")
