import resource, sys

# https://stackoverflow.com/questions/5061582/setting-stacksize-in-a-python-script
resource.setrlimit(resource.RLIMIT_STACK, (2**29, -1))
sys.setrecursionlimit(10**6)


def pi_day(n, subtract=False):
    # base case
    if n > 50000:
        return 0.0

    # recursive case
    term = 4.0 / ((n - 1) * n * (n + 1))
    if subtract:
        term *= -1.0

    # n+2 brings n closer to base case
    next = pi_day(n + 2, not subtract)

    return term + next


def main():
    pi = 3.0 + pi_day(3, False)

    print("pi = {}".format(pi))


if __name__ == "__main__":
    main()
