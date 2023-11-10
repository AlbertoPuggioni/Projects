# RSA Implementation

def main():
    # Defining the message
    m = 32

    # Defining p and q
    p = 5
    q = 7

    # Calculate n
    # n = p * q
    n = p * q

    # Calculate phi(n)
    # phi = (p-1) * (q-1)
    phi = (p-1) * (q-1)

    # Find e as coprime and < phi(n)
    # That means that MCD (phi, e) = 1
    e = 2
    while e < phi:
        if MCD(phi, e) == 1:
            break
        e += 1

    print(f"La tua chiave pubblica è: ({n}, {e})")

    # Find d
    # e * d = (phi * something) + 1
    # d must be an integer
    # ((phi * something) + 1) / e --> must be an integer
    # ((phi * something) + 1) % e must be equals to 0

    d = 0
    for something in range(n+1):
        temp = (phi * something) + 1
        if temp % e == 0:
            d = temp // e
            break

    print(f"La tua chiave privata è: {d}")

    # Use the keys generated
    c = (m ** e) % n
    print(f"Il messaggio cifrato è: {c}")

    message = (c ** d) % n  # In teoria, message = m, quindi potremmo dire int(message)
    print(f"Ho decifrato il seguente messaggio: {int(message)}")

def MCD(phi, e):
    # We use the Euclidean's algorithm
    # Given two natural numbers a and b, we check if b is equals to 0
    # If the b is equals to 0, then a is the MCD
    # Otherwise, we divide a / b and we initialize r with the division's rest
    # If r = 0 then we can say that b is the MCD
    # otherwise we need to initialize a=b and b=r and we continue to check the division

    if e == 0:
        return phi
    else:
        r = phi % e

        if r == 0:
            return e
        else:
            return MCD(e, r)

if __name__ == "__main__":
    main()
