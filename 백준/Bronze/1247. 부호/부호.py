import sys
answer = []

for i in range(3):
    s = 0
    tc = int(sys.stdin.readline())
    for _ in range(tc):
        ip = int(sys.stdin.readline())
        s += ip
    if s == 0:
        answer.append(0)
    elif s > 0:
        answer.append("+")
    else:
        answer.append("-")

for j in answer:
    print(j)
