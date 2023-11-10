# Libraries
import hashlib
import secrets
import base64

# ==============================================
# Defining the functions
# ==============================================

# generate_salt Function
def generate_salt():
    # Generate a random salt of 16 bytes
    salt = secrets.token_bytes(16)
    return salt

# generate_hash_with_salt function
def generate_hash_with_salt(password, salt):
    # Combine password and salt
    password_bytes = password.encode('utf-8')
    salted_password = password_bytes + salt

    # Compute the SHA-256 hash of the salted password
    hash_object = hashlib.sha256()
    hash_object.update(salted_password)
    hash_bytes = hash_object.digest()

    # Encode the hash as a Base64 string
    hash_string = base64.b64encode(hash_bytes).decode('utf-8')

    return hash_string

# generate_hash_with_salt_and_pepper
def generate_hash_with_salt_and_pepper(password, salt, pepper):
    # Combine password, salt, and pepper
    password_bytes = password.encode('utf-8')
    salted_password = password_bytes + salt + pepper

    # Compute the SHA-256 hash of the salted password
    hash_object = hashlib.sha256()
    hash_object.update(salted_password)
    hash_bytes = hash_object.digest()

    # Encode the hash as a Base64 string
    hash_string = base64.b64encode(hash_bytes).decode('utf-8')

    return hash_string

# generate_hash function
def generate_hash(password):
    # Compute the SHA-256 hash of the password
    hash_object = hashlib.sha256()
    hash_object.update(password.encode('utf-8'))
    hash_bytes = hash_object.digest()

    # Encode the hash as a Base64 string
    hash_string = base64.b64encode(hash_bytes).decode('utf-8')

    return hash_string


# ======================================
# Main
# ======================================

def main():
    password = "password"
    password1 = "pass"
    hash_value = generate_hash(password)
    hash_value1 = generate_hash(password1)

    print("This is your password:", password)
    print("This is the hash of the password:", hash_value)
    print("This is the hash1 of the password:", hash_value1)

    salt = generate_salt()
    hash2 = generate_hash_with_salt(password, salt)
    print("This is the hash of the password with salt:", hash_value)
    print("This is the hash2 (+ salt) of the password:", hash2)

    salt1 = generate_salt()
    hash3 = generate_hash_with_salt(password1, salt1)

    pepper = generate_salt()
    hash4 = generate_hash_with_salt(password, pepper)
    print("This is the hash4 (+ pepper) of the password:", hash4)
    hash5 = generate_hash_with_salt(password1, pepper)

    hash6 = generate_hash_with_salt_and_pepper(password, salt, pepper)
    print("This is the hash6 (+ salt and pepper) of the password:", hash6)

# main convention py
if __name__ == "__main__":
    main()
