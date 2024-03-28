def sieve_of_eratosthenes(n):
    primes = [True] * (n + 1)
    primes[0] = primes[1] = False
    for i in range(2, int(n ** 0.5) + 1):
        if primes[i]:
            for j in range(i * i, n + 1, i):
                primes[j] = False
    return [i for i in range(n + 1) if primes[i]]

primes_up_to_1000000 = set(sieve_of_eratosthenes(1000000))

def is_appropriate_key(S):
    for prime in primes_up_to_1000000:
        if prime * prime > S:
            break
        if S % prime == 0:
            return "NO"
    return "YES"

N = int(input())
for _ in range(N):
    S = int(input())
    print(is_appropriate_key(S))